package typings.awsSdkClientCognitoIdentity.distTypesCommandsMod

import typings.awsSdkClientCognitoIdentity.distTypesCommandsGetIdCommandMod.GetIdCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/dist-types/commands", "GetIdCommand")
@js.native
open class GetIdCommand protected ()
  extends typings.awsSdkClientCognitoIdentity.distTypesCommandsGetIdCommandMod.GetIdCommand {
  def this(input: GetIdCommandInput) = this()
}
/* static members */
object GetIdCommand {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands", "GetIdCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
