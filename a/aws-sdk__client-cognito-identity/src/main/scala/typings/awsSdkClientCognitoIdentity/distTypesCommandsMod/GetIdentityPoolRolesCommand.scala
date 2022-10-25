package typings.awsSdkClientCognitoIdentity.distTypesCommandsMod

import typings.awsSdkClientCognitoIdentity.distTypesCommandsGetIdentityPoolRolesCommandMod.GetIdentityPoolRolesCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/dist-types/commands", "GetIdentityPoolRolesCommand")
@js.native
open class GetIdentityPoolRolesCommand protected ()
  extends typings.awsSdkClientCognitoIdentity.distTypesCommandsGetIdentityPoolRolesCommandMod.GetIdentityPoolRolesCommand {
  def this(input: GetIdentityPoolRolesCommandInput) = this()
}
/* static members */
object GetIdentityPoolRolesCommand {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands", "GetIdentityPoolRolesCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
