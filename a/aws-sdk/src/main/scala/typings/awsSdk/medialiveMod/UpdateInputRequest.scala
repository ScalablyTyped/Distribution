package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateInputRequest extends js.Object {
  
  /**
    * Destination settings for PUSH type inputs.
    */
  var Destinations: js.UndefOr[listOfInputDestinationRequest] = js.native
  
  /**
    * Settings for the devices.
    */
  var InputDevices: js.UndefOr[listOfInputDeviceRequest] = js.native
  
  /**
    * Unique ID of the input.
    */
  var InputId: string = js.native
  
  /**
    * A list of security groups referenced by IDs to attach to the input.
    */
  var InputSecurityGroups: js.UndefOr[listOfString] = js.native
  
  /**
    * A list of the MediaConnect Flow ARNs that you want to use as the source of the input. You can specify as few as one
  Flow and presently, as many as two. The only requirement is when you have more than one is that each Flow is in a
  separate Availability Zone as this ensures your EML input is redundant to AZ issues.
    */
  var MediaConnectFlows: js.UndefOr[listOfMediaConnectFlowRequest] = js.native
  
  /**
    * Name of the input.
    */
  var Name: js.UndefOr[string] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the role this input assumes during and after creation.
    */
  var RoleArn: js.UndefOr[string] = js.native
  
  /**
    * The source URLs for a PULL-type input. Every PULL type input needs
  exactly two source URLs for redundancy.
  Only specify sources for PULL type Inputs. Leave Destinations empty.
    */
  var Sources: js.UndefOr[listOfInputSourceRequest] = js.native
}
object UpdateInputRequest {
  
  @scala.inline
  def apply(InputId: string): UpdateInputRequest = {
    val __obj = js.Dynamic.literal(InputId = InputId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInputRequest]
  }
  
  @scala.inline
  implicit class UpdateInputRequestOps[Self <: UpdateInputRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInputId(value: string): Self = this.set("InputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationsVarargs(value: InputDestinationRequest*): Self = this.set("Destinations", js.Array(value :_*))
    
    @scala.inline
    def setDestinations(value: listOfInputDestinationRequest): Self = this.set("Destinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinations: Self = this.set("Destinations", js.undefined)
    
    @scala.inline
    def setInputDevicesVarargs(value: InputDeviceRequest*): Self = this.set("InputDevices", js.Array(value :_*))
    
    @scala.inline
    def setInputDevices(value: listOfInputDeviceRequest): Self = this.set("InputDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputDevices: Self = this.set("InputDevices", js.undefined)
    
    @scala.inline
    def setInputSecurityGroupsVarargs(value: string*): Self = this.set("InputSecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setInputSecurityGroups(value: listOfString): Self = this.set("InputSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputSecurityGroups: Self = this.set("InputSecurityGroups", js.undefined)
    
    @scala.inline
    def setMediaConnectFlowsVarargs(value: MediaConnectFlowRequest*): Self = this.set("MediaConnectFlows", js.Array(value :_*))
    
    @scala.inline
    def setMediaConnectFlows(value: listOfMediaConnectFlowRequest): Self = this.set("MediaConnectFlows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaConnectFlows: Self = this.set("MediaConnectFlows", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setRoleArn(value: string): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: InputSourceRequest*): Self = this.set("Sources", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: listOfInputSourceRequest): Self = this.set("Sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSources: Self = this.set("Sources", js.undefined)
  }
}
