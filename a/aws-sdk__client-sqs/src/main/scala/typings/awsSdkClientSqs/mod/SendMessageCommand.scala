package typings.awsSdkClientSqs.mod

import typings.awsSdkClientSqs.distTypesCommandsSendMessageCommandMod.SendMessageCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs", "SendMessageCommand")
@js.native
open class SendMessageCommand protected ()
  extends typings.awsSdkClientSqs.distTypesCommandsMod.SendMessageCommand {
  /**
    * @public
    */
  def this(input: SendMessageCommandInput) = this()
}
/* static members */
object SendMessageCommand {
  
  @JSImport("@aws-sdk/client-sqs", "SendMessageCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
