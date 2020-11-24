package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignInstanceRequest extends js.Object {
  
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
  implicit class AssignInstanceRequestOps[Self <: AssignInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerIdsVarargs(value: String*): Self = this.set("LayerIds", js.Array(value :_*))
    
    @scala.inline
    def setLayerIds(value: Strings): Self = this.set("LayerIds", value.asInstanceOf[js.Any])
  }
}
