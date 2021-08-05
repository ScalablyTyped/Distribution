package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Asset extends StObject {
  
  var GroundTruthManifest: js.UndefOr[typings.awsSdk.rekognitionMod.GroundTruthManifest] = js.undefined
}
object Asset {
  
  inline def apply(): Asset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Asset]
  }
  
  extension [Self <: Asset](x: Self) {
    
    inline def setGroundTruthManifest(value: GroundTruthManifest): Self = StObject.set(x, "GroundTruthManifest", value.asInstanceOf[js.Any])
    
    inline def setGroundTruthManifestUndefined: Self = StObject.set(x, "GroundTruthManifest", js.undefined)
  }
}
