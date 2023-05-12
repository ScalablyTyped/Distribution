package typings.awsSdkClientSts

import typings.awsSdkClientSts.distTypesCommandsAssumeRoleCommandMod.AssumeRoleCommandInput
import typings.awsSdkClientSts.distTypesCommandsAssumeRoleCommandMod.AssumeRoleCommandOutput
import typings.awsSdkClientSts.distTypesCommandsAssumeRoleWithSAMLCommandMod.AssumeRoleWithSAMLCommandInput
import typings.awsSdkClientSts.distTypesCommandsAssumeRoleWithSAMLCommandMod.AssumeRoleWithSAMLCommandOutput
import typings.awsSdkClientSts.distTypesCommandsAssumeRoleWithWebIdentityCommandMod.AssumeRoleWithWebIdentityCommandInput
import typings.awsSdkClientSts.distTypesCommandsAssumeRoleWithWebIdentityCommandMod.AssumeRoleWithWebIdentityCommandOutput
import typings.awsSdkClientSts.distTypesCommandsDecodeAuthorizationMessageCommandMod.DecodeAuthorizationMessageCommandInput
import typings.awsSdkClientSts.distTypesCommandsDecodeAuthorizationMessageCommandMod.DecodeAuthorizationMessageCommandOutput
import typings.awsSdkClientSts.distTypesCommandsGetAccessKeyInfoCommandMod.GetAccessKeyInfoCommandInput
import typings.awsSdkClientSts.distTypesCommandsGetAccessKeyInfoCommandMod.GetAccessKeyInfoCommandOutput
import typings.awsSdkClientSts.distTypesCommandsGetCallerIdentityCommandMod.GetCallerIdentityCommandInput
import typings.awsSdkClientSts.distTypesCommandsGetCallerIdentityCommandMod.GetCallerIdentityCommandOutput
import typings.awsSdkClientSts.distTypesCommandsGetFederationTokenCommandMod.GetFederationTokenCommandInput
import typings.awsSdkClientSts.distTypesCommandsGetFederationTokenCommandMod.GetFederationTokenCommandOutput
import typings.awsSdkClientSts.distTypesCommandsGetSessionTokenCommandMod.GetSessionTokenCommandInput
import typings.awsSdkClientSts.distTypesCommandsGetSessionTokenCommandMod.GetSessionTokenCommandOutput
import typings.awsSdkProtocolHttp.mod.HttpRequest
import typings.awsSdkProtocolHttp.mod.HttpResponse
import typings.awsSdkTypes.distTypesSerdeMod.SerdeContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesProtocolsAwsQueryMod {
  
  @JSImport("@aws-sdk/client-sts/dist-types/protocols/Aws_query", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deAssumeRoleCommand(output: HttpResponse, context: SerdeContext): js.Promise[AssumeRoleCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_AssumeRoleCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssumeRoleCommandOutput]]
  
  inline def deAssumeRoleWithSAMLCommand(output: HttpResponse, context: SerdeContext): js.Promise[AssumeRoleWithSAMLCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_AssumeRoleWithSAMLCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssumeRoleWithSAMLCommandOutput]]
  
  inline def deAssumeRoleWithWebIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[AssumeRoleWithWebIdentityCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_AssumeRoleWithWebIdentityCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssumeRoleWithWebIdentityCommandOutput]]
  
  inline def deDecodeAuthorizationMessageCommand(output: HttpResponse, context: SerdeContext): js.Promise[DecodeAuthorizationMessageCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_DecodeAuthorizationMessageCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DecodeAuthorizationMessageCommandOutput]]
  
  inline def deGetAccessKeyInfoCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetAccessKeyInfoCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_GetAccessKeyInfoCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetAccessKeyInfoCommandOutput]]
  
  inline def deGetCallerIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetCallerIdentityCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_GetCallerIdentityCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetCallerIdentityCommandOutput]]
  
  inline def deGetFederationTokenCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetFederationTokenCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_GetFederationTokenCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetFederationTokenCommandOutput]]
  
  inline def deGetSessionTokenCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetSessionTokenCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_GetSessionTokenCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSessionTokenCommandOutput]]
  
  inline def seAssumeRoleCommand(input: AssumeRoleCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_AssumeRoleCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seAssumeRoleWithSAMLCommand(input: AssumeRoleWithSAMLCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_AssumeRoleWithSAMLCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seAssumeRoleWithWebIdentityCommand(input: AssumeRoleWithWebIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_AssumeRoleWithWebIdentityCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seDecodeAuthorizationMessageCommand(input: DecodeAuthorizationMessageCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_DecodeAuthorizationMessageCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seGetAccessKeyInfoCommand(input: GetAccessKeyInfoCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_GetAccessKeyInfoCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seGetCallerIdentityCommand(input: GetCallerIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_GetCallerIdentityCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seGetFederationTokenCommand(input: GetFederationTokenCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_GetFederationTokenCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seGetSessionTokenCommand(input: GetSessionTokenCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_GetSessionTokenCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
}
