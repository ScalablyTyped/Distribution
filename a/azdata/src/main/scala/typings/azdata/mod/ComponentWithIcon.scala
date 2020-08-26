package typings.azdata.mod

import typings.azdata.anon.Dark
import typings.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentWithIcon extends js.Object {
  /**
    * @deprecated This will be moved to `ComponentWithIconProperties`
    */
  var iconHeight: js.UndefOr[Double | String] = js.native
  /**
    * @deprecated This will be moved to `ComponentWithIconProperties`
    */
  var iconPath: js.UndefOr[String | Uri | Dark] = js.native
  /**
    * @deprecated This will be moved to `ComponentWithIconProperties`
    */
  var iconWidth: js.UndefOr[Double | String] = js.native
}

object ComponentWithIcon {
  @scala.inline
  def apply(): ComponentWithIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentWithIcon]
  }
  @scala.inline
  implicit class ComponentWithIconOps[Self <: ComponentWithIcon] (val x: Self) extends AnyVal {
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
    def setIconHeight(value: Double | String): Self = this.set("iconHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconHeight: Self = this.set("iconHeight", js.undefined)
    @scala.inline
    def setIconPath(value: String | Uri | Dark): Self = this.set("iconPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconPath: Self = this.set("iconPath", js.undefined)
    @scala.inline
    def setIconWidth(value: Double | String): Self = this.set("iconWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconWidth: Self = this.set("iconWidth", js.undefined)
  }
  
}

