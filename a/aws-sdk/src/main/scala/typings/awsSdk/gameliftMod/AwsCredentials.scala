package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsCredentials extends js.Object {
  /**
    * Temporary key allowing access to the Amazon GameLift S3 account.
    */
  var AccessKeyId: js.UndefOr[NonEmptyString] = js.native
  /**
    * Temporary secret key allowing access to the Amazon GameLift S3 account.
    */
  var SecretAccessKey: js.UndefOr[NonEmptyString] = js.native
  /**
    * Token used to associate a specific build ID with the files uploaded using these credentials.
    */
  var SessionToken: js.UndefOr[NonEmptyString] = js.native
}

object AwsCredentials {
  @scala.inline
  def apply(
    AccessKeyId: NonEmptyString = null,
    SecretAccessKey: NonEmptyString = null,
    SessionToken: NonEmptyString = null
  ): AwsCredentials = {
    val __obj = js.Dynamic.literal()
    if (AccessKeyId != null) __obj.updateDynamic("AccessKeyId")(AccessKeyId.asInstanceOf[js.Any])
    if (SecretAccessKey != null) __obj.updateDynamic("SecretAccessKey")(SecretAccessKey.asInstanceOf[js.Any])
    if (SessionToken != null) __obj.updateDynamic("SessionToken")(SessionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsCredentials]
  }
}

