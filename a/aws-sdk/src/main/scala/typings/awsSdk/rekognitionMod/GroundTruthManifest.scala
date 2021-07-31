package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroundTruthManifest extends StObject {
  
  var S3Object: js.UndefOr[typings.awsSdk.rekognitionMod.S3Object] = js.undefined
}
object GroundTruthManifest {
  
  @scala.inline
  def apply(): GroundTruthManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroundTruthManifest]
  }
  
  @scala.inline
  implicit class GroundTruthManifestMutableBuilder[Self <: GroundTruthManifest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3Object(value: S3Object): Self = StObject.set(x, "S3Object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ObjectUndefined: Self = StObject.set(x, "S3Object", js.undefined)
  }
}
