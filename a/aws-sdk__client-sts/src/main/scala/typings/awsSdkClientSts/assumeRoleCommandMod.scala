package typings.awsSdkClientSts

import typings.awsSdkClientSts.models0Mod.AssumeRoleRequest
import typings.awsSdkClientSts.models0Mod.AssumeRoleResponse
import typings.awsSdkClientSts.stsclientMod.STSClientResolvedConfig
import typings.awsSdkClientSts.stsclientMod.ServiceInputTypes
import typings.awsSdkClientSts.stsclientMod.ServiceOutputTypes
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assumeRoleCommandMod {
  
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
