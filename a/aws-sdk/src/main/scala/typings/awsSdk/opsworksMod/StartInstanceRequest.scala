package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartInstanceRequest extends StObject {
  
  /**
    * The instance ID.
    */
  var InstanceId: String = js.native
}
object StartInstanceRequest {
  
  @scala.inline
  def apply(InstanceId: String): StartInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartInstanceRequest]
  }
  
  @scala.inline
  implicit class StartInstanceRequestMutableBuilder[Self <: StartInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
