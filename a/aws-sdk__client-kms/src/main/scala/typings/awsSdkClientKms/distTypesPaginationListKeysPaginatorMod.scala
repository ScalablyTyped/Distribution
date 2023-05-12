package typings.awsSdkClientKms

import typings.awsSdkClientKms.distTypesCommandsListKeysCommandMod.ListKeysCommandInput
import typings.awsSdkClientKms.distTypesCommandsListKeysCommandMod.ListKeysCommandOutput
import typings.awsSdkClientKms.distTypesPaginationInterfacesMod.KMSPaginationConfiguration
import typings.awsSdkTypes.distTypesPaginationMod.Paginator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPaginationListKeysPaginatorMod {
  
  @JSImport("@aws-sdk/client-kms/dist-types/pagination/ListKeysPaginator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def paginateListKeys(
    config: KMSPaginationConfiguration,
    input: ListKeysCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[ListKeysCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateListKeys")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ListKeysCommandOutput]]
}
