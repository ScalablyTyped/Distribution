package typings.awsSdk.lookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InferenceS3OutputConfiguration extends StObject {
  
  /**
    *  The bucket containing the output results from the inference 
    */
  var Bucket: S3Bucket
  
  /**
    *  The prefix for the S3 bucket used for the output results from the inference. 
    */
  var Prefix: js.UndefOr[S3Prefix] = js.undefined
}
object InferenceS3OutputConfiguration {
  
  inline def apply(Bucket: S3Bucket): InferenceS3OutputConfiguration = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferenceS3OutputConfiguration]
  }
  
  extension [Self <: InferenceS3OutputConfiguration](x: Self) {
    
    inline def setBucket(value: S3Bucket): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: S3Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
  }
}
