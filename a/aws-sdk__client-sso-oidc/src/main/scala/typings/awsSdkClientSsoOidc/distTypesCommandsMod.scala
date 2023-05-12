package typings.awsSdkClientSsoOidc

import typings.awsSdkClientSsoOidc.distTypesCommandsCreateTokenCommandMod.CreateTokenCommandInput
import typings.awsSdkClientSsoOidc.distTypesCommandsRegisterClientCommandMod.RegisterClientCommandInput
import typings.awsSdkClientSsoOidc.distTypesCommandsStartDeviceAuthorizationCommandMod.StartDeviceAuthorizationCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommandsMod {
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/commands", "CreateTokenCommand")
  @js.native
  open class CreateTokenCommand protected ()
    extends typings.awsSdkClientSsoOidc.distTypesCommandsCreateTokenCommandMod.CreateTokenCommand {
    /**
      * @public
      */
    def this(input: CreateTokenCommandInput) = this()
  }
  /* static members */
  object CreateTokenCommand {
    
    @JSImport("@aws-sdk/client-sso-oidc/dist-types/commands", "CreateTokenCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/commands", "RegisterClientCommand")
  @js.native
  open class RegisterClientCommand protected ()
    extends typings.awsSdkClientSsoOidc.distTypesCommandsRegisterClientCommandMod.RegisterClientCommand {
    /**
      * @public
      */
    def this(input: RegisterClientCommandInput) = this()
  }
  /* static members */
  object RegisterClientCommand {
    
    @JSImport("@aws-sdk/client-sso-oidc/dist-types/commands", "RegisterClientCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/commands", "StartDeviceAuthorizationCommand")
  @js.native
  open class StartDeviceAuthorizationCommand protected ()
    extends typings.awsSdkClientSsoOidc.distTypesCommandsStartDeviceAuthorizationCommandMod.StartDeviceAuthorizationCommand {
    /**
      * @public
      */
    def this(input: StartDeviceAuthorizationCommandInput) = this()
  }
  /* static members */
  object StartDeviceAuthorizationCommand {
    
    @JSImport("@aws-sdk/client-sso-oidc/dist-types/commands", "StartDeviceAuthorizationCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
}
