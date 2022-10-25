package typings.awsSdkClientCognitoIdentity.mod

import typings.awsSdkClientCognitoIdentity.distTypesCommandsUntagResourceCommandMod.UntagResourceCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity", "UntagResourceCommand")
@js.native
open class UntagResourceCommand protected ()
  extends typings.awsSdkClientCognitoIdentity.distTypesCommandsMod.UntagResourceCommand {
  def this(input: UntagResourceCommandInput) = this()
}
/* static members */
object UntagResourceCommand {
  
  @JSImport("@aws-sdk/client-cognito-identity", "UntagResourceCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
