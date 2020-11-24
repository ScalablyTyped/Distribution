package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DashManifest extends js.Object {
  
  /**
    * Determines the position of some tags in the Media Presentation Description (MPD).  When set to FULL, elements like SegmentTemplate and ContentProtection are included in each Representation.  When set to COMPACT, duplicate elements are combined and presented at the AdaptationSet level.
    */
  var ManifestLayout: js.UndefOr[typings.awsSdk.mediapackagevodMod.ManifestLayout] = js.native
  
  /**
    * An optional string to include in the name of the manifest.
    */
  var ManifestName: js.UndefOr[string] = js.native
  
  /**
    * Minimum duration (in seconds) that a player will buffer media before starting the presentation.
    */
  var MinBufferTimeSeconds: js.UndefOr[integer] = js.native
  
  /**
    * The Dynamic Adaptive Streaming over HTTP (DASH) profile type.  When set to "HBBTV_1_5", HbbTV 1.5 compliant output is enabled.
    */
  var Profile: js.UndefOr[typings.awsSdk.mediapackagevodMod.Profile] = js.native
  
  var StreamSelection: js.UndefOr[typings.awsSdk.mediapackagevodMod.StreamSelection] = js.native
}
object DashManifest {
  
  @scala.inline
  def apply(): DashManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashManifest]
  }
  
  @scala.inline
  implicit class DashManifestOps[Self <: DashManifest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setManifestLayout(value: ManifestLayout): Self = this.set("ManifestLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManifestLayout: Self = this.set("ManifestLayout", js.undefined)
    
    @scala.inline
    def setManifestName(value: string): Self = this.set("ManifestName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManifestName: Self = this.set("ManifestName", js.undefined)
    
    @scala.inline
    def setMinBufferTimeSeconds(value: integer): Self = this.set("MinBufferTimeSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinBufferTimeSeconds: Self = this.set("MinBufferTimeSeconds", js.undefined)
    
    @scala.inline
    def setProfile(value: Profile): Self = this.set("Profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile: Self = this.set("Profile", js.undefined)
    
    @scala.inline
    def setStreamSelection(value: StreamSelection): Self = this.set("StreamSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamSelection: Self = this.set("StreamSelection", js.undefined)
  }
}
