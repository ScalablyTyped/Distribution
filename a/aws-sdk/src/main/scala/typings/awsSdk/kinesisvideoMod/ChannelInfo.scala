package typings.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelInfo extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the signaling channel.
    */
  var ChannelARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * The name of the signaling channel.
    */
  var ChannelName: js.UndefOr[typings.awsSdk.kinesisvideoMod.ChannelName] = js.undefined
  
  /**
    * Current status of the signaling channel.
    */
  var ChannelStatus: js.UndefOr[Status] = js.undefined
  
  /**
    * The type of the signaling channel.
    */
  var ChannelType: js.UndefOr[typings.awsSdk.kinesisvideoMod.ChannelType] = js.undefined
  
  /**
    * The time at which the signaling channel was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * A structure that contains the configuration for the SINGLE_MASTER channel type.
    */
  var SingleMasterConfiguration: js.UndefOr[typings.awsSdk.kinesisvideoMod.SingleMasterConfiguration] = js.undefined
  
  /**
    * The current version of the signaling channel.
    */
  var Version: js.UndefOr[typings.awsSdk.kinesisvideoMod.Version] = js.undefined
}
object ChannelInfo {
  
  inline def apply(): ChannelInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelInfo]
  }
  
  extension [Self <: ChannelInfo](x: Self) {
    
    inline def setChannelARN(value: ResourceARN): Self = StObject.set(x, "ChannelARN", value.asInstanceOf[js.Any])
    
    inline def setChannelARNUndefined: Self = StObject.set(x, "ChannelARN", js.undefined)
    
    inline def setChannelName(value: ChannelName): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
    
    inline def setChannelNameUndefined: Self = StObject.set(x, "ChannelName", js.undefined)
    
    inline def setChannelStatus(value: Status): Self = StObject.set(x, "ChannelStatus", value.asInstanceOf[js.Any])
    
    inline def setChannelStatusUndefined: Self = StObject.set(x, "ChannelStatus", js.undefined)
    
    inline def setChannelType(value: ChannelType): Self = StObject.set(x, "ChannelType", value.asInstanceOf[js.Any])
    
    inline def setChannelTypeUndefined: Self = StObject.set(x, "ChannelType", js.undefined)
    
    inline def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setSingleMasterConfiguration(value: SingleMasterConfiguration): Self = StObject.set(x, "SingleMasterConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSingleMasterConfigurationUndefined: Self = StObject.set(x, "SingleMasterConfiguration", js.undefined)
    
    inline def setVersion(value: Version): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
