package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DmsTransferSettings extends js.Object {
  /**
    *  The name of the S3 bucket to use. 
    */
  var BucketName: js.UndefOr[String] = js.native
  /**
    *  The IAM role that has permission to access the Amazon S3 bucket. 
    */
  var ServiceAccessRoleArn: js.UndefOr[String] = js.native
}

object DmsTransferSettings {
  @scala.inline
  def apply(BucketName: String = null, ServiceAccessRoleArn: String = null): DmsTransferSettings = {
    val __obj = js.Dynamic.literal()
    if (BucketName != null) __obj.updateDynamic("BucketName")(BucketName.asInstanceOf[js.Any])
    if (ServiceAccessRoleArn != null) __obj.updateDynamic("ServiceAccessRoleArn")(ServiceAccessRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DmsTransferSettings]
  }
}

