package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSignalingChannelEndpointInput extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the signalling channel for which you want to get an endpoint.
    */
  var ChannelARN: ResourceARN = js.native
  
  /**
    * A structure containing the endpoint configuration for the SINGLE_MASTER channel type.
    */
  var SingleMasterChannelEndpointConfiguration: js.UndefOr[typings.awsSdk.kinesisvideoMod.SingleMasterChannelEndpointConfiguration] = js.native
}
object GetSignalingChannelEndpointInput {
  
  @scala.inline
  def apply(ChannelARN: ResourceARN): GetSignalingChannelEndpointInput = {
    val __obj = js.Dynamic.literal(ChannelARN = ChannelARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSignalingChannelEndpointInput]
  }
  
  @scala.inline
  implicit class GetSignalingChannelEndpointInputOps[Self <: GetSignalingChannelEndpointInput] (val x: Self) extends AnyVal {
    
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
    def setSingleMasterChannelEndpointConfiguration(value: SingleMasterChannelEndpointConfiguration): Self = this.set("SingleMasterChannelEndpointConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleMasterChannelEndpointConfiguration: Self = this.set("SingleMasterChannelEndpointConfiguration", js.undefined)
  }
}
