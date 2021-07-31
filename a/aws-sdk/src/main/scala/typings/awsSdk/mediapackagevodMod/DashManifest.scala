package typings.awsSdk.mediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashManifest extends StObject {
  
  /**
    * Determines the position of some tags in the Media Presentation Description (MPD).  When set to FULL, elements like SegmentTemplate and ContentProtection are included in each Representation.  When set to COMPACT, duplicate elements are combined and presented at the AdaptationSet level.
    */
  var ManifestLayout: js.UndefOr[typings.awsSdk.mediapackagevodMod.ManifestLayout] = js.undefined
  
  /**
    * An optional string to include in the name of the manifest.
    */
  var ManifestName: js.UndefOr[string] = js.undefined
  
  /**
    * Minimum duration (in seconds) that a player will buffer media before starting the presentation.
    */
  var MinBufferTimeSeconds: js.UndefOr[integer] = js.undefined
  
  /**
    * The Dynamic Adaptive Streaming over HTTP (DASH) profile type.  When set to "HBBTV_1_5", HbbTV 1.5 compliant output is enabled.
    */
  var Profile: js.UndefOr[typings.awsSdk.mediapackagevodMod.Profile] = js.undefined
  
  var StreamSelection: js.UndefOr[typings.awsSdk.mediapackagevodMod.StreamSelection] = js.undefined
}
object DashManifest {
  
  @scala.inline
  def apply(): DashManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashManifest]
  }
  
  @scala.inline
  implicit class DashManifestMutableBuilder[Self <: DashManifest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManifestLayout(value: ManifestLayout): Self = StObject.set(x, "ManifestLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestLayoutUndefined: Self = StObject.set(x, "ManifestLayout", js.undefined)
    
    @scala.inline
    def setManifestName(value: string): Self = StObject.set(x, "ManifestName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestNameUndefined: Self = StObject.set(x, "ManifestName", js.undefined)
    
    @scala.inline
    def setMinBufferTimeSeconds(value: integer): Self = StObject.set(x, "MinBufferTimeSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinBufferTimeSecondsUndefined: Self = StObject.set(x, "MinBufferTimeSeconds", js.undefined)
    
    @scala.inline
    def setProfile(value: Profile): Self = StObject.set(x, "Profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileUndefined: Self = StObject.set(x, "Profile", js.undefined)
    
    @scala.inline
    def setStreamSelection(value: StreamSelection): Self = StObject.set(x, "StreamSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamSelectionUndefined: Self = StObject.set(x, "StreamSelection", js.undefined)
  }
}
