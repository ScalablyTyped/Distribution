package typings.awsSdkClientDynamodb

import typings.awsSdkClientDynamodb.distTypesCommandsListTablesCommandMod.ListTablesCommandInput
import typings.awsSdkClientDynamodb.distTypesCommandsListTablesCommandMod.ListTablesCommandOutput
import typings.awsSdkClientDynamodb.distTypesPaginationInterfacesMod.DynamoDBPaginationConfiguration
import typings.awsSdkTypes.distTypesPaginationMod.Paginator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPaginationListTablesPaginatorMod {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/pagination/ListTablesPaginator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def paginateListTables(
    config: DynamoDBPaginationConfiguration,
    input: ListTablesCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[ListTablesCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateListTables")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ListTablesCommandOutput]]
}
