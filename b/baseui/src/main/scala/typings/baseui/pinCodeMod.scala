package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.anon.Arialabel
import typings.baseui.anon.OnChange
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.pinCodePinCodeMod.default
import typings.baseui.pinCodeTypesMod.StatefulPinCodeContainerProps
import typings.baseui.pinCodeTypesMod.StatefulPinCodeProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinCodeMod {
  
  @JSImport("baseui/pin-code", "PinCode")
  @js.native
  open class PinCode () extends default
  /* static members */
  object PinCode {
    
    @JSImport("baseui/pin-code", "PinCode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/pin-code", "PinCode.defaultProps")
    @js.native
    def defaultProps: Arialabel = js.native
    inline def defaultProps_=(x: Arialabel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  object SIZE extends Shortcut {
    
    @JSImport("baseui/pin-code", "SIZE.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/pin-code", "SIZE.compact")
    @js.native
    val compact: typings.baseui.baseuiStrings.compact = js.native
    
    @JSImport("baseui/pin-code", "SIZE.large")
    @js.native
    val large: large_ = js.native
    
    @JSImport("baseui/pin-code", "SIZE.mini")
    @js.native
    val mini: typings.baseui.baseuiStrings.mini = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `SIZE.foo` */
    override def _to: default_ = default
  }
  
  object StatefulPinCode {
    
    inline def apply(props: StatefulPinCodeProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/pin-code", "StatefulPinCode")
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("baseui/pin-code", "StatefulPinCode.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/pin-code", "StatefulPinCode.defaultProps.aria-describedby")
      @js.native
      def ariaDescribedby: Any = js.native
      
      inline def ariaDescribedby_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria-describedby")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/pin-code", "StatefulPinCode.defaultProps.aria-label")
      @js.native
      def ariaLabel: String = js.native
      
      inline def ariaLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/pin-code", "StatefulPinCode.defaultProps.aria-labelledby")
      @js.native
      def ariaLabelledby: Any = js.native
      
      inline def ariaLabelledby_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria-labelledby")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/pin-code", "StatefulPinCode.defaultProps.autoComplete")
      @js.native
      def autoComplete: String = js.native
      inline def autoComplete_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/pin-code", "StatefulPinCode.defaultProps.autoFocus")
      @js.native
      def autoFocus: Boolean = js.native
      inline def autoFocus_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/pin-code", "StatefulPinCode.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/pin-code", "StatefulPinCode.defaultProps.error")
      @js.native
      def error: Boolean = js.native
      inline def error_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/pin-code", "StatefulPinCode.defaultProps.id")
      @js.native
      def id: Any = js.native
      inline def id_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/pin-code", "StatefulPinCode.defaultProps.manageFocus")
      @js.native
      def manageFocus: Boolean = js.native
      inline def manageFocus_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("manageFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/pin-code", "StatefulPinCode.defaultProps.mask")
      @js.native
      def mask: Boolean = js.native
      inline def mask_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mask")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/pin-code", "StatefulPinCode.defaultProps.name")
      @js.native
      def name: Any = js.native
      inline def name_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
      
      inline def onChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange")().asInstanceOf[Unit]
      
      @JSImport("baseui/pin-code", "StatefulPinCode.defaultProps.placeholder")
      @js.native
      def placeholder: String = js.native
      inline def placeholder_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/pin-code", "StatefulPinCode.defaultProps.positive")
      @js.native
      def positive: Boolean = js.native
      inline def positive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("positive")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/pin-code", "StatefulPinCode.defaultProps.required")
      @js.native
      def required: Boolean = js.native
      inline def required_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/pin-code", "StatefulPinCode.defaultProps.size")
      @js.native
      def size: default_ = js.native
      inline def size_=(x: default_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/pin-code", "StatefulPinCode.defaultProps.values")
      @js.native
      def values: js.Array[String] = js.native
      inline def values_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("values")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/pin-code", "StatefulPinCodeContainer")
  @js.native
  open class StatefulPinCodeContainer ()
    extends typings.baseui.pinCodeStatefulPinCodeContainerMod.default
  /* static members */
  object StatefulPinCodeContainer {
    
    @JSImport("baseui/pin-code", "StatefulPinCodeContainer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/pin-code", "StatefulPinCodeContainer.defaultProps")
    @js.native
    def defaultProps: OnChange = js.native
    inline def defaultProps_=(x: OnChange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  type StatefulContainerProps = StatefulPinCodeContainerProps
}
