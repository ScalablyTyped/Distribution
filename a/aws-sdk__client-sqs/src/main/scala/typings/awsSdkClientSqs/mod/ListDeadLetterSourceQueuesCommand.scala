package typings.awsSdkClientSqs.mod

import typings.awsSdkClientSqs.distTypesCommandsListDeadLetterSourceQueuesCommandMod.ListDeadLetterSourceQueuesCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs", "ListDeadLetterSourceQueuesCommand")
@js.native
open class ListDeadLetterSourceQueuesCommand protected ()
  extends typings.awsSdkClientSqs.distTypesCommandsMod.ListDeadLetterSourceQueuesCommand {
  /**
    * @public
    */
  def this(input: ListDeadLetterSourceQueuesCommandInput) = this()
}
/* static members */
object ListDeadLetterSourceQueuesCommand {
  
  @JSImport("@aws-sdk/client-sqs", "ListDeadLetterSourceQueuesCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
