package typings.awsSdkClientDynamodb.distTypesCommandsMod

import typings.awsSdkClientDynamodb.distTypesCommandsDescribeTimeToLiveCommandMod.DescribeTimeToLiveCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "DescribeTimeToLiveCommand")
@js.native
open class DescribeTimeToLiveCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsDescribeTimeToLiveCommandMod.DescribeTimeToLiveCommand {
  /**
    * @public
    */
  def this(input: DescribeTimeToLiveCommandInput) = this()
}
/* static members */
object DescribeTimeToLiveCommand {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "DescribeTimeToLiveCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
