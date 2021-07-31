package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBrokerInstanceOptionsResponse extends StObject {
  
  /**
    * List of available broker instance options.
    */
  var BrokerInstanceOptions: js.UndefOr[listOfBrokerInstanceOption] = js.undefined
  
  /**
    * Required. The maximum number of instance options that can be returned per page (20 by default). This value must be an integer from 5 to 100.
    */
  var MaxResults: js.UndefOr[integerMin5Max100] = js.undefined
  
  /**
    * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object DescribeBrokerInstanceOptionsResponse {
  
  @scala.inline
  def apply(): DescribeBrokerInstanceOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBrokerInstanceOptionsResponse]
  }
  
  @scala.inline
  implicit class DescribeBrokerInstanceOptionsResponseMutableBuilder[Self <: DescribeBrokerInstanceOptionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrokerInstanceOptions(value: listOfBrokerInstanceOption): Self = StObject.set(x, "BrokerInstanceOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrokerInstanceOptionsUndefined: Self = StObject.set(x, "BrokerInstanceOptions", js.undefined)
    
    @scala.inline
    def setBrokerInstanceOptionsVarargs(value: BrokerInstanceOption*): Self = StObject.set(x, "BrokerInstanceOptions", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: integerMin5Max100): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
