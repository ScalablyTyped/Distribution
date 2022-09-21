package typings.awsSyntheticsPuppeteer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Bucket extends StObject {
  
  var s3Bucket: String
  
  var s3Key: String
}
object S3Bucket {
  
  inline def apply(s3Bucket: String, s3Key: String): S3Bucket = {
    val __obj = js.Dynamic.literal(s3Bucket = s3Bucket.asInstanceOf[js.Any], s3Key = s3Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Bucket]
  }
  
  extension [Self <: S3Bucket](x: Self) {
    
    inline def setS3Bucket(value: String): Self = StObject.set(x, "s3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3Key(value: String): Self = StObject.set(x, "s3Key", value.asInstanceOf[js.Any])
  }
}
