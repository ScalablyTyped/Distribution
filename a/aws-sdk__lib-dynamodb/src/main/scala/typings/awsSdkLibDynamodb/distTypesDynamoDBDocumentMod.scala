package typings.awsSdkLibDynamodb

import typings.awsSdkClientDynamodb.mod.DynamoDBClient
import typings.awsSdkLibDynamodb.distTypesCommandsBatchExecuteStatementCommandMod.BatchExecuteStatementCommandInput
import typings.awsSdkLibDynamodb.distTypesCommandsBatchExecuteStatementCommandMod.BatchExecuteStatementCommandOutput
import typings.awsSdkLibDynamodb.distTypesCommandsBatchGetCommandMod.BatchGetCommandInput
import typings.awsSdkLibDynamodb.distTypesCommandsBatchGetCommandMod.BatchGetCommandOutput
import typings.awsSdkLibDynamodb.distTypesCommandsBatchWriteCommandMod.BatchWriteCommandInput
import typings.awsSdkLibDynamodb.distTypesCommandsBatchWriteCommandMod.BatchWriteCommandOutput
import typings.awsSdkLibDynamodb.distTypesCommandsDeleteCommandMod.DeleteCommandInput
import typings.awsSdkLibDynamodb.distTypesCommandsDeleteCommandMod.DeleteCommandOutput
import typings.awsSdkLibDynamodb.distTypesCommandsExecuteStatementCommandMod.ExecuteStatementCommandInput
import typings.awsSdkLibDynamodb.distTypesCommandsExecuteStatementCommandMod.ExecuteStatementCommandOutput
import typings.awsSdkLibDynamodb.distTypesCommandsExecuteTransactionCommandMod.ExecuteTransactionCommandInput
import typings.awsSdkLibDynamodb.distTypesCommandsExecuteTransactionCommandMod.ExecuteTransactionCommandOutput
import typings.awsSdkLibDynamodb.distTypesCommandsGetCommandMod.GetCommandInput
import typings.awsSdkLibDynamodb.distTypesCommandsGetCommandMod.GetCommandOutput
import typings.awsSdkLibDynamodb.distTypesCommandsPutCommandMod.PutCommandInput
import typings.awsSdkLibDynamodb.distTypesCommandsPutCommandMod.PutCommandOutput
import typings.awsSdkLibDynamodb.distTypesCommandsQueryCommandMod.QueryCommandInput
import typings.awsSdkLibDynamodb.distTypesCommandsQueryCommandMod.QueryCommandOutput
import typings.awsSdkLibDynamodb.distTypesCommandsScanCommandMod.ScanCommandInput
import typings.awsSdkLibDynamodb.distTypesCommandsScanCommandMod.ScanCommandOutput
import typings.awsSdkLibDynamodb.distTypesCommandsTransactGetCommandMod.TransactGetCommandInput
import typings.awsSdkLibDynamodb.distTypesCommandsTransactGetCommandMod.TransactGetCommandOutput
import typings.awsSdkLibDynamodb.distTypesCommandsTransactWriteCommandMod.TransactWriteCommandInput
import typings.awsSdkLibDynamodb.distTypesCommandsTransactWriteCommandMod.TransactWriteCommandOutput
import typings.awsSdkLibDynamodb.distTypesCommandsUpdateCommandMod.UpdateCommandInput
import typings.awsSdkLibDynamodb.distTypesCommandsUpdateCommandMod.UpdateCommandOutput
import typings.awsSdkLibDynamodb.distTypesDynamoDBDocumentClientMod.DynamoDBDocumentClient
import typings.awsSdkLibDynamodb.distTypesDynamoDBDocumentClientMod.TranslateConfig
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDynamoDBDocumentMod {
  
  @JSImport("@aws-sdk/lib-dynamodb/dist-types/DynamoDBDocument", "DynamoDBDocument")
  @js.native
  open class DynamoDBDocument protected () extends DynamoDBDocumentClient {
    /* protected */ def this(client: DynamoDBClient) = this()
    /* protected */ def this(client: DynamoDBClient, translateConfig: TranslateConfig) = this()
    
    /**
      * Accepts native JavaScript types instead of `AttributeValue`s, and calls
      * BatchExecuteStatementCommand operation from {@link https://www.npmjs.com/package/@aws-sdk/client-dynamodb @aws-sdk/client-dynamodb}.
      *
      * JavaScript objects passed in as parameters are marshalled into `AttributeValue` shapes
      * required by Amazon DynamoDB. Responses from DynamoDB are unmarshalled into plain JavaScript objects.
      */
    def batchExecuteStatement(args: BatchExecuteStatementCommandInput): js.Promise[BatchExecuteStatementCommandOutput] = js.native
    def batchExecuteStatement(
      args: BatchExecuteStatementCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[BatchExecuteStatementCommandOutput], Unit]
    ): Unit = js.native
    def batchExecuteStatement(args: BatchExecuteStatementCommandInput, options: HttpHandlerOptions): js.Promise[BatchExecuteStatementCommandOutput] = js.native
    def batchExecuteStatement(
      args: BatchExecuteStatementCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[BatchExecuteStatementCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * Accepts native JavaScript types instead of `AttributeValue`s, and calls
      * BatchGetItemCommand operation from {@link https://www.npmjs.com/package/@aws-sdk/client-dynamodb @aws-sdk/client-dynamodb}.
      *
      * JavaScript objects passed in as parameters are marshalled into `AttributeValue` shapes
      * required by Amazon DynamoDB. Responses from DynamoDB are unmarshalled into plain JavaScript objects.
      */
    def batchGet(args: BatchGetCommandInput): js.Promise[BatchGetCommandOutput] = js.native
    def batchGet(
      args: BatchGetCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[BatchGetCommandOutput], Unit]
    ): Unit = js.native
    def batchGet(args: BatchGetCommandInput, options: HttpHandlerOptions): js.Promise[BatchGetCommandOutput] = js.native
    def batchGet(
      args: BatchGetCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[BatchGetCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * Accepts native JavaScript types instead of `AttributeValue`s, and calls
      * BatchWriteItemCommand operation from {@link https://www.npmjs.com/package/@aws-sdk/client-dynamodb @aws-sdk/client-dynamodb}.
      *
      * JavaScript objects passed in as parameters are marshalled into `AttributeValue` shapes
      * required by Amazon DynamoDB. Responses from DynamoDB are unmarshalled into plain JavaScript objects.
      */
    def batchWrite(args: BatchWriteCommandInput): js.Promise[BatchWriteCommandOutput] = js.native
    def batchWrite(
      args: BatchWriteCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[BatchWriteCommandOutput], Unit]
    ): Unit = js.native
    def batchWrite(args: BatchWriteCommandInput, options: HttpHandlerOptions): js.Promise[BatchWriteCommandOutput] = js.native
    def batchWrite(
      args: BatchWriteCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[BatchWriteCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * Accepts native JavaScript types instead of `AttributeValue`s, and calls
      * DeleteItemCommand operation from {@link https://www.npmjs.com/package/@aws-sdk/client-dynamodb @aws-sdk/client-dynamodb}.
      *
      * JavaScript objects passed in as parameters are marshalled into `AttributeValue` shapes
      * required by Amazon DynamoDB. Responses from DynamoDB are unmarshalled into plain JavaScript objects.
      */
    def delete(args: DeleteCommandInput): js.Promise[DeleteCommandOutput] = js.native
    def delete(
      args: DeleteCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[DeleteCommandOutput], Unit]
    ): Unit = js.native
    def delete(args: DeleteCommandInput, options: HttpHandlerOptions): js.Promise[DeleteCommandOutput] = js.native
    def delete(
      args: DeleteCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[DeleteCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * Accepts native JavaScript types instead of `AttributeValue`s, and calls
      * ExecuteStatementCommand operation from {@link https://www.npmjs.com/package/@aws-sdk/client-dynamodb @aws-sdk/client-dynamodb}.
      *
      * JavaScript objects passed in as parameters are marshalled into `AttributeValue` shapes
      * required by Amazon DynamoDB. Responses from DynamoDB are unmarshalled into plain JavaScript objects.
      */
    def executeStatement(args: ExecuteStatementCommandInput): js.Promise[ExecuteStatementCommandOutput] = js.native
    def executeStatement(
      args: ExecuteStatementCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[ExecuteStatementCommandOutput], Unit]
    ): Unit = js.native
    def executeStatement(args: ExecuteStatementCommandInput, options: HttpHandlerOptions): js.Promise[ExecuteStatementCommandOutput] = js.native
    def executeStatement(
      args: ExecuteStatementCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[ExecuteStatementCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * Accepts native JavaScript types instead of `AttributeValue`s, and calls
      * ExecuteTransactionCommand operation from {@link https://www.npmjs.com/package/@aws-sdk/client-dynamodb @aws-sdk/client-dynamodb}.
      *
      * JavaScript objects passed in as parameters are marshalled into `AttributeValue` shapes
      * required by Amazon DynamoDB. Responses from DynamoDB are unmarshalled into plain JavaScript objects.
      */
    def executeTransaction(args: ExecuteTransactionCommandInput): js.Promise[ExecuteTransactionCommandOutput] = js.native
    def executeTransaction(
      args: ExecuteTransactionCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[ExecuteTransactionCommandOutput], Unit]
    ): Unit = js.native
    def executeTransaction(args: ExecuteTransactionCommandInput, options: HttpHandlerOptions): js.Promise[ExecuteTransactionCommandOutput] = js.native
    def executeTransaction(
      args: ExecuteTransactionCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[ExecuteTransactionCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * Accepts native JavaScript types instead of `AttributeValue`s, and calls
      * GetItemCommand operation from {@link https://www.npmjs.com/package/@aws-sdk/client-dynamodb @aws-sdk/client-dynamodb}.
      *
      * JavaScript objects passed in as parameters are marshalled into `AttributeValue` shapes
      * required by Amazon DynamoDB. Responses from DynamoDB are unmarshalled into plain JavaScript objects.
      */
    def get(args: GetCommandInput): js.Promise[GetCommandOutput] = js.native
    def get(
      args: GetCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[GetCommandOutput], Unit]
    ): Unit = js.native
    def get(args: GetCommandInput, options: HttpHandlerOptions): js.Promise[GetCommandOutput] = js.native
    def get(
      args: GetCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[GetCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * Accepts native JavaScript types instead of `AttributeValue`s, and calls
      * PutItemCommand operation from {@link https://www.npmjs.com/package/@aws-sdk/client-dynamodb @aws-sdk/client-dynamodb}.
      *
      * JavaScript objects passed in as parameters are marshalled into `AttributeValue` shapes
      * required by Amazon DynamoDB. Responses from DynamoDB are unmarshalled into plain JavaScript objects.
      */
    def put(args: PutCommandInput): js.Promise[PutCommandOutput] = js.native
    def put(
      args: PutCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[PutCommandOutput], Unit]
    ): Unit = js.native
    def put(args: PutCommandInput, options: HttpHandlerOptions): js.Promise[PutCommandOutput] = js.native
    def put(
      args: PutCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[PutCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * Accepts native JavaScript types instead of `AttributeValue`s, and calls
      * QueryCommand operation from {@link https://www.npmjs.com/package/@aws-sdk/client-dynamodb @aws-sdk/client-dynamodb}.
      *
      * JavaScript objects passed in as parameters are marshalled into `AttributeValue` shapes
      * required by Amazon DynamoDB. Responses from DynamoDB are unmarshalled into plain JavaScript objects.
      */
    def query(args: QueryCommandInput): js.Promise[QueryCommandOutput] = js.native
    def query(
      args: QueryCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[QueryCommandOutput], Unit]
    ): Unit = js.native
    def query(args: QueryCommandInput, options: HttpHandlerOptions): js.Promise[QueryCommandOutput] = js.native
    def query(
      args: QueryCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[QueryCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * Accepts native JavaScript types instead of `AttributeValue`s, and calls
      * ScanCommand operation from {@link https://www.npmjs.com/package/@aws-sdk/client-dynamodb @aws-sdk/client-dynamodb}.
      *
      * JavaScript objects passed in as parameters are marshalled into `AttributeValue` shapes
      * required by Amazon DynamoDB. Responses from DynamoDB are unmarshalled into plain JavaScript objects.
      */
    def scan(args: ScanCommandInput): js.Promise[ScanCommandOutput] = js.native
    def scan(
      args: ScanCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[ScanCommandOutput], Unit]
    ): Unit = js.native
    def scan(args: ScanCommandInput, options: HttpHandlerOptions): js.Promise[ScanCommandOutput] = js.native
    def scan(
      args: ScanCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[ScanCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * Accepts native JavaScript types instead of `AttributeValue`s, and calls
      * TransactGetItemsCommand operation from {@link https://www.npmjs.com/package/@aws-sdk/client-dynamodb @aws-sdk/client-dynamodb}.
      *
      * JavaScript objects passed in as parameters are marshalled into `AttributeValue` shapes
      * required by Amazon DynamoDB. Responses from DynamoDB are unmarshalled into plain JavaScript objects.
      */
    def transactGet(args: TransactGetCommandInput): js.Promise[TransactGetCommandOutput] = js.native
    def transactGet(
      args: TransactGetCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[TransactGetCommandOutput], Unit]
    ): Unit = js.native
    def transactGet(args: TransactGetCommandInput, options: HttpHandlerOptions): js.Promise[TransactGetCommandOutput] = js.native
    def transactGet(
      args: TransactGetCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[TransactGetCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * Accepts native JavaScript types instead of `AttributeValue`s, and calls
      * TransactWriteItemsCommand operation from {@link https://www.npmjs.com/package/@aws-sdk/client-dynamodb @aws-sdk/client-dynamodb}.
      *
      * JavaScript objects passed in as parameters are marshalled into `AttributeValue` shapes
      * required by Amazon DynamoDB. Responses from DynamoDB are unmarshalled into plain JavaScript objects.
      */
    def transactWrite(args: TransactWriteCommandInput): js.Promise[TransactWriteCommandOutput] = js.native
    def transactWrite(
      args: TransactWriteCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[TransactWriteCommandOutput], Unit]
    ): Unit = js.native
    def transactWrite(args: TransactWriteCommandInput, options: HttpHandlerOptions): js.Promise[TransactWriteCommandOutput] = js.native
    def transactWrite(
      args: TransactWriteCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[TransactWriteCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * Accepts native JavaScript types instead of `AttributeValue`s, and calls
      * UpdateItemCommand operation from {@link https://www.npmjs.com/package/@aws-sdk/client-dynamodb @aws-sdk/client-dynamodb}.
      *
      * JavaScript objects passed in as parameters are marshalled into `AttributeValue` shapes
      * required by Amazon DynamoDB. Responses from DynamoDB are unmarshalled into plain JavaScript objects.
      */
    def update(args: UpdateCommandInput): js.Promise[UpdateCommandOutput] = js.native
    def update(
      args: UpdateCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[UpdateCommandOutput], Unit]
    ): Unit = js.native
    def update(args: UpdateCommandInput, options: HttpHandlerOptions): js.Promise[UpdateCommandOutput] = js.native
    def update(
      args: UpdateCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[UpdateCommandOutput], Unit]
    ): Unit = js.native
  }
  /* static members */
  object DynamoDBDocument {
    
    @JSImport("@aws-sdk/lib-dynamodb/dist-types/DynamoDBDocument", "DynamoDBDocument")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(client: DynamoDBClient): DynamoDBDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(client.asInstanceOf[js.Any]).asInstanceOf[DynamoDBDocument]
    inline def from(client: DynamoDBClient, translateConfig: TranslateConfig): DynamoDBDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(client.asInstanceOf[js.Any], translateConfig.asInstanceOf[js.Any])).asInstanceOf[DynamoDBDocument]
  }
}
