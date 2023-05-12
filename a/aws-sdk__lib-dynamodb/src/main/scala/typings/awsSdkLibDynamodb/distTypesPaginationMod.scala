package typings.awsSdkLibDynamodb

import typings.awsSdkLibDynamodb.distTypesCommandsQueryCommandMod.QueryCommandInput
import typings.awsSdkLibDynamodb.distTypesCommandsQueryCommandMod.QueryCommandOutput
import typings.awsSdkLibDynamodb.distTypesCommandsScanCommandMod.ScanCommandInput
import typings.awsSdkLibDynamodb.distTypesCommandsScanCommandMod.ScanCommandOutput
import typings.awsSdkLibDynamodb.distTypesPaginationInterfacesMod.DynamoDBDocumentPaginationConfiguration
import typings.awsSdkTypes.distTypesPaginationMod.Paginator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPaginationMod {
  
  @JSImport("@aws-sdk/lib-dynamodb/dist-types/pagination", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def paginateQuery(
    config: DynamoDBDocumentPaginationConfiguration,
    input: QueryCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[QueryCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateQuery")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[QueryCommandOutput]]
  
  inline def paginateScan(
    config: DynamoDBDocumentPaginationConfiguration,
    input: ScanCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[ScanCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateScan")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ScanCommandOutput]]
}
