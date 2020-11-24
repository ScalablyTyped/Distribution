package typings.bootstrapSwitch.BootstrapSwitch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapSwitchOptions extends js.Object {
  
  var animate: js.UndefOr[Boolean] = js.native
  
  var baseClass: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var handleWidth: js.UndefOr[String] = js.native
  
  var indeterminate: js.UndefOr[Boolean] = js.native
  
  var invers: js.UndefOr[Boolean] = js.native
  
  var labelText: js.UndefOr[String] = js.native
  
  var labelWidth: js.UndefOr[String] = js.native
  
  var offColor: js.UndefOr[String] = js.native
  
  var offText: js.UndefOr[String] = js.native
  
  var onColor: js.UndefOr[String] = js.native
  
  var onInit: js.UndefOr[js.Any] = js.native
  
  var onSwitchChange: js.UndefOr[js.Any] = js.native
  
  var onText: js.UndefOr[String] = js.native
  
  var radioAllOff: js.UndefOr[Boolean] = js.native
  
  var readonly: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[String] = js.native
  
  var state: js.UndefOr[Boolean] = js.native
  
  var wrapperClass: js.UndefOr[String] = js.native
}
object BootstrapSwitchOptions {
  
  @scala.inline
  def apply(): BootstrapSwitchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BootstrapSwitchOptions]
  }
  
  @scala.inline
  implicit class BootstrapSwitchOptionsOps[Self <: BootstrapSwitchOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    
    @scala.inline
    def setBaseClass(value: String): Self = this.set("baseClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseClass: Self = this.set("baseClass", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setHandleWidth(value: String): Self = this.set("handleWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleWidth: Self = this.set("handleWidth", js.undefined)
    
    @scala.inline
    def setIndeterminate(value: Boolean): Self = this.set("indeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndeterminate: Self = this.set("indeterminate", js.undefined)
    
    @scala.inline
    def setInvers(value: Boolean): Self = this.set("invers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvers: Self = this.set("invers", js.undefined)
    
    @scala.inline
    def setLabelText(value: String): Self = this.set("labelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelText: Self = this.set("labelText", js.undefined)
    
    @scala.inline
    def setLabelWidth(value: String): Self = this.set("labelWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelWidth: Self = this.set("labelWidth", js.undefined)
    
    @scala.inline
    def setOffColor(value: String): Self = this.set("offColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffColor: Self = this.set("offColor", js.undefined)
    
    @scala.inline
    def setOffText(value: String): Self = this.set("offText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffText: Self = this.set("offText", js.undefined)
    
    @scala.inline
    def setOnColor(value: String): Self = this.set("onColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnColor: Self = this.set("onColor", js.undefined)
    
    @scala.inline
    def setOnInit(value: js.Any): Self = this.set("onInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnInit: Self = this.set("onInit", js.undefined)
    
    @scala.inline
    def setOnSwitchChange(value: js.Any): Self = this.set("onSwitchChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSwitchChange: Self = this.set("onSwitchChange", js.undefined)
    
    @scala.inline
    def setOnText(value: String): Self = this.set("onText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnText: Self = this.set("onText", js.undefined)
    
    @scala.inline
    def setRadioAllOff(value: Boolean): Self = this.set("radioAllOff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadioAllOff: Self = this.set("radioAllOff", js.undefined)
    
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadonly: Self = this.set("readonly", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setState(value: Boolean): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setWrapperClass(value: String): Self = this.set("wrapperClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperClass: Self = this.set("wrapperClass", js.undefined)
  }
}
