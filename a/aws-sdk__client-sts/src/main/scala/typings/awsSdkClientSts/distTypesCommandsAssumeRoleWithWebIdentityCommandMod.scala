package typings.awsSdkClientSts

import typings.awsSdkClientSts.distTypesModelsModels0Mod.AssumeRoleWithWebIdentityRequest
import typings.awsSdkClientSts.distTypesModelsModels0Mod.AssumeRoleWithWebIdentityResponse
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

object distTypesCommandsAssumeRoleWithWebIdentityCommandMod {
  
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
