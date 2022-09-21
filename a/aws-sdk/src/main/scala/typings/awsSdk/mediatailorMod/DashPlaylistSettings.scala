package typings.awsSdk.mediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashPlaylistSettings extends StObject {
  
  /**
    * The total duration (in seconds) of each manifest. Minimum value: 30 seconds. Maximum value: 3600 seconds.
    */
  var ManifestWindowSeconds: js.UndefOr[integer] = js.undefined
  
  /**
    * Minimum amount of content (measured in seconds) that a player must keep available in the buffer. Minimum value: 2 seconds. Maximum value: 60 seconds.
    */
  var MinBufferTimeSeconds: js.UndefOr[integer] = js.undefined
  
  /**
    * Minimum amount of time (in seconds) that the player should wait before requesting updates to the manifest. Minimum value: 2 seconds. Maximum value: 60 seconds.
    */
  var MinUpdatePeriodSeconds: js.UndefOr[integer] = js.undefined
  
  /**
    * Amount of time (in seconds) that the player should be from the live point at the end of the manifest. Minimum value: 2 seconds. Maximum value: 60 seconds.
    */
  var SuggestedPresentationDelaySeconds: js.UndefOr[integer] = js.undefined
}
object DashPlaylistSettings {
  
  inline def apply(): DashPlaylistSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashPlaylistSettings]
  }
  
  extension [Self <: DashPlaylistSettings](x: Self) {
    
    inline def setManifestWindowSeconds(value: integer): Self = StObject.set(x, "ManifestWindowSeconds", value.asInstanceOf[js.Any])
    
    inline def setManifestWindowSecondsUndefined: Self = StObject.set(x, "ManifestWindowSeconds", js.undefined)
    
    inline def setMinBufferTimeSeconds(value: integer): Self = StObject.set(x, "MinBufferTimeSeconds", value.asInstanceOf[js.Any])
    
    inline def setMinBufferTimeSecondsUndefined: Self = StObject.set(x, "MinBufferTimeSeconds", js.undefined)
    
    inline def setMinUpdatePeriodSeconds(value: integer): Self = StObject.set(x, "MinUpdatePeriodSeconds", value.asInstanceOf[js.Any])
    
    inline def setMinUpdatePeriodSecondsUndefined: Self = StObject.set(x, "MinUpdatePeriodSeconds", js.undefined)
    
    inline def setSuggestedPresentationDelaySeconds(value: integer): Self = StObject.set(x, "SuggestedPresentationDelaySeconds", value.asInstanceOf[js.Any])
    
    inline def setSuggestedPresentationDelaySecondsUndefined: Self = StObject.set(x, "SuggestedPresentationDelaySeconds", js.undefined)
  }
}
