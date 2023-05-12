package typings.awsSdkClientSqs.mod

import typings.awsSdkClientSqs.distTypesCommandsTagQueueCommandMod.TagQueueCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs", "TagQueueCommand")
@js.native
open class TagQueueCommand protected ()
  extends typings.awsSdkClientSqs.distTypesCommandsMod.TagQueueCommand {
  /**
    * @public
    */
  def this(input: TagQueueCommandInput) = this()
}
/* static members */
object TagQueueCommand {
  
  @JSImport("@aws-sdk/client-sqs", "TagQueueCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
