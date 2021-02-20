package typings.awsSdk.mediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MssPackage extends StObject {
  
  var Encryption: js.UndefOr[MssEncryption] = js.native
  
  /**
    * A list of MSS manifest configurations.
    */
  var MssManifests: listOfMssManifest = js.native
  
  /**
    * The duration (in seconds) of each segment.
    */
  var SegmentDurationSeconds: js.UndefOr[integer] = js.native
}
object MssPackage {
  
  @scala.inline
  def apply(MssManifests: listOfMssManifest): MssPackage = {
    val __obj = js.Dynamic.literal(MssManifests = MssManifests.asInstanceOf[js.Any])
    __obj.asInstanceOf[MssPackage]
  }
  
  @scala.inline
  implicit class MssPackageMutableBuilder[Self <: MssPackage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryption(value: MssEncryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    @scala.inline
    def setMssManifests(value: listOfMssManifest): Self = StObject.set(x, "MssManifests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMssManifestsVarargs(value: MssManifest*): Self = StObject.set(x, "MssManifests", js.Array(value :_*))
    
    @scala.inline
    def setSegmentDurationSeconds(value: integer): Self = StObject.set(x, "SegmentDurationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentDurationSecondsUndefined: Self = StObject.set(x, "SegmentDurationSeconds", js.undefined)
  }
}
