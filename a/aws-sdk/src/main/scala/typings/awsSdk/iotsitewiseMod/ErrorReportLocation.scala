package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorReportLocation extends StObject {
  
  /**
    * The name of the Amazon S3 bucket to which errors associated with the bulk import job are sent.
    */
  var bucket: Bucket
  
  /**
    * Amazon S3 uses the prefix as a folder name to organize data in the bucket. Each Amazon S3 object has a key that is its unique identifier in the bucket. Each object in a bucket has exactly one key. The prefix must end with a forward slash (/). For more information, see Organizing objects using prefixes in the Amazon Simple Storage Service User Guide.
    */
  var prefix: String
}
object ErrorReportLocation {
  
  inline def apply(bucket: Bucket, prefix: String): ErrorReportLocation = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorReportLocation]
  }
  
  extension [Self <: ErrorReportLocation](x: Self) {
    
    inline def setBucket(value: Bucket): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
  }
}
