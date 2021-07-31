package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TransactionRequestSource extends StObject
@JSImport("braintree", "TransactionRequestSource")
@js.native
object TransactionRequestSource extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TransactionRequestSource & String] = js.native
  
  @js.native
  sealed trait moto
    extends StObject
       with TransactionRequestSource
  /* "moto" */ val moto: typings.braintree.mod.TransactionRequestSource.moto & String = js.native
  
  @js.native
  sealed trait recurring
    extends StObject
       with TransactionRequestSource
  /* "recurring" */ val recurring: typings.braintree.mod.TransactionRequestSource.recurring & String = js.native
  
  @js.native
  sealed trait recurring_first
    extends StObject
       with TransactionRequestSource
  /* "recurring_first" */ val recurring_first: typings.braintree.mod.TransactionRequestSource.recurring_first & String = js.native
  
  @js.native
  sealed trait unscheduled
    extends StObject
       with TransactionRequestSource
  /* "unscheduled" */ val unscheduled: typings.braintree.mod.TransactionRequestSource.unscheduled & String = js.native
}
