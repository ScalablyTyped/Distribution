package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.createIdentityPoolCommandMod.CreateIdentityPoolCommandInput
import typings.awsSdkClientCognitoIdentity.createIdentityPoolCommandMod.CreateIdentityPoolCommandOutput
import typings.awsSdkClientCognitoIdentity.deleteIdentitiesCommandMod.DeleteIdentitiesCommandInput
import typings.awsSdkClientCognitoIdentity.deleteIdentitiesCommandMod.DeleteIdentitiesCommandOutput
import typings.awsSdkClientCognitoIdentity.deleteIdentityPoolCommandMod.DeleteIdentityPoolCommandInput
import typings.awsSdkClientCognitoIdentity.deleteIdentityPoolCommandMod.DeleteIdentityPoolCommandOutput
import typings.awsSdkClientCognitoIdentity.describeIdentityCommandMod.DescribeIdentityCommandInput
import typings.awsSdkClientCognitoIdentity.describeIdentityCommandMod.DescribeIdentityCommandOutput
import typings.awsSdkClientCognitoIdentity.describeIdentityPoolCommandMod.DescribeIdentityPoolCommandInput
import typings.awsSdkClientCognitoIdentity.describeIdentityPoolCommandMod.DescribeIdentityPoolCommandOutput
import typings.awsSdkClientCognitoIdentity.getCredentialsForIdentityCommandMod.GetCredentialsForIdentityCommandInput
import typings.awsSdkClientCognitoIdentity.getCredentialsForIdentityCommandMod.GetCredentialsForIdentityCommandOutput
import typings.awsSdkClientCognitoIdentity.getIdCommandMod.GetIdCommandInput
import typings.awsSdkClientCognitoIdentity.getIdCommandMod.GetIdCommandOutput
import typings.awsSdkClientCognitoIdentity.getIdentityPoolRolesCommandMod.GetIdentityPoolRolesCommandInput
import typings.awsSdkClientCognitoIdentity.getIdentityPoolRolesCommandMod.GetIdentityPoolRolesCommandOutput
import typings.awsSdkClientCognitoIdentity.getOpenIdTokenCommandMod.GetOpenIdTokenCommandInput
import typings.awsSdkClientCognitoIdentity.getOpenIdTokenCommandMod.GetOpenIdTokenCommandOutput
import typings.awsSdkClientCognitoIdentity.getOpenIdTokenForDeveloperIdentityCommandMod.GetOpenIdTokenForDeveloperIdentityCommandInput
import typings.awsSdkClientCognitoIdentity.getOpenIdTokenForDeveloperIdentityCommandMod.GetOpenIdTokenForDeveloperIdentityCommandOutput
import typings.awsSdkClientCognitoIdentity.listIdentitiesCommandMod.ListIdentitiesCommandInput
import typings.awsSdkClientCognitoIdentity.listIdentitiesCommandMod.ListIdentitiesCommandOutput
import typings.awsSdkClientCognitoIdentity.listIdentityPoolsCommandMod.ListIdentityPoolsCommandInput
import typings.awsSdkClientCognitoIdentity.listIdentityPoolsCommandMod.ListIdentityPoolsCommandOutput
import typings.awsSdkClientCognitoIdentity.listTagsForResourceCommandMod.ListTagsForResourceCommandInput
import typings.awsSdkClientCognitoIdentity.listTagsForResourceCommandMod.ListTagsForResourceCommandOutput
import typings.awsSdkClientCognitoIdentity.lookupDeveloperIdentityCommandMod.LookupDeveloperIdentityCommandInput
import typings.awsSdkClientCognitoIdentity.lookupDeveloperIdentityCommandMod.LookupDeveloperIdentityCommandOutput
import typings.awsSdkClientCognitoIdentity.mergeDeveloperIdentitiesCommandMod.MergeDeveloperIdentitiesCommandInput
import typings.awsSdkClientCognitoIdentity.mergeDeveloperIdentitiesCommandMod.MergeDeveloperIdentitiesCommandOutput
import typings.awsSdkClientCognitoIdentity.setIdentityPoolRolesCommandMod.SetIdentityPoolRolesCommandInput
import typings.awsSdkClientCognitoIdentity.setIdentityPoolRolesCommandMod.SetIdentityPoolRolesCommandOutput
import typings.awsSdkClientCognitoIdentity.tagResourceCommandMod.TagResourceCommandInput
import typings.awsSdkClientCognitoIdentity.tagResourceCommandMod.TagResourceCommandOutput
import typings.awsSdkClientCognitoIdentity.unlinkDeveloperIdentityCommandMod.UnlinkDeveloperIdentityCommandInput
import typings.awsSdkClientCognitoIdentity.unlinkDeveloperIdentityCommandMod.UnlinkDeveloperIdentityCommandOutput
import typings.awsSdkClientCognitoIdentity.unlinkIdentityCommandMod.UnlinkIdentityCommandInput
import typings.awsSdkClientCognitoIdentity.unlinkIdentityCommandMod.UnlinkIdentityCommandOutput
import typings.awsSdkClientCognitoIdentity.untagResourceCommandMod.UntagResourceCommandInput
import typings.awsSdkClientCognitoIdentity.untagResourceCommandMod.UntagResourceCommandOutput
import typings.awsSdkClientCognitoIdentity.updateIdentityPoolCommandMod.UpdateIdentityPoolCommandInput
import typings.awsSdkClientCognitoIdentity.updateIdentityPoolCommandMod.UpdateIdentityPoolCommandOutput
import typings.awsSdkProtocolHttp.mod.HttpRequest
import typings.awsSdkProtocolHttp.mod.HttpResponse
import typings.awsSdkTypes.serdeMod.SerdeContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object awsJson11Mod {
  
  @JSImport("@aws-sdk/client-cognito-identity/types/protocols/Aws_json1_1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def deserializeAwsJson11CreateIdentityPoolCommand(output: HttpResponse, context: SerdeContext): js.Promise[CreateIdentityPoolCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1CreateIdentityPoolCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CreateIdentityPoolCommandOutput]]
  
  @scala.inline
  def deserializeAwsJson11DeleteIdentitiesCommand(output: HttpResponse, context: SerdeContext): js.Promise[DeleteIdentitiesCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1DeleteIdentitiesCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteIdentitiesCommandOutput]]
  
  @scala.inline
  def deserializeAwsJson11DeleteIdentityPoolCommand(output: HttpResponse, context: SerdeContext): js.Promise[DeleteIdentityPoolCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1DeleteIdentityPoolCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteIdentityPoolCommandOutput]]
  
  @scala.inline
  def deserializeAwsJson11DescribeIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[DescribeIdentityCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1DescribeIdentityCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DescribeIdentityCommandOutput]]
  
  @scala.inline
  def deserializeAwsJson11DescribeIdentityPoolCommand(output: HttpResponse, context: SerdeContext): js.Promise[DescribeIdentityPoolCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1DescribeIdentityPoolCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DescribeIdentityPoolCommandOutput]]
  
  @scala.inline
  def deserializeAwsJson11GetCredentialsForIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetCredentialsForIdentityCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1GetCredentialsForIdentityCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetCredentialsForIdentityCommandOutput]]
  
  @scala.inline
  def deserializeAwsJson11GetIdCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetIdCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1GetIdCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetIdCommandOutput]]
  
  @scala.inline
  def deserializeAwsJson11GetIdentityPoolRolesCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetIdentityPoolRolesCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1GetIdentityPoolRolesCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetIdentityPoolRolesCommandOutput]]
  
  @scala.inline
  def deserializeAwsJson11GetOpenIdTokenCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetOpenIdTokenCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1GetOpenIdTokenCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetOpenIdTokenCommandOutput]]
  
  @scala.inline
  def deserializeAwsJson11GetOpenIdTokenForDeveloperIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetOpenIdTokenForDeveloperIdentityCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1GetOpenIdTokenForDeveloperIdentityCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetOpenIdTokenForDeveloperIdentityCommandOutput]]
  
  @scala.inline
  def deserializeAwsJson11ListIdentitiesCommand(output: HttpResponse, context: SerdeContext): js.Promise[ListIdentitiesCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1ListIdentitiesCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ListIdentitiesCommandOutput]]
  
  @scala.inline
  def deserializeAwsJson11ListIdentityPoolsCommand(output: HttpResponse, context: SerdeContext): js.Promise[ListIdentityPoolsCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1ListIdentityPoolsCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ListIdentityPoolsCommandOutput]]
  
  @scala.inline
  def deserializeAwsJson11ListTagsForResourceCommand(output: HttpResponse, context: SerdeContext): js.Promise[ListTagsForResourceCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1ListTagsForResourceCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ListTagsForResourceCommandOutput]]
  
  @scala.inline
  def deserializeAwsJson11LookupDeveloperIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[LookupDeveloperIdentityCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1LookupDeveloperIdentityCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LookupDeveloperIdentityCommandOutput]]
  
  @scala.inline
  def deserializeAwsJson11MergeDeveloperIdentitiesCommand(output: HttpResponse, context: SerdeContext): js.Promise[MergeDeveloperIdentitiesCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1MergeDeveloperIdentitiesCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MergeDeveloperIdentitiesCommandOutput]]
  
  @scala.inline
  def deserializeAwsJson11SetIdentityPoolRolesCommand(output: HttpResponse, context: SerdeContext): js.Promise[SetIdentityPoolRolesCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1SetIdentityPoolRolesCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SetIdentityPoolRolesCommandOutput]]
  
  @scala.inline
  def deserializeAwsJson11TagResourceCommand(output: HttpResponse, context: SerdeContext): js.Promise[TagResourceCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1TagResourceCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TagResourceCommandOutput]]
  
  @scala.inline
  def deserializeAwsJson11UnlinkDeveloperIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[UnlinkDeveloperIdentityCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1UnlinkDeveloperIdentityCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UnlinkDeveloperIdentityCommandOutput]]
  
  @scala.inline
  def deserializeAwsJson11UnlinkIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[UnlinkIdentityCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1UnlinkIdentityCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UnlinkIdentityCommandOutput]]
  
  @scala.inline
  def deserializeAwsJson11UntagResourceCommand(output: HttpResponse, context: SerdeContext): js.Promise[UntagResourceCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1UntagResourceCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UntagResourceCommandOutput]]
  
  @scala.inline
  def deserializeAwsJson11UpdateIdentityPoolCommand(output: HttpResponse, context: SerdeContext): js.Promise[UpdateIdentityPoolCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_json1_1UpdateIdentityPoolCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpdateIdentityPoolCommandOutput]]
  
  @scala.inline
  def serializeAwsJson11CreateIdentityPoolCommand(input: CreateIdentityPoolCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1CreateIdentityPoolCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  @scala.inline
  def serializeAwsJson11DeleteIdentitiesCommand(input: DeleteIdentitiesCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1DeleteIdentitiesCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  @scala.inline
  def serializeAwsJson11DeleteIdentityPoolCommand(input: DeleteIdentityPoolCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1DeleteIdentityPoolCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  @scala.inline
  def serializeAwsJson11DescribeIdentityCommand(input: DescribeIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1DescribeIdentityCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  @scala.inline
  def serializeAwsJson11DescribeIdentityPoolCommand(input: DescribeIdentityPoolCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1DescribeIdentityPoolCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  @scala.inline
  def serializeAwsJson11GetCredentialsForIdentityCommand(input: GetCredentialsForIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1GetCredentialsForIdentityCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  @scala.inline
  def serializeAwsJson11GetIdCommand(input: GetIdCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1GetIdCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  @scala.inline
  def serializeAwsJson11GetIdentityPoolRolesCommand(input: GetIdentityPoolRolesCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1GetIdentityPoolRolesCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  @scala.inline
  def serializeAwsJson11GetOpenIdTokenCommand(input: GetOpenIdTokenCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1GetOpenIdTokenCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  @scala.inline
  def serializeAwsJson11GetOpenIdTokenForDeveloperIdentityCommand(input: GetOpenIdTokenForDeveloperIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1GetOpenIdTokenForDeveloperIdentityCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  @scala.inline
  def serializeAwsJson11ListIdentitiesCommand(input: ListIdentitiesCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1ListIdentitiesCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  @scala.inline
  def serializeAwsJson11ListIdentityPoolsCommand(input: ListIdentityPoolsCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1ListIdentityPoolsCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  @scala.inline
  def serializeAwsJson11ListTagsForResourceCommand(input: ListTagsForResourceCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1ListTagsForResourceCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  @scala.inline
  def serializeAwsJson11LookupDeveloperIdentityCommand(input: LookupDeveloperIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1LookupDeveloperIdentityCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  @scala.inline
  def serializeAwsJson11MergeDeveloperIdentitiesCommand(input: MergeDeveloperIdentitiesCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1MergeDeveloperIdentitiesCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  @scala.inline
  def serializeAwsJson11SetIdentityPoolRolesCommand(input: SetIdentityPoolRolesCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1SetIdentityPoolRolesCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  @scala.inline
  def serializeAwsJson11TagResourceCommand(input: TagResourceCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1TagResourceCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  @scala.inline
  def serializeAwsJson11UnlinkDeveloperIdentityCommand(input: UnlinkDeveloperIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1UnlinkDeveloperIdentityCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  @scala.inline
  def serializeAwsJson11UnlinkIdentityCommand(input: UnlinkIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1UnlinkIdentityCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  @scala.inline
  def serializeAwsJson11UntagResourceCommand(input: UntagResourceCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1UntagResourceCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  @scala.inline
  def serializeAwsJson11UpdateIdentityPoolCommand(input: UpdateIdentityPoolCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_json1_1UpdateIdentityPoolCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
}
