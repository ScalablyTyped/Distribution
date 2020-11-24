package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteInstanceRequest extends js.Object {
  
  /**
    * Whether to delete the instance Elastic IP address.
    */
  var DeleteElasticIp: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to delete the instance's Amazon EBS volumes.
    */
  var DeleteVolumes: js.UndefOr[Boolean] = js.native
  
  /**
    * The instance ID.
    */
  var InstanceId: String = js.native
}
object DeleteInstanceRequest {
  
  @scala.inline
  def apply(InstanceId: String): DeleteInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInstanceRequest]
  }
  
  @scala.inline
  implicit class DeleteInstanceRequestOps[Self <: DeleteInstanceRequest] (val x: Self) extends AnyVal {
    
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
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteElasticIp(value: Boolean): Self = this.set("DeleteElasticIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteElasticIp: Self = this.set("DeleteElasticIp", js.undefined)
    
    @scala.inline
    def setDeleteVolumes(value: Boolean): Self = this.set("DeleteVolumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteVolumes: Self = this.set("DeleteVolumes", js.undefined)
  }
}
