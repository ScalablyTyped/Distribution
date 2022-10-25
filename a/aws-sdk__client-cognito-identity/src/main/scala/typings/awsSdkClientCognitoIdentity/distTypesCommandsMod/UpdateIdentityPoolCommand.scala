package typings.awsSdkClientCognitoIdentity.distTypesCommandsMod

import typings.awsSdkClientCognitoIdentity.distTypesCommandsUpdateIdentityPoolCommandMod.UpdateIdentityPoolCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/dist-types/commands", "UpdateIdentityPoolCommand")
@js.native
open class UpdateIdentityPoolCommand protected ()
  extends typings.awsSdkClientCognitoIdentity.distTypesCommandsUpdateIdentityPoolCommandMod.UpdateIdentityPoolCommand {
  def this(input: UpdateIdentityPoolCommandInput) = this()
}
/* static members */
object UpdateIdentityPoolCommand {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands", "UpdateIdentityPoolCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
