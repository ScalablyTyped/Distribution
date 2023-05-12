package typings.awsSdkClientDynamodb.mod

import typings.awsSdkClientDynamodb.distTypesCommandsDescribeTableReplicaAutoScalingCommandMod.DescribeTableReplicaAutoScalingCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb", "DescribeTableReplicaAutoScalingCommand")
@js.native
open class DescribeTableReplicaAutoScalingCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsMod.DescribeTableReplicaAutoScalingCommand {
  /**
    * @public
    */
  def this(input: DescribeTableReplicaAutoScalingCommandInput) = this()
}
/* static members */
object DescribeTableReplicaAutoScalingCommand {
  
  @JSImport("@aws-sdk/client-dynamodb", "DescribeTableReplicaAutoScalingCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
