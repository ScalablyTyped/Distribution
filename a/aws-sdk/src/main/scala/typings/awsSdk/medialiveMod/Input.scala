package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Input extends StObject {
  
  /**
    * The Unique ARN of the input (generated, immutable).
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * A list of channel IDs that that input is attached to (currently an input can only be attached to one channel).
    */
  var AttachedChannels: js.UndefOr[listOfString] = js.undefined
  
  /**
    * A list of the destinations of the input (PUSH-type).
    */
  var Destinations: js.UndefOr[listOfInputDestination] = js.undefined
  
  /**
    * The generated ID of the input (unique for user account, immutable).
    */
  var Id: js.UndefOr[string] = js.undefined
  
  /**
    * STANDARD - MediaLive expects two sources to be connected to this input. If the channel is also STANDARD, both sources will be ingested. If the channel is SINGLE_PIPELINE, only the first source will be ingested; the second source will always be ignored, even if the first source fails.
  SINGLE_PIPELINE - You can connect only one source to this input. If the ChannelClass is also  SINGLE_PIPELINE, this value is valid. If the ChannelClass is STANDARD, this value is not valid because the channel requires two sources in the input.
    */
  var InputClass: js.UndefOr[typings.awsSdk.medialiveMod.InputClass] = js.undefined
  
  /**
    * Settings for the input devices.
    */
  var InputDevices: js.UndefOr[listOfInputDeviceSettings] = js.undefined
  
  /**
    * Certain pull input sources can be dynamic, meaning that they can have their URL's dynamically changes
  during input switch actions. Presently, this functionality only works with MP4_FILE inputs.
    */
  var InputSourceType: js.UndefOr[typings.awsSdk.medialiveMod.InputSourceType] = js.undefined
  
  /**
    * A list of MediaConnect Flows for this input.
    */
  var MediaConnectFlows: js.UndefOr[listOfMediaConnectFlow] = js.undefined
  
  /**
    * The user-assigned name (This is a mutable value).
    */
  var Name: js.UndefOr[string] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the role this input assumes during and after creation.
    */
  var RoleArn: js.UndefOr[string] = js.undefined
  
  /**
    * A list of IDs for all the Input Security Groups attached to the input.
    */
  var SecurityGroups: js.UndefOr[listOfString] = js.undefined
  
  /**
    * A list of the sources of the input (PULL-type).
    */
  var Sources: js.UndefOr[listOfInputSource] = js.undefined
  
  var State: js.UndefOr[InputState] = js.undefined
  
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typings.awsSdk.medialiveMod.Tags] = js.undefined
  
  var Type: js.UndefOr[InputType] = js.undefined
}
object Input {
  
  @scala.inline
  def apply(): Input = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Input]
  }
  
  @scala.inline
  implicit class InputMutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setAttachedChannels(value: listOfString): Self = StObject.set(x, "AttachedChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachedChannelsUndefined: Self = StObject.set(x, "AttachedChannels", js.undefined)
    
    @scala.inline
    def setAttachedChannelsVarargs(value: string*): Self = StObject.set(x, "AttachedChannels", js.Array(value :_*))
    
    @scala.inline
    def setDestinations(value: listOfInputDestination): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationsUndefined: Self = StObject.set(x, "Destinations", js.undefined)
    
    @scala.inline
    def setDestinationsVarargs(value: InputDestination*): Self = StObject.set(x, "Destinations", js.Array(value :_*))
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setInputClass(value: InputClass): Self = StObject.set(x, "InputClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputClassUndefined: Self = StObject.set(x, "InputClass", js.undefined)
    
    @scala.inline
    def setInputDevices(value: listOfInputDeviceSettings): Self = StObject.set(x, "InputDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDevicesUndefined: Self = StObject.set(x, "InputDevices", js.undefined)
    
    @scala.inline
    def setInputDevicesVarargs(value: InputDeviceSettings*): Self = StObject.set(x, "InputDevices", js.Array(value :_*))
    
    @scala.inline
    def setInputSourceType(value: InputSourceType): Self = StObject.set(x, "InputSourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputSourceTypeUndefined: Self = StObject.set(x, "InputSourceType", js.undefined)
    
    @scala.inline
    def setMediaConnectFlows(value: listOfMediaConnectFlow): Self = StObject.set(x, "MediaConnectFlows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaConnectFlowsUndefined: Self = StObject.set(x, "MediaConnectFlows", js.undefined)
    
    @scala.inline
    def setMediaConnectFlowsVarargs(value: MediaConnectFlow*): Self = StObject.set(x, "MediaConnectFlows", js.Array(value :_*))
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setRoleArn(value: string): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    @scala.inline
    def setSecurityGroups(value: listOfString): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: string*): Self = StObject.set(x, "SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: listOfInputSource): Self = StObject.set(x, "Sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "Sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: InputSource*): Self = StObject.set(x, "Sources", js.Array(value :_*))
    
    @scala.inline
    def setState(value: InputState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setType(value: InputType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
