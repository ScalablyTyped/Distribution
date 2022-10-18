package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.anon.SizeSize
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.div
import typings.baseui.baseuiStrings.large_
import typings.baseui.paymentCardPaymentCardMod.default
import typings.baseui.paymentCardTypesMod.PaymentCardProps
import typings.baseui.paymentCardTypesMod.StatefulPaymentCardProps
import typings.react.mod.global.JSX.Element
import typings.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paymentCardMod {
  
  @JSImport("baseui/payment-card", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("baseui/payment-card", "PaymentCard")
  @js.native
  open class PaymentCard protected () extends default {
    def this(props: PaymentCardProps) = this()
  }
  object PaymentCard {
    
    /* static member */
    object defaultProps {
      
      @JSImport("baseui/payment-card", "PaymentCard.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/payment-card", "PaymentCard.defaultProps.autoComplete")
      @js.native
      def autoComplete: String = js.native
      inline def autoComplete_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/payment-card", "PaymentCard.defaultProps.autoFocus")
      @js.native
      def autoFocus: Boolean = js.native
      inline def autoFocus_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/payment-card", "PaymentCard.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/payment-card", "PaymentCard.defaultProps.endEnhancer")
      @js.native
      def endEnhancer: Any = js.native
      inline def endEnhancer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("endEnhancer")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/payment-card", "PaymentCard.defaultProps.error")
      @js.native
      def error: Boolean = js.native
      inline def error_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/payment-card", "PaymentCard.defaultProps.name")
      @js.native
      def name: String = js.native
      inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
      
      inline def onBlur(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBlur")().asInstanceOf[Unit]
      
      inline def onFocus(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onFocus")().asInstanceOf[Unit]
      
      @JSImport("baseui/payment-card", "PaymentCard.defaultProps.required")
      @js.native
      def required: Boolean = js.native
      inline def required_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/payment-card", "PaymentCard.defaultProps.size")
      @js.native
      def size: String = js.native
      inline def size_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/payment-card", "PaymentCard.defaultProps.startEnhancer")
      @js.native
      def startEnhancer: Any = js.native
      inline def startEnhancer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("startEnhancer")(x.asInstanceOf[js.Any])
    }
  }
  
  object SIZE extends Shortcut {
    
    @JSImport("baseui/payment-card", "SIZE.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/payment-card", "SIZE.compact")
    @js.native
    val compact: typings.baseui.baseuiStrings.compact = js.native
    
    @JSImport("baseui/payment-card", "SIZE.large")
    @js.native
    val large: large_ = js.native
    
    @JSImport("baseui/payment-card", "SIZE.mini")
    @js.native
    val mini: typings.baseui.baseuiStrings.mini = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `SIZE.foo` */
    override def _to: default_ = default
  }
  
  inline def StatefulPaymentCard(props: StatefulPaymentCardProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StatefulPaymentCard")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/payment-card", "StyledIconWrapper")
  @js.native
  val StyledIconWrapper: StyletronComponent[div, SizeSize] = js.native
}
