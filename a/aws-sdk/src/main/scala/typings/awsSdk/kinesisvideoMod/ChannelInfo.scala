package typings.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelInfo extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the signaling channel.
    */
  var ChannelARN: js.UndefOr[ResourceARN] = js.native
  
  /**
    * The name of the signaling channel.
    */
  var ChannelName: js.UndefOr[typings.awsSdk.kinesisvideoMod.ChannelName] = js.native
  
  /**
    * Current status of the signaling channel.
    */
  var ChannelStatus: js.UndefOr[Status] = js.native
  
  /**
    * The type of the signaling channel.
    */
  var ChannelType: js.UndefOr[typings.awsSdk.kinesisvideoMod.ChannelType] = js.native
  
  /**
    * The time at which the signaling channel was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * A structure that contains the configuration for the SINGLE_MASTER channel type.
    */
  var SingleMasterConfiguration: js.UndefOr[typings.awsSdk.kinesisvideoMod.SingleMasterConfiguration] = js.native
  
  /**
    * The current version of the signaling channel.
    */
  var Version: js.UndefOr[typings.awsSdk.kinesisvideoMod.Version] = js.native
}
object ChannelInfo {
  
  @scala.inline
  def apply(): ChannelInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelInfo]
  }
  
  @scala.inline
  implicit class ChannelInfoMutableBuilder[Self <: ChannelInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelARN(value: ResourceARN): Self = StObject.set(x, "ChannelARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelARNUndefined: Self = StObject.set(x, "ChannelARN", js.undefined)
    
    @scala.inline
    def setChannelName(value: ChannelName): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelNameUndefined: Self = StObject.set(x, "ChannelName", js.undefined)
    
    @scala.inline
    def setChannelStatus(value: Status): Self = StObject.set(x, "ChannelStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelStatusUndefined: Self = StObject.set(x, "ChannelStatus", js.undefined)
    
    @scala.inline
    def setChannelType(value: ChannelType): Self = StObject.set(x, "ChannelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelTypeUndefined: Self = StObject.set(x, "ChannelType", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setSingleMasterConfiguration(value: SingleMasterConfiguration): Self = StObject.set(x, "SingleMasterConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleMasterConfigurationUndefined: Self = StObject.set(x, "SingleMasterConfiguration", js.undefined)
    
    @scala.inline
    def setVersion(value: Version): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
