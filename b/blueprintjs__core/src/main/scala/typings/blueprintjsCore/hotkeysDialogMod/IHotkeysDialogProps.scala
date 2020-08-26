package typings.blueprintjsCore.hotkeysDialogMod

import typings.blueprintjsCore.dialogMod.IDialogProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHotkeysDialogProps extends IDialogProps {
  /**
    * This string displayed as the group name in the hotkeys dialog for all
    * global hotkeys.
    */
  var globalHotkeysGroup: js.UndefOr[String] = js.native
}

object IHotkeysDialogProps {
  @scala.inline
  def apply(isOpen: Boolean): IHotkeysDialogProps = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHotkeysDialogProps]
  }
  @scala.inline
  implicit class IHotkeysDialogPropsOps[Self <: IHotkeysDialogProps] (val x: Self) extends AnyVal {
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
    def setGlobalHotkeysGroup(value: String): Self = this.set("globalHotkeysGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalHotkeysGroup: Self = this.set("globalHotkeysGroup", js.undefined)
  }
  
}

