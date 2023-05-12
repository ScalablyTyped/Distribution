package typings.awsSdkClientSqs.mod

import typings.awsSdkClientSqs.distTypesCommandsGetQueueAttributesCommandMod.GetQueueAttributesCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs", "GetQueueAttributesCommand")
@js.native
open class GetQueueAttributesCommand protected ()
  extends typings.awsSdkClientSqs.distTypesCommandsMod.GetQueueAttributesCommand {
  /**
    * @public
    */
  def this(input: GetQueueAttributesCommandInput) = this()
}
/* static members */
object GetQueueAttributesCommand {
  
  @JSImport("@aws-sdk/client-sqs", "GetQueueAttributesCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
