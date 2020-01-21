package typings.baseui

import typings.baseui.inputMod.InputOverrides
import typings.baseui.inputMod.InputProps
import typings.baseui.inputMod.StatefulContainerProps
import typings.cardValidator.AnonMinLength
import typings.cardValidator.AnonMonth
import typings.cardValidator.mod.validExpirationDate
import typings.cardValidator.mod.validExpirationMonth
import typings.cardValidator.mod.validExpirationYear
import typings.cardValidator.mod.validNumber
import typings.react.mod.Component
import typings.react.mod.FC
import typings.styletronReact.mod.StyletronComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/payment-card", JSImport.Namespace)
@js.native
object paymentCardMod extends js.Object {
  @js.native
  class PaymentCard ()
    extends Component[PaymentCardProps, js.Object, js.Any]
  
  val SIZE: typings.baseui.inputMod.SIZE = js.native
  val StatefulContainer: FC[StatefulContainerProps] = js.native
  val StatefulPaymentCard: FC[StatefulPaymentCardProps] = js.native
  val StyledIconWrapper: StyletronComponent[js.Any] = js.native
  @js.native
  object valid extends js.Object {
    def cvv(value: String): typings.cardValidator.mod.valid = js.native
    def cvv(value: String, maxLength: Double): typings.cardValidator.mod.valid = js.native
    def expirationDate(value: String): validExpirationDate = js.native
    def expirationDate(value: AnonMonth): validExpirationDate = js.native
    def expirationMonth(value: String): validExpirationMonth = js.native
    def expirationYear(value: String): validExpirationYear = js.native
    def number(value: String): validNumber = js.native
    def postalCode(value: String): typings.cardValidator.mod.valid = js.native
    def postalCode(value: String, options: AnonMinLength): typings.cardValidator.mod.valid = js.native
  }
  
  type PaymentCardOverrides = InputOverrides with AnonIconWrapper
  type PaymentCardProps = InputProps with AnonOverrides
  type StatefulPaymentCardProps = InputProps with StatefulContainerProps with AnonOverrides
}

