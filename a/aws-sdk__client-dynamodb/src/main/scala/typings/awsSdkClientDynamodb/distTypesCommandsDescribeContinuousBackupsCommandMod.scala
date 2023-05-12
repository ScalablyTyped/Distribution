package typings.awsSdkClientDynamodb

import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.DynamoDBClientResolvedConfig
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceInputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod._ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.DescribeContinuousBackupsInput
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.DescribeContinuousBackupsOutput
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

object distTypesCommandsDescribeContinuousBackupsCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/DescribeContinuousBackupsCommand", "DescribeContinuousBackupsCommand")
  @js.native
  open class DescribeContinuousBackupsCommand protected () extends Command[
          DescribeContinuousBackupsCommandInput, 
          DescribeContinuousBackupsCommandOutput, 
          DynamoDBClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: DescribeContinuousBackupsCommandInput) = this()
    
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
    ): Handler[DescribeContinuousBackupsCommandInput, DescribeContinuousBackupsCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[DescribeContinuousBackupsCommandInput, DescribeContinuousBackupsCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object DescribeContinuousBackupsCommand {
    
    @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/DescribeContinuousBackupsCommand", "DescribeContinuousBackupsCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type DescribeContinuousBackupsCommandInput = DescribeContinuousBackupsInput
  
  trait DescribeContinuousBackupsCommandOutput
    extends StObject
       with DescribeContinuousBackupsOutput
       with MetadataBearer
       with _ServiceOutputTypes
  object DescribeContinuousBackupsCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): DescribeContinuousBackupsCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeContinuousBackupsCommandOutput]
    }
  }
}
