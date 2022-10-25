package typings.awsSdkClientCognitoIdentity.distTypesCommandsMod

import typings.awsSdkClientCognitoIdentity.distTypesCommandsListIdentityPoolsCommandMod.ListIdentityPoolsCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/dist-types/commands", "ListIdentityPoolsCommand")
@js.native
open class ListIdentityPoolsCommand protected ()
  extends typings.awsSdkClientCognitoIdentity.distTypesCommandsListIdentityPoolsCommandMod.ListIdentityPoolsCommand {
  def this(input: ListIdentityPoolsCommandInput) = this()
}
/* static members */
object ListIdentityPoolsCommand {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands", "ListIdentityPoolsCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
