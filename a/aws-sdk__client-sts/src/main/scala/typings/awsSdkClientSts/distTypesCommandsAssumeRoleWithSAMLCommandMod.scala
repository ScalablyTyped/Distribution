package typings.awsSdkClientSts

import typings.awsSdkClientSts.distTypesModelsModels0Mod.AssumeRoleWithSAMLRequest
import typings.awsSdkClientSts.distTypesModelsModels0Mod.AssumeRoleWithSAMLResponse
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

object distTypesCommandsAssumeRoleWithSAMLCommandMod {
  
  @JSImport("@aws-sdk/client-sts/dist-types/commands/AssumeRoleWithSAMLCommand", "AssumeRoleWithSAMLCommand")
  @js.native
  open class AssumeRoleWithSAMLCommand protected () extends Command[
          AssumeRoleWithSAMLCommandInput, 
          AssumeRoleWithSAMLCommandOutput, 
          STSClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: AssumeRoleWithSAMLCommandInput) = this()
    
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
    ): Handler[AssumeRoleWithSAMLCommandInput, AssumeRoleWithSAMLCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: STSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[AssumeRoleWithSAMLCommandInput, AssumeRoleWithSAMLCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object AssumeRoleWithSAMLCommand {
    
    @JSImport("@aws-sdk/client-sts/dist-types/commands/AssumeRoleWithSAMLCommand", "AssumeRoleWithSAMLCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
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
