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
  
  inline def deserializeAwsQueryAssumeRoleCommand(output: HttpResponse, context: SerdeContext): js.Promise[AssumeRoleCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_queryAssumeRoleCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssumeRoleCommandOutput]]
  
  inline def deserializeAwsQueryAssumeRoleWithSAMLCommand(output: HttpResponse, context: SerdeContext): js.Promise[AssumeRoleWithSAMLCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_queryAssumeRoleWithSAMLCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssumeRoleWithSAMLCommandOutput]]
  
  inline def deserializeAwsQueryAssumeRoleWithWebIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[AssumeRoleWithWebIdentityCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_queryAssumeRoleWithWebIdentityCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssumeRoleWithWebIdentityCommandOutput]]
  
  inline def deserializeAwsQueryDecodeAuthorizationMessageCommand(output: HttpResponse, context: SerdeContext): js.Promise[DecodeAuthorizationMessageCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_queryDecodeAuthorizationMessageCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DecodeAuthorizationMessageCommandOutput]]
  
  inline def deserializeAwsQueryGetAccessKeyInfoCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetAccessKeyInfoCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_queryGetAccessKeyInfoCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetAccessKeyInfoCommandOutput]]
  
  inline def deserializeAwsQueryGetCallerIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetCallerIdentityCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_queryGetCallerIdentityCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetCallerIdentityCommandOutput]]
  
  inline def deserializeAwsQueryGetFederationTokenCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetFederationTokenCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_queryGetFederationTokenCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetFederationTokenCommandOutput]]
  
  inline def deserializeAwsQueryGetSessionTokenCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetSessionTokenCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_queryGetSessionTokenCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSessionTokenCommandOutput]]
  
  inline def serializeAwsQueryAssumeRoleCommand(input: AssumeRoleCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_queryAssumeRoleCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsQueryAssumeRoleWithSAMLCommand(input: AssumeRoleWithSAMLCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_queryAssumeRoleWithSAMLCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsQueryAssumeRoleWithWebIdentityCommand(input: AssumeRoleWithWebIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_queryAssumeRoleWithWebIdentityCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsQueryDecodeAuthorizationMessageCommand(input: DecodeAuthorizationMessageCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_queryDecodeAuthorizationMessageCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsQueryGetAccessKeyInfoCommand(input: GetAccessKeyInfoCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_queryGetAccessKeyInfoCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsQueryGetCallerIdentityCommand(input: GetCallerIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_queryGetCallerIdentityCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsQueryGetFederationTokenCommand(input: GetFederationTokenCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_queryGetFederationTokenCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsQueryGetSessionTokenCommand(input: GetSessionTokenCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_queryGetSessionTokenCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
}
