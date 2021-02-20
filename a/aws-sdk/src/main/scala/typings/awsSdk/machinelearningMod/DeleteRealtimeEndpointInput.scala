package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRealtimeEndpointInput extends StObject {
  
  /**
    * The ID assigned to the MLModel during creation.
    */
  var MLModelId: EntityId = js.native
}
object DeleteRealtimeEndpointInput {
  
  @scala.inline
  def apply(MLModelId: EntityId): DeleteRealtimeEndpointInput = {
    val __obj = js.Dynamic.literal(MLModelId = MLModelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRealtimeEndpointInput]
  }
  
  @scala.inline
  implicit class DeleteRealtimeEndpointInputMutableBuilder[Self <: DeleteRealtimeEndpointInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMLModelId(value: EntityId): Self = StObject.set(x, "MLModelId", value.asInstanceOf[js.Any])
  }
}
