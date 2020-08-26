package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSessionEmbedUrlRequest extends js.Object {
  /**
    * The ID for the AWS account that contains the QuickSight session that you're embedding.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The entry point for the embedded session.
    */
  var EntryPoint: js.UndefOr[typings.awsSdk.quicksightMod.EntryPoint] = js.native
  /**
    * How many minutes the session is valid. The session lifetime must be 15-600 minutes.
    */
  var SessionLifetimeInMinutes: js.UndefOr[typings.awsSdk.quicksightMod.SessionLifetimeInMinutes] = js.native
  /**
    * The Amazon QuickSight user's Amazon Resource Name (ARN), for use with QUICKSIGHT identity type. You can use this for any Amazon QuickSight users in your account (readers, authors, or admins) authenticated as one of the following:   Active Directory (AD) users or group members   Invited nonfederated users   IAM users and IAM role-based sessions authenticated through Federated Single Sign-On using SAML, OpenID Connect, or IAM federation.  
    */
  var UserArn: js.UndefOr[Arn] = js.native
}

object GetSessionEmbedUrlRequest {
  @scala.inline
  def apply(AwsAccountId: AwsAccountId): GetSessionEmbedUrlRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSessionEmbedUrlRequest]
  }
  @scala.inline
  implicit class GetSessionEmbedUrlRequestOps[Self <: GetSessionEmbedUrlRequest] (val x: Self) extends AnyVal {
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
    def setAwsAccountId(value: AwsAccountId): Self = this.set("AwsAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntryPoint(value: EntryPoint): Self = this.set("EntryPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntryPoint: Self = this.set("EntryPoint", js.undefined)
    @scala.inline
    def setSessionLifetimeInMinutes(value: SessionLifetimeInMinutes): Self = this.set("SessionLifetimeInMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionLifetimeInMinutes: Self = this.set("SessionLifetimeInMinutes", js.undefined)
    @scala.inline
    def setUserArn(value: Arn): Self = this.set("UserArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserArn: Self = this.set("UserArn", js.undefined)
  }
  
}

