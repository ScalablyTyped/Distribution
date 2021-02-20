package typings.awsSdk.rdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeginTransactionResponse extends StObject {
  
  /**
    * The transaction ID of the transaction started by the call.
    */
  var transactionId: js.UndefOr[Id] = js.native
}
object BeginTransactionResponse {
  
  @scala.inline
  def apply(): BeginTransactionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeginTransactionResponse]
  }
  
  @scala.inline
  implicit class BeginTransactionResponseMutableBuilder[Self <: BeginTransactionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransactionId(value: Id): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
  }
}
