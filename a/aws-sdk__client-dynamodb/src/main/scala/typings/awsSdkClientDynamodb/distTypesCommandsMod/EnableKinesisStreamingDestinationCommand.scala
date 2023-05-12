package typings.awsSdkClientDynamodb.distTypesCommandsMod

import typings.awsSdkClientDynamodb.distTypesCommandsEnableKinesisStreamingDestinationCommandMod.EnableKinesisStreamingDestinationCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "EnableKinesisStreamingDestinationCommand")
@js.native
open class EnableKinesisStreamingDestinationCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsEnableKinesisStreamingDestinationCommandMod.EnableKinesisStreamingDestinationCommand {
  /**
    * @public
    */
  def this(input: EnableKinesisStreamingDestinationCommandInput) = this()
}
/* static members */
object EnableKinesisStreamingDestinationCommand {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "EnableKinesisStreamingDestinationCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
