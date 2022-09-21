package typings.awsSdk.mediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MssPackage extends StObject {
  
  var Encryption: js.UndefOr[MssEncryption] = js.undefined
  
  /**
    * A list of MSS manifest configurations.
    */
  var MssManifests: listOfMssManifest
  
  /**
    * The duration (in seconds) of each segment.
    */
  var SegmentDurationSeconds: js.UndefOr[integer] = js.undefined
}
object MssPackage {
  
  inline def apply(MssManifests: listOfMssManifest): MssPackage = {
    val __obj = js.Dynamic.literal(MssManifests = MssManifests.asInstanceOf[js.Any])
    __obj.asInstanceOf[MssPackage]
  }
  
  extension [Self <: MssPackage](x: Self) {
    
    inline def setEncryption(value: MssEncryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    inline def setMssManifests(value: listOfMssManifest): Self = StObject.set(x, "MssManifests", value.asInstanceOf[js.Any])
    
    inline def setMssManifestsVarargs(value: MssManifest*): Self = StObject.set(x, "MssManifests", js.Array(value*))
    
    inline def setSegmentDurationSeconds(value: integer): Self = StObject.set(x, "SegmentDurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setSegmentDurationSecondsUndefined: Self = StObject.set(x, "SegmentDurationSeconds", js.undefined)
  }
}
