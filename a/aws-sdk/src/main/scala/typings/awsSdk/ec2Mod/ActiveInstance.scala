package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveInstance extends js.Object {
  
  /**
    * The health status of the instance. If the status of either the instance status check or the system status check is impaired, the health status of the instance is unhealthy. Otherwise, the health status is healthy.
    */
  var InstanceHealth: js.UndefOr[InstanceHealthStatus] = js.native
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[String] = js.native
  
  /**
    * The ID of the Spot Instance request.
    */
  var SpotInstanceRequestId: js.UndefOr[String] = js.native
}
object ActiveInstance {
  
  @scala.inline
  def apply(): ActiveInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveInstance]
  }
  
  @scala.inline
  implicit class ActiveInstanceOps[Self <: ActiveInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInstanceHealth(value: InstanceHealthStatus): Self = this.set("InstanceHealth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceHealth: Self = this.set("InstanceHealth", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    
    @scala.inline
    def setInstanceType(value: String): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    
    @scala.inline
    def setSpotInstanceRequestId(value: String): Self = this.set("SpotInstanceRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpotInstanceRequestId: Self = this.set("SpotInstanceRequestId", js.undefined)
  }
}
