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
  def apply(): DmsTransferSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DmsTransferSettings]
  }
  @scala.inline
  implicit class DmsTransferSettingsOps[Self <: DmsTransferSettings] (val x: Self) extends AnyVal {
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
    def setBucketName(value: String): Self = this.set("BucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketName: Self = this.set("BucketName", js.undefined)
    @scala.inline
    def setServiceAccessRoleArn(value: String): Self = this.set("ServiceAccessRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceAccessRoleArn: Self = this.set("ServiceAccessRoleArn", js.undefined)
  }
  
}

