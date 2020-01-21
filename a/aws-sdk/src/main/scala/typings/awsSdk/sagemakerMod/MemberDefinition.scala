package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberDefinition extends js.Object {
  /**
    * The Amazon Cognito user group that is part of the work team.
    */
  var CognitoMemberDefinition: js.UndefOr[typings.awsSdk.sagemakerMod.CognitoMemberDefinition] = js.native
}

object MemberDefinition {
  @scala.inline
  def apply(CognitoMemberDefinition: CognitoMemberDefinition = null): MemberDefinition = {
    val __obj = js.Dynamic.literal()
    if (CognitoMemberDefinition != null) __obj.updateDynamic("CognitoMemberDefinition")(CognitoMemberDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberDefinition]
  }
}

