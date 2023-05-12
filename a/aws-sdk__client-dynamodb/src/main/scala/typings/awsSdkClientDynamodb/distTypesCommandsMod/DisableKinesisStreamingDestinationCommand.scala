package typings.awsSdkClientDynamodb.distTypesCommandsMod

import typings.awsSdkClientDynamodb.distTypesCommandsDisableKinesisStreamingDestinationCommandMod.DisableKinesisStreamingDestinationCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "DisableKinesisStreamingDestinationCommand")
@js.native
open class DisableKinesisStreamingDestinationCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsDisableKinesisStreamingDestinationCommandMod.DisableKinesisStreamingDestinationCommand {
  /**
    * @public
    */
  def this(input: DisableKinesisStreamingDestinationCommandInput) = this()
}
/* static members */
object DisableKinesisStreamingDestinationCommand {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "DisableKinesisStreamingDestinationCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
