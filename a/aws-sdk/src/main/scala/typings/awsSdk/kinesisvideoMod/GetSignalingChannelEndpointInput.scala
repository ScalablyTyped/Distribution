package typings.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSignalingChannelEndpointInput extends StObject {
  
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
  implicit class GetSignalingChannelEndpointInputMutableBuilder[Self <: GetSignalingChannelEndpointInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelARN(value: ResourceARN): Self = StObject.set(x, "ChannelARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleMasterChannelEndpointConfiguration(value: SingleMasterChannelEndpointConfiguration): Self = StObject.set(x, "SingleMasterChannelEndpointConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleMasterChannelEndpointConfigurationUndefined: Self = StObject.set(x, "SingleMasterChannelEndpointConfiguration", js.undefined)
  }
}
