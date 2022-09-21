package typings.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSignalingChannelInput extends StObject {
  
  /**
    * A name for the signaling channel that you are creating. It must be unique for each Amazon Web Services account and Amazon Web Services Region.
    */
  var ChannelName: typings.awsSdk.kinesisvideoMod.ChannelName
  
  /**
    * A type of the signaling channel that you are creating. Currently, SINGLE_MASTER is the only supported channel type. 
    */
  var ChannelType: js.UndefOr[typings.awsSdk.kinesisvideoMod.ChannelType] = js.undefined
  
  /**
    * A structure containing the configuration for the SINGLE_MASTER channel type. 
    */
  var SingleMasterConfiguration: js.UndefOr[typings.awsSdk.kinesisvideoMod.SingleMasterConfiguration] = js.undefined
  
  /**
    * A set of tags (key-value pairs) that you want to associate with this channel.
    */
  var Tags: js.UndefOr[TagOnCreateList] = js.undefined
}
object CreateSignalingChannelInput {
  
  inline def apply(ChannelName: ChannelName): CreateSignalingChannelInput = {
    val __obj = js.Dynamic.literal(ChannelName = ChannelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSignalingChannelInput]
  }
  
  extension [Self <: CreateSignalingChannelInput](x: Self) {
    
    inline def setChannelName(value: ChannelName): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
    
    inline def setChannelType(value: ChannelType): Self = StObject.set(x, "ChannelType", value.asInstanceOf[js.Any])
    
    inline def setChannelTypeUndefined: Self = StObject.set(x, "ChannelType", js.undefined)
    
    inline def setSingleMasterConfiguration(value: SingleMasterConfiguration): Self = StObject.set(x, "SingleMasterConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSingleMasterConfigurationUndefined: Self = StObject.set(x, "SingleMasterConfiguration", js.undefined)
    
    inline def setTags(value: TagOnCreateList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
