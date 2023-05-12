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
  
  inline def deCreateTokenCommand(output: HttpResponse, context: SerdeContext): js.Promise[CreateTokenCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_CreateTokenCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CreateTokenCommandOutput]]
  
  inline def deRegisterClientCommand(output: HttpResponse, context: SerdeContext): js.Promise[RegisterClientCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_RegisterClientCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RegisterClientCommandOutput]]
  
  inline def deStartDeviceAuthorizationCommand(output: HttpResponse, context: SerdeContext): js.Promise[StartDeviceAuthorizationCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_StartDeviceAuthorizationCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StartDeviceAuthorizationCommandOutput]]
  
  inline def seCreateTokenCommand(input: CreateTokenCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_CreateTokenCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seRegisterClientCommand(input: RegisterClientCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_RegisterClientCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seStartDeviceAuthorizationCommand(input: StartDeviceAuthorizationCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_StartDeviceAuthorizationCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
}
