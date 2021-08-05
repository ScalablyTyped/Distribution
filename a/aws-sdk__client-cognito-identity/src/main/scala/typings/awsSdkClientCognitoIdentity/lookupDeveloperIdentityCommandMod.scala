package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceInputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod._ServiceOutputTypes
import typings.awsSdkClientCognitoIdentity.models0Mod.LookupDeveloperIdentityInput
import typings.awsSdkClientCognitoIdentity.models0Mod.LookupDeveloperIdentityResponse
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lookupDeveloperIdentityCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/types/commands/LookupDeveloperIdentityCommand", "LookupDeveloperIdentityCommand")
  @js.native
  class LookupDeveloperIdentityCommand protected ()
    extends Command[
          LookupDeveloperIdentityCommandInput, 
          LookupDeveloperIdentityCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          js.Any, 
          js.Any
        ] {
    def this(input: LookupDeveloperIdentityCommandInput) = this()
    
    /* private */ var deserialize: js.Any = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[LookupDeveloperIdentityCommandInput, LookupDeveloperIdentityCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[LookupDeveloperIdentityCommandInput, LookupDeveloperIdentityCommandOutput] = js.native
    
    /* private */ var serialize: js.Any = js.native
  }
  
  type LookupDeveloperIdentityCommandInput = LookupDeveloperIdentityInput
  
  trait LookupDeveloperIdentityCommandOutput
    extends StObject
       with LookupDeveloperIdentityResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object LookupDeveloperIdentityCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): LookupDeveloperIdentityCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[LookupDeveloperIdentityCommandOutput]
    }
  }
}
