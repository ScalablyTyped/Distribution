package typings.awsSdkClientDynamodb

import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.DynamoDBClientResolvedConfig
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceInputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod._ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ExportTableToPointInTimeInput
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ExportTableToPointInTimeOutput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommandsExportTableToPointInTimeCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/ExportTableToPointInTimeCommand", "ExportTableToPointInTimeCommand")
  @js.native
  open class ExportTableToPointInTimeCommand protected () extends Command[
          ExportTableToPointInTimeCommandInput, 
          ExportTableToPointInTimeCommandOutput, 
          DynamoDBClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: ExportTableToPointInTimeCommandInput) = this()
    
    /**
      * @internal
      */
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBClientResolvedConfig
    ): Handler[ExportTableToPointInTimeCommandInput, ExportTableToPointInTimeCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[ExportTableToPointInTimeCommandInput, ExportTableToPointInTimeCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object ExportTableToPointInTimeCommand {
    
    @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/ExportTableToPointInTimeCommand", "ExportTableToPointInTimeCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type ExportTableToPointInTimeCommandInput = ExportTableToPointInTimeInput
  
  trait ExportTableToPointInTimeCommandOutput
    extends StObject
       with ExportTableToPointInTimeOutput
       with MetadataBearer
       with _ServiceOutputTypes
  object ExportTableToPointInTimeCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): ExportTableToPointInTimeCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportTableToPointInTimeCommandOutput]
    }
  }
}
