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
  def apply(bucketName: BucketName, key: Key, roleArn: AwsArn): S3Action = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Action]
  }
  @scala.inline
  implicit class S3ActionOps[Self <: S3Action] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBucketName(value: BucketName): Self = this.set("bucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: AwsArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCannedAcl(value: CannedAccessControlList): Self = this.set("cannedAcl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCannedAcl: Self = this.set("cannedAcl", js.undefined)
  }
  
}

