package typings.awsSdkClientSqs.mod

import typings.awsSdkClientSqs.distTypesCommandsReceiveMessageCommandMod.ReceiveMessageCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs", "ReceiveMessageCommand")
@js.native
open class ReceiveMessageCommand protected ()
  extends typings.awsSdkClientSqs.distTypesCommandsMod.ReceiveMessageCommand {
  /**
    * @public
    */
  def this(input: ReceiveMessageCommandInput) = this()
}
/* static members */
object ReceiveMessageCommand {
  
  @JSImport("@aws-sdk/client-sqs", "ReceiveMessageCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
