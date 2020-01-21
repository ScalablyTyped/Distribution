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
  def apply(
    CloudWatchEncryption: CloudWatchEncryption = null,
    JobBookmarksEncryption: JobBookmarksEncryption = null,
    S3Encryption: S3EncryptionList = null
  ): EncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (CloudWatchEncryption != null) __obj.updateDynamic("CloudWatchEncryption")(CloudWatchEncryption.asInstanceOf[js.Any])
    if (JobBookmarksEncryption != null) __obj.updateDynamic("JobBookmarksEncryption")(JobBookmarksEncryption.asInstanceOf[js.Any])
    if (S3Encryption != null) __obj.updateDynamic("S3Encryption")(S3Encryption.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionConfiguration]
  }
}

