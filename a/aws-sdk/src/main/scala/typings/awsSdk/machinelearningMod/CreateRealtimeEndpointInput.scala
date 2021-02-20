package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRealtimeEndpointInput extends StObject {
  
  /**
    * The ID assigned to the MLModel during creation.
    */
  var MLModelId: EntityId = js.native
}
object CreateRealtimeEndpointInput {
  
  @scala.inline
  def apply(MLModelId: EntityId): CreateRealtimeEndpointInput = {
    val __obj = js.Dynamic.literal(MLModelId = MLModelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRealtimeEndpointInput]
  }
  
  @scala.inline
  implicit class CreateRealtimeEndpointInputMutableBuilder[Self <: CreateRealtimeEndpointInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMLModelId(value: EntityId): Self = StObject.set(x, "MLModelId", value.asInstanceOf[js.Any])
  }
}
