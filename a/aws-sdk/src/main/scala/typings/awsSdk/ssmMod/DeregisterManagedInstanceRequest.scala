package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeregisterManagedInstanceRequest extends StObject {
  
  /**
    * The ID assigned to the managed instance when you registered it using the activation process. 
    */
  var InstanceId: ManagedInstanceId = js.native
}
object DeregisterManagedInstanceRequest {
  
  @scala.inline
  def apply(InstanceId: ManagedInstanceId): DeregisterManagedInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterManagedInstanceRequest]
  }
  
  @scala.inline
  implicit class DeregisterManagedInstanceRequestMutableBuilder[Self <: DeregisterManagedInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: ManagedInstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
