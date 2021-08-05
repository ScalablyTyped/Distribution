package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBucketIntelligentTieringConfigurationRequest extends StObject {
  
  /**
    * The name of the Amazon S3 bucket whose configuration you want to modify or retrieve.
    */
  var Bucket: BucketName
  
  /**
    * The ID used to identify the S3 Intelligent-Tiering configuration.
    */
  var Id: IntelligentTieringId
}
object DeleteBucketIntelligentTieringConfigurationRequest {
  
  inline def apply(Bucket: BucketName, Id: IntelligentTieringId): DeleteBucketIntelligentTieringConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketIntelligentTieringConfigurationRequest]
  }
  
  extension [Self <: DeleteBucketIntelligentTieringConfigurationRequest](x: Self) {
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setId(value: IntelligentTieringId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
