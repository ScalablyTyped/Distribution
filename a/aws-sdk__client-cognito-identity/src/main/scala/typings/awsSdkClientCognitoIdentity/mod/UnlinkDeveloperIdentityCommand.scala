package typings.awsSdkClientCognitoIdentity.mod

import typings.awsSdkClientCognitoIdentity.distTypesCommandsUnlinkDeveloperIdentityCommandMod.UnlinkDeveloperIdentityCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity", "UnlinkDeveloperIdentityCommand")
@js.native
open class UnlinkDeveloperIdentityCommand protected ()
  extends typings.awsSdkClientCognitoIdentity.distTypesCommandsMod.UnlinkDeveloperIdentityCommand {
  def this(input: UnlinkDeveloperIdentityCommandInput) = this()
}
/* static members */
object UnlinkDeveloperIdentityCommand {
  
  @JSImport("@aws-sdk/client-cognito-identity", "UnlinkDeveloperIdentityCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
