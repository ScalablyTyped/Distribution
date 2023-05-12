package typings.awsSdkClientSqs.mod

import typings.awsSdkClientSqs.distTypesCommandsSendMessageBatchCommandMod.SendMessageBatchCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs", "SendMessageBatchCommand")
@js.native
open class SendMessageBatchCommand protected ()
  extends typings.awsSdkClientSqs.distTypesCommandsMod.SendMessageBatchCommand {
  /**
    * @public
    */
  def this(input: SendMessageBatchCommandInput) = this()
}
/* static members */
object SendMessageBatchCommand {
  
  @JSImport("@aws-sdk/client-sqs", "SendMessageBatchCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
