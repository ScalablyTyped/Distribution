package typings.awsSdkClientCognitoIdentity.distTypesCommandsMod

import typings.awsSdkClientCognitoIdentity.distTypesCommandsGetOpenIdTokenCommandMod.GetOpenIdTokenCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/dist-types/commands", "GetOpenIdTokenCommand")
@js.native
open class GetOpenIdTokenCommand protected ()
  extends typings.awsSdkClientCognitoIdentity.distTypesCommandsGetOpenIdTokenCommandMod.GetOpenIdTokenCommand {
  def this(input: GetOpenIdTokenCommandInput) = this()
}
/* static members */
object GetOpenIdTokenCommand {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands", "GetOpenIdTokenCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
