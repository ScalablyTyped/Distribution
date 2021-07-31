package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerManagedChannelS3StorageSummary extends StObject {
  
  /**
    * The name of the S3 bucket in which channel data is stored.
    */
  var bucket: js.UndefOr[BucketName] = js.undefined
  
  /**
    * Optional. The prefix used to create the keys of the channel data objects. Each object in an S3 bucket has a key that is its unique identifier within the bucket (each object in a bucket has exactly one key). The prefix must end with a forward slash (/).
    */
  var keyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
  
  /**
    * The ARN of the role that grants AWS IoT Analytics permission to interact with your Amazon S3 resources.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
}
object CustomerManagedChannelS3StorageSummary {
  
  @scala.inline
  def apply(): CustomerManagedChannelS3StorageSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerManagedChannelS3StorageSummary]
  }
  
  @scala.inline
  implicit class CustomerManagedChannelS3StorageSummaryMutableBuilder[Self <: CustomerManagedChannelS3StorageSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    @scala.inline
    def setKeyPrefix(value: S3KeyPrefix): Self = StObject.set(x, "keyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPrefixUndefined: Self = StObject.set(x, "keyPrefix", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}
