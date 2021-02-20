package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeregisterEcsClusterRequest extends StObject {
  
  /**
    * The cluster's Amazon Resource Number (ARN).
    */
  var EcsClusterArn: String = js.native
}
object DeregisterEcsClusterRequest {
  
  @scala.inline
  def apply(EcsClusterArn: String): DeregisterEcsClusterRequest = {
    val __obj = js.Dynamic.literal(EcsClusterArn = EcsClusterArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterEcsClusterRequest]
  }
  
  @scala.inline
  implicit class DeregisterEcsClusterRequestMutableBuilder[Self <: DeregisterEcsClusterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEcsClusterArn(value: String): Self = StObject.set(x, "EcsClusterArn", value.asInstanceOf[js.Any])
  }
}
