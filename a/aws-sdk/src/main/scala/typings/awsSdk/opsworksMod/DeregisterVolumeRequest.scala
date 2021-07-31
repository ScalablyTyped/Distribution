package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterVolumeRequest extends StObject {
  
  /**
    * The AWS OpsWorks Stacks volume ID, which is the GUID that AWS OpsWorks Stacks assigned to the instance when you registered the volume with the stack, not the Amazon EC2 volume ID.
    */
  var VolumeId: String
}
object DeregisterVolumeRequest {
  
  @scala.inline
  def apply(VolumeId: String): DeregisterVolumeRequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterVolumeRequest]
  }
  
  @scala.inline
  implicit class DeregisterVolumeRequestMutableBuilder[Self <: DeregisterVolumeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVolumeId(value: String): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
  }
}
