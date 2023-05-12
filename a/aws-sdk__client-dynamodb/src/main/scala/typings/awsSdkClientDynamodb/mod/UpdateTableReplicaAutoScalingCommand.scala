package typings.awsSdkClientDynamodb.mod

import typings.awsSdkClientDynamodb.distTypesCommandsUpdateTableReplicaAutoScalingCommandMod.UpdateTableReplicaAutoScalingCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb", "UpdateTableReplicaAutoScalingCommand")
@js.native
open class UpdateTableReplicaAutoScalingCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsMod.UpdateTableReplicaAutoScalingCommand {
  /**
    * @public
    */
  def this(input: UpdateTableReplicaAutoScalingCommandInput) = this()
}
/* static members */
object UpdateTableReplicaAutoScalingCommand {
  
  @JSImport("@aws-sdk/client-dynamodb", "UpdateTableReplicaAutoScalingCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
