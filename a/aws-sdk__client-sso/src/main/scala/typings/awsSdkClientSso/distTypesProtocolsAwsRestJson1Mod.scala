package typings.awsSdkClientSso

import typings.awsSdkClientSso.distTypesCommandsGetRoleCredentialsCommandMod.GetRoleCredentialsCommandInput
import typings.awsSdkClientSso.distTypesCommandsGetRoleCredentialsCommandMod.GetRoleCredentialsCommandOutput
import typings.awsSdkClientSso.distTypesCommandsListAccountRolesCommandMod.ListAccountRolesCommandInput
import typings.awsSdkClientSso.distTypesCommandsListAccountRolesCommandMod.ListAccountRolesCommandOutput
import typings.awsSdkClientSso.distTypesCommandsListAccountsCommandMod.ListAccountsCommandInput
import typings.awsSdkClientSso.distTypesCommandsListAccountsCommandMod.ListAccountsCommandOutput
import typings.awsSdkClientSso.distTypesCommandsLogoutCommandMod.LogoutCommandInput
import typings.awsSdkClientSso.distTypesCommandsLogoutCommandMod.LogoutCommandOutput
import typings.awsSdkProtocolHttp.mod.HttpRequest
import typings.awsSdkProtocolHttp.mod.HttpResponse
import typings.awsSdkTypes.distTypesSerdeMod.SerdeContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesProtocolsAwsRestJson1Mod {
  
  @JSImport("@aws-sdk/client-sso/dist-types/protocols/Aws_restJson1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deGetRoleCredentialsCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetRoleCredentialsCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_GetRoleCredentialsCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetRoleCredentialsCommandOutput]]
  
  inline def deListAccountRolesCommand(output: HttpResponse, context: SerdeContext): js.Promise[ListAccountRolesCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_ListAccountRolesCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ListAccountRolesCommandOutput]]
  
  inline def deListAccountsCommand(output: HttpResponse, context: SerdeContext): js.Promise[ListAccountsCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_ListAccountsCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ListAccountsCommandOutput]]
  
  inline def deLogoutCommand(output: HttpResponse, context: SerdeContext): js.Promise[LogoutCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_LogoutCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LogoutCommandOutput]]
  
  inline def seGetRoleCredentialsCommand(input: GetRoleCredentialsCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_GetRoleCredentialsCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seListAccountRolesCommand(input: ListAccountRolesCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_ListAccountRolesCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seListAccountsCommand(input: ListAccountsCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_ListAccountsCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seLogoutCommand(input: LogoutCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_LogoutCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
}
