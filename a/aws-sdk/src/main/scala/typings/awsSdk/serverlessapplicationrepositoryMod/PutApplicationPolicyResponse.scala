package typings.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutApplicationPolicyResponse extends js.Object {
  /**
    * An array of policy statements applied to the application.
    */
  var Statements: js.UndefOr[listOfApplicationPolicyStatement] = js.native
}

object PutApplicationPolicyResponse {
  @scala.inline
  def apply(Statements: listOfApplicationPolicyStatement = null): PutApplicationPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (Statements != null) __obj.updateDynamic("Statements")(Statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutApplicationPolicyResponse]
  }
}

