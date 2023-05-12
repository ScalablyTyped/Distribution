package typings.awsSdkClientSts

import typings.awsSdkClientSts.distTypesModelsModels0Mod.AssumeRoleWithWebIdentityRequest
import typings.awsSdkClientSts.distTypesModelsModels0Mod.AssumeRoleWithWebIdentityResponse
import typings.awsSdkClientSts.distTypesStsclientMod.STSClientResolvedConfig
import typings.awsSdkClientSts.distTypesStsclientMod.ServiceInputTypes
import typings.awsSdkClientSts.distTypesStsclientMod.ServiceOutputTypes
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
    /**
      * @public
      */
    def this(input: AssumeRoleWithWebIdentityCommandInput) = this()
    
    /**
      * @internal
      */
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
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object AssumeRoleWithWebIdentityCommand {
    
    @JSImport("@aws-sdk/client-sts/dist-types/commands/AssumeRoleWithWebIdentityCommand", "AssumeRoleWithWebIdentityCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
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
