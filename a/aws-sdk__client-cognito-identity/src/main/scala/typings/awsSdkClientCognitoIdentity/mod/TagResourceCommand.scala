package typings.awsSdkClientCognitoIdentity.mod

import typings.awsSdkClientCognitoIdentity.distTypesCommandsTagResourceCommandMod.TagResourceCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity", "TagResourceCommand")
@js.native
open class TagResourceCommand protected ()
  extends typings.awsSdkClientCognitoIdentity.distTypesCommandsMod.TagResourceCommand {
  def this(input: TagResourceCommandInput) = this()
}
/* static members */
object TagResourceCommand {
  
  @JSImport("@aws-sdk/client-cognito-identity", "TagResourceCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
