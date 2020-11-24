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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/types/protocols/Aws_json1_1", JSImport.Namespace)
@js.native
object awsJson11Mod extends js.Object {
  
  @JSName("deserializeAws_json1_1CreateIdentityPoolCommand")
  def deserializeAwsJson11CreateIdentityPoolCommand(output: HttpResponse, context: SerdeContext): js.Promise[CreateIdentityPoolCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1DeleteIdentitiesCommand")
  def deserializeAwsJson11DeleteIdentitiesCommand(output: HttpResponse, context: SerdeContext): js.Promise[DeleteIdentitiesCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1DeleteIdentityPoolCommand")
  def deserializeAwsJson11DeleteIdentityPoolCommand(output: HttpResponse, context: SerdeContext): js.Promise[DeleteIdentityPoolCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1DescribeIdentityCommand")
  def deserializeAwsJson11DescribeIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[DescribeIdentityCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1DescribeIdentityPoolCommand")
  def deserializeAwsJson11DescribeIdentityPoolCommand(output: HttpResponse, context: SerdeContext): js.Promise[DescribeIdentityPoolCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1GetCredentialsForIdentityCommand")
  def deserializeAwsJson11GetCredentialsForIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetCredentialsForIdentityCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1GetIdCommand")
  def deserializeAwsJson11GetIdCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetIdCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1GetIdentityPoolRolesCommand")
  def deserializeAwsJson11GetIdentityPoolRolesCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetIdentityPoolRolesCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1GetOpenIdTokenCommand")
  def deserializeAwsJson11GetOpenIdTokenCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetOpenIdTokenCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1GetOpenIdTokenForDeveloperIdentityCommand")
  def deserializeAwsJson11GetOpenIdTokenForDeveloperIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetOpenIdTokenForDeveloperIdentityCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1ListIdentitiesCommand")
  def deserializeAwsJson11ListIdentitiesCommand(output: HttpResponse, context: SerdeContext): js.Promise[ListIdentitiesCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1ListIdentityPoolsCommand")
  def deserializeAwsJson11ListIdentityPoolsCommand(output: HttpResponse, context: SerdeContext): js.Promise[ListIdentityPoolsCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1ListTagsForResourceCommand")
  def deserializeAwsJson11ListTagsForResourceCommand(output: HttpResponse, context: SerdeContext): js.Promise[ListTagsForResourceCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1LookupDeveloperIdentityCommand")
  def deserializeAwsJson11LookupDeveloperIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[LookupDeveloperIdentityCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1MergeDeveloperIdentitiesCommand")
  def deserializeAwsJson11MergeDeveloperIdentitiesCommand(output: HttpResponse, context: SerdeContext): js.Promise[MergeDeveloperIdentitiesCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1SetIdentityPoolRolesCommand")
  def deserializeAwsJson11SetIdentityPoolRolesCommand(output: HttpResponse, context: SerdeContext): js.Promise[SetIdentityPoolRolesCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1TagResourceCommand")
  def deserializeAwsJson11TagResourceCommand(output: HttpResponse, context: SerdeContext): js.Promise[TagResourceCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1UnlinkDeveloperIdentityCommand")
  def deserializeAwsJson11UnlinkDeveloperIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[UnlinkDeveloperIdentityCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1UnlinkIdentityCommand")
  def deserializeAwsJson11UnlinkIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[UnlinkIdentityCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1UntagResourceCommand")
  def deserializeAwsJson11UntagResourceCommand(output: HttpResponse, context: SerdeContext): js.Promise[UntagResourceCommandOutput] = js.native
  
  @JSName("deserializeAws_json1_1UpdateIdentityPoolCommand")
  def deserializeAwsJson11UpdateIdentityPoolCommand(output: HttpResponse, context: SerdeContext): js.Promise[UpdateIdentityPoolCommandOutput] = js.native
  
  @JSName("serializeAws_json1_1CreateIdentityPoolCommand")
  def serializeAwsJson11CreateIdentityPoolCommand(input: CreateIdentityPoolCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1DeleteIdentitiesCommand")
  def serializeAwsJson11DeleteIdentitiesCommand(input: DeleteIdentitiesCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1DeleteIdentityPoolCommand")
  def serializeAwsJson11DeleteIdentityPoolCommand(input: DeleteIdentityPoolCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1DescribeIdentityCommand")
  def serializeAwsJson11DescribeIdentityCommand(input: DescribeIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1DescribeIdentityPoolCommand")
  def serializeAwsJson11DescribeIdentityPoolCommand(input: DescribeIdentityPoolCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1GetCredentialsForIdentityCommand")
  def serializeAwsJson11GetCredentialsForIdentityCommand(input: GetCredentialsForIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1GetIdCommand")
  def serializeAwsJson11GetIdCommand(input: GetIdCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1GetIdentityPoolRolesCommand")
  def serializeAwsJson11GetIdentityPoolRolesCommand(input: GetIdentityPoolRolesCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1GetOpenIdTokenCommand")
  def serializeAwsJson11GetOpenIdTokenCommand(input: GetOpenIdTokenCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1GetOpenIdTokenForDeveloperIdentityCommand")
  def serializeAwsJson11GetOpenIdTokenForDeveloperIdentityCommand(input: GetOpenIdTokenForDeveloperIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1ListIdentitiesCommand")
  def serializeAwsJson11ListIdentitiesCommand(input: ListIdentitiesCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1ListIdentityPoolsCommand")
  def serializeAwsJson11ListIdentityPoolsCommand(input: ListIdentityPoolsCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1ListTagsForResourceCommand")
  def serializeAwsJson11ListTagsForResourceCommand(input: ListTagsForResourceCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1LookupDeveloperIdentityCommand")
  def serializeAwsJson11LookupDeveloperIdentityCommand(input: LookupDeveloperIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1MergeDeveloperIdentitiesCommand")
  def serializeAwsJson11MergeDeveloperIdentitiesCommand(input: MergeDeveloperIdentitiesCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1SetIdentityPoolRolesCommand")
  def serializeAwsJson11SetIdentityPoolRolesCommand(input: SetIdentityPoolRolesCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1TagResourceCommand")
  def serializeAwsJson11TagResourceCommand(input: TagResourceCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1UnlinkDeveloperIdentityCommand")
  def serializeAwsJson11UnlinkDeveloperIdentityCommand(input: UnlinkDeveloperIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1UnlinkIdentityCommand")
  def serializeAwsJson11UnlinkIdentityCommand(input: UnlinkIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1UntagResourceCommand")
  def serializeAwsJson11UntagResourceCommand(input: UntagResourceCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
  
  @JSName("serializeAws_json1_1UpdateIdentityPoolCommand")
  def serializeAwsJson11UpdateIdentityPoolCommand(input: UpdateIdentityPoolCommandInput, context: SerdeContext): js.Promise[HttpRequest] = js.native
}
