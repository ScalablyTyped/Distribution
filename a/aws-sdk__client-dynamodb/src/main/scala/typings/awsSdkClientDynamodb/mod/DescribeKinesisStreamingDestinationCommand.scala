package typings.awsSdkClientDynamodb.mod

import typings.awsSdkClientDynamodb.distTypesCommandsDescribeKinesisStreamingDestinationCommandMod.DescribeKinesisStreamingDestinationCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb", "DescribeKinesisStreamingDestinationCommand")
@js.native
open class DescribeKinesisStreamingDestinationCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsMod.DescribeKinesisStreamingDestinationCommand {
  /**
    * @public
    */
  def this(input: DescribeKinesisStreamingDestinationCommandInput) = this()
}
/* static members */
object DescribeKinesisStreamingDestinationCommand {
  
  @JSImport("@aws-sdk/client-dynamodb", "DescribeKinesisStreamingDestinationCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
