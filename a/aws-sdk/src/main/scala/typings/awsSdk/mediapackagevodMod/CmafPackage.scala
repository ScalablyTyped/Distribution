package typings.awsSdk.mediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CmafPackage extends StObject {
  
  var Encryption: js.UndefOr[CmafEncryption] = js.undefined
  
  /**
    * A list of HLS manifest configurations.
    */
  var HlsManifests: listOfHlsManifest
  
  /**
    * Duration (in seconds) of each fragment. Actual fragments will be
  rounded to the nearest multiple of the source fragment duration.
    */
  var SegmentDurationSeconds: js.UndefOr[integer] = js.undefined
}
object CmafPackage {
  
  @scala.inline
  def apply(HlsManifests: listOfHlsManifest): CmafPackage = {
    val __obj = js.Dynamic.literal(HlsManifests = HlsManifests.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmafPackage]
  }
  
  @scala.inline
  implicit class CmafPackageMutableBuilder[Self <: CmafPackage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryption(value: CmafEncryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
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
  }
}
