package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomerManagedDatastoreS3Storage extends js.Object {
  
  /**
    * The name of the S3 bucket in which data store data is stored.
    */
  var bucket: BucketName = js.native
  
  /**
    * Optional. The prefix used to create the keys of the data store data objects. Each object in an S3 bucket has a key that is its unique identifier in the bucket. Each object in a bucket has exactly one key. The prefix must end with a forward slash (/).
    */
  var keyPrefix: js.UndefOr[S3KeyPrefix] = js.native
  
  /**
    * The ARN of the role that grants AWS IoT Analytics permission to interact with your Amazon S3 resources.
    */
  var roleArn: RoleArn = js.native
}
object CustomerManagedDatastoreS3Storage {
  
  @scala.inline
  def apply(bucket: BucketName, roleArn: RoleArn): CustomerManagedDatastoreS3Storage = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerManagedDatastoreS3Storage]
  }
  
  @scala.inline
  implicit class CustomerManagedDatastoreS3StorageOps[Self <: CustomerManagedDatastoreS3Storage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBucket(value: BucketName): Self = this.set("bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPrefix(value: S3KeyPrefix): Self = this.set("keyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPrefix: Self = this.set("keyPrefix", js.undefined)
  }
}
