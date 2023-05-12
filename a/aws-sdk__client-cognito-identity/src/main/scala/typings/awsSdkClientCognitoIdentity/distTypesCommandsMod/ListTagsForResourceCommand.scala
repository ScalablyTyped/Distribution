package typings.awsSdkClientCognitoIdentity.distTypesCommandsMod

import typings.awsSdkClientCognitoIdentity.distTypesCommandsListTagsForResourceCommandMod.ListTagsForResourceCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/dist-types/commands", "ListTagsForResourceCommand")
@js.native
open class ListTagsForResourceCommand protected ()
  extends typings.awsSdkClientCognitoIdentity.distTypesCommandsListTagsForResourceCommandMod.ListTagsForResourceCommand {
  /**
    * @public
    */
  def this(input: ListTagsForResourceCommandInput) = this()
}
/* static members */
object ListTagsForResourceCommand {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands", "ListTagsForResourceCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
