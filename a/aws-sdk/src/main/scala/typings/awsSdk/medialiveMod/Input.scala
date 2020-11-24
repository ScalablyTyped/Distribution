package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Input extends js.Object {
  
  /**
    * The Unique ARN of the input (generated, immutable).
    */
  var Arn: js.UndefOr[string] = js.native
  
  /**
    * A list of channel IDs that that input is attached to (currently an input can only be attached to one channel).
    */
  var AttachedChannels: js.UndefOr[listOfString] = js.native
  
  /**
    * A list of the destinations of the input (PUSH-type).
    */
  var Destinations: js.UndefOr[listOfInputDestination] = js.native
  
  /**
    * The generated ID of the input (unique for user account, immutable).
    */
  var Id: js.UndefOr[string] = js.native
  
  /**
    * STANDARD - MediaLive expects two sources to be connected to this input. If the channel is also STANDARD, both sources will be ingested. If the channel is SINGLE_PIPELINE, only the first source will be ingested; the second source will always be ignored, even if the first source fails.
  SINGLE_PIPELINE - You can connect only one source to this input. If the ChannelClass is also  SINGLE_PIPELINE, this value is valid. If the ChannelClass is STANDARD, this value is not valid because the channel requires two sources in the input.
    */
  var InputClass: js.UndefOr[typings.awsSdk.medialiveMod.InputClass] = js.native
  
  /**
    * Settings for the input devices.
    */
  var InputDevices: js.UndefOr[listOfInputDeviceSettings] = js.native
  
  /**
    * Certain pull input sources can be dynamic, meaning that they can have their URL's dynamically changes
  during input switch actions. Presently, this functionality only works with MP4_FILE inputs.
    */
  var InputSourceType: js.UndefOr[typings.awsSdk.medialiveMod.InputSourceType] = js.native
  
  /**
    * A list of MediaConnect Flows for this input.
    */
  var MediaConnectFlows: js.UndefOr[listOfMediaConnectFlow] = js.native
  
  /**
    * The user-assigned name (This is a mutable value).
    */
  var Name: js.UndefOr[string] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the role this input assumes during and after creation.
    */
  var RoleArn: js.UndefOr[string] = js.native
  
  /**
    * A list of IDs for all the Input Security Groups attached to the input.
    */
  var SecurityGroups: js.UndefOr[listOfString] = js.native
  
  /**
    * A list of the sources of the input (PULL-type).
    */
  var Sources: js.UndefOr[listOfInputSource] = js.native
  
  var State: js.UndefOr[InputState] = js.native
  
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typings.awsSdk.medialiveMod.Tags] = js.native
  
  var Type: js.UndefOr[InputType] = js.native
}
object Input {
  
  @scala.inline
  def apply(): Input = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Input]
  }
  
  @scala.inline
  implicit class InputOps[Self <: Input] (val x: Self) extends AnyVal {
    
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
    def setArn(value: string): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setAttachedChannelsVarargs(value: string*): Self = this.set("AttachedChannels", js.Array(value :_*))
    
    @scala.inline
    def setAttachedChannels(value: listOfString): Self = this.set("AttachedChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachedChannels: Self = this.set("AttachedChannels", js.undefined)
    
    @scala.inline
    def setDestinationsVarargs(value: InputDestination*): Self = this.set("Destinations", js.Array(value :_*))
    
    @scala.inline
    def setDestinations(value: listOfInputDestination): Self = this.set("Destinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinations: Self = this.set("Destinations", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setInputClass(value: InputClass): Self = this.set("InputClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputClass: Self = this.set("InputClass", js.undefined)
    
    @scala.inline
    def setInputDevicesVarargs(value: InputDeviceSettings*): Self = this.set("InputDevices", js.Array(value :_*))
    
    @scala.inline
    def setInputDevices(value: listOfInputDeviceSettings): Self = this.set("InputDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputDevices: Self = this.set("InputDevices", js.undefined)
    
    @scala.inline
    def setInputSourceType(value: InputSourceType): Self = this.set("InputSourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputSourceType: Self = this.set("InputSourceType", js.undefined)
    
    @scala.inline
    def setMediaConnectFlowsVarargs(value: MediaConnectFlow*): Self = this.set("MediaConnectFlows", js.Array(value :_*))
    
    @scala.inline
    def setMediaConnectFlows(value: listOfMediaConnectFlow): Self = this.set("MediaConnectFlows", value.asInstanceOf[js.Any])
    
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
    def setSecurityGroupsVarargs(value: string*): Self = this.set("SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroups(value: listOfString): Self = this.set("SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroups: Self = this.set("SecurityGroups", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: InputSource*): Self = this.set("Sources", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: listOfInputSource): Self = this.set("Sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSources: Self = this.set("Sources", js.undefined)
    
    @scala.inline
    def setState(value: InputState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setType(value: InputType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
