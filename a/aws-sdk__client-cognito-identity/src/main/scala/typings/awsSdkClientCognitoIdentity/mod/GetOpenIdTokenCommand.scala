package typings.awsSdkClientCognitoIdentity.mod

import typings.awsSdkClientCognitoIdentity.distTypesCommandsGetOpenIdTokenCommandMod.GetOpenIdTokenCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity", "GetOpenIdTokenCommand")
@js.native
open class GetOpenIdTokenCommand protected ()
  extends typings.awsSdkClientCognitoIdentity.distTypesCommandsMod.GetOpenIdTokenCommand {
  def this(input: GetOpenIdTokenCommandInput) = this()
}
/* static members */
object GetOpenIdTokenCommand {
  
  @JSImport("@aws-sdk/client-cognito-identity", "GetOpenIdTokenCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
