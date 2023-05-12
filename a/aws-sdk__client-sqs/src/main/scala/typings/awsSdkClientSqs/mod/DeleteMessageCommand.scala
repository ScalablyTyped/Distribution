package typings.awsSdkClientSqs.mod

import typings.awsSdkClientSqs.distTypesCommandsDeleteMessageCommandMod.DeleteMessageCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs", "DeleteMessageCommand")
@js.native
open class DeleteMessageCommand protected ()
  extends typings.awsSdkClientSqs.distTypesCommandsMod.DeleteMessageCommand {
  /**
    * @public
    */
  def this(input: DeleteMessageCommandInput) = this()
}
/* static members */
object DeleteMessageCommand {
  
  @JSImport("@aws-sdk/client-sqs", "DeleteMessageCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
