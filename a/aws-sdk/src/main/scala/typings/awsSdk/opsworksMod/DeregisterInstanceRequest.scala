package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterInstanceRequest extends StObject {
  
  /**
    * The instance ID.
    */
  var InstanceId: String
}
object DeregisterInstanceRequest {
  
  @scala.inline
  def apply(InstanceId: String): DeregisterInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterInstanceRequest]
  }
  
  @scala.inline
  implicit class DeregisterInstanceRequestMutableBuilder[Self <: DeregisterInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
