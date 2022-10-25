package typings.awsSdkClientCognitoIdentity.mod

import typings.awsSdkClientCognitoIdentity.distTypesCommandsDeleteIdentityPoolCommandMod.DeleteIdentityPoolCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity", "DeleteIdentityPoolCommand")
@js.native
open class DeleteIdentityPoolCommand protected ()
  extends typings.awsSdkClientCognitoIdentity.distTypesCommandsMod.DeleteIdentityPoolCommand {
  def this(input: DeleteIdentityPoolCommandInput) = this()
}
/* static members */
object DeleteIdentityPoolCommand {
  
  @JSImport("@aws-sdk/client-cognito-identity", "DeleteIdentityPoolCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
