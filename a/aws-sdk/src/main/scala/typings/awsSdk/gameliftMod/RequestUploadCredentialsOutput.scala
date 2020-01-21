package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestUploadCredentialsOutput extends js.Object {
  /**
    * Amazon S3 path and key, identifying where the game build files are stored.
    */
  var StorageLocation: js.UndefOr[S3Location] = js.native
  /**
    * AWS credentials required when uploading a game build to the storage location. These credentials have a limited lifespan and are valid only for the build they were issued for.
    */
  var UploadCredentials: js.UndefOr[AwsCredentials] = js.native
}

object RequestUploadCredentialsOutput {
  @scala.inline
  def apply(StorageLocation: S3Location = null, UploadCredentials: AwsCredentials = null): RequestUploadCredentialsOutput = {
    val __obj = js.Dynamic.literal()
    if (StorageLocation != null) __obj.updateDynamic("StorageLocation")(StorageLocation.asInstanceOf[js.Any])
    if (UploadCredentials != null) __obj.updateDynamic("UploadCredentials")(UploadCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestUploadCredentialsOutput]
  }
}

