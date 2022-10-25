package typings.awsSdkClientCognitoIdentity.mod

import typings.awsSdkClientCognitoIdentity.distTypesCommandsUnlinkIdentityCommandMod.UnlinkIdentityCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity", "UnlinkIdentityCommand")
@js.native
open class UnlinkIdentityCommand protected ()
  extends typings.awsSdkClientCognitoIdentity.distTypesCommandsMod.UnlinkIdentityCommand {
  def this(input: UnlinkIdentityCommandInput) = this()
}
/* static members */
object UnlinkIdentityCommand {
  
  @JSImport("@aws-sdk/client-cognito-identity", "UnlinkIdentityCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
