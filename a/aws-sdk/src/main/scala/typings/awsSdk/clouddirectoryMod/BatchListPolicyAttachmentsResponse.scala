package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchListPolicyAttachmentsResponse extends js.Object {
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
  /**
    * A list of ObjectIdentifiers to which the policy is attached.
    */
  var ObjectIdentifiers: js.UndefOr[ObjectIdentifierList] = js.native
}

object BatchListPolicyAttachmentsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, ObjectIdentifiers: ObjectIdentifierList = null): BatchListPolicyAttachmentsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ObjectIdentifiers != null) __obj.updateDynamic("ObjectIdentifiers")(ObjectIdentifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchListPolicyAttachmentsResponse]
  }
}

