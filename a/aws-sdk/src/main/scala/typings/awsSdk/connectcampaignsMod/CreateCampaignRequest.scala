package typings.awsSdk.connectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCampaignRequest extends StObject {
  
  var connectInstanceId: InstanceId
  
  var dialerConfig: DialerConfig
  
  var name: CampaignName
  
  var outboundCallConfig: OutboundCallConfig
  
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateCampaignRequest {
  
  inline def apply(
    connectInstanceId: InstanceId,
    dialerConfig: DialerConfig,
    name: CampaignName,
    outboundCallConfig: OutboundCallConfig
  ): CreateCampaignRequest = {
    val __obj = js.Dynamic.literal(connectInstanceId = connectInstanceId.asInstanceOf[js.Any], dialerConfig = dialerConfig.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outboundCallConfig = outboundCallConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCampaignRequest]
  }
  
  extension [Self <: CreateCampaignRequest](x: Self) {
    
    inline def setConnectInstanceId(value: InstanceId): Self = StObject.set(x, "connectInstanceId", value.asInstanceOf[js.Any])
    
    inline def setDialerConfig(value: DialerConfig): Self = StObject.set(x, "dialerConfig", value.asInstanceOf[js.Any])
    
    inline def setName(value: CampaignName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOutboundCallConfig(value: OutboundCallConfig): Self = StObject.set(x, "outboundCallConfig", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
