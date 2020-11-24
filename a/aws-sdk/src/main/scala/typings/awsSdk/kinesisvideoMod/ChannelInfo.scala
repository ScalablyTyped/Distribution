package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelInfo extends js.Object {
  
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
  implicit class ChannelInfoOps[Self <: ChannelInfo] (val x: Self) extends AnyVal {
    
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
    def setChannelARN(value: ResourceARN): Self = this.set("ChannelARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelARN: Self = this.set("ChannelARN", js.undefined)
    
    @scala.inline
    def setChannelName(value: ChannelName): Self = this.set("ChannelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelName: Self = this.set("ChannelName", js.undefined)
    
    @scala.inline
    def setChannelStatus(value: Status): Self = this.set("ChannelStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelStatus: Self = this.set("ChannelStatus", js.undefined)
    
    @scala.inline
    def setChannelType(value: ChannelType): Self = this.set("ChannelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelType: Self = this.set("ChannelType", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setSingleMasterConfiguration(value: SingleMasterConfiguration): Self = this.set("SingleMasterConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleMasterConfiguration: Self = this.set("SingleMasterConfiguration", js.undefined)
    
    @scala.inline
    def setVersion(value: Version): Self = this.set("Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
}
