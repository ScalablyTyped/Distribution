package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBulkDeploymentStatusRequest extends StObject {
  
  /**
    * The ID of the bulk deployment.
    */
  var BulkDeploymentId: string
}
object GetBulkDeploymentStatusRequest {
  
  @scala.inline
  def apply(BulkDeploymentId: string): GetBulkDeploymentStatusRequest = {
    val __obj = js.Dynamic.literal(BulkDeploymentId = BulkDeploymentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBulkDeploymentStatusRequest]
  }
  
  @scala.inline
  implicit class GetBulkDeploymentStatusRequestMutableBuilder[Self <: GetBulkDeploymentStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBulkDeploymentId(value: string): Self = StObject.set(x, "BulkDeploymentId", value.asInstanceOf[js.Any])
  }
}
