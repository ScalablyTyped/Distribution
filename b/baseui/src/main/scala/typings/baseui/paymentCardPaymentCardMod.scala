package typings.baseui

import typings.baseui.paymentCardTypesMod.PaymentCardProps
import typings.react.mod.Component
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paymentCardPaymentCardMod {
  
  @JSImport("baseui/payment-card/payment-card", JSImport.Default)
  @js.native
  open class default protected () extends PaymentCard {
    def this(props: PaymentCardProps) = this()
  }
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("baseui/payment-card/payment-card", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/payment-card/payment-card", "default.defaultProps.autoComplete")
      @js.native
      def autoComplete: String = js.native
      inline def autoComplete_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/payment-card/payment-card", "default.defaultProps.autoFocus")
      @js.native
      def autoFocus: Boolean = js.native
      inline def autoFocus_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/payment-card/payment-card", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/payment-card/payment-card", "default.defaultProps.endEnhancer")
      @js.native
      def endEnhancer: Any = js.native
      inline def endEnhancer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("endEnhancer")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/payment-card/payment-card", "default.defaultProps.error")
      @js.native
      def error: Boolean = js.native
      inline def error_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/payment-card/payment-card", "default.defaultProps.name")
      @js.native
      def name: String = js.native
      inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
      
      inline def onBlur(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBlur")().asInstanceOf[Unit]
      
      inline def onFocus(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onFocus")().asInstanceOf[Unit]
      
      @JSImport("baseui/payment-card/payment-card", "default.defaultProps.required")
      @js.native
      def required: Boolean = js.native
      inline def required_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/payment-card/payment-card", "default.defaultProps.size")
      @js.native
      def size: String = js.native
      inline def size_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/payment-card/payment-card", "default.defaultProps.startEnhancer")
      @js.native
      def startEnhancer: Any = js.native
      inline def startEnhancer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("startEnhancer")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PaymentCard
    extends Component[PaymentCardProps, js.Object, Any] {
    
    var caretPosition: Double = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MPaymentCard(prevProps: PaymentCardProps): Unit = js.native
    
    var inRef: HTMLInputElement | HTMLTextAreaElement | Null = js.native
  }
}
