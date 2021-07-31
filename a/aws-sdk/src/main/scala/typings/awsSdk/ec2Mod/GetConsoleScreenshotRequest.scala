package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConsoleScreenshotRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the instance.
    */
  var InstanceId: typings.awsSdk.ec2Mod.InstanceId
  
  /**
    * When set to true, acts as keystroke input and wakes up an instance that's in standby or "sleep" mode.
    */
  var WakeUp: js.UndefOr[Boolean] = js.undefined
}
object GetConsoleScreenshotRequest {
  
  @scala.inline
  def apply(InstanceId: InstanceId): GetConsoleScreenshotRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConsoleScreenshotRequest]
  }
  
  @scala.inline
  implicit class GetConsoleScreenshotRequestMutableBuilder[Self <: GetConsoleScreenshotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWakeUp(value: Boolean): Self = StObject.set(x, "WakeUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWakeUpUndefined: Self = StObject.set(x, "WakeUp", js.undefined)
  }
}
