package typings.bootstrapSwitch

import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BootstrapSwitch {
  
  @js.native
  trait BootstrapSwitchChangeEventObject
    extends StObject
       with JQueryEventObject {
    
    var state: Boolean = js.native
  }
  
  type BootstrapSwitchEventObject = JQueryEventObject
  
  trait BootstrapSwitchOptions extends StObject {
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var baseClass: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var handleWidth: js.UndefOr[String] = js.undefined
    
    var indeterminate: js.UndefOr[Boolean] = js.undefined
    
    var invers: js.UndefOr[Boolean] = js.undefined
    
    var labelText: js.UndefOr[String] = js.undefined
    
    var labelWidth: js.UndefOr[String] = js.undefined
    
    var offColor: js.UndefOr[String] = js.undefined
    
    var offText: js.UndefOr[String] = js.undefined
    
    var onColor: js.UndefOr[String] = js.undefined
    
    var onInit: js.UndefOr[Any] = js.undefined
    
    var onSwitchChange: js.UndefOr[Any] = js.undefined
    
    var onText: js.UndefOr[String] = js.undefined
    
    var radioAllOff: js.UndefOr[Boolean] = js.undefined
    
    var readonly: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[Boolean] = js.undefined
    
    var wrapperClass: js.UndefOr[String] = js.undefined
  }
  object BootstrapSwitchOptions {
    
    inline def apply(): BootstrapSwitchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BootstrapSwitchOptions]
    }
    
    extension [Self <: BootstrapSwitchOptions](x: Self) {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setBaseClass(value: String): Self = StObject.set(x, "baseClass", value.asInstanceOf[js.Any])
      
      inline def setBaseClassUndefined: Self = StObject.set(x, "baseClass", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHandleWidth(value: String): Self = StObject.set(x, "handleWidth", value.asInstanceOf[js.Any])
      
      inline def setHandleWidthUndefined: Self = StObject.set(x, "handleWidth", js.undefined)
      
      inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
      
      inline def setInvers(value: Boolean): Self = StObject.set(x, "invers", value.asInstanceOf[js.Any])
      
      inline def setInversUndefined: Self = StObject.set(x, "invers", js.undefined)
      
      inline def setLabelText(value: String): Self = StObject.set(x, "labelText", value.asInstanceOf[js.Any])
      
      inline def setLabelTextUndefined: Self = StObject.set(x, "labelText", js.undefined)
      
      inline def setLabelWidth(value: String): Self = StObject.set(x, "labelWidth", value.asInstanceOf[js.Any])
      
      inline def setLabelWidthUndefined: Self = StObject.set(x, "labelWidth", js.undefined)
      
      inline def setOffColor(value: String): Self = StObject.set(x, "offColor", value.asInstanceOf[js.Any])
      
      inline def setOffColorUndefined: Self = StObject.set(x, "offColor", js.undefined)
      
      inline def setOffText(value: String): Self = StObject.set(x, "offText", value.asInstanceOf[js.Any])
      
      inline def setOffTextUndefined: Self = StObject.set(x, "offText", js.undefined)
      
      inline def setOnColor(value: String): Self = StObject.set(x, "onColor", value.asInstanceOf[js.Any])
      
      inline def setOnColorUndefined: Self = StObject.set(x, "onColor", js.undefined)
      
      inline def setOnInit(value: Any): Self = StObject.set(x, "onInit", value.asInstanceOf[js.Any])
      
      inline def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
      
      inline def setOnSwitchChange(value: Any): Self = StObject.set(x, "onSwitchChange", value.asInstanceOf[js.Any])
      
      inline def setOnSwitchChangeUndefined: Self = StObject.set(x, "onSwitchChange", js.undefined)
      
      inline def setOnText(value: String): Self = StObject.set(x, "onText", value.asInstanceOf[js.Any])
      
      inline def setOnTextUndefined: Self = StObject.set(x, "onText", js.undefined)
      
      inline def setRadioAllOff(value: Boolean): Self = StObject.set(x, "radioAllOff", value.asInstanceOf[js.Any])
      
      inline def setRadioAllOffUndefined: Self = StObject.set(x, "radioAllOff", js.undefined)
      
      inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setState(value: Boolean): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setWrapperClass(value: String): Self = StObject.set(x, "wrapperClass", value.asInstanceOf[js.Any])
      
      inline def setWrapperClassUndefined: Self = StObject.set(x, "wrapperClass", js.undefined)
    }
  }
  
  @js.native
  trait Switch extends StObject {
    
    def animate(): Boolean = js.native
    def animate(state: Boolean): JQuery = js.native
    
    def baseClass(): String = js.native
    def baseClass(text: String): JQuery = js.native
    
    def destroy(): JQuery = js.native
    
    def disabled(): Boolean = js.native
    def disabled(state: Boolean): JQuery = js.native
    
    def labelText(): String = js.native
    def labelText(text: String): JQuery = js.native
    
    def offColor(): String = js.native
    def offColor(color: String): JQuery = js.native
    
    def offText(): String = js.native
    def offText(text: String): JQuery = js.native
    
    def onColor(): String = js.native
    def onColor(color: String): JQuery = js.native
    
    def onText(): String = js.native
    def onText(text: String): JQuery = js.native
    
    def radioAllOff(): Boolean = js.native
    def radioAllOff(state: Boolean): JQuery = js.native
    
    def readonly(): Boolean = js.native
    def readonly(state: Boolean): JQuery = js.native
    
    def size(): String = js.native
    def size(size: String): JQuery = js.native
    
    def state(): Boolean = js.native
    def state(value: Any): JQuery = js.native
    def state(value: Any, skip: Boolean): JQuery = js.native
    
    def toggleAnimate(): JQuery = js.native
    
    def toggleDisabled(): JQuery = js.native
    
    def toggleIndeterminate(): JQuery = js.native
    
    def toggleInverse(): JQuery = js.native
    
    def toggleReadOnly(): JQuery = js.native
    
    def toggleReadonly(): JQuery = js.native
    
    def toggleState(): JQuery = js.native
    def toggleState(skip: Boolean): JQuery = js.native
    
    def wrapperClass(): String = js.native
    def wrapperClass(text: String): JQuery = js.native
  }
}
