package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopBulkDeploymentRequest extends StObject {
  
  /**
    * The ID of the bulk deployment.
    */
  var BulkDeploymentId: string
}
object StopBulkDeploymentRequest {
  
  @scala.inline
  def apply(BulkDeploymentId: string): StopBulkDeploymentRequest = {
    val __obj = js.Dynamic.literal(BulkDeploymentId = BulkDeploymentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopBulkDeploymentRequest]
  }
  
  @scala.inline
  implicit class StopBulkDeploymentRequestMutableBuilder[Self <: StopBulkDeploymentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBulkDeploymentId(value: string): Self = StObject.set(x, "BulkDeploymentId", value.asInstanceOf[js.Any])
  }
}
