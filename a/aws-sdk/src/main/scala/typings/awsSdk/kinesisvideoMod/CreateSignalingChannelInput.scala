package typings.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSignalingChannelInput extends StObject {
  
  /**
    * A name for the signaling channel that you are creating. It must be unique for each AWS account and AWS Region.
    */
  var ChannelName: typings.awsSdk.kinesisvideoMod.ChannelName = js.native
  
  /**
    * A type of the signaling channel that you are creating. Currently, SINGLE_MASTER is the only supported channel type. 
    */
  var ChannelType: js.UndefOr[typings.awsSdk.kinesisvideoMod.ChannelType] = js.native
  
  /**
    * A structure containing the configuration for the SINGLE_MASTER channel type. 
    */
  var SingleMasterConfiguration: js.UndefOr[typings.awsSdk.kinesisvideoMod.SingleMasterConfiguration] = js.native
  
  /**
    * A set of tags (key-value pairs) that you want to associate with this channel.
    */
  var Tags: js.UndefOr[TagOnCreateList] = js.native
}
object CreateSignalingChannelInput {
  
  @scala.inline
  def apply(ChannelName: ChannelName): CreateSignalingChannelInput = {
    val __obj = js.Dynamic.literal(ChannelName = ChannelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSignalingChannelInput]
  }
  
  @scala.inline
  implicit class CreateSignalingChannelInputMutableBuilder[Self <: CreateSignalingChannelInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelName(value: ChannelName): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelType(value: ChannelType): Self = StObject.set(x, "ChannelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelTypeUndefined: Self = StObject.set(x, "ChannelType", js.undefined)
    
    @scala.inline
    def setSingleMasterConfiguration(value: SingleMasterConfiguration): Self = StObject.set(x, "SingleMasterConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleMasterConfigurationUndefined: Self = StObject.set(x, "SingleMasterConfiguration", js.undefined)
    
    @scala.inline
    def setTags(value: TagOnCreateList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
