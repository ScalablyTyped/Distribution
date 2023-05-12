package typings.awsSdkLibDynamodb

import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.DynamoDBClientResolvedConfigType
import typings.awsSdkClientDynamodb.mod.DynamoDBClient
import typings.awsSdkSmithyClient.mod.Client
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import typings.awsSdkUtilDynamodb.distTypesMarshallMod.marshallOptions
import typings.awsSdkUtilDynamodb.distTypesUnmarshallMod.unmarshallOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDynamoDBDocumentClientMod {
  
  @JSImport("@aws-sdk/lib-dynamodb/dist-types/DynamoDBDocumentClient", "DynamoDBDocumentClient")
  @js.native
  open class DynamoDBDocumentClient protected () extends Client[
          HttpHandlerOptions, 
          ServiceInputTypes, 
          ServiceOutputTypes, 
          DynamoDBDocumentClientResolvedConfig
        ] {
    /* protected */ def this(client: DynamoDBClient) = this()
    /* protected */ def this(client: DynamoDBClient, translateConfig: TranslateConfig) = this()
  }
  /* static members */
  object DynamoDBDocumentClient {
    
    @JSImport("@aws-sdk/lib-dynamodb/dist-types/DynamoDBDocumentClient", "DynamoDBDocumentClient")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(client: DynamoDBClient): DynamoDBDocumentClient = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(client.asInstanceOf[js.Any]).asInstanceOf[DynamoDBDocumentClient]
    inline def from(client: DynamoDBClient, translateConfig: TranslateConfig): DynamoDBDocumentClient = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(client.asInstanceOf[js.Any], translateConfig.asInstanceOf[js.Any])).asInstanceOf[DynamoDBDocumentClient]
  }
  
  @js.native
  trait DynamoDBDocumentClientResolvedConfig
    extends StObject
       with DynamoDBClientResolvedConfigType {
    
    var translateConfig: js.UndefOr[TranslateConfig] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceInputTypes
    - typings.awsSdkLibDynamodb.distTypesCommandsBatchExecuteStatementCommandMod.BatchExecuteStatementCommandInput
    - typings.awsSdkLibDynamodb.distTypesCommandsBatchGetCommandMod.BatchGetCommandInput
    - typings.awsSdkLibDynamodb.distTypesCommandsBatchWriteCommandMod.BatchWriteCommandInput
    - typings.awsSdkLibDynamodb.distTypesCommandsDeleteCommandMod.DeleteCommandInput
    - typings.awsSdkLibDynamodb.distTypesCommandsExecuteStatementCommandMod.ExecuteStatementCommandInput
    - typings.awsSdkLibDynamodb.distTypesCommandsExecuteTransactionCommandMod.ExecuteTransactionCommandInput
    - typings.awsSdkLibDynamodb.distTypesCommandsGetCommandMod.GetCommandInput
    - typings.awsSdkLibDynamodb.distTypesCommandsPutCommandMod.PutCommandInput
    - typings.awsSdkLibDynamodb.distTypesCommandsQueryCommandMod.QueryCommandInput
    - typings.awsSdkLibDynamodb.distTypesCommandsScanCommandMod.ScanCommandInput
    - typings.awsSdkLibDynamodb.distTypesCommandsTransactGetCommandMod.TransactGetCommandInput
    - typings.awsSdkLibDynamodb.distTypesCommandsTransactWriteCommandMod.TransactWriteCommandInput
    - typings.awsSdkLibDynamodb.distTypesCommandsUpdateCommandMod.UpdateCommandInput
  */
  type ServiceInputTypes = _ServiceInputTypes | typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceInputTypes
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceOutputTypes
    - typings.awsSdkLibDynamodb.distTypesCommandsBatchExecuteStatementCommandMod.BatchExecuteStatementCommandOutput
    - typings.awsSdkLibDynamodb.distTypesCommandsBatchGetCommandMod.BatchGetCommandOutput
    - typings.awsSdkLibDynamodb.distTypesCommandsBatchWriteCommandMod.BatchWriteCommandOutput
    - typings.awsSdkLibDynamodb.distTypesCommandsDeleteCommandMod.DeleteCommandOutput
    - typings.awsSdkLibDynamodb.distTypesCommandsExecuteStatementCommandMod.ExecuteStatementCommandOutput
    - typings.awsSdkLibDynamodb.distTypesCommandsExecuteTransactionCommandMod.ExecuteTransactionCommandOutput
    - typings.awsSdkLibDynamodb.distTypesCommandsGetCommandMod.GetCommandOutput
    - typings.awsSdkLibDynamodb.distTypesCommandsPutCommandMod.PutCommandOutput
    - typings.awsSdkLibDynamodb.distTypesCommandsQueryCommandMod.QueryCommandOutput
    - typings.awsSdkLibDynamodb.distTypesCommandsScanCommandMod.ScanCommandOutput
    - typings.awsSdkLibDynamodb.distTypesCommandsTransactGetCommandMod.TransactGetCommandOutput
    - typings.awsSdkLibDynamodb.distTypesCommandsTransactWriteCommandMod.TransactWriteCommandOutput
    - typings.awsSdkLibDynamodb.distTypesCommandsUpdateCommandMod.UpdateCommandOutput
  */
  type ServiceOutputTypes = _ServiceOutputTypes | typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceOutputTypes
  
  trait TranslateConfig extends StObject {
    
    var marshallOptions: js.UndefOr[typings.awsSdkUtilDynamodb.distTypesMarshallMod.marshallOptions] = js.undefined
    
    var unmarshallOptions: js.UndefOr[typings.awsSdkUtilDynamodb.distTypesUnmarshallMod.unmarshallOptions] = js.undefined
  }
  object TranslateConfig {
    
    inline def apply(): TranslateConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TranslateConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TranslateConfig] (val x: Self) extends AnyVal {
      
      inline def setMarshallOptions(value: marshallOptions): Self = StObject.set(x, "marshallOptions", value.asInstanceOf[js.Any])
      
      inline def setMarshallOptionsUndefined: Self = StObject.set(x, "marshallOptions", js.undefined)
      
      inline def setUnmarshallOptions(value: unmarshallOptions): Self = StObject.set(x, "unmarshallOptions", value.asInstanceOf[js.Any])
      
      inline def setUnmarshallOptionsUndefined: Self = StObject.set(x, "unmarshallOptions", js.undefined)
    }
  }
  
  trait _ServiceInputTypes extends StObject
  object _ServiceInputTypes {
    
    inline def BatchExecuteStatementCommandInput(): typings.awsSdkLibDynamodb.distTypesCommandsBatchExecuteStatementCommandMod.BatchExecuteStatementCommandInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkLibDynamodb.distTypesCommandsBatchExecuteStatementCommandMod.BatchExecuteStatementCommandInput]
    }
    
    inline def BatchGetCommandInput(): typings.awsSdkLibDynamodb.distTypesCommandsBatchGetCommandMod.BatchGetCommandInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkLibDynamodb.distTypesCommandsBatchGetCommandMod.BatchGetCommandInput]
    }
    
    inline def BatchWriteCommandInput(): typings.awsSdkLibDynamodb.distTypesCommandsBatchWriteCommandMod.BatchWriteCommandInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkLibDynamodb.distTypesCommandsBatchWriteCommandMod.BatchWriteCommandInput]
    }
    
    inline def DeleteCommandInput(): typings.awsSdkLibDynamodb.distTypesCommandsDeleteCommandMod.DeleteCommandInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkLibDynamodb.distTypesCommandsDeleteCommandMod.DeleteCommandInput]
    }
    
    inline def ExecuteStatementCommandInput(): typings.awsSdkLibDynamodb.distTypesCommandsExecuteStatementCommandMod.ExecuteStatementCommandInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkLibDynamodb.distTypesCommandsExecuteStatementCommandMod.ExecuteStatementCommandInput]
    }
    
    inline def ExecuteTransactionCommandInput(): typings.awsSdkLibDynamodb.distTypesCommandsExecuteTransactionCommandMod.ExecuteTransactionCommandInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkLibDynamodb.distTypesCommandsExecuteTransactionCommandMod.ExecuteTransactionCommandInput]
    }
    
    inline def GetCommandInput(): typings.awsSdkLibDynamodb.distTypesCommandsGetCommandMod.GetCommandInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkLibDynamodb.distTypesCommandsGetCommandMod.GetCommandInput]
    }
    
    inline def PutCommandInput(): typings.awsSdkLibDynamodb.distTypesCommandsPutCommandMod.PutCommandInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkLibDynamodb.distTypesCommandsPutCommandMod.PutCommandInput]
    }
    
    inline def QueryCommandInput(): typings.awsSdkLibDynamodb.distTypesCommandsQueryCommandMod.QueryCommandInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkLibDynamodb.distTypesCommandsQueryCommandMod.QueryCommandInput]
    }
    
    inline def ScanCommandInput(): typings.awsSdkLibDynamodb.distTypesCommandsScanCommandMod.ScanCommandInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkLibDynamodb.distTypesCommandsScanCommandMod.ScanCommandInput]
    }
    
    inline def TransactGetCommandInput(): typings.awsSdkLibDynamodb.distTypesCommandsTransactGetCommandMod.TransactGetCommandInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkLibDynamodb.distTypesCommandsTransactGetCommandMod.TransactGetCommandInput]
    }
    
    inline def TransactWriteCommandInput(): typings.awsSdkLibDynamodb.distTypesCommandsTransactWriteCommandMod.TransactWriteCommandInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkLibDynamodb.distTypesCommandsTransactWriteCommandMod.TransactWriteCommandInput]
    }
    
    inline def UpdateCommandInput(): typings.awsSdkLibDynamodb.distTypesCommandsUpdateCommandMod.UpdateCommandInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkLibDynamodb.distTypesCommandsUpdateCommandMod.UpdateCommandInput]
    }
  }
  
  trait _ServiceOutputTypes extends StObject
  object _ServiceOutputTypes {
    
    inline def BatchExecuteStatementCommandOutput($metadata: ResponseMetadata): typings.awsSdkLibDynamodb.distTypesCommandsBatchExecuteStatementCommandMod.BatchExecuteStatementCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkLibDynamodb.distTypesCommandsBatchExecuteStatementCommandMod.BatchExecuteStatementCommandOutput]
    }
    
    inline def BatchGetCommandOutput($metadata: ResponseMetadata): typings.awsSdkLibDynamodb.distTypesCommandsBatchGetCommandMod.BatchGetCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkLibDynamodb.distTypesCommandsBatchGetCommandMod.BatchGetCommandOutput]
    }
    
    inline def BatchWriteCommandOutput($metadata: ResponseMetadata): typings.awsSdkLibDynamodb.distTypesCommandsBatchWriteCommandMod.BatchWriteCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkLibDynamodb.distTypesCommandsBatchWriteCommandMod.BatchWriteCommandOutput]
    }
    
    inline def DeleteCommandOutput($metadata: ResponseMetadata): typings.awsSdkLibDynamodb.distTypesCommandsDeleteCommandMod.DeleteCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkLibDynamodb.distTypesCommandsDeleteCommandMod.DeleteCommandOutput]
    }
    
    inline def ExecuteStatementCommandOutput($metadata: ResponseMetadata): typings.awsSdkLibDynamodb.distTypesCommandsExecuteStatementCommandMod.ExecuteStatementCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkLibDynamodb.distTypesCommandsExecuteStatementCommandMod.ExecuteStatementCommandOutput]
    }
    
    inline def ExecuteTransactionCommandOutput($metadata: ResponseMetadata): typings.awsSdkLibDynamodb.distTypesCommandsExecuteTransactionCommandMod.ExecuteTransactionCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkLibDynamodb.distTypesCommandsExecuteTransactionCommandMod.ExecuteTransactionCommandOutput]
    }
    
    inline def GetCommandOutput($metadata: ResponseMetadata): typings.awsSdkLibDynamodb.distTypesCommandsGetCommandMod.GetCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkLibDynamodb.distTypesCommandsGetCommandMod.GetCommandOutput]
    }
    
    inline def PutCommandOutput($metadata: ResponseMetadata): typings.awsSdkLibDynamodb.distTypesCommandsPutCommandMod.PutCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkLibDynamodb.distTypesCommandsPutCommandMod.PutCommandOutput]
    }
    
    inline def QueryCommandOutput($metadata: ResponseMetadata): typings.awsSdkLibDynamodb.distTypesCommandsQueryCommandMod.QueryCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkLibDynamodb.distTypesCommandsQueryCommandMod.QueryCommandOutput]
    }
    
    inline def ScanCommandOutput($metadata: ResponseMetadata): typings.awsSdkLibDynamodb.distTypesCommandsScanCommandMod.ScanCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkLibDynamodb.distTypesCommandsScanCommandMod.ScanCommandOutput]
    }
    
    inline def TransactGetCommandOutput($metadata: ResponseMetadata): typings.awsSdkLibDynamodb.distTypesCommandsTransactGetCommandMod.TransactGetCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkLibDynamodb.distTypesCommandsTransactGetCommandMod.TransactGetCommandOutput]
    }
    
    inline def TransactWriteCommandOutput($metadata: ResponseMetadata): typings.awsSdkLibDynamodb.distTypesCommandsTransactWriteCommandMod.TransactWriteCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkLibDynamodb.distTypesCommandsTransactWriteCommandMod.TransactWriteCommandOutput]
    }
    
    inline def UpdateCommandOutput($metadata: ResponseMetadata): typings.awsSdkLibDynamodb.distTypesCommandsUpdateCommandMod.UpdateCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkLibDynamodb.distTypesCommandsUpdateCommandMod.UpdateCommandOutput]
    }
  }
}
