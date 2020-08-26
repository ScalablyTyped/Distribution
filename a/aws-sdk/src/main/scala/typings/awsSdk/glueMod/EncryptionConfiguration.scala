package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionConfiguration extends js.Object {
  /**
    * The encryption configuration for Amazon CloudWatch.
    */
  var CloudWatchEncryption: js.UndefOr[typings.awsSdk.glueMod.CloudWatchEncryption] = js.native
  /**
    * The encryption configuration for job bookmarks.
    */
  var JobBookmarksEncryption: js.UndefOr[typings.awsSdk.glueMod.JobBookmarksEncryption] = js.native
  /**
    * The encryption configuration for Amazon Simple Storage Service (Amazon S3) data.
    */
  var S3Encryption: js.UndefOr[S3EncryptionList] = js.native
}

object EncryptionConfiguration {
  @scala.inline
  def apply(): EncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionConfiguration]
  }
  @scala.inline
  implicit class EncryptionConfigurationOps[Self <: EncryptionConfiguration] (val x: Self) extends AnyVal {
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
    def setCloudWatchEncryption(value: CloudWatchEncryption): Self = this.set("CloudWatchEncryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudWatchEncryption: Self = this.set("CloudWatchEncryption", js.undefined)
    @scala.inline
    def setJobBookmarksEncryption(value: JobBookmarksEncryption): Self = this.set("JobBookmarksEncryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobBookmarksEncryption: Self = this.set("JobBookmarksEncryption", js.undefined)
    @scala.inline
    def setS3EncryptionVarargs(value: S3Encryption*): Self = this.set("S3Encryption", js.Array(value :_*))
    @scala.inline
    def setS3Encryption(value: S3EncryptionList): Self = this.set("S3Encryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Encryption: Self = this.set("S3Encryption", js.undefined)
  }
  
}

