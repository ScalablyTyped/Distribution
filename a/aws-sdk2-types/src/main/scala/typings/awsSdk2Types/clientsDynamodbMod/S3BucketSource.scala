package typings.awsSdk2Types.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3BucketSource extends StObject {
  
  /**
    *  The S3 bucket that is being imported from. 
    */
  var S3Bucket: typings.awsSdk2Types.clientsDynamodbMod.S3Bucket
  
  /**
    *  The account number of the S3 bucket that is being imported from. If the bucket is owned by the requester this is optional. 
    */
  var S3BucketOwner: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.S3BucketOwner] = js.undefined
  
  /**
    *  The key prefix shared by all S3 Objects that are being imported. 
    */
  var S3KeyPrefix: js.UndefOr[S3Prefix] = js.undefined
}
object S3BucketSource {
  
  inline def apply(S3Bucket: S3Bucket): S3BucketSource = {
    val __obj = js.Dynamic.literal(S3Bucket = S3Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3BucketSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3BucketSource] (val x: Self) extends AnyVal {
    
    inline def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3BucketOwner(value: S3BucketOwner): Self = StObject.set(x, "S3BucketOwner", value.asInstanceOf[js.Any])
    
    inline def setS3BucketOwnerUndefined: Self = StObject.set(x, "S3BucketOwner", js.undefined)
    
    inline def setS3KeyPrefix(value: S3Prefix): Self = StObject.set(x, "S3KeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setS3KeyPrefixUndefined: Self = StObject.set(x, "S3KeyPrefix", js.undefined)
  }
}
