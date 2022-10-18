package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.distTypesCommandsCreateIdentityPoolCommandMod.CreateIdentityPoolCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsCreateIdentityPoolCommandMod.CreateIdentityPoolCommandOutput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsDeleteIdentitiesCommandMod.DeleteIdentitiesCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsDeleteIdentitiesCommandMod.DeleteIdentitiesCommandOutput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsDeleteIdentityPoolCommandMod.DeleteIdentityPoolCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsDeleteIdentityPoolCommandMod.DeleteIdentityPoolCommandOutput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsDescribeIdentityCommandMod.DescribeIdentityCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsDescribeIdentityCommandMod.DescribeIdentityCommandOutput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsDescribeIdentityPoolCommandMod.DescribeIdentityPoolCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsDescribeIdentityPoolCommandMod.DescribeIdentityPoolCommandOutput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsGetCredentialsForIdentityCommandMod.GetCredentialsForIdentityCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsGetCredentialsForIdentityCommandMod.GetCredentialsForIdentityCommandOutput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsGetIdCommandMod.GetIdCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsGetIdCommandMod.GetIdCommandOutput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsGetIdentityPoolRolesCommandMod.GetIdentityPoolRolesCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsGetIdentityPoolRolesCommandMod.GetIdentityPoolRolesCommandOutput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsGetOpenIdTokenCommandMod.GetOpenIdTokenCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsGetOpenIdTokenCommandMod.GetOpenIdTokenCommandOutput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsGetOpenIdTokenForDeveloperIdentityCommandMod.GetOpenIdTokenForDeveloperIdentityCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsGetOpenIdTokenForDeveloperIdentityCommandMod.GetOpenIdTokenForDeveloperIdentityCommandOutput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsGetPrincipalTagAttributeMapCommandMod.GetPrincipalTagAttributeMapCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsGetPrincipalTagAttributeMapCommandMod.GetPrincipalTagAttributeMapCommandOutput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsListIdentitiesCommandMod.ListIdentitiesCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsListIdentitiesCommandMod.ListIdentitiesCommandOutput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsListIdentityPoolsCommandMod.ListIdentityPoolsCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsListIdentityPoolsCommandMod.ListIdentityPoolsCommandOutput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsListTagsForResourceCommandMod.ListTagsForResourceCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsListTagsForResourceCommandMod.ListTagsForResourceCommandOutput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsLookupDeveloperIdentityCommandMod.LookupDeveloperIdentityCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsLookupDeveloperIdentityCommandMod.LookupDeveloperIdentityCommandOutput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsMergeDeveloperIdentitiesCommandMod.MergeDeveloperIdentitiesCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsMergeDeveloperIdentitiesCommandMod.MergeDeveloperIdentitiesCommandOutput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsSetIdentityPoolRolesCommandMod.SetIdentityPoolRolesCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsSetIdentityPoolRolesCommandMod.SetIdentityPoolRolesCommandOutput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsSetPrincipalTagAttributeMapCommandMod.SetPrincipalTagAttributeMapCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsSetPrincipalTagAttributeMapCommandMod.SetPrincipalTagAttributeMapCommandOutput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsTagResourceCommandMod.TagResourceCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsTagResourceCommandMod.TagResourceCommandOutput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsUnlinkDeveloperIdentityCommandMod.UnlinkDeveloperIdentityCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsUnlinkDeveloperIdentityCommandMod.UnlinkDeveloperIdentityCommandOutput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsUnlinkIdentityCommandMod.UnlinkIdentityCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsUnlinkIdentityCommandMod.UnlinkIdentityCommandOutput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsUntagResourceCommandMod.UntagResourceCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsUntagResourceCommandMod.UntagResourceCommandOutput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsUpdateIdentityPoolCommandMod.UpdateIdentityPoolCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsUpdateIdentityPoolCommandMod.UpdateIdentityPoolCommandOutput
import typings.awsSdkProtocolHttp.mod.HttpRequest
import typings.awsSdkProtocolHttp.mod.HttpResponse
import typings.awsSdkTypes.distTypesSerdeMod.SerdeContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesProtocolsAwsJson11Mod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/protocols/Aws_json1_1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializeAwsJson11CreateIdentityPoolCommand(output: HttpResponse, context: SerdeContext): js.Promise[CreateIdentityPoolCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1CreateIdentityPoolCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CreateIdentityPoolCommandOutput]]
  
  inline def deserializeAwsJson11DeleteIdentitiesCommand(output: HttpResponse, context: SerdeContext): js.Promise[DeleteIdentitiesCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1DeleteIdentitiesCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteIdentitiesCommandOutput]]
  
  inline def deserializeAwsJson11DeleteIdentityPoolCommand(output: HttpResponse, context: SerdeContext): js.Promise[DeleteIdentityPoolCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1DeleteIdentityPoolCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteIdentityPoolCommandOutput]]
  
  inline def deserializeAwsJson11DescribeIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[DescribeIdentityCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1DescribeIdentityCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DescribeIdentityCommandOutput]]
  
  inline def deserializeAwsJson11DescribeIdentityPoolCommand(output: HttpResponse, context: SerdeContext): js.Promise[DescribeIdentityPoolCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1DescribeIdentityPoolCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DescribeIdentityPoolCommandOutput]]
  
  inline def deserializeAwsJson11GetCredentialsForIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetCredentialsForIdentityCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1GetCredentialsForIdentityCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetCredentialsForIdentityCommandOutput]]
  
  inline def deserializeAwsJson11GetIdCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetIdCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1GetIdCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetIdCommandOutput]]
  
  inline def deserializeAwsJson11GetIdentityPoolRolesCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetIdentityPoolRolesCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1GetIdentityPoolRolesCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetIdentityPoolRolesCommandOutput]]
  
  inline def deserializeAwsJson11GetOpenIdTokenCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetOpenIdTokenCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1GetOpenIdTokenCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetOpenIdTokenCommandOutput]]
  
  inline def deserializeAwsJson11GetOpenIdTokenForDeveloperIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetOpenIdTokenForDeveloperIdentityCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1GetOpenIdTokenForDeveloperIdentityCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetOpenIdTokenForDeveloperIdentityCommandOutput]]
  
  inline def deserializeAwsJson11GetPrincipalTagAttributeMapCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetPrincipalTagAttributeMapCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1GetPrincipalTagAttributeMapCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetPrincipalTagAttributeMapCommandOutput]]
  
  inline def deserializeAwsJson11ListIdentitiesCommand(output: HttpResponse, context: SerdeContext): js.Promise[ListIdentitiesCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1ListIdentitiesCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ListIdentitiesCommandOutput]]
  
  inline def deserializeAwsJson11ListIdentityPoolsCommand(output: HttpResponse, context: SerdeContext): js.Promise[ListIdentityPoolsCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1ListIdentityPoolsCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ListIdentityPoolsCommandOutput]]
  
  inline def deserializeAwsJson11ListTagsForResourceCommand(output: HttpResponse, context: SerdeContext): js.Promise[ListTagsForResourceCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1ListTagsForResourceCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ListTagsForResourceCommandOutput]]
  
  inline def deserializeAwsJson11LookupDeveloperIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[LookupDeveloperIdentityCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1LookupDeveloperIdentityCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LookupDeveloperIdentityCommandOutput]]
  
  inline def deserializeAwsJson11MergeDeveloperIdentitiesCommand(output: HttpResponse, context: SerdeContext): js.Promise[MergeDeveloperIdentitiesCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1MergeDeveloperIdentitiesCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MergeDeveloperIdentitiesCommandOutput]]
  
  inline def deserializeAwsJson11SetIdentityPoolRolesCommand(output: HttpResponse, context: SerdeContext): js.Promise[SetIdentityPoolRolesCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1SetIdentityPoolRolesCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SetIdentityPoolRolesCommandOutput]]
  
  inline def deserializeAwsJson11SetPrincipalTagAttributeMapCommand(output: HttpResponse, context: SerdeContext): js.Promise[SetPrincipalTagAttributeMapCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1SetPrincipalTagAttributeMapCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SetPrincipalTagAttributeMapCommandOutput]]
  
  inline def deserializeAwsJson11TagResourceCommand(output: HttpResponse, context: SerdeContext): js.Promise[TagResourceCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1TagResourceCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TagResourceCommandOutput]]
  
  inline def deserializeAwsJson11UnlinkDeveloperIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[UnlinkDeveloperIdentityCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1UnlinkDeveloperIdentityCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UnlinkDeveloperIdentityCommandOutput]]
  
  inline def deserializeAwsJson11UnlinkIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[UnlinkIdentityCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1UnlinkIdentityCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UnlinkIdentityCommandOutput]]
  
  inline def deserializeAwsJson11UntagResourceCommand(output: HttpResponse, context: SerdeContext): js.Promise[UntagResourceCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1UntagResourceCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UntagResourceCommandOutput]]
  
  inline def deserializeAwsJson11UpdateIdentityPoolCommand(output: HttpResponse, context: SerdeContext): js.Promise[UpdateIdentityPoolCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1UpdateIdentityPoolCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpdateIdentityPoolCommandOutput]]
  
  inline def serializeAwsJson11CreateIdentityPoolCommand(input: CreateIdentityPoolCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1CreateIdentityPoolCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsJson11DeleteIdentitiesCommand(input: DeleteIdentitiesCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1DeleteIdentitiesCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsJson11DeleteIdentityPoolCommand(input: DeleteIdentityPoolCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1DeleteIdentityPoolCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsJson11DescribeIdentityCommand(input: DescribeIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1DescribeIdentityCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsJson11DescribeIdentityPoolCommand(input: DescribeIdentityPoolCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1DescribeIdentityPoolCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsJson11GetCredentialsForIdentityCommand(input: GetCredentialsForIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1GetCredentialsForIdentityCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsJson11GetIdCommand(input: GetIdCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1GetIdCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsJson11GetIdentityPoolRolesCommand(input: GetIdentityPoolRolesCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1GetIdentityPoolRolesCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsJson11GetOpenIdTokenCommand(input: GetOpenIdTokenCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1GetOpenIdTokenCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsJson11GetOpenIdTokenForDeveloperIdentityCommand(input: GetOpenIdTokenForDeveloperIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1GetOpenIdTokenForDeveloperIdentityCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsJson11GetPrincipalTagAttributeMapCommand(input: GetPrincipalTagAttributeMapCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1GetPrincipalTagAttributeMapCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsJson11ListIdentitiesCommand(input: ListIdentitiesCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1ListIdentitiesCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsJson11ListIdentityPoolsCommand(input: ListIdentityPoolsCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1ListIdentityPoolsCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsJson11ListTagsForResourceCommand(input: ListTagsForResourceCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1ListTagsForResourceCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsJson11LookupDeveloperIdentityCommand(input: LookupDeveloperIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1LookupDeveloperIdentityCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsJson11MergeDeveloperIdentitiesCommand(input: MergeDeveloperIdentitiesCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1MergeDeveloperIdentitiesCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsJson11SetIdentityPoolRolesCommand(input: SetIdentityPoolRolesCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1SetIdentityPoolRolesCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsJson11SetPrincipalTagAttributeMapCommand(input: SetPrincipalTagAttributeMapCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1SetPrincipalTagAttributeMapCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsJson11TagResourceCommand(input: TagResourceCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1TagResourceCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsJson11UnlinkDeveloperIdentityCommand(input: UnlinkDeveloperIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1UnlinkDeveloperIdentityCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsJson11UnlinkIdentityCommand(input: UnlinkIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1UnlinkIdentityCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsJson11UntagResourceCommand(input: UntagResourceCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1UntagResourceCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsJson11UpdateIdentityPoolCommand(input: UpdateIdentityPoolCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1UpdateIdentityPoolCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
}
