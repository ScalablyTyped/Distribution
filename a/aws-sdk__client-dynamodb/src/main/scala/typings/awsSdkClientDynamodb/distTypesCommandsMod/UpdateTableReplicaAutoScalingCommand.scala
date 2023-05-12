package typings.awsSdkClientDynamodb.distTypesCommandsMod

import typings.awsSdkClientDynamodb.distTypesCommandsUpdateTableReplicaAutoScalingCommandMod.UpdateTableReplicaAutoScalingCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "UpdateTableReplicaAutoScalingCommand")
@js.native
open class UpdateTableReplicaAutoScalingCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsUpdateTableReplicaAutoScalingCommandMod.UpdateTableReplicaAutoScalingCommand {
  /**
    * @public
    */
  def this(input: UpdateTableReplicaAutoScalingCommandInput) = this()
}
/* static members */
object UpdateTableReplicaAutoScalingCommand {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "UpdateTableReplicaAutoScalingCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}
