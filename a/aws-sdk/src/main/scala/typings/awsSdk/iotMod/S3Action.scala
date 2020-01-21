package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Action extends js.Object {
  /**
    * The Amazon S3 bucket.
    */
  var bucketName: BucketName = js.native
  /**
    * The Amazon S3 canned ACL that controls access to the object identified by the object key. For more information, see S3 canned ACLs.
    */
  var cannedAcl: js.UndefOr[CannedAccessControlList] = js.native
  /**
    * The object key.
    */
  var key: Key = js.native
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: AwsArn = js.native
}

object S3Action {
  @scala.inline
  def apply(bucketName: BucketName, key: Key, roleArn: AwsArn, cannedAcl: CannedAccessControlList = null): S3Action = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (cannedAcl != null) __obj.updateDynamic("cannedAcl")(cannedAcl.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Action]
  }
}

