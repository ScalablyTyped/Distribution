package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3BucketSource extends StObject {
  
  /**
    * <p> The S3 bucket that is being imported from. </p>
    */
  var S3Bucket: js.UndefOr[String] = js.undefined
  
  /**
    * <p> The account number of the S3 bucket that is being imported from. If the bucket is
    *             owned by the requester this is optional. </p>
    */
  var S3BucketOwner: js.UndefOr[String] = js.undefined
  
  /**
    * <p> The key prefix shared by all S3 Objects that are being imported. </p>
    */
  var S3KeyPrefix: js.UndefOr[String] = js.undefined
}
object S3BucketSource {
  
  inline def apply(): S3BucketSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3BucketSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3BucketSource] (val x: Self) extends AnyVal {
    
    inline def setS3Bucket(value: String): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3BucketOwner(value: String): Self = StObject.set(x, "S3BucketOwner", value.asInstanceOf[js.Any])
    
    inline def setS3BucketOwnerUndefined: Self = StObject.set(x, "S3BucketOwner", js.undefined)
    
    inline def setS3BucketUndefined: Self = StObject.set(x, "S3Bucket", js.undefined)
    
    inline def setS3KeyPrefix(value: String): Self = StObject.set(x, "S3KeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setS3KeyPrefixUndefined: Self = StObject.set(x, "S3KeyPrefix", js.undefined)
  }
}
