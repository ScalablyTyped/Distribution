package typings.awsSdkClientSqs.mod

import typings.awsSdkClientSqs.distTypesCommandsGetQueueUrlCommandMod.GetQueueUrlCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs", "GetQueueUrlCommand")
@js.native
open class GetQueueUrlCommand protected ()
  extends typings.awsSdkClientSqs.distTypesCommandsMod.GetQueueUrlCommand {
  /**
    * @public
    */
  def this(input: GetQueueUrlCommandInput) = this()
}
/* static members */
object GetQueueUrlCommand {
  
  @JSImport("@aws-sdk/client-sqs", "GetQueueUrlCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
