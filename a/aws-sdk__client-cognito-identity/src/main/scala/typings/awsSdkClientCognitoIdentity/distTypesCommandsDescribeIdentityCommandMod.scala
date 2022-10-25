package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod._ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.DescribeIdentityInput
import typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.IdentityDescription
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

object distTypesCommandsDescribeIdentityCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/DescribeIdentityCommand", "DescribeIdentityCommand")
  @js.native
  open class DescribeIdentityCommand protected () extends Command[
          DescribeIdentityCommandInput, 
          DescribeIdentityCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: DescribeIdentityCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[DescribeIdentityCommandInput, DescribeIdentityCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[DescribeIdentityCommandInput, DescribeIdentityCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object DescribeIdentityCommand {
    
    @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/DescribeIdentityCommand", "DescribeIdentityCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type DescribeIdentityCommandInput = DescribeIdentityInput
  
  trait DescribeIdentityCommandOutput
    extends StObject
       with IdentityDescription
       with MetadataBearer
       with _ServiceOutputTypes
  object DescribeIdentityCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): DescribeIdentityCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeIdentityCommandOutput]
    }
  }
}
