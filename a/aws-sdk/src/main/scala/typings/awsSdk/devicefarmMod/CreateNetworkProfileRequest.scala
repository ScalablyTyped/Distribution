package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNetworkProfileRequest extends StObject {
  
  /**
    * The description of the network profile.
    */
  var description: js.UndefOr[Message] = js.native
  
  /**
    * The data throughput rate in bits per second, as an integer from 0 to 104857600.
    */
  var downlinkBandwidthBits: js.UndefOr[Long] = js.native
  
  /**
    * Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
    */
  var downlinkDelayMs: js.UndefOr[Long] = js.native
  
  /**
    * Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
    */
  var downlinkJitterMs: js.UndefOr[Long] = js.native
  
  /**
    * Proportion of received packets that fail to arrive from 0 to 100 percent.
    */
  var downlinkLossPercent: js.UndefOr[PercentInteger] = js.native
  
  /**
    * The name for the new network profile.
    */
  var name: Name = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the project for which you want to create a network profile.
    */
  var projectArn: AmazonResourceName = js.native
  
  /**
    * The type of network profile to create. Valid values are listed here.
    */
  var `type`: js.UndefOr[NetworkProfileType] = js.native
  
  /**
    * The data throughput rate in bits per second, as an integer from 0 to 104857600.
    */
  var uplinkBandwidthBits: js.UndefOr[Long] = js.native
  
  /**
    * Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
    */
  var uplinkDelayMs: js.UndefOr[Long] = js.native
  
  /**
    * Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
    */
  var uplinkJitterMs: js.UndefOr[Long] = js.native
  
  /**
    * Proportion of transmitted packets that fail to arrive from 0 to 100 percent.
    */
  var uplinkLossPercent: js.UndefOr[PercentInteger] = js.native
}
object CreateNetworkProfileRequest {
  
  @scala.inline
  def apply(name: Name, projectArn: AmazonResourceName): CreateNetworkProfileRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], projectArn = projectArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNetworkProfileRequest]
  }
  
  @scala.inline
  implicit class CreateNetworkProfileRequestMutableBuilder[Self <: CreateNetworkProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Message): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDownlinkBandwidthBits(value: Long): Self = StObject.set(x, "downlinkBandwidthBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownlinkBandwidthBitsUndefined: Self = StObject.set(x, "downlinkBandwidthBits", js.undefined)
    
    @scala.inline
    def setDownlinkDelayMs(value: Long): Self = StObject.set(x, "downlinkDelayMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownlinkDelayMsUndefined: Self = StObject.set(x, "downlinkDelayMs", js.undefined)
    
    @scala.inline
    def setDownlinkJitterMs(value: Long): Self = StObject.set(x, "downlinkJitterMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownlinkJitterMsUndefined: Self = StObject.set(x, "downlinkJitterMs", js.undefined)
    
    @scala.inline
    def setDownlinkLossPercent(value: PercentInteger): Self = StObject.set(x, "downlinkLossPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownlinkLossPercentUndefined: Self = StObject.set(x, "downlinkLossPercent", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectArn(value: AmazonResourceName): Self = StObject.set(x, "projectArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: NetworkProfileType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUplinkBandwidthBits(value: Long): Self = StObject.set(x, "uplinkBandwidthBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUplinkBandwidthBitsUndefined: Self = StObject.set(x, "uplinkBandwidthBits", js.undefined)
    
    @scala.inline
    def setUplinkDelayMs(value: Long): Self = StObject.set(x, "uplinkDelayMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUplinkDelayMsUndefined: Self = StObject.set(x, "uplinkDelayMs", js.undefined)
    
    @scala.inline
    def setUplinkJitterMs(value: Long): Self = StObject.set(x, "uplinkJitterMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUplinkJitterMsUndefined: Self = StObject.set(x, "uplinkJitterMs", js.undefined)
    
    @scala.inline
    def setUplinkLossPercent(value: PercentInteger): Self = StObject.set(x, "uplinkLossPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUplinkLossPercentUndefined: Self = StObject.set(x, "uplinkLossPercent", js.undefined)
  }
}
