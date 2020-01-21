package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBackupRequest extends js.Object {
  /**
    * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string is automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.fsxMod.ClientRequestToken] = js.native
  /**
    * The ID of the file system to back up.
    */
  var FileSystemId: typings.awsSdk.fsxMod.FileSystemId = js.native
  /**
    * The tags to apply to the backup at backup creation. The key value of the Name tag appears in the console as the backup name.
    */
  var Tags: js.UndefOr[typings.awsSdk.fsxMod.Tags] = js.native
}

object CreateBackupRequest {
  @scala.inline
  def apply(FileSystemId: FileSystemId, ClientRequestToken: ClientRequestToken = null, Tags: Tags = null): CreateBackupRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackupRequest]
  }
}

