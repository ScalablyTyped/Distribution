package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyInstanceEventStartTimeRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the event whose date and time you are modifying.
    */
  var InstanceEventId: String = js.native
  
  /**
    * The ID of the instance with the scheduled event.
    */
  var InstanceId: typings.awsSdk.ec2Mod.InstanceId = js.native
  
  /**
    * The new date and time when the event will take place.
    */
  var NotBefore: DateTime = js.native
}
object ModifyInstanceEventStartTimeRequest {
  
  @scala.inline
  def apply(InstanceEventId: String, InstanceId: InstanceId, NotBefore: DateTime): ModifyInstanceEventStartTimeRequest = {
    val __obj = js.Dynamic.literal(InstanceEventId = InstanceEventId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], NotBefore = NotBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstanceEventStartTimeRequest]
  }
  
  @scala.inline
  implicit class ModifyInstanceEventStartTimeRequestMutableBuilder[Self <: ModifyInstanceEventStartTimeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setInstanceEventId(value: String): Self = StObject.set(x, "InstanceEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotBefore(value: DateTime): Self = StObject.set(x, "NotBefore", value.asInstanceOf[js.Any])
  }
}
