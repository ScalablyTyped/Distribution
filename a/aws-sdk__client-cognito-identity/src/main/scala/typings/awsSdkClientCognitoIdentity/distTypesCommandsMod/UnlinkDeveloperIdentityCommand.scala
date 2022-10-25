package typings.awsSdkClientCognitoIdentity.distTypesCommandsMod

import typings.awsSdkClientCognitoIdentity.distTypesCommandsUnlinkDeveloperIdentityCommandMod.UnlinkDeveloperIdentityCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/dist-types/commands", "UnlinkDeveloperIdentityCommand")
@js.native
open class UnlinkDeveloperIdentityCommand protected ()
  extends typings.awsSdkClientCognitoIdentity.distTypesCommandsUnlinkDeveloperIdentityCommandMod.UnlinkDeveloperIdentityCommand {
  def this(input: UnlinkDeveloperIdentityCommandInput) = this()
}
/* static members */
object UnlinkDeveloperIdentityCommand {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands", "UnlinkDeveloperIdentityCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
