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
  def apply(DomainId: DomainId, UserProfileName: UserProfileName): CreatePresignedDomainUrlRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], UserProfileName = UserProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePresignedDomainUrlRequest]
  }
  @scala.inline
  implicit class CreatePresignedDomainUrlRequestOps[Self <: CreatePresignedDomainUrlRequest] (val x: Self) extends AnyVal {
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
    def setDomainId(value: DomainId): Self = this.set("DomainId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserProfileName(value: UserProfileName): Self = this.set("UserProfileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionExpirationDurationInSeconds(value: SessionExpirationDurationInSeconds): Self = this.set("SessionExpirationDurationInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionExpirationDurationInSeconds: Self = this.set("SessionExpirationDurationInSeconds", js.undefined)
  }
  
}

