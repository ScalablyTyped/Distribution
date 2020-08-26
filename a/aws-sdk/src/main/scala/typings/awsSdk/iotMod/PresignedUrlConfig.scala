package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PresignedUrlConfig extends js.Object {
  /**
    * How long (in seconds) pre-signed URLs are valid. Valid values are 60 - 3600, the default value is 3600 seconds. Pre-signed URLs are generated when Jobs receives an MQTT request for the job document.
    */
  var expiresInSec: js.UndefOr[ExpiresInSec] = js.native
  /**
    * The ARN of an IAM role that grants grants permission to download files from the S3 bucket where the job data/updates are stored. The role must also grant permission for IoT to download the files.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
}

object PresignedUrlConfig {
  @scala.inline
  def apply(): PresignedUrlConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PresignedUrlConfig]
  }
  @scala.inline
  implicit class PresignedUrlConfigOps[Self <: PresignedUrlConfig] (val x: Self) extends AnyVal {
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
    def setExpiresInSec(value: ExpiresInSec): Self = this.set("expiresInSec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiresInSec: Self = this.set("expiresInSec", js.undefined)
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
  }
  
}

