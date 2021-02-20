package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnassignInstanceRequest extends StObject {
  
  /**
    * The instance ID.
    */
  var InstanceId: String = js.native
}
object UnassignInstanceRequest {
  
  @scala.inline
  def apply(InstanceId: String): UnassignInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnassignInstanceRequest]
  }
  
  @scala.inline
  implicit class UnassignInstanceRequestMutableBuilder[Self <: UnassignInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
