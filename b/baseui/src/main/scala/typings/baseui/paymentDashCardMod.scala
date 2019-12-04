package typings.baseui

import typings.baseui.inputMod.InputOverrides
import typings.baseui.inputMod.InputProps
import typings.baseui.inputMod.StatefulContainerProps
import typings.baseui.paymentDashCardMod.PaymentCardProps
import typings.baseui.paymentDashCardMod.StatefulPaymentCardProps
import typings.cardDashValidator.Anon_MinLength
import typings.cardDashValidator.Anon_Month
import typings.cardDashValidator.cardDashValidatorMod.validExpirationDate
import typings.cardDashValidator.cardDashValidatorMod.validExpirationMonth
import typings.cardDashValidator.cardDashValidatorMod.validExpirationYear
import typings.cardDashValidator.cardDashValidatorMod.validNumber
import typings.react.reactMod.Component
import typings.react.reactMod.FC
import typings.styletronDashReact.styletronDashReactMod.StyletronComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/payment-card", JSImport.Namespace)
@js.native
object paymentDashCardMod extends js.Object {
  @js.native
  class PaymentCard ()
    extends Component[PaymentCardProps, js.Object, js.Any]
  
  val SIZE: typings.baseui.inputMod.SIZE = js.native
  val StatefulContainer: FC[StatefulContainerProps] = js.native
  val StatefulPaymentCard: FC[StatefulPaymentCardProps] = js.native
  val StyledIconWrapper: StyletronComponent[js.Any] = js.native
  @js.native
  object valid extends js.Object {
    def cvv(value: String): typings.cardDashValidator.cardDashValidatorMod.valid = js.native
    def cvv(value: String, maxLength: Double): typings.cardDashValidator.cardDashValidatorMod.valid = js.native
    def expirationDate(value: String): validExpirationDate = js.native
    def expirationDate(value: Anon_Month): validExpirationDate = js.native
    def expirationMonth(value: String): validExpirationMonth = js.native
    def expirationYear(value: String): validExpirationYear = js.native
    def number(value: String): validNumber = js.native
    def postalCode(value: String): typings.cardDashValidator.cardDashValidatorMod.valid = js.native
    def postalCode(value: String, options: Anon_MinLength): typings.cardDashValidator.cardDashValidatorMod.valid = js.native
  }
  
  type PaymentCardOverrides = InputOverrides with Anon_IconWrapper
  type PaymentCardProps = InputProps with Anon_Overrides
  type StatefulPaymentCardProps = InputProps with StatefulContainerProps with Anon_Overrides
}

