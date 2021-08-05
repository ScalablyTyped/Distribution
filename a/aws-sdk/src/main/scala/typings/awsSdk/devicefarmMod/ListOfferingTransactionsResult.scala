package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOfferingTransactionsResult extends StObject {
  
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The audit log of subscriptions you have purchased and modified through AWS Device Farm.
    */
  var offeringTransactions: js.UndefOr[OfferingTransactions] = js.undefined
}
object ListOfferingTransactionsResult {
  
  inline def apply(): ListOfferingTransactionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOfferingTransactionsResult]
  }
  
  extension [Self <: ListOfferingTransactionsResult](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setOfferingTransactions(value: OfferingTransactions): Self = StObject.set(x, "offeringTransactions", value.asInstanceOf[js.Any])
    
    inline def setOfferingTransactionsUndefined: Self = StObject.set(x, "offeringTransactions", js.undefined)
    
    inline def setOfferingTransactionsVarargs(value: OfferingTransaction*): Self = StObject.set(x, "offeringTransactions", js.Array(value :_*))
  }
}
