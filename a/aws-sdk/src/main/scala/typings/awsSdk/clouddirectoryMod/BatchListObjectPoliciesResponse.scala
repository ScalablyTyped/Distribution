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
  def apply(AttachedPolicyIds: ObjectIdentifierList = null, NextToken: NextToken = null): BatchListObjectPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    if (AttachedPolicyIds != null) __obj.updateDynamic("AttachedPolicyIds")(AttachedPolicyIds.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchListObjectPoliciesResponse]
  }
}

