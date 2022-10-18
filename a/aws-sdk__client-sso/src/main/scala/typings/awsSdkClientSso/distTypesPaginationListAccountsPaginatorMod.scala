package typings.awsSdkClientSso

import typings.awsSdkClientSso.distTypesCommandsListAccountsCommandMod.ListAccountsCommandInput
import typings.awsSdkClientSso.distTypesCommandsListAccountsCommandMod.ListAccountsCommandOutput
import typings.awsSdkClientSso.distTypesPaginationInterfacesMod.SSOPaginationConfiguration
import typings.awsSdkTypes.distTypesPaginationMod.Paginator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPaginationListAccountsPaginatorMod {
  
  @JSImport("@aws-sdk/client-sso/dist-types/pagination/ListAccountsPaginator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def paginateListAccounts(
    config: SSOPaginationConfiguration,
    input: ListAccountsCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[ListAccountsCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateListAccounts")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ListAccountsCommandOutput]]
}
