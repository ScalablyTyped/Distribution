package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRealtimeEndpointOutput extends StObject {
  
  /**
    * A user-supplied ID that uniquely identifies the MLModel. This value should be identical to the value of the MLModelId in the request.
    */
  var MLModelId: js.UndefOr[EntityId] = js.undefined
  
  /**
    * The endpoint information of the MLModel 
    */
  var RealtimeEndpointInfo: js.UndefOr[typings.awsSdk.machinelearningMod.RealtimeEndpointInfo] = js.undefined
}
object DeleteRealtimeEndpointOutput {
  
  @scala.inline
  def apply(): DeleteRealtimeEndpointOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRealtimeEndpointOutput]
  }
  
  @scala.inline
  implicit class DeleteRealtimeEndpointOutputMutableBuilder[Self <: DeleteRealtimeEndpointOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMLModelId(value: EntityId): Self = StObject.set(x, "MLModelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMLModelIdUndefined: Self = StObject.set(x, "MLModelId", js.undefined)
    
    @scala.inline
    def setRealtimeEndpointInfo(value: RealtimeEndpointInfo): Self = StObject.set(x, "RealtimeEndpointInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealtimeEndpointInfoUndefined: Self = StObject.set(x, "RealtimeEndpointInfo", js.undefined)
  }
}
