package typings.awsSdkClientDynamodb

import typings.awsSdkClientDynamodb.distTypesCommandsQueryCommandMod.QueryCommandInput
import typings.awsSdkClientDynamodb.distTypesCommandsQueryCommandMod.QueryCommandOutput
import typings.awsSdkClientDynamodb.distTypesPaginationInterfacesMod.DynamoDBPaginationConfiguration
import typings.awsSdkTypes.distTypesPaginationMod.Paginator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPaginationQueryPaginatorMod {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/pagination/QueryPaginator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def paginateQuery(
    config: DynamoDBPaginationConfiguration,
    input: QueryCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[QueryCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateQuery")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[QueryCommandOutput]]
}
