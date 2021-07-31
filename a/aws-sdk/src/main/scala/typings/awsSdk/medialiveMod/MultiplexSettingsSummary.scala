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
  
  @scala.inline
  def apply(): MultiplexSettingsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiplexSettingsSummary]
  }
  
  @scala.inline
  implicit class MultiplexSettingsSummaryMutableBuilder[Self <: MultiplexSettingsSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransportStreamBitrate(value: integerMin1000000Max100000000): Self = StObject.set(x, "TransportStreamBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportStreamBitrateUndefined: Self = StObject.set(x, "TransportStreamBitrate", js.undefined)
  }
}
