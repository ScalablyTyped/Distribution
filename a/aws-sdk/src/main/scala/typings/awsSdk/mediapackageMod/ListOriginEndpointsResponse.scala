package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOriginEndpointsResponse extends StObject {
  
  /**
    * A token that can be used to resume pagination from the end of the collection.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * A list of OriginEndpoint records.
    */
  var OriginEndpoints: js.UndefOr[listOfOriginEndpoint] = js.undefined
}
object ListOriginEndpointsResponse {
  
  @scala.inline
  def apply(): ListOriginEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOriginEndpointsResponse]
  }
  
  @scala.inline
  implicit class ListOriginEndpointsResponseMutableBuilder[Self <: ListOriginEndpointsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setOriginEndpoints(value: listOfOriginEndpoint): Self = StObject.set(x, "OriginEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginEndpointsUndefined: Self = StObject.set(x, "OriginEndpoints", js.undefined)
    
    @scala.inline
    def setOriginEndpointsVarargs(value: OriginEndpoint*): Self = StObject.set(x, "OriginEndpoints", js.Array(value :_*))
  }
}
