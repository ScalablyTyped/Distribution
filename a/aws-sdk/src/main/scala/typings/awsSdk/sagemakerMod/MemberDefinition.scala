package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemberDefinition extends StObject {
  
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
  implicit class MemberDefinitionMutableBuilder[Self <: MemberDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCognitoMemberDefinition(value: CognitoMemberDefinition): Self = StObject.set(x, "CognitoMemberDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCognitoMemberDefinitionUndefined: Self = StObject.set(x, "CognitoMemberDefinition", js.undefined)
    
    @scala.inline
    def setOidcMemberDefinition(value: OidcMemberDefinition): Self = StObject.set(x, "OidcMemberDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOidcMemberDefinitionUndefined: Self = StObject.set(x, "OidcMemberDefinition", js.undefined)
  }
}
