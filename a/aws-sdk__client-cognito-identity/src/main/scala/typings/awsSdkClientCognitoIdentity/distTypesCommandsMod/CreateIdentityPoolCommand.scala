package typings.awsSdkClientCognitoIdentity.distTypesCommandsMod

import typings.awsSdkClientCognitoIdentity.distTypesCommandsCreateIdentityPoolCommandMod.CreateIdentityPoolCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/dist-types/commands", "CreateIdentityPoolCommand")
@js.native
open class CreateIdentityPoolCommand protected ()
  extends typings.awsSdkClientCognitoIdentity.distTypesCommandsCreateIdentityPoolCommandMod.CreateIdentityPoolCommand {
  def this(input: CreateIdentityPoolCommandInput) = this()
}
/* static members */
object CreateIdentityPoolCommand {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands", "CreateIdentityPoolCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
