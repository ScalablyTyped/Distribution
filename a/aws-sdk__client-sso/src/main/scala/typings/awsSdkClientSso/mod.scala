package typings.awsSdkClientSso

import typings.awsSdkClientSso.anon.ExceptionOptionTypeInvali
import typings.awsSdkClientSso.anon.ExceptionOptionTypeResour
import typings.awsSdkClientSso.anon.ExceptionOptionTypeTooMan
import typings.awsSdkClientSso.anon.ExceptionOptionTypeUnauth
import typings.awsSdkClientSso.getRoleCredentialsCommandMod.GetRoleCredentialsCommandInput
import typings.awsSdkClientSso.interfacesMod.SSOPaginationConfiguration
import typings.awsSdkClientSso.listAccountRolesCommandMod.ListAccountRolesCommandInput
import typings.awsSdkClientSso.listAccountRolesCommandMod.ListAccountRolesCommandOutput
import typings.awsSdkClientSso.listAccountsCommandMod.ListAccountsCommandInput
import typings.awsSdkClientSso.listAccountsCommandMod.ListAccountsCommandOutput
import typings.awsSdkClientSso.logoutCommandMod.LogoutCommandInput
import typings.awsSdkClientSso.models0Mod.AccountInfo
import typings.awsSdkClientSso.models0Mod.GetRoleCredentialsRequest
import typings.awsSdkClientSso.models0Mod.GetRoleCredentialsResponse
import typings.awsSdkClientSso.models0Mod.ListAccountRolesRequest
import typings.awsSdkClientSso.models0Mod.ListAccountRolesResponse
import typings.awsSdkClientSso.models0Mod.ListAccountsRequest
import typings.awsSdkClientSso.models0Mod.ListAccountsResponse
import typings.awsSdkClientSso.models0Mod.LogoutRequest
import typings.awsSdkClientSso.models0Mod.RoleCredentials
import typings.awsSdkClientSso.models0Mod.RoleInfo
import typings.awsSdkClientSso.ssoclientMod.SSOClientConfig
import typings.awsSdkSmithyClient.exceptionsMod.ServiceExceptionOptions
import typings.awsSdkTypes.paginationMod.Paginator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/client-sso", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def AccountInfoFilterSensitiveLog(obj: AccountInfo): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("AccountInfoFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sso", "GetRoleCredentialsCommand")
  @js.native
  open class GetRoleCredentialsCommand protected ()
    extends typings.awsSdkClientSso.commandsMod.GetRoleCredentialsCommand {
    def this(input: GetRoleCredentialsCommandInput) = this()
  }
  
  inline def GetRoleCredentialsRequestFilterSensitiveLog(obj: GetRoleCredentialsRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetRoleCredentialsRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetRoleCredentialsResponseFilterSensitiveLog(obj: GetRoleCredentialsResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetRoleCredentialsResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sso", "InvalidRequestException")
  @js.native
  open class InvalidRequestException protected ()
    extends typings.awsSdkClientSso.modelsMod.InvalidRequestException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
  }
  
  @JSImport("@aws-sdk/client-sso", "ListAccountRolesCommand")
  @js.native
  open class ListAccountRolesCommand protected ()
    extends typings.awsSdkClientSso.commandsMod.ListAccountRolesCommand {
    def this(input: ListAccountRolesCommandInput) = this()
  }
  
  inline def ListAccountRolesRequestFilterSensitiveLog(obj: ListAccountRolesRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ListAccountRolesRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def ListAccountRolesResponseFilterSensitiveLog(obj: ListAccountRolesResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ListAccountRolesResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sso", "ListAccountsCommand")
  @js.native
  open class ListAccountsCommand protected ()
    extends typings.awsSdkClientSso.commandsMod.ListAccountsCommand {
    def this(input: ListAccountsCommandInput) = this()
  }
  
  inline def ListAccountsRequestFilterSensitiveLog(obj: ListAccountsRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ListAccountsRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def ListAccountsResponseFilterSensitiveLog(obj: ListAccountsResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ListAccountsResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sso", "LogoutCommand")
  @js.native
  open class LogoutCommand protected ()
    extends typings.awsSdkClientSso.commandsMod.LogoutCommand {
    def this(input: LogoutCommandInput) = this()
  }
  
  inline def LogoutRequestFilterSensitiveLog(obj: LogoutRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("LogoutRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sso", "ResourceNotFoundException")
  @js.native
  open class ResourceNotFoundException protected ()
    extends typings.awsSdkClientSso.modelsMod.ResourceNotFoundException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeResour) = this()
  }
  
  inline def RoleCredentialsFilterSensitiveLog(obj: RoleCredentials): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("RoleCredentialsFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def RoleInfoFilterSensitiveLog(obj: RoleInfo): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("RoleInfoFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sso", "SSO")
  @js.native
  open class SSO protected ()
    extends typings.awsSdkClientSso.ssoMod.SSO {
    def this(configuration: SSOClientConfig) = this()
  }
  
  @JSImport("@aws-sdk/client-sso", "SSOClient")
  @js.native
  open class SSOClient protected ()
    extends typings.awsSdkClientSso.ssoclientMod.SSOClient {
    def this(configuration: SSOClientConfig) = this()
  }
  
  @JSImport("@aws-sdk/client-sso", "SSOServiceException")
  @js.native
  open class SSOServiceException protected ()
    extends typings.awsSdkClientSso.ssoserviceexceptionMod.SSOServiceException {
    /**
      * @internal
      */
    def this(options: ServiceExceptionOptions) = this()
  }
  
  @JSImport("@aws-sdk/client-sso", "TooManyRequestsException")
  @js.native
  open class TooManyRequestsException protected ()
    extends typings.awsSdkClientSso.modelsMod.TooManyRequestsException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeTooMan) = this()
  }
  
  @JSImport("@aws-sdk/client-sso", "UnauthorizedException")
  @js.native
  open class UnauthorizedException protected ()
    extends typings.awsSdkClientSso.modelsMod.UnauthorizedException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeUnauth) = this()
  }
  
  inline def paginateListAccountRoles(
    config: SSOPaginationConfiguration,
    input: ListAccountRolesCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[ListAccountRolesCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateListAccountRoles")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ListAccountRolesCommandOutput]]
  
  inline def paginateListAccounts(
    config: SSOPaginationConfiguration,
    input: ListAccountsCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[ListAccountsCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateListAccounts")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ListAccountsCommandOutput]]
}
