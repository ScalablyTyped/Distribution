package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAgreementsResponse extends StObject {
  
  /**
    * Returns an array, where each item contains the details of an agreement.
    */
  var Agreements: ListedAgreements
  
  /**
    * Returns a token that you can use to call ListAgreements again and receive additional results, if there are any.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsTransferMod.NextToken] = js.undefined
}
object ListAgreementsResponse {
  
  inline def apply(Agreements: ListedAgreements): ListAgreementsResponse = {
    val __obj = js.Dynamic.literal(Agreements = Agreements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAgreementsResponse]
  }
  
  extension [Self <: ListAgreementsResponse](x: Self) {
    
    inline def setAgreements(value: ListedAgreements): Self = StObject.set(x, "Agreements", value.asInstanceOf[js.Any])
    
    inline def setAgreementsVarargs(value: ListedAgreement*): Self = StObject.set(x, "Agreements", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
