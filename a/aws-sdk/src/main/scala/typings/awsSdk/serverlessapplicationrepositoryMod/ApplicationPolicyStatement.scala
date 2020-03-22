package typings.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationPolicyStatement extends js.Object {
  /**
    * For the list of actions supported for this operation, see Application 
    Permissions.
    */
  var Actions: listOfString = js.native
  /**
    * An array of PrinciplalOrgIDs, which corresponds to AWS IAM aws:PrincipalOrgID global condition key.
    */
  var PrincipalOrgIDs: js.UndefOr[listOfString] = js.native
  /**
    * An array of AWS account IDs, or * to make the application public.
    */
  var Principals: listOfString = js.native
  /**
    * A unique ID for the statement.
    */
  var StatementId: js.UndefOr[string] = js.native
}

object ApplicationPolicyStatement {
  @scala.inline
  def apply(
    Actions: listOfString,
    Principals: listOfString,
    PrincipalOrgIDs: listOfString = null,
    StatementId: string = null
  ): ApplicationPolicyStatement = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], Principals = Principals.asInstanceOf[js.Any])
    if (PrincipalOrgIDs != null) __obj.updateDynamic("PrincipalOrgIDs")(PrincipalOrgIDs.asInstanceOf[js.Any])
    if (StatementId != null) __obj.updateDynamic("StatementId")(StatementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationPolicyStatement]
  }
}

