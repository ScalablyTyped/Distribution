package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateReason extends StObject {
  
  /**
    * The reason code for the state change.
    */
  var Code: js.UndefOr[String] = js.undefined
  
  /**
    * The message for the state change.    Server.InsufficientInstanceCapacity: There was insufficient capacity available to satisfy the launch request.    Server.InternalError: An internal error caused the instance to terminate during launch.    Server.ScheduledStop: The instance was stopped due to a scheduled retirement.    Server.SpotInstanceShutdown: The instance was stopped because the number of Spot requests with a maximum price equal to or higher than the Spot price exceeded available capacity or because of an increase in the Spot price.    Server.SpotInstanceTermination: The instance was terminated because the number of Spot requests with a maximum price equal to or higher than the Spot price exceeded available capacity or because of an increase in the Spot price.    Client.InstanceInitiatedShutdown: The instance was shut down using the shutdown -h command from the instance.    Client.InstanceTerminated: The instance was terminated or rebooted during AMI creation.    Client.InternalError: A client error caused the instance to terminate during launch.    Client.InvalidSnapshot.NotFound: The specified snapshot was not found.    Client.UserInitiatedHibernate: Hibernation was initiated on the instance.    Client.UserInitiatedShutdown: The instance was shut down using the Amazon EC2 API.    Client.VolumeLimitExceeded: The limit on the number of EBS volumes or total storage was exceeded. Decrease usage or request an increase in your account limits.  
    */
  var Message: js.UndefOr[String] = js.undefined
}
object StateReason {
  
  @scala.inline
  def apply(): StateReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateReason]
  }
  
  @scala.inline
  implicit class StateReasonMutableBuilder[Self <: StateReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
