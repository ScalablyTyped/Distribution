package typings.awsSdkClientSqs.mod

import typings.awsSdkClientSqs.distTypesCommandsChangeMessageVisibilityBatchCommandMod.ChangeMessageVisibilityBatchCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs", "ChangeMessageVisibilityBatchCommand")
@js.native
open class ChangeMessageVisibilityBatchCommand protected ()
  extends typings.awsSdkClientSqs.distTypesCommandsMod.ChangeMessageVisibilityBatchCommand {
  /**
    * @public
    */
  def this(input: ChangeMessageVisibilityBatchCommandInput) = this()
}
/* static members */
object ChangeMessageVisibilityBatchCommand {
  
  @JSImport("@aws-sdk/client-sqs", "ChangeMessageVisibilityBatchCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
