package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelingJobS3DataSource extends StObject {
  
  /**
    * The Amazon S3 location of the manifest file that describes the input data objects.
    */
  var ManifestS3Uri: S3Uri
}
object LabelingJobS3DataSource {
  
  inline def apply(ManifestS3Uri: S3Uri): LabelingJobS3DataSource = {
    val __obj = js.Dynamic.literal(ManifestS3Uri = ManifestS3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelingJobS3DataSource]
  }
  
  extension [Self <: LabelingJobS3DataSource](x: Self) {
    
    inline def setManifestS3Uri(value: S3Uri): Self = StObject.set(x, "ManifestS3Uri", value.asInstanceOf[js.Any])
  }
}
