package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  /**
    * The type of event being logged.   Fleet state transition events:    FLEET_CREATED -- A fleet resource was successfully created with a status of NEW. Event messaging includes the fleet ID.   FLEET_STATE_DOWNLOADING -- Fleet status changed from NEW to DOWNLOADING. The compressed build has started downloading to a fleet instance for installation.   FLEET_STATE_VALIDATING -- Fleet status changed from DOWNLOADING to VALIDATING. GameLift has successfully downloaded the build and is now validating the build files.   FLEET_STATE_BUILDING -- Fleet status changed from VALIDATING to BUILDING. GameLift has successfully verified the build files and is now running the installation scripts.   FLEET_STATE_ACTIVATING -- Fleet status changed from BUILDING to ACTIVATING. GameLift is trying to launch an instance and test the connectivity between the build and the GameLift Service via the Server SDK.   FLEET_STATE_ACTIVE -- The fleet's status changed from ACTIVATING to ACTIVE. The fleet is now ready to host game sessions.   FLEET_STATE_ERROR -- The Fleet's status changed to ERROR. Describe the fleet event message for more details.    Fleet creation events (ordered by fleet creation activity):    FLEET_BINARY_DOWNLOAD_FAILED -- The build failed to download to the fleet instance.   FLEET_CREATION_EXTRACTING_BUILD -- The game server build was successfully downloaded to an instance, and the build files are now being extracted from the uploaded build and saved to an instance. Failure at this stage prevents a fleet from moving to ACTIVE status. Logs for this stage display a list of the files that are extracted and saved on the instance. Access the logs by using the URL in PreSignedLogUrl.   FLEET_CREATION_RUNNING_INSTALLER -- The game server build files were successfully extracted, and the GameLift is now running the build's install script (if one is included). Failure in this stage prevents a fleet from moving to ACTIVE status. Logs for this stage list the installation steps and whether or not the install completed successfully. Access the logs by using the URL in PreSignedLogUrl.   FLEET_CREATION_VALIDATING_RUNTIME_CONFIG -- The build process was successful, and the GameLift is now verifying that the game server launch paths, which are specified in the fleet's runtime configuration, exist. If any listed launch path exists, GameLift tries to launch a game server process and waits for the process to report ready. Failures in this stage prevent a fleet from moving to ACTIVE status. Logs for this stage list the launch paths in the runtime configuration and indicate whether each is found. Access the logs by using the URL in PreSignedLogUrl.   FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND -- Validation of the runtime configuration failed because the executable specified in a launch path does not exist on the instance.   FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE -- Validation of the runtime configuration failed because the executable specified in a launch path failed to run on the fleet instance.   FLEET_VALIDATION_TIMED_OUT -- Validation of the fleet at the end of creation timed out. Try fleet creation again.   FLEET_ACTIVATION_FAILED -- The fleet failed to successfully complete one of the steps in the fleet activation process. This event code indicates that the game build was successfully downloaded to a fleet instance, built, and validated, but was not able to start a server process. For more information, see Debug Fleet Creation Issues.   FLEET_ACTIVATION_FAILED_NO_INSTANCES -- Fleet creation was not able to obtain any instances based on the input fleet attributes. Try again at a different time or choose a different combination of fleet attributes such as fleet type, instance type, etc.   FLEET_INITIALIZATION_FAILED -- A generic exception occurred during fleet creation. Describe the fleet event message for more details.    VPC peering events:    FLEET_VPC_PEERING_SUCCEEDED -- A VPC peering connection has been established between the VPC for an GameLift fleet and a VPC in your Amazon Web Services account.   FLEET_VPC_PEERING_FAILED -- A requested VPC peering connection has failed. Event details and status information (see DescribeVpcPeeringConnections) provide additional detail. A common reason for peering failure is that the two VPCs have overlapping CIDR blocks of IPv4 addresses. To resolve this, change the CIDR block for the VPC in your Amazon Web Services account. For more information on VPC peering failures, see https://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide/invalid-peering-configurations.html    FLEET_VPC_PEERING_DELETED -- A VPC peering connection has been successfully deleted.    Spot instance events:     INSTANCE_INTERRUPTED -- A spot instance was interrupted by EC2 with a two-minute notification.    Spot process events:    SERVER_PROCESS_INVALID_PATH -- The game server executable or script could not be found based on the Fleet runtime configuration. Check that the launch path is correct based on the operating system of the Fleet.   SERVER_PROCESS_SDK_INITIALIZATION_TIMEOUT -- The server process did not call InitSDK() within the time expected. Check your game session log to see why InitSDK() was not called in time.   SERVER_PROCESS_PROCESS_READY_TIMEOUT -- The server process did not call ProcessReady() within the time expected after calling InitSDK(). Check your game session log to see why ProcessReady() was not called in time.   SERVER_PROCESS_CRASHED -- The server process exited without calling ProcessEnding(). Check your game session log to see why ProcessEnding() was not called.   SERVER_PROCESS_TERMINATED_UNHEALTHY -- The server process did not report a valid health check for too long and was therefore terminated by GameLift. Check your game session log to see if the thread became stuck processing a synchronous task for too long.   SERVER_PROCESS_FORCE_TERMINATED -- The server process did not exit cleanly after OnProcessTerminate() was sent within the time expected. Check your game session log to see why termination took longer than expected.   SERVER_PROCESS_PROCESS_EXIT_TIMEOUT -- The server process did not exit cleanly within the time expected after calling ProcessEnding(). Check your game session log to see why termination took longer than expected.    Game session events:    GAME_SESSION_ACTIVATION_TIMEOUT -- GameSession failed to activate within the expected time. Check your game session log to see why ActivateGameSession() took longer to complete than expected.    Other fleet events:    FLEET_SCALING_EVENT -- A change was made to the fleet's capacity settings (desired instances, minimum/maximum scaling limits). Event messaging includes the new capacity settings.   FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED -- A change was made to the fleet's game session protection policy setting. Event messaging includes both the old and new policy setting.    FLEET_DELETED -- A request to delete a fleet was initiated.    GENERIC_EVENT -- An unspecified event has occurred.  
    */
  var EventCode: js.UndefOr[typings.awsSdk.gameliftMod.EventCode] = js.undefined
  
  /**
    * A unique identifier for a fleet event.
    */
  var EventId: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * Time stamp indicating when this event occurred. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var EventTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Additional information related to the event.
    */
  var Message: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Location of stored logs with additional detail that is related to the event. This is useful for debugging issues. The URL is valid for 15 minutes. You can also access fleet creation logs through the GameLift console.
    */
  var PreSignedLogUrl: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * A unique identifier for an event resource, such as a fleet ID.
    */
  var ResourceId: js.UndefOr[NonZeroAndMaxString] = js.undefined
}
object Event {
  
  inline def apply(): Event = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Event]
  }
  
  extension [Self <: Event](x: Self) {
    
    inline def setEventCode(value: EventCode): Self = StObject.set(x, "EventCode", value.asInstanceOf[js.Any])
    
    inline def setEventCodeUndefined: Self = StObject.set(x, "EventCode", js.undefined)
    
    inline def setEventId(value: NonZeroAndMaxString): Self = StObject.set(x, "EventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdUndefined: Self = StObject.set(x, "EventId", js.undefined)
    
    inline def setEventTime(value: js.Date): Self = StObject.set(x, "EventTime", value.asInstanceOf[js.Any])
    
    inline def setEventTimeUndefined: Self = StObject.set(x, "EventTime", js.undefined)
    
    inline def setMessage(value: NonEmptyString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setPreSignedLogUrl(value: NonZeroAndMaxString): Self = StObject.set(x, "PreSignedLogUrl", value.asInstanceOf[js.Any])
    
    inline def setPreSignedLogUrlUndefined: Self = StObject.set(x, "PreSignedLogUrl", js.undefined)
    
    inline def setResourceId(value: NonZeroAndMaxString): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
  }
}
