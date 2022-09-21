package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBrokersResponse extends StObject {
  
  /**
    * A list of information about all brokers.
    */
  var BrokerSummaries: js.UndefOr[listOfBrokerSummary] = js.undefined
  
  /**
    * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListBrokersResponse {
  
  inline def apply(): ListBrokersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBrokersResponse]
  }
  
  extension [Self <: ListBrokersResponse](x: Self) {
    
    inline def setBrokerSummaries(value: listOfBrokerSummary): Self = StObject.set(x, "BrokerSummaries", value.asInstanceOf[js.Any])
    
    inline def setBrokerSummariesUndefined: Self = StObject.set(x, "BrokerSummaries", js.undefined)
    
    inline def setBrokerSummariesVarargs(value: BrokerSummary*): Self = StObject.set(x, "BrokerSummaries", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
