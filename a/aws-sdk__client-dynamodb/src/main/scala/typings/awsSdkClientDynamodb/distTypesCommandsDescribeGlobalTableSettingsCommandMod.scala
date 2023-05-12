package typings.awsSdkClientDynamodb

import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.DynamoDBClientResolvedConfig
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceInputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod._ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.DescribeGlobalTableSettingsInput
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.DescribeGlobalTableSettingsOutput
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

object distTypesCommandsDescribeGlobalTableSettingsCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/DescribeGlobalTableSettingsCommand", "DescribeGlobalTableSettingsCommand")
  @js.native
  open class DescribeGlobalTableSettingsCommand protected () extends Command[
          DescribeGlobalTableSettingsCommandInput, 
          DescribeGlobalTableSettingsCommandOutput, 
          DynamoDBClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: DescribeGlobalTableSettingsCommandInput) = this()
    
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
    ): Handler[DescribeGlobalTableSettingsCommandInput, DescribeGlobalTableSettingsCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[DescribeGlobalTableSettingsCommandInput, DescribeGlobalTableSettingsCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object DescribeGlobalTableSettingsCommand {
    
    @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/DescribeGlobalTableSettingsCommand", "DescribeGlobalTableSettingsCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type DescribeGlobalTableSettingsCommandInput = DescribeGlobalTableSettingsInput
  
  trait DescribeGlobalTableSettingsCommandOutput
    extends StObject
       with DescribeGlobalTableSettingsOutput
       with MetadataBearer
       with _ServiceOutputTypes
  object DescribeGlobalTableSettingsCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): DescribeGlobalTableSettingsCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeGlobalTableSettingsCommandOutput]
    }
  }
}
