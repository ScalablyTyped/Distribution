package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFraudstersResponse extends StObject {
  
  /**
    * A list that contains details about each fraudster in the Amazon Web Services account. 
    */
  var FraudsterSummaries: js.UndefOr[typings.awsSdk.clientsVoiceidMod.FraudsterSummaries] = js.undefined
  
  /**
    * If NextToken is returned, there are more results available. The value of NextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListFraudstersResponse {
  
  inline def apply(): ListFraudstersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFraudstersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListFraudstersResponse] (val x: Self) extends AnyVal {
    
    inline def setFraudsterSummaries(value: FraudsterSummaries): Self = StObject.set(x, "FraudsterSummaries", value.asInstanceOf[js.Any])
    
    inline def setFraudsterSummariesUndefined: Self = StObject.set(x, "FraudsterSummaries", js.undefined)
    
    inline def setFraudsterSummariesVarargs(value: FraudsterSummary*): Self = StObject.set(x, "FraudsterSummaries", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
