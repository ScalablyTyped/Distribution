package typings.awsSdkClientKms

import typings.awsSdkClientKms.distTypesCommandsListAliasesCommandMod.ListAliasesCommandInput
import typings.awsSdkClientKms.distTypesCommandsListAliasesCommandMod.ListAliasesCommandOutput
import typings.awsSdkClientKms.distTypesPaginationInterfacesMod.KMSPaginationConfiguration
import typings.awsSdkTypes.distTypesPaginationMod.Paginator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPaginationListAliasesPaginatorMod {
  
  @JSImport("@aws-sdk/client-kms/dist-types/pagination/ListAliasesPaginator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def paginateListAliases(
    config: KMSPaginationConfiguration,
    input: ListAliasesCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[ListAliasesCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateListAliases")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ListAliasesCommandOutput]]
}
