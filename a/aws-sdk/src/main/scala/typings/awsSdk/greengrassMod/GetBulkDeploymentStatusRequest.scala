package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBulkDeploymentStatusRequest extends js.Object {
  
  /**
    * The ID of the bulk deployment.
    */
  var BulkDeploymentId: string = js.native
}
object GetBulkDeploymentStatusRequest {
  
  @scala.inline
  def apply(BulkDeploymentId: string): GetBulkDeploymentStatusRequest = {
    val __obj = js.Dynamic.literal(BulkDeploymentId = BulkDeploymentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBulkDeploymentStatusRequest]
  }
  
  @scala.inline
  implicit class GetBulkDeploymentStatusRequestOps[Self <: GetBulkDeploymentStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBulkDeploymentId(value: string): Self = this.set("BulkDeploymentId", value.asInstanceOf[js.Any])
  }
}
