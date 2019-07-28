package typings.braintree.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransactionRequestSource extends js.Object

@JSImport("braintree", "TransactionRequestSource")
@js.native
object TransactionRequestSource extends js.Object {
  @js.native
  sealed trait moto extends TransactionRequestSource
  
  @js.native
  sealed trait recurring extends TransactionRequestSource
  
  @js.native
  sealed trait recurring_first extends TransactionRequestSource
  
  @js.native
  sealed trait unscheduled extends TransactionRequestSource
  
  /* "moto" */ val moto: typings.braintree.braintreeMod.TransactionRequestSource.moto with String = js.native
  /* "recurring" */ val recurring: typings.braintree.braintreeMod.TransactionRequestSource.recurring with String = js.native
  /* "recurring_first" */ val recurring_first: typings.braintree.braintreeMod.TransactionRequestSource.recurring_first with String = js.native
  /* "unscheduled" */ val unscheduled: typings.braintree.braintreeMod.TransactionRequestSource.unscheduled with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TransactionRequestSource with String] = js.native
}

