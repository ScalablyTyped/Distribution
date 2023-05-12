package typings.awsSdkClientSso

import typings.awsSdkClientSso.anon.ExceptionOptionTypeInvali
import typings.awsSdkClientSso.anon.ExceptionOptionTypeResour
import typings.awsSdkClientSso.anon.ExceptionOptionTypeTooMan
import typings.awsSdkClientSso.anon.ExceptionOptionTypeUnauth
import typings.awsSdkClientSso.distTypesModelsModels0Mod.GetRoleCredentialsRequest
import typings.awsSdkClientSso.distTypesModelsModels0Mod.GetRoleCredentialsResponse
import typings.awsSdkClientSso.distTypesModelsModels0Mod.ListAccountRolesRequest
import typings.awsSdkClientSso.distTypesModelsModels0Mod.ListAccountsRequest
import typings.awsSdkClientSso.distTypesModelsModels0Mod.LogoutRequest
import typings.awsSdkClientSso.distTypesModelsModels0Mod.RoleCredentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesModelsMod {
  
  @JSImport("@aws-sdk/client-sso/dist-types/models", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def GetRoleCredentialsRequestFilterSensitiveLog(obj: GetRoleCredentialsRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetRoleCredentialsRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetRoleCredentialsResponseFilterSensitiveLog(obj: GetRoleCredentialsResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetRoleCredentialsResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sso/dist-types/models", "InvalidRequestException")
  @js.native
  open class InvalidRequestException protected ()
    extends typings.awsSdkClientSso.distTypesModelsModels0Mod.InvalidRequestException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
  }
  
  inline def ListAccountRolesRequestFilterSensitiveLog(obj: ListAccountRolesRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ListAccountRolesRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def ListAccountsRequestFilterSensitiveLog(obj: ListAccountsRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ListAccountsRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def LogoutRequestFilterSensitiveLog(obj: LogoutRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("LogoutRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sso/dist-types/models", "ResourceNotFoundException")
  @js.native
  open class ResourceNotFoundException protected ()
    extends typings.awsSdkClientSso.distTypesModelsModels0Mod.ResourceNotFoundException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeResour) = this()
  }
  
  inline def RoleCredentialsFilterSensitiveLog(obj: RoleCredentials): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("RoleCredentialsFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sso/dist-types/models", "TooManyRequestsException")
  @js.native
  open class TooManyRequestsException protected ()
    extends typings.awsSdkClientSso.distTypesModelsModels0Mod.TooManyRequestsException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeTooMan) = this()
  }
  
  @JSImport("@aws-sdk/client-sso/dist-types/models", "UnauthorizedException")
  @js.native
  open class UnauthorizedException protected ()
    extends typings.awsSdkClientSso.distTypesModelsModels0Mod.UnauthorizedException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeUnauth) = this()
  }
}
