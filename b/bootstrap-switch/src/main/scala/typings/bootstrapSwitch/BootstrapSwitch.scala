package typings.bootstrapSwitch

import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BootstrapSwitch {
  
  @js.native
  trait BootstrapSwitchChangeEventObject extends JQueryEventObject {
    
    var state: Boolean = js.native
  }
  
  type BootstrapSwitchEventObject = JQueryEventObject
  
  @js.native
  trait BootstrapSwitchOptions extends StObject {
    
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
    implicit class BootstrapSwitchOptionsMutableBuilder[Self <: BootstrapSwitchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      @scala.inline
      def setBaseClass(value: String): Self = StObject.set(x, "baseClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseClassUndefined: Self = StObject.set(x, "baseClass", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHandleWidth(value: String): Self = StObject.set(x, "handleWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleWidthUndefined: Self = StObject.set(x, "handleWidth", js.undefined)
      
      @scala.inline
      def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
      
      @scala.inline
      def setInvers(value: Boolean): Self = StObject.set(x, "invers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInversUndefined: Self = StObject.set(x, "invers", js.undefined)
      
      @scala.inline
      def setLabelText(value: String): Self = StObject.set(x, "labelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelTextUndefined: Self = StObject.set(x, "labelText", js.undefined)
      
      @scala.inline
      def setLabelWidth(value: String): Self = StObject.set(x, "labelWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelWidthUndefined: Self = StObject.set(x, "labelWidth", js.undefined)
      
      @scala.inline
      def setOffColor(value: String): Self = StObject.set(x, "offColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffColorUndefined: Self = StObject.set(x, "offColor", js.undefined)
      
      @scala.inline
      def setOffText(value: String): Self = StObject.set(x, "offText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffTextUndefined: Self = StObject.set(x, "offText", js.undefined)
      
      @scala.inline
      def setOnColor(value: String): Self = StObject.set(x, "onColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnColorUndefined: Self = StObject.set(x, "onColor", js.undefined)
      
      @scala.inline
      def setOnInit(value: js.Any): Self = StObject.set(x, "onInit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
      
      @scala.inline
      def setOnSwitchChange(value: js.Any): Self = StObject.set(x, "onSwitchChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSwitchChangeUndefined: Self = StObject.set(x, "onSwitchChange", js.undefined)
      
      @scala.inline
      def setOnText(value: String): Self = StObject.set(x, "onText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTextUndefined: Self = StObject.set(x, "onText", js.undefined)
      
      @scala.inline
      def setRadioAllOff(value: Boolean): Self = StObject.set(x, "radioAllOff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioAllOffUndefined: Self = StObject.set(x, "radioAllOff", js.undefined)
      
      @scala.inline
      def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setState(value: Boolean): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setWrapperClass(value: String): Self = StObject.set(x, "wrapperClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperClassUndefined: Self = StObject.set(x, "wrapperClass", js.undefined)
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
    def state(value: js.Any): JQuery = js.native
    def state(value: js.Any, skip: Boolean): JQuery = js.native
    
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
