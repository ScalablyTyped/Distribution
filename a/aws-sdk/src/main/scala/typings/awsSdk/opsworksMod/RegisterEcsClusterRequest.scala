package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterEcsClusterRequest extends StObject {
  
  /**
    * The cluster's ARN.
    */
  var EcsClusterArn: String
  
  /**
    * The stack ID.
    */
  var StackId: String
}
object RegisterEcsClusterRequest {
  
  @scala.inline
  def apply(EcsClusterArn: String, StackId: String): RegisterEcsClusterRequest = {
    val __obj = js.Dynamic.literal(EcsClusterArn = EcsClusterArn.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterEcsClusterRequest]
  }
  
  @scala.inline
  implicit class RegisterEcsClusterRequestMutableBuilder[Self <: RegisterEcsClusterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEcsClusterArn(value: String): Self = StObject.set(x, "EcsClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
  }
}
