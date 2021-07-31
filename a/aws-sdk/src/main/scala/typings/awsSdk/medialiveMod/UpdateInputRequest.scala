package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInputRequest extends StObject {
  
  /**
    * Destination settings for PUSH type inputs.
    */
  var Destinations: js.UndefOr[listOfInputDestinationRequest] = js.undefined
  
  /**
    * Settings for the devices.
    */
  var InputDevices: js.UndefOr[listOfInputDeviceRequest] = js.undefined
  
  /**
    * Unique ID of the input.
    */
  var InputId: string
  
  /**
    * A list of security groups referenced by IDs to attach to the input.
    */
  var InputSecurityGroups: js.UndefOr[listOfString] = js.undefined
  
  /**
    * A list of the MediaConnect Flow ARNs that you want to use as the source of the input. You can specify as few as one
  Flow and presently, as many as two. The only requirement is when you have more than one is that each Flow is in a
  separate Availability Zone as this ensures your EML input is redundant to AZ issues.
    */
  var MediaConnectFlows: js.UndefOr[listOfMediaConnectFlowRequest] = js.undefined
  
  /**
    * Name of the input.
    */
  var Name: js.UndefOr[string] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the role this input assumes during and after creation.
    */
  var RoleArn: js.UndefOr[string] = js.undefined
  
  /**
    * The source URLs for a PULL-type input. Every PULL type input needs
  exactly two source URLs for redundancy.
  Only specify sources for PULL type Inputs. Leave Destinations empty.
    */
  var Sources: js.UndefOr[listOfInputSourceRequest] = js.undefined
}
object UpdateInputRequest {
  
  @scala.inline
  def apply(InputId: string): UpdateInputRequest = {
    val __obj = js.Dynamic.literal(InputId = InputId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInputRequest]
  }
  
  @scala.inline
  implicit class UpdateInputRequestMutableBuilder[Self <: UpdateInputRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinations(value: listOfInputDestinationRequest): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationsUndefined: Self = StObject.set(x, "Destinations", js.undefined)
    
    @scala.inline
    def setDestinationsVarargs(value: InputDestinationRequest*): Self = StObject.set(x, "Destinations", js.Array(value :_*))
    
    @scala.inline
    def setInputDevices(value: listOfInputDeviceRequest): Self = StObject.set(x, "InputDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDevicesUndefined: Self = StObject.set(x, "InputDevices", js.undefined)
    
    @scala.inline
    def setInputDevicesVarargs(value: InputDeviceRequest*): Self = StObject.set(x, "InputDevices", js.Array(value :_*))
    
    @scala.inline
    def setInputId(value: string): Self = StObject.set(x, "InputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputSecurityGroups(value: listOfString): Self = StObject.set(x, "InputSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputSecurityGroupsUndefined: Self = StObject.set(x, "InputSecurityGroups", js.undefined)
    
    @scala.inline
    def setInputSecurityGroupsVarargs(value: string*): Self = StObject.set(x, "InputSecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setMediaConnectFlows(value: listOfMediaConnectFlowRequest): Self = StObject.set(x, "MediaConnectFlows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaConnectFlowsUndefined: Self = StObject.set(x, "MediaConnectFlows", js.undefined)
    
    @scala.inline
    def setMediaConnectFlowsVarargs(value: MediaConnectFlowRequest*): Self = StObject.set(x, "MediaConnectFlows", js.Array(value :_*))
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setRoleArn(value: string): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    @scala.inline
    def setSources(value: listOfInputSourceRequest): Self = StObject.set(x, "Sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "Sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: InputSourceRequest*): Self = StObject.set(x, "Sources", js.Array(value :_*))
  }
}
