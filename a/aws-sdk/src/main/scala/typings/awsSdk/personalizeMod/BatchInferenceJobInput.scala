package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchInferenceJobInput extends StObject {
  
  /**
    * The URI of the Amazon S3 location that contains your input data. The Amazon S3 bucket must be in the same region as the API endpoint you are calling.
    */
  var s3DataSource: S3DataConfig
}
object BatchInferenceJobInput {
  
  inline def apply(s3DataSource: S3DataConfig): BatchInferenceJobInput = {
    val __obj = js.Dynamic.literal(s3DataSource = s3DataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchInferenceJobInput]
  }
  
  extension [Self <: BatchInferenceJobInput](x: Self) {
    
    inline def setS3DataSource(value: S3DataConfig): Self = StObject.set(x, "s3DataSource", value.asInstanceOf[js.Any])
  }
}
