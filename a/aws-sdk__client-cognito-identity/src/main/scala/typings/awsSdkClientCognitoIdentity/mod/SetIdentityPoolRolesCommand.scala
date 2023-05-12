package typings.awsSdkClientCognitoIdentity.mod

import typings.awsSdkClientCognitoIdentity.distTypesCommandsSetIdentityPoolRolesCommandMod.SetIdentityPoolRolesCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity", "SetIdentityPoolRolesCommand")
@js.native
open class SetIdentityPoolRolesCommand protected ()
  extends typings.awsSdkClientCognitoIdentity.distTypesCommandsMod.SetIdentityPoolRolesCommand {
  /**
    * @public
    */
  def this(input: SetIdentityPoolRolesCommandInput) = this()
}
/* static members */
object SetIdentityPoolRolesCommand {
  
  @JSImport("@aws-sdk/client-cognito-identity", "SetIdentityPoolRolesCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
