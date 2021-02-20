package typings.awsSdk.qldbsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartTransactionResult extends StObject {
  
  /**
    * The transaction ID of the started transaction.
    */
  var TransactionId: js.UndefOr[typings.awsSdk.qldbsessionMod.TransactionId] = js.native
}
object StartTransactionResult {
  
  @scala.inline
  def apply(): StartTransactionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTransactionResult]
  }
  
  @scala.inline
  implicit class StartTransactionResultMutableBuilder[Self <: StartTransactionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransactionId(value: TransactionId): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionIdUndefined: Self = StObject.set(x, "TransactionId", js.undefined)
  }
}
