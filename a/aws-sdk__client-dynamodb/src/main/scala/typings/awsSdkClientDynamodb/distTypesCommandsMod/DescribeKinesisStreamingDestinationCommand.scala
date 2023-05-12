package typings.awsSdkClientDynamodb.distTypesCommandsMod

import typings.awsSdkClientDynamodb.distTypesCommandsDescribeKinesisStreamingDestinationCommandMod.DescribeKinesisStreamingDestinationCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "DescribeKinesisStreamingDestinationCommand")
@js.native
open class DescribeKinesisStreamingDestinationCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsDescribeKinesisStreamingDestinationCommandMod.DescribeKinesisStreamingDestinationCommand {
  /**
    * @public
    */
  def this(input: DescribeKinesisStreamingDestinationCommandInput) = this()
}
/* static members */
object DescribeKinesisStreamingDestinationCommand {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "DescribeKinesisStreamingDestinationCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
