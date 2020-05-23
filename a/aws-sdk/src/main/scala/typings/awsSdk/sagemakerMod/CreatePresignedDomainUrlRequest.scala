package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePresignedDomainUrlRequest extends js.Object {
  /**
    * The domain ID.
    */
  var DomainId: typings.awsSdk.sagemakerMod.DomainId = js.native
  /**
    * The session expiration duration in seconds.
    */
  var SessionExpirationDurationInSeconds: js.UndefOr[typings.awsSdk.sagemakerMod.SessionExpirationDurationInSeconds] = js.native
  /**
    * The name of the UserProfile to sign-in as.
    */
  var UserProfileName: typings.awsSdk.sagemakerMod.UserProfileName = js.native
}

object CreatePresignedDomainUrlRequest {
  @scala.inline
  def apply(
    DomainId: DomainId,
    UserProfileName: UserProfileName,
    SessionExpirationDurationInSeconds: js.UndefOr[SessionExpirationDurationInSeconds] = js.undefined
  ): CreatePresignedDomainUrlRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], UserProfileName = UserProfileName.asInstanceOf[js.Any])
    if (!js.isUndefined(SessionExpirationDurationInSeconds)) __obj.updateDynamic("SessionExpirationDurationInSeconds")(SessionExpirationDurationInSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePresignedDomainUrlRequest]
  }
}

