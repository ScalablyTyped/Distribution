package typings.awsSdkClientSts

import typings.awsSdkClientSts.models0Mod.AssumeRoleWithWebIdentityRequest
import typings.awsSdkClientSts.models0Mod.AssumeRoleWithWebIdentityResponse
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

object assumeRoleWithWebIdentityCommandMod {
  
  @JSImport("@aws-sdk/client-sts/dist-types/commands/AssumeRoleWithWebIdentityCommand", "AssumeRoleWithWebIdentityCommand")
  @js.native
  open class AssumeRoleWithWebIdentityCommand protected () extends Command[
          AssumeRoleWithWebIdentityCommandInput, 
          AssumeRoleWithWebIdentityCommandOutput, 
          STSClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: AssumeRoleWithWebIdentityCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: STSClientResolvedConfig
    ): Handler[AssumeRoleWithWebIdentityCommandInput, AssumeRoleWithWebIdentityCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: STSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[AssumeRoleWithWebIdentityCommandInput, AssumeRoleWithWebIdentityCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  
  type AssumeRoleWithWebIdentityCommandInput = AssumeRoleWithWebIdentityRequest
  
  trait AssumeRoleWithWebIdentityCommandOutput
    extends StObject
       with AssumeRoleWithWebIdentityResponse
       with MetadataBearer
       with ServiceOutputTypes
  object AssumeRoleWithWebIdentityCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): AssumeRoleWithWebIdentityCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssumeRoleWithWebIdentityCommandOutput]
    }
  }
}
