package typings.awsSdkClientSqs.mod

import typings.awsSdkClientSqs.distTypesCommandsPurgeQueueCommandMod.PurgeQueueCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs", "PurgeQueueCommand")
@js.native
open class PurgeQueueCommand protected ()
  extends typings.awsSdkClientSqs.distTypesCommandsMod.PurgeQueueCommand {
  /**
    * @public
    */
  def this(input: PurgeQueueCommandInput) = this()
}
/* static members */
object PurgeQueueCommand {
  
  @JSImport("@aws-sdk/client-sqs", "PurgeQueueCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
