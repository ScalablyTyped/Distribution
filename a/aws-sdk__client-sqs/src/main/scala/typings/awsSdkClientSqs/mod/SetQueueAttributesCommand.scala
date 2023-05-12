package typings.awsSdkClientSqs.mod

import typings.awsSdkClientSqs.distTypesCommandsSetQueueAttributesCommandMod.SetQueueAttributesCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs", "SetQueueAttributesCommand")
@js.native
open class SetQueueAttributesCommand protected ()
  extends typings.awsSdkClientSqs.distTypesCommandsMod.SetQueueAttributesCommand {
  /**
    * @public
    */
  def this(input: SetQueueAttributesCommandInput) = this()
}
/* static members */
object SetQueueAttributesCommand {
  
  @JSImport("@aws-sdk/client-sqs", "SetQueueAttributesCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
