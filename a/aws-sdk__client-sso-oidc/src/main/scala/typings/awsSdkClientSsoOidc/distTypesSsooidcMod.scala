package typings.awsSdkClientSsoOidc

import typings.awsSdkClientSsoOidc.distTypesCommandsCreateTokenCommandMod.CreateTokenCommandInput
import typings.awsSdkClientSsoOidc.distTypesCommandsCreateTokenCommandMod.CreateTokenCommandOutput
import typings.awsSdkClientSsoOidc.distTypesCommandsRegisterClientCommandMod.RegisterClientCommandInput
import typings.awsSdkClientSsoOidc.distTypesCommandsRegisterClientCommandMod.RegisterClientCommandOutput
import typings.awsSdkClientSsoOidc.distTypesCommandsStartDeviceAuthorizationCommandMod.StartDeviceAuthorizationCommandInput
import typings.awsSdkClientSsoOidc.distTypesCommandsStartDeviceAuthorizationCommandMod.StartDeviceAuthorizationCommandOutput
import typings.awsSdkClientSsoOidc.distTypesSsooidcclientMod.SSOOIDCClient
import typings.awsSdkClientSsoOidc.distTypesSsooidcclientMod.SSOOIDCClientConfig
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSsooidcMod {
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/SSOOIDC", "SSOOIDC")
  @js.native
  open class SSOOIDC protected () extends SSOOIDCClient {
    def this(configuration: SSOOIDCClientConfig) = this()
    
    /**
      * @see {@link CreateTokenCommand}
      */
    def createToken(args: CreateTokenCommandInput): js.Promise[CreateTokenCommandOutput] = js.native
    def createToken(
      args: CreateTokenCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[CreateTokenCommandOutput], Unit]
    ): Unit = js.native
    def createToken(args: CreateTokenCommandInput, options: HttpHandlerOptions): js.Promise[CreateTokenCommandOutput] = js.native
    def createToken(
      args: CreateTokenCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[CreateTokenCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * @see {@link RegisterClientCommand}
      */
    def registerClient(args: RegisterClientCommandInput): js.Promise[RegisterClientCommandOutput] = js.native
    def registerClient(
      args: RegisterClientCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[RegisterClientCommandOutput], Unit]
    ): Unit = js.native
    def registerClient(args: RegisterClientCommandInput, options: HttpHandlerOptions): js.Promise[RegisterClientCommandOutput] = js.native
    def registerClient(
      args: RegisterClientCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[RegisterClientCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * @see {@link StartDeviceAuthorizationCommand}
      */
    def startDeviceAuthorization(args: StartDeviceAuthorizationCommandInput): js.Promise[StartDeviceAuthorizationCommandOutput] = js.native
    def startDeviceAuthorization(
      args: StartDeviceAuthorizationCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[StartDeviceAuthorizationCommandOutput], Unit]
    ): Unit = js.native
    def startDeviceAuthorization(args: StartDeviceAuthorizationCommandInput, options: HttpHandlerOptions): js.Promise[StartDeviceAuthorizationCommandOutput] = js.native
    def startDeviceAuthorization(
      args: StartDeviceAuthorizationCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[StartDeviceAuthorizationCommandOutput], Unit]
    ): Unit = js.native
  }
}
