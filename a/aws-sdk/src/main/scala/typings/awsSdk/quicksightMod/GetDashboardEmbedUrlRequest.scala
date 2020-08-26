package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDashboardEmbedUrlRequest extends js.Object {
  /**
    * The ID for the AWS account that contains the dashboard that you're embedding.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The ID for the dashboard, also added to the IAM policy.
    */
  var DashboardId: RestrictiveResourceId = js.native
  /**
    * The authentication method that the user uses to sign in.
    */
  var IdentityType: typings.awsSdk.quicksightMod.IdentityType = js.native
  /**
    * Remove the reset button on the embedded dashboard. The default is FALSE, which enables the reset button.
    */
  var ResetDisabled: js.UndefOr[scala.Boolean] = js.native
  /**
    * How many minutes the session is valid. The session lifetime must be 15-600 minutes.
    */
  var SessionLifetimeInMinutes: js.UndefOr[typings.awsSdk.quicksightMod.SessionLifetimeInMinutes] = js.native
  /**
    * Remove the undo/redo button on the embedded dashboard. The default is FALSE, which enables the undo/redo button.
    */
  var UndoRedoDisabled: js.UndefOr[scala.Boolean] = js.native
  /**
    * The Amazon QuickSight user's Amazon Resource Name (ARN), for use with QUICKSIGHT identity type. You can use this for any Amazon QuickSight users in your account (readers, authors, or admins) authenticated as one of the following:   Active Directory (AD) users or group members   Invited nonfederated users   IAM users and IAM role-based sessions authenticated through Federated Single Sign-On using SAML, OpenID Connect, or IAM federation.  
    */
  var UserArn: js.UndefOr[Arn] = js.native
}

object GetDashboardEmbedUrlRequest {
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, DashboardId: RestrictiveResourceId, IdentityType: IdentityType): GetDashboardEmbedUrlRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DashboardId = DashboardId.asInstanceOf[js.Any], IdentityType = IdentityType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDashboardEmbedUrlRequest]
  }
  @scala.inline
  implicit class GetDashboardEmbedUrlRequestOps[Self <: GetDashboardEmbedUrlRequest] (val x: Self) extends AnyVal {
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
    def setDashboardId(value: RestrictiveResourceId): Self = this.set("DashboardId", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentityType(value: IdentityType): Self = this.set("IdentityType", value.asInstanceOf[js.Any])
    @scala.inline
    def setResetDisabled(value: scala.Boolean): Self = this.set("ResetDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetDisabled: Self = this.set("ResetDisabled", js.undefined)
    @scala.inline
    def setSessionLifetimeInMinutes(value: SessionLifetimeInMinutes): Self = this.set("SessionLifetimeInMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionLifetimeInMinutes: Self = this.set("SessionLifetimeInMinutes", js.undefined)
    @scala.inline
    def setUndoRedoDisabled(value: scala.Boolean): Self = this.set("UndoRedoDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUndoRedoDisabled: Self = this.set("UndoRedoDisabled", js.undefined)
    @scala.inline
    def setUserArn(value: Arn): Self = this.set("UserArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserArn: Self = this.set("UserArn", js.undefined)
  }
  
}

