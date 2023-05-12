package typings.awsSdkClientDynamodb.mod

import typings.awsSdkClientDynamodb.distTypesCommandsListTagsOfResourceCommandMod.ListTagsOfResourceCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb", "ListTagsOfResourceCommand")
@js.native
open class ListTagsOfResourceCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsMod.ListTagsOfResourceCommand {
  /**
    * @public
    */
  def this(input: ListTagsOfResourceCommandInput) = this()
}
/* static members */
object ListTagsOfResourceCommand {
  
  @JSImport("@aws-sdk/client-dynamodb", "ListTagsOfResourceCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
