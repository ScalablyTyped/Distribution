package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignVolumeRequest extends StObject {
  
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * The volume ID.
    */
  var VolumeId: String
}
object AssignVolumeRequest {
  
  @scala.inline
  def apply(VolumeId: String): AssignVolumeRequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignVolumeRequest]
  }
  
  @scala.inline
  implicit class AssignVolumeRequestMutableBuilder[Self <: AssignVolumeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setVolumeId(value: String): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
  }
}
