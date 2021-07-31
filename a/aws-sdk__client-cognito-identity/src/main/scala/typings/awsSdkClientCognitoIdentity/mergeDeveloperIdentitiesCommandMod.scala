package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod._ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.models0Mod.MergeDeveloperIdentitiesInput
import typings.awsSdkClientCognitoIdentity.models0Mod.MergeDeveloperIdentitiesResponse
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeDeveloperIdentitiesCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/types/commands/MergeDeveloperIdentitiesCommand", "MergeDeveloperIdentitiesCommand")
  @js.native
  class MergeDeveloperIdentitiesCommand protected ()
    extends Command[
          MergeDeveloperIdentitiesCommandInput, 
          MergeDeveloperIdentitiesCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          js.Any, 
          js.Any
        ] {
    def this(input: MergeDeveloperIdentitiesCommandInput) = this()
    
    var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[MergeDeveloperIdentitiesCommandInput, MergeDeveloperIdentitiesCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[MergeDeveloperIdentitiesCommandInput, MergeDeveloperIdentitiesCommandOutput] = js.native
    
    var serialize: js.Any = js.native
  }
  
  type MergeDeveloperIdentitiesCommandInput = MergeDeveloperIdentitiesInput
  
  trait MergeDeveloperIdentitiesCommandOutput
    extends StObject
       with MergeDeveloperIdentitiesResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object MergeDeveloperIdentitiesCommandOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): MergeDeveloperIdentitiesCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[MergeDeveloperIdentitiesCommandOutput]
    }
  }
}
