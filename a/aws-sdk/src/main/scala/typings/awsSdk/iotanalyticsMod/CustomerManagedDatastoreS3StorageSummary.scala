package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerManagedDatastoreS3StorageSummary extends StObject {
  
  /**
    * The name of the S3 bucket in which data store data is stored.
    */
  var bucket: js.UndefOr[BucketName] = js.undefined
  
  /**
    * Optional. The prefix used to create the keys of the data store data objects. Each object in an S3 bucket has a key that is its unique identifier in the bucket. Each object in a bucket has exactly one key. The prefix must end with a forward slash (/).
    */
  var keyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
  
  /**
    * The ARN of the role that grants AWS IoT Analytics permission to interact with your Amazon S3 resources.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
}
object CustomerManagedDatastoreS3StorageSummary {
  
  @scala.inline
  def apply(): CustomerManagedDatastoreS3StorageSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerManagedDatastoreS3StorageSummary]
  }
  
  @scala.inline
  implicit class CustomerManagedDatastoreS3StorageSummaryMutableBuilder[Self <: CustomerManagedDatastoreS3StorageSummary] (val x: Self) extends AnyVal {
    
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
