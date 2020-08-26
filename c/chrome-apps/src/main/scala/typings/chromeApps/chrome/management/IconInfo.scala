package typings.chromeApps.chrome.management

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information about an icon belonging to an extension, app, or theme. */
@js.native
trait IconInfo extends js.Object {
  /** A number representing the width and height of the icon. Likely values include (but are not limited to) 128, 48, 24, and 16. */
  var size: integer = js.native
  /**
    * The URL for this icon image.
    * To display a grayscale version of the icon (to indicate that an extension is disabled, for example),
    * append ?grayscale=true to the URL. */
  var url: String = js.native
}

object IconInfo {
  @scala.inline
  def apply(size: integer, url: String): IconInfo = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconInfo]
  }
  @scala.inline
  implicit class IconInfoOps[Self <: IconInfo] (val x: Self) extends AnyVal {
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
    def setSize(value: integer): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

