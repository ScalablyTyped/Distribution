package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBrokersResponse extends StObject {
  
  /**
    * A list of information about all brokers.
    */
  var BrokerSummaries: js.UndefOr[listOfBrokerSummary] = js.native
  
  /**
    * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object ListBrokersResponse {
  
  @scala.inline
  def apply(): ListBrokersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBrokersResponse]
  }
  
  @scala.inline
  implicit class ListBrokersResponseMutableBuilder[Self <: ListBrokersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrokerSummaries(value: listOfBrokerSummary): Self = StObject.set(x, "BrokerSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrokerSummariesUndefined: Self = StObject.set(x, "BrokerSummaries", js.undefined)
    
    @scala.inline
    def setBrokerSummariesVarargs(value: BrokerSummary*): Self = StObject.set(x, "BrokerSummaries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
