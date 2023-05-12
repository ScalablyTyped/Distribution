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
  
  inline def deCreateIdentityPoolCommand(output: HttpResponse, context: SerdeContext): js.Promise[CreateIdentityPoolCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_CreateIdentityPoolCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CreateIdentityPoolCommandOutput]]
  
  inline def deDeleteIdentitiesCommand(output: HttpResponse, context: SerdeContext): js.Promise[DeleteIdentitiesCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_DeleteIdentitiesCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteIdentitiesCommandOutput]]
  
  inline def deDeleteIdentityPoolCommand(output: HttpResponse, context: SerdeContext): js.Promise[DeleteIdentityPoolCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_DeleteIdentityPoolCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteIdentityPoolCommandOutput]]
  
  inline def deDescribeIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[DescribeIdentityCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_DescribeIdentityCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DescribeIdentityCommandOutput]]
  
  inline def deDescribeIdentityPoolCommand(output: HttpResponse, context: SerdeContext): js.Promise[DescribeIdentityPoolCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_DescribeIdentityPoolCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DescribeIdentityPoolCommandOutput]]
  
  inline def deGetCredentialsForIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetCredentialsForIdentityCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_GetCredentialsForIdentityCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetCredentialsForIdentityCommandOutput]]
  
  inline def deGetIdCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetIdCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_GetIdCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetIdCommandOutput]]
  
  inline def deGetIdentityPoolRolesCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetIdentityPoolRolesCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_GetIdentityPoolRolesCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetIdentityPoolRolesCommandOutput]]
  
  inline def deGetOpenIdTokenCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetOpenIdTokenCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_GetOpenIdTokenCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetOpenIdTokenCommandOutput]]
  
  inline def deGetOpenIdTokenForDeveloperIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetOpenIdTokenForDeveloperIdentityCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_GetOpenIdTokenForDeveloperIdentityCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetOpenIdTokenForDeveloperIdentityCommandOutput]]
  
  inline def deGetPrincipalTagAttributeMapCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetPrincipalTagAttributeMapCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_GetPrincipalTagAttributeMapCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetPrincipalTagAttributeMapCommandOutput]]
  
  inline def deListIdentitiesCommand(output: HttpResponse, context: SerdeContext): js.Promise[ListIdentitiesCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_ListIdentitiesCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ListIdentitiesCommandOutput]]
  
  inline def deListIdentityPoolsCommand(output: HttpResponse, context: SerdeContext): js.Promise[ListIdentityPoolsCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_ListIdentityPoolsCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ListIdentityPoolsCommandOutput]]
  
  inline def deListTagsForResourceCommand(output: HttpResponse, context: SerdeContext): js.Promise[ListTagsForResourceCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_ListTagsForResourceCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ListTagsForResourceCommandOutput]]
  
  inline def deLookupDeveloperIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[LookupDeveloperIdentityCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_LookupDeveloperIdentityCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LookupDeveloperIdentityCommandOutput]]
  
  inline def deMergeDeveloperIdentitiesCommand(output: HttpResponse, context: SerdeContext): js.Promise[MergeDeveloperIdentitiesCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_MergeDeveloperIdentitiesCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MergeDeveloperIdentitiesCommandOutput]]
  
  inline def deSetIdentityPoolRolesCommand(output: HttpResponse, context: SerdeContext): js.Promise[SetIdentityPoolRolesCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_SetIdentityPoolRolesCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SetIdentityPoolRolesCommandOutput]]
  
  inline def deSetPrincipalTagAttributeMapCommand(output: HttpResponse, context: SerdeContext): js.Promise[SetPrincipalTagAttributeMapCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_SetPrincipalTagAttributeMapCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SetPrincipalTagAttributeMapCommandOutput]]
  
  inline def deTagResourceCommand(output: HttpResponse, context: SerdeContext): js.Promise[TagResourceCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_TagResourceCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TagResourceCommandOutput]]
  
  inline def deUnlinkDeveloperIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[UnlinkDeveloperIdentityCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_UnlinkDeveloperIdentityCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UnlinkDeveloperIdentityCommandOutput]]
  
  inline def deUnlinkIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[UnlinkIdentityCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_UnlinkIdentityCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UnlinkIdentityCommandOutput]]
  
  inline def deUntagResourceCommand(output: HttpResponse, context: SerdeContext): js.Promise[UntagResourceCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_UntagResourceCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UntagResourceCommandOutput]]
  
  inline def deUpdateIdentityPoolCommand(output: HttpResponse, context: SerdeContext): js.Promise[UpdateIdentityPoolCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_UpdateIdentityPoolCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpdateIdentityPoolCommandOutput]]
  
  inline def seCreateIdentityPoolCommand(input: CreateIdentityPoolCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_CreateIdentityPoolCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seDeleteIdentitiesCommand(input: DeleteIdentitiesCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_DeleteIdentitiesCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seDeleteIdentityPoolCommand(input: DeleteIdentityPoolCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_DeleteIdentityPoolCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seDescribeIdentityCommand(input: DescribeIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_DescribeIdentityCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seDescribeIdentityPoolCommand(input: DescribeIdentityPoolCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_DescribeIdentityPoolCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seGetCredentialsForIdentityCommand(input: GetCredentialsForIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_GetCredentialsForIdentityCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seGetIdCommand(input: GetIdCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_GetIdCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seGetIdentityPoolRolesCommand(input: GetIdentityPoolRolesCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_GetIdentityPoolRolesCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seGetOpenIdTokenCommand(input: GetOpenIdTokenCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_GetOpenIdTokenCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seGetOpenIdTokenForDeveloperIdentityCommand(input: GetOpenIdTokenForDeveloperIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_GetOpenIdTokenForDeveloperIdentityCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seGetPrincipalTagAttributeMapCommand(input: GetPrincipalTagAttributeMapCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_GetPrincipalTagAttributeMapCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seListIdentitiesCommand(input: ListIdentitiesCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_ListIdentitiesCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seListIdentityPoolsCommand(input: ListIdentityPoolsCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_ListIdentityPoolsCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seListTagsForResourceCommand(input: ListTagsForResourceCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_ListTagsForResourceCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seLookupDeveloperIdentityCommand(input: LookupDeveloperIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_LookupDeveloperIdentityCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seMergeDeveloperIdentitiesCommand(input: MergeDeveloperIdentitiesCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_MergeDeveloperIdentitiesCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seSetIdentityPoolRolesCommand(input: SetIdentityPoolRolesCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_SetIdentityPoolRolesCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seSetPrincipalTagAttributeMapCommand(input: SetPrincipalTagAttributeMapCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_SetPrincipalTagAttributeMapCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seTagResourceCommand(input: TagResourceCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_TagResourceCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seUnlinkDeveloperIdentityCommand(input: UnlinkDeveloperIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_UnlinkDeveloperIdentityCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seUnlinkIdentityCommand(input: UnlinkIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_UnlinkIdentityCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seUntagResourceCommand(input: UntagResourceCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_UntagResourceCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seUpdateIdentityPoolCommand(input: UpdateIdentityPoolCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_UpdateIdentityPoolCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
}
