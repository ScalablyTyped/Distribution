package typings.awsSdkClientSqs.mod

import typings.awsSdkClientSqs.distTypesCommandsCreateQueueCommandMod.CreateQueueCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs", "CreateQueueCommand")
@js.native
open class CreateQueueCommand protected ()
  extends typings.awsSdkClientSqs.distTypesCommandsMod.CreateQueueCommand {
  /**
    * @public
    */
  def this(input: CreateQueueCommandInput) = this()
}
/* static members */
object CreateQueueCommand {
  
  @JSImport("@aws-sdk/client-sqs", "CreateQueueCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
