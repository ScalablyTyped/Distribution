package typings.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMountTargetRequest extends StObject {
  
  /**
    * The ID of the mount target to delete (String).
    */
  var MountTargetId: typings.awsSdk.efsMod.MountTargetId
}
object DeleteMountTargetRequest {
  
  inline def apply(MountTargetId: MountTargetId): DeleteMountTargetRequest = {
    val __obj = js.Dynamic.literal(MountTargetId = MountTargetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMountTargetRequest]
  }
  
  extension [Self <: DeleteMountTargetRequest](x: Self) {
    
    inline def setMountTargetId(value: MountTargetId): Self = StObject.set(x, "MountTargetId", value.asInstanceOf[js.Any])
  }
}
