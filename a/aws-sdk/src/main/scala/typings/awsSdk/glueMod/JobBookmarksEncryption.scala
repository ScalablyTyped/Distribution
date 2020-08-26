package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobBookmarksEncryption extends js.Object {
  /**
    * The encryption mode to use for job bookmarks data.
    */
  var JobBookmarksEncryptionMode: js.UndefOr[typings.awsSdk.glueMod.JobBookmarksEncryptionMode] = js.native
  /**
    * The Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
    */
  var KmsKeyArn: js.UndefOr[typings.awsSdk.glueMod.KmsKeyArn] = js.native
}

object JobBookmarksEncryption {
  @scala.inline
  def apply(): JobBookmarksEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobBookmarksEncryption]
  }
  @scala.inline
  implicit class JobBookmarksEncryptionOps[Self <: JobBookmarksEncryption] (val x: Self) extends AnyVal {
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
    def setJobBookmarksEncryptionMode(value: JobBookmarksEncryptionMode): Self = this.set("JobBookmarksEncryptionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobBookmarksEncryptionMode: Self = this.set("JobBookmarksEncryptionMode", js.undefined)
    @scala.inline
    def setKmsKeyArn(value: KmsKeyArn): Self = this.set("KmsKeyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyArn: Self = this.set("KmsKeyArn", js.undefined)
  }
  
}

