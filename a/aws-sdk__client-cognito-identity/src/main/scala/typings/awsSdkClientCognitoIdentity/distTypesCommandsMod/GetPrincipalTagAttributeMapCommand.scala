package typings.awsSdkClientCognitoIdentity.distTypesCommandsMod

import typings.awsSdkClientCognitoIdentity.distTypesCommandsGetPrincipalTagAttributeMapCommandMod.GetPrincipalTagAttributeMapCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/dist-types/commands", "GetPrincipalTagAttributeMapCommand")
@js.native
open class GetPrincipalTagAttributeMapCommand protected ()
  extends typings.awsSdkClientCognitoIdentity.distTypesCommandsGetPrincipalTagAttributeMapCommandMod.GetPrincipalTagAttributeMapCommand {
  def this(input: GetPrincipalTagAttributeMapCommandInput) = this()
}
/* static members */
object GetPrincipalTagAttributeMapCommand {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands", "GetPrincipalTagAttributeMapCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
