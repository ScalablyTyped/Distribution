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
      * <p>Returns the STS short-term credentials for a given role name that is assigned to the
      *       user.</p>
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
      * <p>Lists all roles that are assigned to the user for a given AWS account.</p>
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
      * <p>Lists all AWS accounts assigned to the user. These AWS accounts are assigned by the
      *       administrator of the account. For more information, see <a href="https://docs.aws.amazon.com/singlesignon/latest/userguide/useraccess.html#assignusers">Assign User Access</a> in the <i>IAM Identity Center User Guide</i>. This operation
      *       returns a paginated response.</p>
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
      * <p>Removes the locally stored SSO tokens from the client-side cache and sends an API call to
      *       the IAM Identity Center service to invalidate the corresponding server-side IAM Identity Center sign in
      *       session.</p>
      *
      *          <note>
      *             <p>If a user uses IAM Identity Center to access the AWS CLI, the user’s IAM Identity Center sign in session is
      *         used to obtain an IAM session, as specified in the corresponding IAM Identity Center permission set.
      *         More specifically, IAM Identity Center assumes an IAM role in the target account on behalf of the user,
      *         and the corresponding temporary AWS credentials are returned to the client.</p>
      *
      *             <p>After user logout, any existing IAM role sessions that were created by using IAM Identity Center
      *         permission sets continue based on the duration configured in the permission set.
      *         For more information, see <a href="https://docs.aws.amazon.com/singlesignon/latest/userguide/authconcept.html">User
      *           authentications</a> in the <i>IAM Identity Center User
      *         Guide</i>.</p>
      *          </note>
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
