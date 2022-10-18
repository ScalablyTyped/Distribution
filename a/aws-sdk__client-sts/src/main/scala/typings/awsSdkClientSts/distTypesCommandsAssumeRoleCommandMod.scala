package typings.awsSdkClientSts

import typings.awsSdkClientSts.distTypesModelsModels0Mod.AssumeRoleRequest
import typings.awsSdkClientSts.distTypesModelsModels0Mod.AssumeRoleResponse
import typings.awsSdkClientSts.distTypesStsclientMod.STSClientResolvedConfig
import typings.awsSdkClientSts.distTypesStsclientMod.ServiceInputTypes
import typings.awsSdkClientSts.distTypesStsclientMod.ServiceOutputTypes
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommandsAssumeRoleCommandMod {
  
  @JSImport("@aws-sdk/client-sts/dist-types/commands/AssumeRoleCommand", "AssumeRoleCommand")
  @js.native
  open class AssumeRoleCommand protected () extends Command[AssumeRoleCommandInput, AssumeRoleCommandOutput, STSClientResolvedConfig, Any, Any] {
    def this(input: AssumeRoleCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: STSClientResolvedConfig
    ): Handler[AssumeRoleCommandInput, AssumeRoleCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: STSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[AssumeRoleCommandInput, AssumeRoleCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  
  type AssumeRoleCommandInput = AssumeRoleRequest
  
  trait AssumeRoleCommandOutput
    extends StObject
       with AssumeRoleResponse
       with MetadataBearer
       with ServiceOutputTypes
  object AssumeRoleCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): AssumeRoleCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssumeRoleCommandOutput]
    }
  }
}
