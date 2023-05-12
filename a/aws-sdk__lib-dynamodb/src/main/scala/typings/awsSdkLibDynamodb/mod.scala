package typings.awsSdkLibDynamodb

import typings.awsSdkClientDynamodb.mod.DynamoDBClient
import typings.awsSdkLibDynamodb.distTypesCommandsBatchExecuteStatementCommandMod.BatchExecuteStatementCommandInput
import typings.awsSdkLibDynamodb.distTypesCommandsBatchGetCommandMod.BatchGetCommandInput
import typings.awsSdkLibDynamodb.distTypesCommandsBatchWriteCommandMod.BatchWriteCommandInput
import typings.awsSdkLibDynamodb.distTypesCommandsDeleteCommandMod.DeleteCommandInput
import typings.awsSdkLibDynamodb.distTypesCommandsExecuteStatementCommandMod.ExecuteStatementCommandInput
import typings.awsSdkLibDynamodb.distTypesCommandsExecuteTransactionCommandMod.ExecuteTransactionCommandInput
import typings.awsSdkLibDynamodb.distTypesCommandsGetCommandMod.GetCommandInput
import typings.awsSdkLibDynamodb.distTypesCommandsPutCommandMod.PutCommandInput
import typings.awsSdkLibDynamodb.distTypesCommandsQueryCommandMod.QueryCommandInput
import typings.awsSdkLibDynamodb.distTypesCommandsQueryCommandMod.QueryCommandOutput
import typings.awsSdkLibDynamodb.distTypesCommandsScanCommandMod.ScanCommandInput
import typings.awsSdkLibDynamodb.distTypesCommandsScanCommandMod.ScanCommandOutput
import typings.awsSdkLibDynamodb.distTypesCommandsTransactGetCommandMod.TransactGetCommandInput
import typings.awsSdkLibDynamodb.distTypesCommandsTransactWriteCommandMod.TransactWriteCommandInput
import typings.awsSdkLibDynamodb.distTypesCommandsUpdateCommandMod.UpdateCommandInput
import typings.awsSdkLibDynamodb.distTypesDynamoDBDocumentClientMod.TranslateConfig
import typings.awsSdkLibDynamodb.distTypesPaginationInterfacesMod.DynamoDBDocumentPaginationConfiguration
import typings.awsSdkTypes.distTypesPaginationMod.Paginator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/lib-dynamodb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/lib-dynamodb", "BatchExecuteStatementCommand")
  @js.native
  open class BatchExecuteStatementCommand protected ()
    extends typings.awsSdkLibDynamodb.distTypesCommandsMod.BatchExecuteStatementCommand {
    def this(input: BatchExecuteStatementCommandInput) = this()
  }
  
  @JSImport("@aws-sdk/lib-dynamodb", "BatchGetCommand")
  @js.native
  open class BatchGetCommand protected ()
    extends typings.awsSdkLibDynamodb.distTypesCommandsMod.BatchGetCommand {
    def this(input: BatchGetCommandInput) = this()
  }
  
  @JSImport("@aws-sdk/lib-dynamodb", "BatchWriteCommand")
  @js.native
  open class BatchWriteCommand protected ()
    extends typings.awsSdkLibDynamodb.distTypesCommandsMod.BatchWriteCommand {
    def this(input: BatchWriteCommandInput) = this()
  }
  
  @JSImport("@aws-sdk/lib-dynamodb", "DeleteCommand")
  @js.native
  open class DeleteCommand protected ()
    extends typings.awsSdkLibDynamodb.distTypesCommandsMod.DeleteCommand {
    def this(input: DeleteCommandInput) = this()
  }
  
  @JSImport("@aws-sdk/lib-dynamodb", "DynamoDBDocument")
  @js.native
  open class DynamoDBDocument protected ()
    extends typings.awsSdkLibDynamodb.distTypesDynamoDBDocumentMod.DynamoDBDocument {
    /* protected */ def this(client: DynamoDBClient) = this()
    /* protected */ def this(client: DynamoDBClient, translateConfig: TranslateConfig) = this()
  }
  /* static members */
  object DynamoDBDocument {
    
    @JSImport("@aws-sdk/lib-dynamodb", "DynamoDBDocument")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(client: DynamoDBClient): typings.awsSdkLibDynamodb.distTypesDynamoDBDocumentMod.DynamoDBDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(client.asInstanceOf[js.Any]).asInstanceOf[typings.awsSdkLibDynamodb.distTypesDynamoDBDocumentMod.DynamoDBDocument]
    inline def from(client: DynamoDBClient, translateConfig: TranslateConfig): typings.awsSdkLibDynamodb.distTypesDynamoDBDocumentMod.DynamoDBDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(client.asInstanceOf[js.Any], translateConfig.asInstanceOf[js.Any])).asInstanceOf[typings.awsSdkLibDynamodb.distTypesDynamoDBDocumentMod.DynamoDBDocument]
  }
  
  @JSImport("@aws-sdk/lib-dynamodb", "DynamoDBDocumentClient")
  @js.native
  open class DynamoDBDocumentClient protected ()
    extends typings.awsSdkLibDynamodb.distTypesDynamoDBDocumentClientMod.DynamoDBDocumentClient {
    /* protected */ def this(client: DynamoDBClient) = this()
    /* protected */ def this(client: DynamoDBClient, translateConfig: TranslateConfig) = this()
  }
  /* static members */
  object DynamoDBDocumentClient {
    
    @JSImport("@aws-sdk/lib-dynamodb", "DynamoDBDocumentClient")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(client: DynamoDBClient): typings.awsSdkLibDynamodb.distTypesDynamoDBDocumentClientMod.DynamoDBDocumentClient = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(client.asInstanceOf[js.Any]).asInstanceOf[typings.awsSdkLibDynamodb.distTypesDynamoDBDocumentClientMod.DynamoDBDocumentClient]
    inline def from(client: DynamoDBClient, translateConfig: TranslateConfig): typings.awsSdkLibDynamodb.distTypesDynamoDBDocumentClientMod.DynamoDBDocumentClient = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(client.asInstanceOf[js.Any], translateConfig.asInstanceOf[js.Any])).asInstanceOf[typings.awsSdkLibDynamodb.distTypesDynamoDBDocumentClientMod.DynamoDBDocumentClient]
  }
  
  @JSImport("@aws-sdk/lib-dynamodb", "ExecuteStatementCommand")
  @js.native
  open class ExecuteStatementCommand protected ()
    extends typings.awsSdkLibDynamodb.distTypesCommandsMod.ExecuteStatementCommand {
    def this(input: ExecuteStatementCommandInput) = this()
  }
  
  @JSImport("@aws-sdk/lib-dynamodb", "ExecuteTransactionCommand")
  @js.native
  open class ExecuteTransactionCommand protected ()
    extends typings.awsSdkLibDynamodb.distTypesCommandsMod.ExecuteTransactionCommand {
    def this(input: ExecuteTransactionCommandInput) = this()
  }
  
  @JSImport("@aws-sdk/lib-dynamodb", "GetCommand")
  @js.native
  open class GetCommand protected ()
    extends typings.awsSdkLibDynamodb.distTypesCommandsMod.GetCommand {
    def this(input: GetCommandInput) = this()
  }
  
  @JSImport("@aws-sdk/lib-dynamodb", "PutCommand")
  @js.native
  open class PutCommand protected ()
    extends typings.awsSdkLibDynamodb.distTypesCommandsMod.PutCommand {
    def this(input: PutCommandInput) = this()
  }
  
  @JSImport("@aws-sdk/lib-dynamodb", "QueryCommand")
  @js.native
  open class QueryCommand protected ()
    extends typings.awsSdkLibDynamodb.distTypesCommandsMod.QueryCommand {
    def this(input: QueryCommandInput) = this()
  }
  
  @JSImport("@aws-sdk/lib-dynamodb", "ScanCommand")
  @js.native
  open class ScanCommand protected ()
    extends typings.awsSdkLibDynamodb.distTypesCommandsMod.ScanCommand {
    def this(input: ScanCommandInput) = this()
  }
  
  @JSImport("@aws-sdk/lib-dynamodb", "TransactGetCommand")
  @js.native
  open class TransactGetCommand protected ()
    extends typings.awsSdkLibDynamodb.distTypesCommandsMod.TransactGetCommand {
    def this(input: TransactGetCommandInput) = this()
  }
  
  @JSImport("@aws-sdk/lib-dynamodb", "TransactWriteCommand")
  @js.native
  open class TransactWriteCommand protected ()
    extends typings.awsSdkLibDynamodb.distTypesCommandsMod.TransactWriteCommand {
    def this(input: TransactWriteCommandInput) = this()
  }
  
  @JSImport("@aws-sdk/lib-dynamodb", "UpdateCommand")
  @js.native
  open class UpdateCommand protected ()
    extends typings.awsSdkLibDynamodb.distTypesCommandsMod.UpdateCommand {
    def this(input: UpdateCommandInput) = this()
  }
  
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
