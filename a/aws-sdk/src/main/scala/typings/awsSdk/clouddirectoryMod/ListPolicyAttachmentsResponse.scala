package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPolicyAttachmentsResponse extends js.Object {
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
  /**
    * A list of ObjectIdentifiers to which the policy is attached.
    */
  var ObjectIdentifiers: js.UndefOr[ObjectIdentifierList] = js.native
}

object ListPolicyAttachmentsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, ObjectIdentifiers: ObjectIdentifierList = null): ListPolicyAttachmentsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ObjectIdentifiers != null) __obj.updateDynamic("ObjectIdentifiers")(ObjectIdentifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPolicyAttachmentsResponse]
  }
}

