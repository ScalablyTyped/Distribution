package typings.bootstrap3Dialog.BootstrapDialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogButton extends js.Object {
  
  /**
    * If provided, the callback will be invoked after the button is clicked, and the dialog instance
    * will be passed to the callback function.
    */
  var action: js.UndefOr[js.Function1[/* dialog */ DialogContext, Unit]] = js.native
  
  /**  If it's true, after clicked the button a spinning icon appears. */
  var autospin: js.UndefOr[Boolean] = js.native
  
  /** Additional css class to be added to the button. */
  var cssClass: js.UndefOr[String] = js.native
  
  /** Object containing data attributes to be added to the button. */
  var data: js.UndefOr[js.Any] = js.native
  
  /** Hotkey char code */
  var hotkey: js.UndefOr[Double] = js.native
  
  /** If set, the specified icon will be added to the button. */
  var icon: js.UndefOr[String] = js.native
  
  /** If id is set, you can use dialogInstance.getButton(id) to get the button later. */
  var id: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String] = js.native
}
object DialogButton {
  
  @scala.inline
  def apply(): DialogButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogButton]
  }
  
  @scala.inline
  implicit class DialogButtonOps[Self <: DialogButton] (val x: Self) extends AnyVal {
    
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
    def setAction(value: /* dialog */ DialogContext => Unit): Self = this.set("action", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setAutospin(value: Boolean): Self = this.set("autospin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutospin: Self = this.set("autospin", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setHotkey(value: Double): Self = this.set("hotkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHotkey: Self = this.set("hotkey", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
}
