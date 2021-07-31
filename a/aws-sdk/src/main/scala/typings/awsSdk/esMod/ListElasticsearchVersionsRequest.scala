package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListElasticsearchVersionsRequest extends StObject {
  
  /**
    *  Set this value to limit the number of results returned. Value provided must be greater than 10 else it wont be honored. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.esMod.MaxResults] = js.undefined
  
  var NextToken: js.UndefOr[typings.awsSdk.esMod.NextToken] = js.undefined
}
object ListElasticsearchVersionsRequest {
  
  @scala.inline
  def apply(): ListElasticsearchVersionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListElasticsearchVersionsRequest]
  }
  
  @scala.inline
  implicit class ListElasticsearchVersionsRequestMutableBuilder[Self <: ListElasticsearchVersionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
