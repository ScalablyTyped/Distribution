package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionsBoundaryDecisionDetail extends js.Object {
  /**
    * Specifies whether an action is allowed by a permissions boundary that is applied to an IAM entity (user or role). A value of true means that the permissions boundary does not deny the action. This means that the policy includes an Allow statement that matches the request. In this case, if an identity-based policy also allows the action, the request is allowed. A value of false means that either the requested action is not allowed (implicitly denied) or that the action is explicitly denied by the permissions boundary. In both of these cases, the action is not allowed, regardless of the identity-based policy.
    */
  var AllowedByPermissionsBoundary: js.UndefOr[booleanType] = js.native
}

object PermissionsBoundaryDecisionDetail {
  @scala.inline
  def apply(): PermissionsBoundaryDecisionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionsBoundaryDecisionDetail]
  }
  @scala.inline
  implicit class PermissionsBoundaryDecisionDetailOps[Self <: PermissionsBoundaryDecisionDetail] (val x: Self) extends AnyVal {
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
    def setAllowedByPermissionsBoundary(value: booleanType): Self = this.set("AllowedByPermissionsBoundary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedByPermissionsBoundary: Self = this.set("AllowedByPermissionsBoundary", js.undefined)
  }
  
}

