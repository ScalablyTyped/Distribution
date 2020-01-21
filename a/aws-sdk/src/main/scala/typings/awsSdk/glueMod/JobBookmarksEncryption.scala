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
  def apply(JobBookmarksEncryptionMode: JobBookmarksEncryptionMode = null, KmsKeyArn: KmsKeyArn = null): JobBookmarksEncryption = {
    val __obj = js.Dynamic.literal()
    if (JobBookmarksEncryptionMode != null) __obj.updateDynamic("JobBookmarksEncryptionMode")(JobBookmarksEncryptionMode.asInstanceOf[js.Any])
    if (KmsKeyArn != null) __obj.updateDynamic("KmsKeyArn")(KmsKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobBookmarksEncryption]
  }
}

