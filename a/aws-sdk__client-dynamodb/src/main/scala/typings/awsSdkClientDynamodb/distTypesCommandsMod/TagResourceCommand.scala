package typings.awsSdkClientDynamodb.distTypesCommandsMod

import typings.awsSdkClientDynamodb.distTypesCommandsTagResourceCommandMod.TagResourceCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "TagResourceCommand")
@js.native
open class TagResourceCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsTagResourceCommandMod.TagResourceCommand {
  /**
    * @public
    */
  def this(input: TagResourceCommandInput) = this()
}
/* static members */
object TagResourceCommand {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "TagResourceCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
