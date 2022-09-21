package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFuotaTaskRequest extends StObject {
  
  var Id: FuotaTaskId
}
object DeleteFuotaTaskRequest {
  
  inline def apply(Id: FuotaTaskId): DeleteFuotaTaskRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFuotaTaskRequest]
  }
  
  extension [Self <: DeleteFuotaTaskRequest](x: Self) {
    
    inline def setId(value: FuotaTaskId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
