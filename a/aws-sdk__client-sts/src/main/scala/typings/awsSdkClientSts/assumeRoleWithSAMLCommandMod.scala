package typings.awsSdkClientSts

import typings.awsSdkClientSts.models0Mod.AssumeRoleWithSAMLRequest
import typings.awsSdkClientSts.models0Mod.AssumeRoleWithSAMLResponse
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

object assumeRoleWithSAMLCommandMod {
  
  @JSImport("@aws-sdk/client-sts/dist-types/commands/AssumeRoleWithSAMLCommand", "AssumeRoleWithSAMLCommand")
  @js.native
  open class AssumeRoleWithSAMLCommand protected () extends Command[
          AssumeRoleWithSAMLCommandInput, 
          AssumeRoleWithSAMLCommandOutput, 
          STSClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: AssumeRoleWithSAMLCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: STSClientResolvedConfig
    ): Handler[AssumeRoleWithSAMLCommandInput, AssumeRoleWithSAMLCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: STSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[AssumeRoleWithSAMLCommandInput, AssumeRoleWithSAMLCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  
  type AssumeRoleWithSAMLCommandInput = AssumeRoleWithSAMLRequest
  
  trait AssumeRoleWithSAMLCommandOutput
    extends StObject
       with AssumeRoleWithSAMLResponse
       with MetadataBearer
       with ServiceOutputTypes
  object AssumeRoleWithSAMLCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): AssumeRoleWithSAMLCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssumeRoleWithSAMLCommandOutput]
    }
  }
}
