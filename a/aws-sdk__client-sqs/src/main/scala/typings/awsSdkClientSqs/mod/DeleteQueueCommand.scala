package typings.awsSdkClientSqs.mod

import typings.awsSdkClientSqs.distTypesCommandsDeleteQueueCommandMod.DeleteQueueCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs", "DeleteQueueCommand")
@js.native
open class DeleteQueueCommand protected ()
  extends typings.awsSdkClientSqs.distTypesCommandsMod.DeleteQueueCommand {
  /**
    * @public
    */
  def this(input: DeleteQueueCommandInput) = this()
}
/* static members */
object DeleteQueueCommand {
  
  @JSImport("@aws-sdk/client-sqs", "DeleteQueueCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
