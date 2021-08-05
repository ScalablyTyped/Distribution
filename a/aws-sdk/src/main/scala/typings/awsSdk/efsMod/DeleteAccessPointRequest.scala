package typings.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAccessPointRequest extends StObject {
  
  /**
    * The ID of the access point that you want to delete.
    */
  var AccessPointId: typings.awsSdk.efsMod.AccessPointId
}
object DeleteAccessPointRequest {
  
  inline def apply(AccessPointId: AccessPointId): DeleteAccessPointRequest = {
    val __obj = js.Dynamic.literal(AccessPointId = AccessPointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAccessPointRequest]
  }
  
  extension [Self <: DeleteAccessPointRequest](x: Self) {
    
    inline def setAccessPointId(value: AccessPointId): Self = StObject.set(x, "AccessPointId", value.asInstanceOf[js.Any])
  }
}
