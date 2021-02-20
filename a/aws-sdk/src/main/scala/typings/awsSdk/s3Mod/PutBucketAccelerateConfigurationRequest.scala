package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutBucketAccelerateConfigurationRequest extends StObject {
  
  /**
    * Container for setting the transfer acceleration state.
    */
  var AccelerateConfiguration: typings.awsSdk.s3Mod.AccelerateConfiguration = js.native
  
  /**
    * The name of the bucket for which the accelerate configuration is set.
    */
  var Bucket: BucketName = js.native
  
  /**
    * The account id of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.native
}
object PutBucketAccelerateConfigurationRequest {
  
  @scala.inline
  def apply(AccelerateConfiguration: AccelerateConfiguration, Bucket: BucketName): PutBucketAccelerateConfigurationRequest = {
    val __obj = js.Dynamic.literal(AccelerateConfiguration = AccelerateConfiguration.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketAccelerateConfigurationRequest]
  }
  
  @scala.inline
  implicit class PutBucketAccelerateConfigurationRequestMutableBuilder[Self <: PutBucketAccelerateConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccelerateConfiguration(value: AccelerateConfiguration): Self = StObject.set(x, "AccelerateConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
  }
}
