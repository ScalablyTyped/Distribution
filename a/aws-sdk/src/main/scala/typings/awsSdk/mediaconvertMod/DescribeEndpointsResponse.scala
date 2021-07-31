package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEndpointsResponse extends StObject {
  
  /**
    * List of endpoints
    */
  var Endpoints: js.UndefOr[listOfEndpoint] = js.undefined
  
  /**
    * Use this string to request the next batch of endpoints.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object DescribeEndpointsResponse {
  
  @scala.inline
  def apply(): DescribeEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEndpointsResponse]
  }
  
  @scala.inline
  implicit class DescribeEndpointsResponseMutableBuilder[Self <: DescribeEndpointsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoints(value: listOfEndpoint): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointsUndefined: Self = StObject.set(x, "Endpoints", js.undefined)
    
    @scala.inline
    def setEndpointsVarargs(value: Endpoint*): Self = StObject.set(x, "Endpoints", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
