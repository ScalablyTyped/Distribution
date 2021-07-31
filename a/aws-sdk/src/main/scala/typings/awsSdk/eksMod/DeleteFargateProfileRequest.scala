package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFargateProfileRequest extends StObject {
  
  /**
    * The name of the Amazon EKS cluster associated with the Fargate profile to delete.
    */
  var clusterName: String
  
  /**
    * The name of the Fargate profile to delete.
    */
  var fargateProfileName: String
}
object DeleteFargateProfileRequest {
  
  @scala.inline
  def apply(clusterName: String, fargateProfileName: String): DeleteFargateProfileRequest = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], fargateProfileName = fargateProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFargateProfileRequest]
  }
  
  @scala.inline
  implicit class DeleteFargateProfileRequestMutableBuilder[Self <: DeleteFargateProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFargateProfileName(value: String): Self = StObject.set(x, "fargateProfileName", value.asInstanceOf[js.Any])
  }
}
