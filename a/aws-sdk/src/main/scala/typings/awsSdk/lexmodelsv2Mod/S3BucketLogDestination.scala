package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3BucketLogDestination extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an AWS Key Management Service (KMS) key for encrypting audio log files stored in an S3 bucket.
    */
  var kmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined
  
  /**
    * The S3 prefix to assign to audio log files.
    */
  var logPrefix: LogPrefix
  
  /**
    * The Amazon Resource Name (ARN) of an Amazon S3 bucket where audio log files are stored.
    */
  var s3BucketArn: S3BucketArn
}
object S3BucketLogDestination {
  
  inline def apply(logPrefix: LogPrefix, s3BucketArn: S3BucketArn): S3BucketLogDestination = {
    val __obj = js.Dynamic.literal(logPrefix = logPrefix.asInstanceOf[js.Any], s3BucketArn = s3BucketArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3BucketLogDestination]
  }
  
  extension [Self <: S3BucketLogDestination](x: Self) {
    
    inline def setKmsKeyArn(value: KmsKeyArn): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
    
    inline def setLogPrefix(value: LogPrefix): Self = StObject.set(x, "logPrefix", value.asInstanceOf[js.Any])
    
    inline def setS3BucketArn(value: S3BucketArn): Self = StObject.set(x, "s3BucketArn", value.asInstanceOf[js.Any])
  }
}
