package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchListObjectPoliciesResponse extends js.Object {
  /**
    * A list of policy ObjectIdentifiers, that are attached to the object.
    */
  var AttachedPolicyIds: js.UndefOr[ObjectIdentifierList] = js.native
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
}

object BatchListObjectPoliciesResponse {
  @scala.inline
  def apply(): BatchListObjectPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchListObjectPoliciesResponse]
  }
  @scala.inline
  implicit class BatchListObjectPoliciesResponseOps[Self <: BatchListObjectPoliciesResponse] (val x: Self) extends AnyVal {
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
    def setAttachedPolicyIdsVarargs(value: ObjectIdentifier*): Self = this.set("AttachedPolicyIds", js.Array(value :_*))
    @scala.inline
    def setAttachedPolicyIds(value: ObjectIdentifierList): Self = this.set("AttachedPolicyIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachedPolicyIds: Self = this.set("AttachedPolicyIds", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

