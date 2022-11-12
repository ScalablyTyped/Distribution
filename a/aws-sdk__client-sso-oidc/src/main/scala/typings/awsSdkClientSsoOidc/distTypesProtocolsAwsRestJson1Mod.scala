package typings.awsSdkClientSsoOidc

import typings.awsSdkClientSsoOidc.distTypesCommandsCreateTokenCommandMod.CreateTokenCommandInput
import typings.awsSdkClientSsoOidc.distTypesCommandsCreateTokenCommandMod.CreateTokenCommandOutput
import typings.awsSdkClientSsoOidc.distTypesCommandsRegisterClientCommandMod.RegisterClientCommandInput
import typings.awsSdkClientSsoOidc.distTypesCommandsRegisterClientCommandMod.RegisterClientCommandOutput
import typings.awsSdkClientSsoOidc.distTypesCommandsStartDeviceAuthorizationCommandMod.StartDeviceAuthorizationCommandInput
import typings.awsSdkClientSsoOidc.distTypesCommandsStartDeviceAuthorizationCommandMod.StartDeviceAuthorizationCommandOutput
import typings.awsSdkProtocolHttp.mod.HttpRequest
import typings.awsSdkProtocolHttp.mod.HttpResponse
import typings.awsSdkTypes.distTypesSerdeMod.SerdeContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesProtocolsAwsRestJson1Mod {
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/protocols/Aws_restJson1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializeAwsRestJson1CreateTokenCommand(output: HttpResponse, context: SerdeContext): js.Promise[CreateTokenCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_restJson1CreateTokenCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CreateTokenCommandOutput]]
  
  inline def deserializeAwsRestJson1RegisterClientCommand(output: HttpResponse, context: SerdeContext): js.Promise[RegisterClientCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_restJson1RegisterClientCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RegisterClientCommandOutput]]
  
  inline def deserializeAwsRestJson1StartDeviceAuthorizationCommand(output: HttpResponse, context: SerdeContext): js.Promise[StartDeviceAuthorizationCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_restJson1StartDeviceAuthorizationCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StartDeviceAuthorizationCommandOutput]]
  
  inline def serializeAwsRestJson1CreateTokenCommand(input: CreateTokenCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_restJson1CreateTokenCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsRestJson1RegisterClientCommand(input: RegisterClientCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_restJson1RegisterClientCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsRestJson1StartDeviceAuthorizationCommand(input: StartDeviceAuthorizationCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_restJson1StartDeviceAuthorizationCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
}
