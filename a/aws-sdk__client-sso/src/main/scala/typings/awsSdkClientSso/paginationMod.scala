package typings.awsSdkClientSso

import typings.awsSdkClientSso.interfacesMod.SSOPaginationConfiguration
import typings.awsSdkClientSso.listAccountRolesCommandMod.ListAccountRolesCommandInput
import typings.awsSdkClientSso.listAccountRolesCommandMod.ListAccountRolesCommandOutput
import typings.awsSdkClientSso.listAccountsCommandMod.ListAccountsCommandInput
import typings.awsSdkClientSso.listAccountsCommandMod.ListAccountsCommandOutput
import typings.awsSdkTypes.paginationMod.Paginator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationMod {
  
  @JSImport("@aws-sdk/client-sso/dist-types/pagination", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def paginateListAccountRoles(
    config: SSOPaginationConfiguration,
    input: ListAccountRolesCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[ListAccountRolesCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateListAccountRoles")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ListAccountRolesCommandOutput]]
  
  inline def paginateListAccounts(
    config: SSOPaginationConfiguration,
    input: ListAccountsCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[ListAccountsCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateListAccounts")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ListAccountsCommandOutput]]
}
