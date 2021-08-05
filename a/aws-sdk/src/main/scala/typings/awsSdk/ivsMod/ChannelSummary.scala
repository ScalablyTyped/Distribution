package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelSummary extends StObject {
  
  /**
    * Channel ARN.
    */
  var arn: js.UndefOr[ChannelArn] = js.undefined
  
  /**
    * Whether the channel is authorized.
    */
  var authorized: js.UndefOr[IsAuthorized] = js.undefined
  
  /**
    * Channel latency mode. Default: LOW.
    */
  var latencyMode: js.UndefOr[ChannelLatencyMode] = js.undefined
  
  /**
    * Channel name.
    */
  var name: js.UndefOr[ChannelName] = js.undefined
  
  /**
    * Array of 1-50 maps, each of the form string:string (key:value).
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object ChannelSummary {
  
  inline def apply(): ChannelSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelSummary]
  }
  
  extension [Self <: ChannelSummary](x: Self) {
    
    inline def setArn(value: ChannelArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setAuthorized(value: IsAuthorized): Self = StObject.set(x, "authorized", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedUndefined: Self = StObject.set(x, "authorized", js.undefined)
    
    inline def setLatencyMode(value: ChannelLatencyMode): Self = StObject.set(x, "latencyMode", value.asInstanceOf[js.Any])
    
    inline def setLatencyModeUndefined: Self = StObject.set(x, "latencyMode", js.undefined)
    
    inline def setName(value: ChannelName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
