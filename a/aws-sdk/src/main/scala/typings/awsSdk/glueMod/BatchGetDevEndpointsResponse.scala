package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetDevEndpointsResponse extends StObject {
  
  /**
    * A list of DevEndpoint definitions.
    */
  var DevEndpoints: js.UndefOr[DevEndpointList] = js.native
  
  /**
    * A list of DevEndpoints not found.
    */
  var DevEndpointsNotFound: js.UndefOr[DevEndpointNames] = js.native
}
object BatchGetDevEndpointsResponse {
  
  @scala.inline
  def apply(): BatchGetDevEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetDevEndpointsResponse]
  }
  
  @scala.inline
  implicit class BatchGetDevEndpointsResponseMutableBuilder[Self <: BatchGetDevEndpointsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevEndpoints(value: DevEndpointList): Self = StObject.set(x, "DevEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevEndpointsNotFound(value: DevEndpointNames): Self = StObject.set(x, "DevEndpointsNotFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevEndpointsNotFoundUndefined: Self = StObject.set(x, "DevEndpointsNotFound", js.undefined)
    
    @scala.inline
    def setDevEndpointsNotFoundVarargs(value: GenericString*): Self = StObject.set(x, "DevEndpointsNotFound", js.Array(value :_*))
    
    @scala.inline
    def setDevEndpointsUndefined: Self = StObject.set(x, "DevEndpoints", js.undefined)
    
    @scala.inline
    def setDevEndpointsVarargs(value: DevEndpoint*): Self = StObject.set(x, "DevEndpoints", js.Array(value :_*))
  }
}
