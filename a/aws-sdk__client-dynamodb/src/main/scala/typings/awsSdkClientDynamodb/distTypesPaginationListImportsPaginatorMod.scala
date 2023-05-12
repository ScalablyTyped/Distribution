package typings.awsSdkClientDynamodb

import typings.awsSdkClientDynamodb.distTypesCommandsListImportsCommandMod.ListImportsCommandInput
import typings.awsSdkClientDynamodb.distTypesCommandsListImportsCommandMod.ListImportsCommandOutput
import typings.awsSdkClientDynamodb.distTypesPaginationInterfacesMod.DynamoDBPaginationConfiguration
import typings.awsSdkTypes.distTypesPaginationMod.Paginator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPaginationListImportsPaginatorMod {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/pagination/ListImportsPaginator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def paginateListImports(
    config: DynamoDBPaginationConfiguration,
    input: ListImportsCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[ListImportsCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateListImports")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ListImportsCommandOutput]]
}
