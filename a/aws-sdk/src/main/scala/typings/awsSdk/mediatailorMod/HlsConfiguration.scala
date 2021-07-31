package typings.awsSdk.mediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HlsConfiguration extends StObject {
  
  /**
    * The URL that is used to initiate a playback session for devices that support Apple HLS. The session uses server-side reporting.
    */
  var ManifestEndpointPrefix: js.UndefOr[string] = js.undefined
}
object HlsConfiguration {
  
  @scala.inline
  def apply(): HlsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsConfiguration]
  }
  
  @scala.inline
  implicit class HlsConfigurationMutableBuilder[Self <: HlsConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManifestEndpointPrefix(value: string): Self = StObject.set(x, "ManifestEndpointPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestEndpointPrefixUndefined: Self = StObject.set(x, "ManifestEndpointPrefix", js.undefined)
  }
}
