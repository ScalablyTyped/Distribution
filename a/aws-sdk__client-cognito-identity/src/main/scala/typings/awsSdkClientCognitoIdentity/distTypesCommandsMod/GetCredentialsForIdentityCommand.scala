package typings.awsSdkClientCognitoIdentity.distTypesCommandsMod

import typings.awsSdkClientCognitoIdentity.distTypesCommandsGetCredentialsForIdentityCommandMod.GetCredentialsForIdentityCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/dist-types/commands", "GetCredentialsForIdentityCommand")
@js.native
open class GetCredentialsForIdentityCommand protected ()
  extends typings.awsSdkClientCognitoIdentity.distTypesCommandsGetCredentialsForIdentityCommandMod.GetCredentialsForIdentityCommand {
  def this(input: GetCredentialsForIdentityCommandInput) = this()
}
/* static members */
object GetCredentialsForIdentityCommand {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands", "GetCredentialsForIdentityCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
