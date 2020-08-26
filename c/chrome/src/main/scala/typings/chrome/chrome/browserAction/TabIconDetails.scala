package typings.chrome.chrome.browserAction

import org.scalablytyped.runtime.NumberDictionary
import typings.std.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabIconDetails extends js.Object {
  /** Optional. Either an ImageData object or a dictionary {size -> ImageData} representing icon to be set. If the icon is specified as a dictionary, the actual image to be used is chosen depending on screen's pixel density. If the number of image pixels that fit into one screen space unit equals scale, then image with size scale * 19 will be selected. Initially only scales 1 and 2 will be supported. At least one image must be specified. Note that 'details.imageData = foo' is equivalent to 'details.imageData = {'19': foo}'  */
  var imageData: js.UndefOr[ImageData | NumberDictionary[ImageData]] = js.native
  /** Optional. Either a relative image path or a dictionary {size -> relative image path} pointing to icon to be set. If the icon is specified as a dictionary, the actual image to be used is chosen depending on screen's pixel density. If the number of image pixels that fit into one screen space unit equals scale, then image with size scale * 19 will be selected. Initially only scales 1 and 2 will be supported. At least one image must be specified. Note that 'details.path = foo' is equivalent to 'details.imageData = {'19': foo}'  */
  var path: js.UndefOr[js.Any] = js.native
  /** Optional. Limits the change to when a particular tab is selected. Automatically resets when the tab is closed.  */
  var tabId: js.UndefOr[Double] = js.native
}

object TabIconDetails {
  @scala.inline
  def apply(): TabIconDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabIconDetails]
  }
  @scala.inline
  implicit class TabIconDetailsOps[Self <: TabIconDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setImageData(value: ImageData | NumberDictionary[ImageData]): Self = this.set("imageData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageData: Self = this.set("imageData", js.undefined)
    @scala.inline
    def setPath(value: js.Any): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setTabId(value: Double): Self = this.set("tabId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabId: Self = this.set("tabId", js.undefined)
  }
  
}

