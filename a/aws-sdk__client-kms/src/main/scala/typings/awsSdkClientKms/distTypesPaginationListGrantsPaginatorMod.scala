package typings.awsSdkClientKms

import typings.awsSdkClientKms.distTypesCommandsListGrantsCommandMod.ListGrantsCommandInput
import typings.awsSdkClientKms.distTypesCommandsListGrantsCommandMod.ListGrantsCommandOutput
import typings.awsSdkClientKms.distTypesPaginationInterfacesMod.KMSPaginationConfiguration
import typings.awsSdkTypes.distTypesPaginationMod.Paginator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPaginationListGrantsPaginatorMod {
  
  @JSImport("@aws-sdk/client-kms/dist-types/pagination/ListGrantsPaginator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def paginateListGrants(
    config: KMSPaginationConfiguration,
    input: ListGrantsCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[ListGrantsCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateListGrants")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ListGrantsCommandOutput]]
}
