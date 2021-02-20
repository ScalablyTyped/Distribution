package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBrokerEngineTypesResponse extends StObject {
  
  /**
    * List of available engine types and versions.
    */
  var BrokerEngineTypes: js.UndefOr[listOfBrokerEngineType] = js.native
  
  /**
    * Required. The maximum number of engine types that can be returned per page (20 by default). This value must be an integer from 5 to 100.
    */
  var MaxResults: js.UndefOr[integerMin5Max100] = js.native
  
  /**
    * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object DescribeBrokerEngineTypesResponse {
  
  @scala.inline
  def apply(): DescribeBrokerEngineTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBrokerEngineTypesResponse]
  }
  
  @scala.inline
  implicit class DescribeBrokerEngineTypesResponseMutableBuilder[Self <: DescribeBrokerEngineTypesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrokerEngineTypes(value: listOfBrokerEngineType): Self = StObject.set(x, "BrokerEngineTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrokerEngineTypesUndefined: Self = StObject.set(x, "BrokerEngineTypes", js.undefined)
    
    @scala.inline
    def setBrokerEngineTypesVarargs(value: BrokerEngineType*): Self = StObject.set(x, "BrokerEngineTypes", js.Array(value :_*))
    
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
