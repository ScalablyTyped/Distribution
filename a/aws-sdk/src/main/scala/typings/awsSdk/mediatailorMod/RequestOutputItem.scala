package typings.awsSdk.mediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestOutputItem extends StObject {
  
  /**
    * DASH manifest configuration parameters.
    */
  var DashPlaylistSettings: js.UndefOr[typings.awsSdk.mediatailorMod.DashPlaylistSettings] = js.undefined
  
  /**
    * HLS playlist configuration parameters.
    */
  var HlsPlaylistSettings: js.UndefOr[typings.awsSdk.mediatailorMod.HlsPlaylistSettings] = js.undefined
  
  /**
    * The name of the manifest for the channel. The name appears in the PlaybackUrl.
    */
  var ManifestName: string
  
  /**
    * A string used to match which HttpPackageConfiguration is used for each VodSource.
    */
  var SourceGroup: string
}
object RequestOutputItem {
  
  inline def apply(ManifestName: string, SourceGroup: string): RequestOutputItem = {
    val __obj = js.Dynamic.literal(ManifestName = ManifestName.asInstanceOf[js.Any], SourceGroup = SourceGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOutputItem]
  }
  
  extension [Self <: RequestOutputItem](x: Self) {
    
    inline def setDashPlaylistSettings(value: DashPlaylistSettings): Self = StObject.set(x, "DashPlaylistSettings", value.asInstanceOf[js.Any])
    
    inline def setDashPlaylistSettingsUndefined: Self = StObject.set(x, "DashPlaylistSettings", js.undefined)
    
    inline def setHlsPlaylistSettings(value: HlsPlaylistSettings): Self = StObject.set(x, "HlsPlaylistSettings", value.asInstanceOf[js.Any])
    
    inline def setHlsPlaylistSettingsUndefined: Self = StObject.set(x, "HlsPlaylistSettings", js.undefined)
    
    inline def setManifestName(value: string): Self = StObject.set(x, "ManifestName", value.asInstanceOf[js.Any])
    
    inline def setSourceGroup(value: string): Self = StObject.set(x, "SourceGroup", value.asInstanceOf[js.Any])
  }
}
