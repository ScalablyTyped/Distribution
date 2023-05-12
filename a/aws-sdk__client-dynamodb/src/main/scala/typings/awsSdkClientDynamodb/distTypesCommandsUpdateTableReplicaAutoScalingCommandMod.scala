package typings.awsSdkClientDynamodb

import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.DynamoDBClientResolvedConfig
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceInputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod._ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.UpdateTableReplicaAutoScalingInput
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.UpdateTableReplicaAutoScalingOutput
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

object distTypesCommandsUpdateTableReplicaAutoScalingCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/UpdateTableReplicaAutoScalingCommand", "UpdateTableReplicaAutoScalingCommand")
  @js.native
  open class UpdateTableReplicaAutoScalingCommand protected () extends Command[
          UpdateTableReplicaAutoScalingCommandInput, 
          UpdateTableReplicaAutoScalingCommandOutput, 
          DynamoDBClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: UpdateTableReplicaAutoScalingCommandInput) = this()
    
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
    ): Handler[
        UpdateTableReplicaAutoScalingCommandInput, 
        UpdateTableReplicaAutoScalingCommandOutput
      ] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[
        UpdateTableReplicaAutoScalingCommandInput, 
        UpdateTableReplicaAutoScalingCommandOutput
      ] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object UpdateTableReplicaAutoScalingCommand {
    
    @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/UpdateTableReplicaAutoScalingCommand", "UpdateTableReplicaAutoScalingCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type UpdateTableReplicaAutoScalingCommandInput = UpdateTableReplicaAutoScalingInput
  
  trait UpdateTableReplicaAutoScalingCommandOutput
    extends StObject
       with UpdateTableReplicaAutoScalingOutput
       with MetadataBearer
       with _ServiceOutputTypes
  object UpdateTableReplicaAutoScalingCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): UpdateTableReplicaAutoScalingCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateTableReplicaAutoScalingCommandOutput]
    }
  }
}
