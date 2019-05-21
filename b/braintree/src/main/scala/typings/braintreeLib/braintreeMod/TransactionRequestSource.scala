package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransactionRequestSource extends js.Object

@JSImport("braintree", "TransactionRequestSource")
@js.native
object TransactionRequestSource extends js.Object {
  @js.native
  sealed trait moto
    extends braintreeLib.braintreeMod.TransactionRequestSource
  
  @js.native
  sealed trait recurring
    extends braintreeLib.braintreeMod.TransactionRequestSource
  
  @js.native
  sealed trait recurring_first
    extends braintreeLib.braintreeMod.TransactionRequestSource
  
  @js.native
  sealed trait unscheduled
    extends braintreeLib.braintreeMod.TransactionRequestSource
  
  /* "moto" */ val moto: moto with java.lang.String = js.native
  /* "recurring" */ val recurring: recurring with java.lang.String = js.native
  /* "recurring_first" */ val recurring_first: recurring_first with java.lang.String = js.native
  /* "unscheduled" */ val unscheduled: unscheduled with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[braintreeLib.braintreeMod.TransactionRequestSource with java.lang.String] = js.native
}

