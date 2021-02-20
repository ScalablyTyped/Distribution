package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignInstanceRequest extends StObject {
  
  /**
    * The instance ID.
    */
  var InstanceId: String = js.native
  
  /**
    * The layer ID, which must correspond to a custom layer. You cannot assign a registered instance to a built-in layer.
    */
  var LayerIds: Strings = js.native
}
object AssignInstanceRequest {
  
  @scala.inline
  def apply(InstanceId: String, LayerIds: Strings): AssignInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], LayerIds = LayerIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignInstanceRequest]
  }
  
  @scala.inline
  implicit class AssignInstanceRequestMutableBuilder[Self <: AssignInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerIds(value: Strings): Self = StObject.set(x, "LayerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerIdsVarargs(value: String*): Self = StObject.set(x, "LayerIds", js.Array(value :_*))
  }
}
