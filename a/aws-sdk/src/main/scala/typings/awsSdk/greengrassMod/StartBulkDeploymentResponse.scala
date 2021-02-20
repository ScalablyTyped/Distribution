package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartBulkDeploymentResponse extends StObject {
  
  /**
    * The ARN of the bulk deployment.
    */
  var BulkDeploymentArn: js.UndefOr[string] = js.native
  
  /**
    * The ID of the bulk deployment.
    */
  var BulkDeploymentId: js.UndefOr[string] = js.native
}
object StartBulkDeploymentResponse {
  
  @scala.inline
  def apply(): StartBulkDeploymentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartBulkDeploymentResponse]
  }
  
  @scala.inline
  implicit class StartBulkDeploymentResponseMutableBuilder[Self <: StartBulkDeploymentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBulkDeploymentArn(value: string): Self = StObject.set(x, "BulkDeploymentArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulkDeploymentArnUndefined: Self = StObject.set(x, "BulkDeploymentArn", js.undefined)
    
    @scala.inline
    def setBulkDeploymentId(value: string): Self = StObject.set(x, "BulkDeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulkDeploymentIdUndefined: Self = StObject.set(x, "BulkDeploymentId", js.undefined)
  }
}
