package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportTaskS3LocationRequest extends StObject {
  
  /**
    * The destination Amazon S3 bucket.
    */
  var S3Bucket: String
  
  /**
    * The prefix (logical hierarchy) in the bucket.
    */
  var S3Prefix: js.UndefOr[String] = js.undefined
}
object ExportTaskS3LocationRequest {
  
  inline def apply(S3Bucket: String): ExportTaskS3LocationRequest = {
    val __obj = js.Dynamic.literal(S3Bucket = S3Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportTaskS3LocationRequest]
  }
  
  extension [Self <: ExportTaskS3LocationRequest](x: Self) {
    
    inline def setS3Bucket(value: String): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3Prefix(value: String): Self = StObject.set(x, "S3Prefix", value.asInstanceOf[js.Any])
    
    inline def setS3PrefixUndefined: Self = StObject.set(x, "S3Prefix", js.undefined)
  }
}
