package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSignalingChannelInput extends js.Object {
  
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
  implicit class CreateSignalingChannelInputOps[Self <: CreateSignalingChannelInput] (val x: Self) extends AnyVal {
    
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
    def setChannelName(value: ChannelName): Self = this.set("ChannelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelType(value: ChannelType): Self = this.set("ChannelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelType: Self = this.set("ChannelType", js.undefined)
    
    @scala.inline
    def setSingleMasterConfiguration(value: SingleMasterConfiguration): Self = this.set("SingleMasterConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleMasterConfiguration: Self = this.set("SingleMasterConfiguration", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagOnCreateList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
