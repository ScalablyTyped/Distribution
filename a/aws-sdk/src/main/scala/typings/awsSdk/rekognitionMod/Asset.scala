package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Asset extends StObject {
  
  var GroundTruthManifest: js.UndefOr[typings.awsSdk.rekognitionMod.GroundTruthManifest] = js.undefined
}
object Asset {
  
  @scala.inline
  def apply(): Asset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Asset]
  }
  
  @scala.inline
  implicit class AssetMutableBuilder[Self <: Asset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroundTruthManifest(value: GroundTruthManifest): Self = StObject.set(x, "GroundTruthManifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroundTruthManifestUndefined: Self = StObject.set(x, "GroundTruthManifest", js.undefined)
  }
}
