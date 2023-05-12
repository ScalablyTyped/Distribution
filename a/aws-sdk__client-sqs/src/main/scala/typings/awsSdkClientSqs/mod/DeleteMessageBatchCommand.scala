package typings.awsSdkClientSqs.mod

import typings.awsSdkClientSqs.distTypesCommandsDeleteMessageBatchCommandMod.DeleteMessageBatchCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs", "DeleteMessageBatchCommand")
@js.native
open class DeleteMessageBatchCommand protected ()
  extends typings.awsSdkClientSqs.distTypesCommandsMod.DeleteMessageBatchCommand {
  /**
    * @public
    */
  def this(input: DeleteMessageBatchCommandInput) = this()
}
/* static members */
object DeleteMessageBatchCommand {
  
  @JSImport("@aws-sdk/client-sqs", "DeleteMessageBatchCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
