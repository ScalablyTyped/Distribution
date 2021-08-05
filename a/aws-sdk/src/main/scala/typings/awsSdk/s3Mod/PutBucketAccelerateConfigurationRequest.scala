package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketAccelerateConfigurationRequest extends StObject {
  
  /**
    * Container for setting the transfer acceleration state.
    */
  var AccelerateConfiguration: typings.awsSdk.s3Mod.AccelerateConfiguration
  
  /**
    * The name of the bucket for which the accelerate configuration is set.
    */
  var Bucket: BucketName
  
  /**
    * The account id of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.undefined
}
object PutBucketAccelerateConfigurationRequest {
  
  inline def apply(AccelerateConfiguration: AccelerateConfiguration, Bucket: BucketName): PutBucketAccelerateConfigurationRequest = {
    val __obj = js.Dynamic.literal(AccelerateConfiguration = AccelerateConfiguration.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketAccelerateConfigurationRequest]
  }
  
  extension [Self <: PutBucketAccelerateConfigurationRequest](x: Self) {
    
    inline def setAccelerateConfiguration(value: AccelerateConfiguration): Self = StObject.set(x, "AccelerateConfiguration", value.asInstanceOf[js.Any])
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    inline def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
  }
}
