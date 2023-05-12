package typings.awsSdkClientDynamodb

import typings.awsSdkClientDynamodb.distTypesCommandsListExportsCommandMod.ListExportsCommandInput
import typings.awsSdkClientDynamodb.distTypesCommandsListExportsCommandMod.ListExportsCommandOutput
import typings.awsSdkClientDynamodb.distTypesPaginationInterfacesMod.DynamoDBPaginationConfiguration
import typings.awsSdkTypes.distTypesPaginationMod.Paginator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPaginationListExportsPaginatorMod {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/pagination/ListExportsPaginator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def paginateListExports(
    config: DynamoDBPaginationConfiguration,
    input: ListExportsCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[ListExportsCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateListExports")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ListExportsCommandOutput]]
}
