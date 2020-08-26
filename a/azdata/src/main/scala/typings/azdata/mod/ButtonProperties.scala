package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonProperties
  extends ComponentProperties
     with ComponentWithIcon {
  /**
    * The content of the currently selected file
    */
  var fileContent: js.UndefOr[String] = js.native
  /**
    * Whether the button opens the file browser dialog
    */
  var isFile: js.UndefOr[Boolean] = js.native
  /**
    * The label for the button
    */
  var label: js.UndefOr[String] = js.native
  /**
    * @deprecated This will be moved to `ComponentWithIconProperties`
    *
    * The title for the button. This title will show when hovered over
    */
  var title: js.UndefOr[String] = js.native
}

object ButtonProperties {
  @scala.inline
  def apply(): ButtonProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonProperties]
  }
  @scala.inline
  implicit class ButtonPropertiesOps[Self <: ButtonProperties] (val x: Self) extends AnyVal {
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
    def setFileContent(value: String): Self = this.set("fileContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileContent: Self = this.set("fileContent", js.undefined)
    @scala.inline
    def setIsFile(value: Boolean): Self = this.set("isFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFile: Self = this.set("isFile", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

