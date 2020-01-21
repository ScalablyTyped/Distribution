package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerManagedDatastoreS3Storage extends js.Object {
  /**
    * The name of the Amazon S3 bucket in which data store data is stored.
    */
  var bucket: BucketName = js.native
  /**
    * [Optional] The prefix used to create the keys of the data store data objects. Each object in an Amazon S3 bucket has a key that is its unique identifier within the bucket (each object in a bucket has exactly one key). The prefix must end with a '/'.
    */
  var keyPrefix: js.UndefOr[S3KeyPrefix] = js.native
  /**
    * The ARN of the role which grants AWS IoT Analytics permission to interact with your Amazon S3 resources.
    */
  var roleArn: RoleArn = js.native
}

object CustomerManagedDatastoreS3Storage {
  @scala.inline
  def apply(bucket: BucketName, roleArn: RoleArn, keyPrefix: S3KeyPrefix = null): CustomerManagedDatastoreS3Storage = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (keyPrefix != null) __obj.updateDynamic("keyPrefix")(keyPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerManagedDatastoreS3Storage]
  }
}

