package typings.awsSdkClientSqs.mod

import typings.awsSdkClientSqs.distTypesCommandsUntagQueueCommandMod.UntagQueueCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs", "UntagQueueCommand")
@js.native
open class UntagQueueCommand protected ()
  extends typings.awsSdkClientSqs.distTypesCommandsMod.UntagQueueCommand {
  /**
    * @public
    */
  def this(input: UntagQueueCommandInput) = this()
}
/* static members */
object UntagQueueCommand {
  
  @JSImport("@aws-sdk/client-sqs", "UntagQueueCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
