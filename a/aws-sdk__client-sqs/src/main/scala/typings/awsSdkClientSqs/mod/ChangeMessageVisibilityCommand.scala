package typings.awsSdkClientSqs.mod

import typings.awsSdkClientSqs.distTypesCommandsChangeMessageVisibilityCommandMod.ChangeMessageVisibilityCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs", "ChangeMessageVisibilityCommand")
@js.native
open class ChangeMessageVisibilityCommand protected ()
  extends typings.awsSdkClientSqs.distTypesCommandsMod.ChangeMessageVisibilityCommand {
  /**
    * @public
    */
  def this(input: ChangeMessageVisibilityCommandInput) = this()
}
/* static members */
object ChangeMessageVisibilityCommand {
  
  @JSImport("@aws-sdk/client-sqs", "ChangeMessageVisibilityCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
