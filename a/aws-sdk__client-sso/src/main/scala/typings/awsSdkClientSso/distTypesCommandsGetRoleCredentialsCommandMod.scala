package typings.awsSdkClientSso

import typings.awsSdkClientSso.distTypesModelsModels0Mod.GetRoleCredentialsRequest
import typings.awsSdkClientSso.distTypesModelsModels0Mod.GetRoleCredentialsResponse
import typings.awsSdkClientSso.distTypesSsoclientMod.SSOClientResolvedConfig
import typings.awsSdkClientSso.distTypesSsoclientMod.ServiceInputTypes
import typings.awsSdkClientSso.distTypesSsoclientMod.ServiceOutputTypes
import typings.awsSdkClientSso.distTypesSsoclientMod._ServiceOutputTypes
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommandsGetRoleCredentialsCommandMod {
  
  @JSImport("@aws-sdk/client-sso/dist-types/commands/GetRoleCredentialsCommand", "GetRoleCredentialsCommand")
  @js.native
  open class GetRoleCredentialsCommand protected () extends Command[
          GetRoleCredentialsCommandInput, 
          GetRoleCredentialsCommandOutput, 
          SSOClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: GetRoleCredentialsCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: SSOClientResolvedConfig
    ): Handler[GetRoleCredentialsCommandInput, GetRoleCredentialsCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: SSOClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[GetRoleCredentialsCommandInput, GetRoleCredentialsCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  
  type GetRoleCredentialsCommandInput = GetRoleCredentialsRequest
  
  trait GetRoleCredentialsCommandOutput
    extends StObject
       with GetRoleCredentialsResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object GetRoleCredentialsCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): GetRoleCredentialsCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRoleCredentialsCommandOutput]
    }
  }
}
