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
  /**
    * A list user groups that exist in your OIDC Identity Provider (IdP). One to ten groups can be used to create a single private work team. When you add a user group to the list of Groups, you can add that user group to one or more private work teams. If you add a user group to a private work team, all workers in that user group are added to the work team.
    */
  var OidcMemberDefinition: js.UndefOr[typings.awsSdk.sagemakerMod.OidcMemberDefinition] = js.native
}

object MemberDefinition {
  @scala.inline
  def apply(): MemberDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberDefinition]
  }
  @scala.inline
  implicit class MemberDefinitionOps[Self <: MemberDefinition] (val x: Self) extends AnyVal {
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
    def setCognitoMemberDefinition(value: CognitoMemberDefinition): Self = this.set("CognitoMemberDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCognitoMemberDefinition: Self = this.set("CognitoMemberDefinition", js.undefined)
    @scala.inline
    def setOidcMemberDefinition(value: OidcMemberDefinition): Self = this.set("OidcMemberDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOidcMemberDefinition: Self = this.set("OidcMemberDefinition", js.undefined)
  }
  
}

