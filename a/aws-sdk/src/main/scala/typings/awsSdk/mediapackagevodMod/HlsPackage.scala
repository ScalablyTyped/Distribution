package typings.awsSdk.mediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HlsPackage extends StObject {
  
  var Encryption: js.UndefOr[HlsEncryption] = js.undefined
  
  /**
    * A list of HLS manifest configurations.
    */
  var HlsManifests: listOfHlsManifest
  
  /**
    * Duration (in seconds) of each fragment. Actual fragments will be
  rounded to the nearest multiple of the source fragment duration.
    */
  var SegmentDurationSeconds: js.UndefOr[integer] = js.undefined
  
  /**
    * When enabled, audio streams will be placed in rendition groups in the output.
    */
  var UseAudioRenditionGroup: js.UndefOr[boolean] = js.undefined
}
object HlsPackage {
  
  @scala.inline
  def apply(HlsManifests: listOfHlsManifest): HlsPackage = {
    val __obj = js.Dynamic.literal(HlsManifests = HlsManifests.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsPackage]
  }
  
  @scala.inline
  implicit class HlsPackageMutableBuilder[Self <: HlsPackage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryption(value: HlsEncryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    @scala.inline
    def setHlsManifests(value: listOfHlsManifest): Self = StObject.set(x, "HlsManifests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHlsManifestsVarargs(value: HlsManifest*): Self = StObject.set(x, "HlsManifests", js.Array(value :_*))
    
    @scala.inline
    def setSegmentDurationSeconds(value: integer): Self = StObject.set(x, "SegmentDurationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentDurationSecondsUndefined: Self = StObject.set(x, "SegmentDurationSeconds", js.undefined)
    
    @scala.inline
    def setUseAudioRenditionGroup(value: boolean): Self = StObject.set(x, "UseAudioRenditionGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseAudioRenditionGroupUndefined: Self = StObject.set(x, "UseAudioRenditionGroup", js.undefined)
  }
}
