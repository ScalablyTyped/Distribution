package typings.awsSdk.lookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetGroundTruthManifest extends StObject {
  
  /**
    * The S3 bucket location for the manifest file.
    */
  var S3Object: js.UndefOr[InputS3Object] = js.undefined
}
object DatasetGroundTruthManifest {
  
  inline def apply(): DatasetGroundTruthManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetGroundTruthManifest]
  }
  
  extension [Self <: DatasetGroundTruthManifest](x: Self) {
    
    inline def setS3Object(value: InputS3Object): Self = StObject.set(x, "S3Object", value.asInstanceOf[js.Any])
    
    inline def setS3ObjectUndefined: Self = StObject.set(x, "S3Object", js.undefined)
  }
}
