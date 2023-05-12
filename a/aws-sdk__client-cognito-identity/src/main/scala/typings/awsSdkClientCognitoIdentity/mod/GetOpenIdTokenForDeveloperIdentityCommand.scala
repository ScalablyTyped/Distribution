package typings.awsSdkClientCognitoIdentity.mod

import typings.awsSdkClientCognitoIdentity.distTypesCommandsGetOpenIdTokenForDeveloperIdentityCommandMod.GetOpenIdTokenForDeveloperIdentityCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity", "GetOpenIdTokenForDeveloperIdentityCommand")
@js.native
open class GetOpenIdTokenForDeveloperIdentityCommand protected ()
  extends typings.awsSdkClientCognitoIdentity.distTypesCommandsMod.GetOpenIdTokenForDeveloperIdentityCommand {
  /**
    * @public
    */
  def this(input: GetOpenIdTokenForDeveloperIdentityCommandInput) = this()
}
/* static members */
object GetOpenIdTokenForDeveloperIdentityCommand {
  
  @JSImport("@aws-sdk/client-cognito-identity", "GetOpenIdTokenForDeveloperIdentityCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
