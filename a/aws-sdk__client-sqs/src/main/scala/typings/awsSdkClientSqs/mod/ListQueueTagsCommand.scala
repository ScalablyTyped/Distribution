package typings.awsSdkClientSqs.mod

import typings.awsSdkClientSqs.distTypesCommandsListQueueTagsCommandMod.ListQueueTagsCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs", "ListQueueTagsCommand")
@js.native
open class ListQueueTagsCommand protected ()
  extends typings.awsSdkClientSqs.distTypesCommandsMod.ListQueueTagsCommand {
  /**
    * @public
    */
  def this(input: ListQueueTagsCommandInput) = this()
}
/* static members */
object ListQueueTagsCommand {
  
  @JSImport("@aws-sdk/client-sqs", "ListQueueTagsCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
