package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod._ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.DescribeIdentityPoolInput
import typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.IdentityPool
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommandsDescribeIdentityPoolCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/DescribeIdentityPoolCommand", "DescribeIdentityPoolCommand")
  @js.native
  open class DescribeIdentityPoolCommand protected () extends Command[
          DescribeIdentityPoolCommandInput, 
          DescribeIdentityPoolCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: DescribeIdentityPoolCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[DescribeIdentityPoolCommandInput, DescribeIdentityPoolCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[DescribeIdentityPoolCommandInput, DescribeIdentityPoolCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  
  type DescribeIdentityPoolCommandInput = DescribeIdentityPoolInput
  
  trait DescribeIdentityPoolCommandOutput
    extends StObject
       with IdentityPool
       with MetadataBearer
       with _ServiceOutputTypes
  object DescribeIdentityPoolCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): DescribeIdentityPoolCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeIdentityPoolCommandOutput]
    }
  }
}
