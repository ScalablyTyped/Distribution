package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioLogDestination extends StObject {
  
  /**
    * The Amazon S3 bucket where the audio log files are stored. The IAM role specified in the roleArn parameter of the CreateBot operation must have permission to write to this bucket.
    */
  var s3Bucket: S3BucketLogDestination
}
object AudioLogDestination {
  
  inline def apply(s3Bucket: S3BucketLogDestination): AudioLogDestination = {
    val __obj = js.Dynamic.literal(s3Bucket = s3Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioLogDestination]
  }
  
  extension [Self <: AudioLogDestination](x: Self) {
    
    inline def setS3Bucket(value: S3BucketLogDestination): Self = StObject.set(x, "s3Bucket", value.asInstanceOf[js.Any])
  }
}
