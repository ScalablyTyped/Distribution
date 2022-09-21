package typings.awsSdk.connectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressiveDialerConfig extends StObject {
  
  var bandwidthAllocation: BandwidthAllocation
}
object ProgressiveDialerConfig {
  
  inline def apply(bandwidthAllocation: BandwidthAllocation): ProgressiveDialerConfig = {
    val __obj = js.Dynamic.literal(bandwidthAllocation = bandwidthAllocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressiveDialerConfig]
  }
  
  extension [Self <: ProgressiveDialerConfig](x: Self) {
    
    inline def setBandwidthAllocation(value: BandwidthAllocation): Self = StObject.set(x, "bandwidthAllocation", value.asInstanceOf[js.Any])
  }
}
