package typings.awsSdkClientSqs.mod

import typings.awsSdkClientSqs.distTypesCommandsListQueuesCommandMod.ListQueuesCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs", "ListQueuesCommand")
@js.native
open class ListQueuesCommand protected ()
  extends typings.awsSdkClientSqs.distTypesCommandsMod.ListQueuesCommand {
  /**
    * @public
    */
  def this(input: ListQueuesCommandInput) = this()
}
/* static members */
object ListQueuesCommand {
  
  @JSImport("@aws-sdk/client-sqs", "ListQueuesCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
