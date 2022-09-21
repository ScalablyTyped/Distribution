package typings.awsSdk.mediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseOutputItem extends StObject {
  
  /**
    * DASH manifest configuration settings.
    */
  var DashPlaylistSettings: js.UndefOr[typings.awsSdk.mediatailorMod.DashPlaylistSettings] = js.undefined
  
  /**
    * HLS manifest configuration settings.
    */
  var HlsPlaylistSettings: js.UndefOr[typings.awsSdk.mediatailorMod.HlsPlaylistSettings] = js.undefined
  
  /**
    * The name of the manifest for the channel that will appear in the channel output's playback URL.
    */
  var ManifestName: string
  
  /**
    * The URL used for playback by content players.
    */
  var PlaybackUrl: string
  
  /**
    * A string used to associate a package configuration source group with a channel output.
    */
  var SourceGroup: string
}
object ResponseOutputItem {
  
  inline def apply(ManifestName: string, PlaybackUrl: string, SourceGroup: string): ResponseOutputItem = {
    val __obj = js.Dynamic.literal(ManifestName = ManifestName.asInstanceOf[js.Any], PlaybackUrl = PlaybackUrl.asInstanceOf[js.Any], SourceGroup = SourceGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseOutputItem]
  }
  
  extension [Self <: ResponseOutputItem](x: Self) {
    
    inline def setDashPlaylistSettings(value: DashPlaylistSettings): Self = StObject.set(x, "DashPlaylistSettings", value.asInstanceOf[js.Any])
    
    inline def setDashPlaylistSettingsUndefined: Self = StObject.set(x, "DashPlaylistSettings", js.undefined)
    
    inline def setHlsPlaylistSettings(value: HlsPlaylistSettings): Self = StObject.set(x, "HlsPlaylistSettings", value.asInstanceOf[js.Any])
    
    inline def setHlsPlaylistSettingsUndefined: Self = StObject.set(x, "HlsPlaylistSettings", js.undefined)
    
    inline def setManifestName(value: string): Self = StObject.set(x, "ManifestName", value.asInstanceOf[js.Any])
    
    inline def setPlaybackUrl(value: string): Self = StObject.set(x, "PlaybackUrl", value.asInstanceOf[js.Any])
    
    inline def setSourceGroup(value: string): Self = StObject.set(x, "SourceGroup", value.asInstanceOf[js.Any])
  }
}
