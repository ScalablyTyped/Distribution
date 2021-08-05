package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartInstanceRequest extends StObject {
  
  /**
    * The instance ID.
    */
  var InstanceId: String
}
object StartInstanceRequest {
  
  inline def apply(InstanceId: String): StartInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartInstanceRequest]
  }
  
  extension [Self <: StartInstanceRequest](x: Self) {
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
