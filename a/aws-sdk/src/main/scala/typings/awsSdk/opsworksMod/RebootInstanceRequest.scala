package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RebootInstanceRequest extends StObject {
  
  /**
    * The instance ID.
    */
  var InstanceId: String
}
object RebootInstanceRequest {
  
  @scala.inline
  def apply(InstanceId: String): RebootInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootInstanceRequest]
  }
  
  @scala.inline
  implicit class RebootInstanceRequestMutableBuilder[Self <: RebootInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
