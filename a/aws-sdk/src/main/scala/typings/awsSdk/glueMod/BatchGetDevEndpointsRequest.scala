package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetDevEndpointsRequest extends StObject {
  
  /**
    * The list of DevEndpoint names, which might be the names returned from the ListDevEndpoint operation.
    */
  var DevEndpointNames: typings.awsSdk.glueMod.DevEndpointNames
}
object BatchGetDevEndpointsRequest {
  
  @scala.inline
  def apply(DevEndpointNames: DevEndpointNames): BatchGetDevEndpointsRequest = {
    val __obj = js.Dynamic.literal(DevEndpointNames = DevEndpointNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetDevEndpointsRequest]
  }
  
  @scala.inline
  implicit class BatchGetDevEndpointsRequestMutableBuilder[Self <: BatchGetDevEndpointsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevEndpointNames(value: DevEndpointNames): Self = StObject.set(x, "DevEndpointNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevEndpointNamesVarargs(value: GenericString*): Self = StObject.set(x, "DevEndpointNames", js.Array(value :_*))
  }
}
