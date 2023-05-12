package typings.awsSdkClientSso

import typings.awsSdkClientSso.distTypesCommandsGetRoleCredentialsCommandMod.GetRoleCredentialsCommandInput
import typings.awsSdkClientSso.distTypesCommandsGetRoleCredentialsCommandMod.GetRoleCredentialsCommandOutput
import typings.awsSdkClientSso.distTypesCommandsListAccountRolesCommandMod.ListAccountRolesCommandInput
import typings.awsSdkClientSso.distTypesCommandsListAccountRolesCommandMod.ListAccountRolesCommandOutput
import typings.awsSdkClientSso.distTypesCommandsListAccountsCommandMod.ListAccountsCommandInput
import typings.awsSdkClientSso.distTypesCommandsListAccountsCommandMod.ListAccountsCommandOutput
import typings.awsSdkClientSso.distTypesCommandsLogoutCommandMod.LogoutCommandInput
import typings.awsSdkClientSso.distTypesCommandsLogoutCommandMod.LogoutCommandOutput
import typings.awsSdkClientSso.distTypesSsoclientMod.SSOClient
import typings.awsSdkClientSso.distTypesSsoclientMod.SSOClientConfig
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSsoMod {
  
  @JSImport("@aws-sdk/client-sso/dist-types/SSO", "SSO")
  @js.native
  open class SSO protected () extends SSOClient {
    def this(configuration: SSOClientConfig) = this()
    
    /**
      * @see {@link GetRoleCredentialsCommand}
      */
    def getRoleCredentials(args: GetRoleCredentialsCommandInput): js.Promise[GetRoleCredentialsCommandOutput] = js.native
    def getRoleCredentials(
      args: GetRoleCredentialsCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[GetRoleCredentialsCommandOutput], Unit]
    ): Unit = js.native
    def getRoleCredentials(args: GetRoleCredentialsCommandInput, options: HttpHandlerOptions): js.Promise[GetRoleCredentialsCommandOutput] = js.native
    def getRoleCredentials(
      args: GetRoleCredentialsCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[GetRoleCredentialsCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * @see {@link ListAccountRolesCommand}
      */
    def listAccountRoles(args: ListAccountRolesCommandInput): js.Promise[ListAccountRolesCommandOutput] = js.native
    def listAccountRoles(
      args: ListAccountRolesCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[ListAccountRolesCommandOutput], Unit]
    ): Unit = js.native
    def listAccountRoles(args: ListAccountRolesCommandInput, options: HttpHandlerOptions): js.Promise[ListAccountRolesCommandOutput] = js.native
    def listAccountRoles(
      args: ListAccountRolesCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[ListAccountRolesCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * @see {@link ListAccountsCommand}
      */
    def listAccounts(args: ListAccountsCommandInput): js.Promise[ListAccountsCommandOutput] = js.native
    def listAccounts(
      args: ListAccountsCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[ListAccountsCommandOutput], Unit]
    ): Unit = js.native
    def listAccounts(args: ListAccountsCommandInput, options: HttpHandlerOptions): js.Promise[ListAccountsCommandOutput] = js.native
    def listAccounts(
      args: ListAccountsCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[ListAccountsCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * @see {@link LogoutCommand}
      */
    def logout(args: LogoutCommandInput): js.Promise[LogoutCommandOutput] = js.native
    def logout(
      args: LogoutCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[LogoutCommandOutput], Unit]
    ): Unit = js.native
    def logout(args: LogoutCommandInput, options: HttpHandlerOptions): js.Promise[LogoutCommandOutput] = js.native
    def logout(
      args: LogoutCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[LogoutCommandOutput], Unit]
    ): Unit = js.native
  }
}
