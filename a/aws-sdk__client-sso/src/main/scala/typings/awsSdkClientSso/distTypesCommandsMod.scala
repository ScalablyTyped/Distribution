package typings.awsSdkClientSso

import typings.awsSdkClientSso.distTypesCommandsGetRoleCredentialsCommandMod.GetRoleCredentialsCommandInput
import typings.awsSdkClientSso.distTypesCommandsListAccountRolesCommandMod.ListAccountRolesCommandInput
import typings.awsSdkClientSso.distTypesCommandsListAccountsCommandMod.ListAccountsCommandInput
import typings.awsSdkClientSso.distTypesCommandsLogoutCommandMod.LogoutCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommandsMod {
  
  @JSImport("@aws-sdk/client-sso/dist-types/commands", "GetRoleCredentialsCommand")
  @js.native
  open class GetRoleCredentialsCommand protected ()
    extends typings.awsSdkClientSso.distTypesCommandsGetRoleCredentialsCommandMod.GetRoleCredentialsCommand {
    /**
      * @public
      */
    def this(input: GetRoleCredentialsCommandInput) = this()
  }
  /* static members */
  object GetRoleCredentialsCommand {
    
    @JSImport("@aws-sdk/client-sso/dist-types/commands", "GetRoleCredentialsCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  @JSImport("@aws-sdk/client-sso/dist-types/commands", "ListAccountRolesCommand")
  @js.native
  open class ListAccountRolesCommand protected ()
    extends typings.awsSdkClientSso.distTypesCommandsListAccountRolesCommandMod.ListAccountRolesCommand {
    /**
      * @public
      */
    def this(input: ListAccountRolesCommandInput) = this()
  }
  /* static members */
  object ListAccountRolesCommand {
    
    @JSImport("@aws-sdk/client-sso/dist-types/commands", "ListAccountRolesCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  @JSImport("@aws-sdk/client-sso/dist-types/commands", "ListAccountsCommand")
  @js.native
  open class ListAccountsCommand protected ()
    extends typings.awsSdkClientSso.distTypesCommandsListAccountsCommandMod.ListAccountsCommand {
    /**
      * @public
      */
    def this(input: ListAccountsCommandInput) = this()
  }
  /* static members */
  object ListAccountsCommand {
    
    @JSImport("@aws-sdk/client-sso/dist-types/commands", "ListAccountsCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  @JSImport("@aws-sdk/client-sso/dist-types/commands", "LogoutCommand")
  @js.native
  open class LogoutCommand protected ()
    extends typings.awsSdkClientSso.distTypesCommandsLogoutCommandMod.LogoutCommand {
    /**
      * @public
      */
    def this(input: LogoutCommandInput) = this()
  }
  /* static members */
  object LogoutCommand {
    
    @JSImport("@aws-sdk/client-sso/dist-types/commands", "LogoutCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
}
