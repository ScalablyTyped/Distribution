package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ImportSource extends StObject {
  
  /**
    *  The IAM ARN role used to access the source S3 bucket. 
    */
  var S3BucketAccessRoleArn: String
  
  /**
    *  The region associated with the source S3 bucket. 
    */
  var S3BucketRegion: String
  
  /**
    *  The URI for the source S3 bucket. 
    */
  var S3LocationUri: String
}
object S3ImportSource {
  
  inline def apply(S3BucketAccessRoleArn: String, S3BucketRegion: String, S3LocationUri: String): S3ImportSource = {
    val __obj = js.Dynamic.literal(S3BucketAccessRoleArn = S3BucketAccessRoleArn.asInstanceOf[js.Any], S3BucketRegion = S3BucketRegion.asInstanceOf[js.Any], S3LocationUri = S3LocationUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ImportSource]
  }
  
  extension [Self <: S3ImportSource](x: Self) {
    
    inline def setS3BucketAccessRoleArn(value: String): Self = StObject.set(x, "S3BucketAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setS3BucketRegion(value: String): Self = StObject.set(x, "S3BucketRegion", value.asInstanceOf[js.Any])
    
    inline def setS3LocationUri(value: String): Self = StObject.set(x, "S3LocationUri", value.asInstanceOf[js.Any])
  }
}
