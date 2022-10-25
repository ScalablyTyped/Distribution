package typings.awsSdkClientCognitoIdentity.distTypesCommandsMod

import typings.awsSdkClientCognitoIdentity.distTypesCommandsGetOpenIdTokenForDeveloperIdentityCommandMod.GetOpenIdTokenForDeveloperIdentityCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/dist-types/commands", "GetOpenIdTokenForDeveloperIdentityCommand")
@js.native
open class GetOpenIdTokenForDeveloperIdentityCommand protected ()
  extends typings.awsSdkClientCognitoIdentity.distTypesCommandsGetOpenIdTokenForDeveloperIdentityCommandMod.GetOpenIdTokenForDeveloperIdentityCommand {
  def this(input: GetOpenIdTokenForDeveloperIdentityCommandInput) = this()
}
/* static members */
object GetOpenIdTokenForDeveloperIdentityCommand {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands", "GetOpenIdTokenForDeveloperIdentityCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
