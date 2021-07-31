package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOfferingTransactionsRequest extends StObject {
  
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListOfferingTransactionsRequest {
  
  @scala.inline
  def apply(): ListOfferingTransactionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOfferingTransactionsRequest]
  }
  
  @scala.inline
  implicit class ListOfferingTransactionsRequestMutableBuilder[Self <: ListOfferingTransactionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
