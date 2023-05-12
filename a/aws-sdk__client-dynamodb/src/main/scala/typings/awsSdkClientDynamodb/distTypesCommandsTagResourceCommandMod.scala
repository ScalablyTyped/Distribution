package typings.awsSdkClientDynamodb

import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.DynamoDBClientResolvedConfig
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceInputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.TagResourceInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommandsTagResourceCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/TagResourceCommand", "TagResourceCommand")
  @js.native
  open class TagResourceCommand protected () extends Command[
          TagResourceCommandInput, 
          TagResourceCommandOutput, 
          DynamoDBClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: TagResourceCommandInput) = this()
    
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
    ): Handler[TagResourceCommandInput, TagResourceCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[TagResourceCommandInput, TagResourceCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object TagResourceCommand {
    
    @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/TagResourceCommand", "TagResourceCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type TagResourceCommandInput = TagResourceInput
  
  type TagResourceCommandOutput = MetadataBearer
}
