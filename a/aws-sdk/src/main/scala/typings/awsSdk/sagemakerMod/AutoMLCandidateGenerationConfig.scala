package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoMLCandidateGenerationConfig extends StObject {
  
  /**
    * A URL to the Amazon S3 data source containing selected features from the input data source to run an Autopilot job (optional). This file should be in json format as shown below:   { "FeatureAttributeNames":["col1", "col2", ...] }. The key name FeatureAttributeNames is fixed. The values listed in ["col1", "col2", ...] is case sensitive and should be a list of strings containing unique values that are a subset of the column names in the input data. The list of columns provided must not include the target column.
    */
  var FeatureSpecificationS3Uri: js.UndefOr[S3Uri] = js.undefined
}
object AutoMLCandidateGenerationConfig {
  
  inline def apply(): AutoMLCandidateGenerationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoMLCandidateGenerationConfig]
  }
  
  extension [Self <: AutoMLCandidateGenerationConfig](x: Self) {
    
    inline def setFeatureSpecificationS3Uri(value: S3Uri): Self = StObject.set(x, "FeatureSpecificationS3Uri", value.asInstanceOf[js.Any])
    
    inline def setFeatureSpecificationS3UriUndefined: Self = StObject.set(x, "FeatureSpecificationS3Uri", js.undefined)
  }
}
