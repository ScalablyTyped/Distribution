package typings.braintree.mod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TransactionRequestSource with String] = js.native
  /* "moto" */ @js.native
  object moto extends TopLevel[moto with String]
  
  /* "recurring" */ @js.native
  object recurring extends TopLevel[recurring with String]
  
  /* "recurring_first" */ @js.native
  object recurring_first extends TopLevel[recurring_first with String]
  
  /* "unscheduled" */ @js.native
  object unscheduled extends TopLevel[unscheduled with String]
  
}

