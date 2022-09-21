package typings.awsSdkClientSso

import typings.awsSdkClientSso.getRoleCredentialsCommandMod.GetRoleCredentialsCommandInput
import typings.awsSdkClientSso.listAccountRolesCommandMod.ListAccountRolesCommandInput
import typings.awsSdkClientSso.listAccountsCommandMod.ListAccountsCommandInput
import typings.awsSdkClientSso.logoutCommandMod.LogoutCommandInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsMod {
  
  @JSImport("@aws-sdk/client-sso/dist-types/commands", "GetRoleCredentialsCommand")
  @js.native
  open class GetRoleCredentialsCommand protected ()
    extends typings.awsSdkClientSso.getRoleCredentialsCommandMod.GetRoleCredentialsCommand {
    def this(input: GetRoleCredentialsCommandInput) = this()
  }
  
  @JSImport("@aws-sdk/client-sso/dist-types/commands", "ListAccountRolesCommand")
  @js.native
  open class ListAccountRolesCommand protected ()
    extends typings.awsSdkClientSso.listAccountRolesCommandMod.ListAccountRolesCommand {
    def this(input: ListAccountRolesCommandInput) = this()
  }
  
  @JSImport("@aws-sdk/client-sso/dist-types/commands", "ListAccountsCommand")
  @js.native
  open class ListAccountsCommand protected ()
    extends typings.awsSdkClientSso.listAccountsCommandMod.ListAccountsCommand {
    def this(input: ListAccountsCommandInput) = this()
  }
  
  @JSImport("@aws-sdk/client-sso/dist-types/commands", "LogoutCommand")
  @js.native
  open class LogoutCommand protected ()
    extends typings.awsSdkClientSso.logoutCommandMod.LogoutCommand {
    def this(input: LogoutCommandInput) = this()
  }
}
