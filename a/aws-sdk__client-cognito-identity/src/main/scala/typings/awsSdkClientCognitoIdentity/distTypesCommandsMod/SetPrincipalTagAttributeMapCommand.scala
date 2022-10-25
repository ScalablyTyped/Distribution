package typings.awsSdkClientCognitoIdentity.distTypesCommandsMod

import typings.awsSdkClientCognitoIdentity.distTypesCommandsSetPrincipalTagAttributeMapCommandMod.SetPrincipalTagAttributeMapCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/dist-types/commands", "SetPrincipalTagAttributeMapCommand")
@js.native
open class SetPrincipalTagAttributeMapCommand protected ()
  extends typings.awsSdkClientCognitoIdentity.distTypesCommandsSetPrincipalTagAttributeMapCommandMod.SetPrincipalTagAttributeMapCommand {
  def this(input: SetPrincipalTagAttributeMapCommandInput) = this()
}
/* static members */
object SetPrincipalTagAttributeMapCommand {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands", "SetPrincipalTagAttributeMapCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
