package typings.awsSdkClientDynamodb.distTypesCommandsMod

import typings.awsSdkClientDynamodb.distTypesCommandsUntagResourceCommandMod.UntagResourceCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "UntagResourceCommand")
@js.native
open class UntagResourceCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsUntagResourceCommandMod.UntagResourceCommand {
  /**
    * @public
    */
  def this(input: UntagResourceCommandInput) = this()
}
/* static members */
object UntagResourceCommand {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "UntagResourceCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
