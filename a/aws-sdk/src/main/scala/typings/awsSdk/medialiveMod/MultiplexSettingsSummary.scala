package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiplexSettingsSummary extends StObject {
  
  /**
    * Transport stream bit rate.
    */
  var TransportStreamBitrate: js.UndefOr[integerMin1000000Max100000000] = js.undefined
}
object MultiplexSettingsSummary {
  
  inline def apply(): MultiplexSettingsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiplexSettingsSummary]
  }
  
  extension [Self <: MultiplexSettingsSummary](x: Self) {
    
    inline def setTransportStreamBitrate(value: integerMin1000000Max100000000): Self = StObject.set(x, "TransportStreamBitrate", value.asInstanceOf[js.Any])
    
    inline def setTransportStreamBitrateUndefined: Self = StObject.set(x, "TransportStreamBitrate", js.undefined)
  }
}
