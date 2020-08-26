package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTargetsForPolicyResponse extends js.Object {
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.organizationsMod.NextToken] = js.native
  /**
    * A list of structures, each of which contains details about one of the entities to which the specified policy is attached.
    */
  var Targets: js.UndefOr[PolicyTargets] = js.native
}

object ListTargetsForPolicyResponse {
  @scala.inline
  def apply(): ListTargetsForPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTargetsForPolicyResponse]
  }
  @scala.inline
  implicit class ListTargetsForPolicyResponseOps[Self <: ListTargetsForPolicyResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setTargetsVarargs(value: PolicyTargetSummary*): Self = this.set("Targets", js.Array(value :_*))
    @scala.inline
    def setTargets(value: PolicyTargets): Self = this.set("Targets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargets: Self = this.set("Targets", js.undefined)
  }
  
}

