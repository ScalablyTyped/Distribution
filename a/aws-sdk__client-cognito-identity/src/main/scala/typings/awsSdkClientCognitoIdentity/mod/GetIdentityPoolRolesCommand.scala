package typings.awsSdkClientCognitoIdentity.mod

import typings.awsSdkClientCognitoIdentity.distTypesCommandsGetIdentityPoolRolesCommandMod.GetIdentityPoolRolesCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity", "GetIdentityPoolRolesCommand")
@js.native
open class GetIdentityPoolRolesCommand protected ()
  extends typings.awsSdkClientCognitoIdentity.distTypesCommandsMod.GetIdentityPoolRolesCommand {
  def this(input: GetIdentityPoolRolesCommandInput) = this()
}
/* static members */
object GetIdentityPoolRolesCommand {
  
  @JSImport("@aws-sdk/client-cognito-identity", "GetIdentityPoolRolesCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
