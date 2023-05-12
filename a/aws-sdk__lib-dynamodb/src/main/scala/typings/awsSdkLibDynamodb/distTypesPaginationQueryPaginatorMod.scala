package typings.awsSdkLibDynamodb

import typings.awsSdkLibDynamodb.distTypesCommandsQueryCommandMod.QueryCommandInput
import typings.awsSdkLibDynamodb.distTypesCommandsQueryCommandMod.QueryCommandOutput
import typings.awsSdkLibDynamodb.distTypesPaginationInterfacesMod.DynamoDBDocumentPaginationConfiguration
import typings.awsSdkTypes.distTypesPaginationMod.Paginator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPaginationQueryPaginatorMod {
  
  @JSImport("@aws-sdk/lib-dynamodb/dist-types/pagination/QueryPaginator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def paginateQuery(
    config: DynamoDBDocumentPaginationConfiguration,
    input: QueryCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[QueryCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateQuery")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[QueryCommandOutput]]
}
