package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingEnabled extends StObject {
  
  /**
    * Specifies the bucket where you want Amazon S3 to store server access logs. You can have your logs delivered to any bucket that you own, including the same bucket that is being logged. You can also configure multiple buckets to deliver their logs to the same target bucket. In this case, you should choose a different TargetPrefix for each source bucket so that the delivered log files can be distinguished by key.
    */
  var TargetBucket: typings.awsSdk.s3Mod.TargetBucket
  
  /**
    * Container for granting information. Buckets that use the bucket owner enforced setting for Object Ownership don't support target grants. For more information, see Permissions for server access log delivery in the Amazon S3 User Guide.
    */
  var TargetGrants: js.UndefOr[typings.awsSdk.s3Mod.TargetGrants] = js.undefined
  
  /**
    * A prefix for all log object keys. If you store log files from multiple Amazon S3 buckets in a single bucket, you can use a prefix to distinguish which log files came from which bucket.
    */
  var TargetPrefix: typings.awsSdk.s3Mod.TargetPrefix
}
object LoggingEnabled {
  
  inline def apply(TargetBucket: TargetBucket, TargetPrefix: TargetPrefix): LoggingEnabled = {
    val __obj = js.Dynamic.literal(TargetBucket = TargetBucket.asInstanceOf[js.Any], TargetPrefix = TargetPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingEnabled]
  }
  
  extension [Self <: LoggingEnabled](x: Self) {
    
    inline def setTargetBucket(value: TargetBucket): Self = StObject.set(x, "TargetBucket", value.asInstanceOf[js.Any])
    
    inline def setTargetGrants(value: TargetGrants): Self = StObject.set(x, "TargetGrants", value.asInstanceOf[js.Any])
    
    inline def setTargetGrantsUndefined: Self = StObject.set(x, "TargetGrants", js.undefined)
    
    inline def setTargetGrantsVarargs(value: TargetGrant*): Self = StObject.set(x, "TargetGrants", js.Array(value*))
    
    inline def setTargetPrefix(value: TargetPrefix): Self = StObject.set(x, "TargetPrefix", value.asInstanceOf[js.Any])
  }
}
