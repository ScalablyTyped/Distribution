package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopInstancesRequest extends js.Object {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * Forces the instances to stop. The instances do not have an opportunity to flush file system caches or file system metadata. If you use this option, you must perform file system check and repair procedures. This option is not recommended for Windows instances. Default: false 
    */
  var Force: js.UndefOr[Boolean] = js.native
  
  /**
    * Hibernates the instance if the instance was enabled for hibernation at launch. If the instance cannot hibernate successfully, a normal shutdown occurs. For more information, see Hibernate your instance in the Amazon Elastic Compute Cloud User Guide.  Default: false 
    */
  var Hibernate: js.UndefOr[Boolean] = js.native
  
  /**
    * The IDs of the instances.
    */
  var InstanceIds: InstanceIdStringList = js.native
}
object StopInstancesRequest {
  
  @scala.inline
  def apply(InstanceIds: InstanceIdStringList): StopInstancesRequest = {
    val __obj = js.Dynamic.literal(InstanceIds = InstanceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopInstancesRequest]
  }
  
  @scala.inline
  implicit class StopInstancesRequestOps[Self <: StopInstancesRequest] (val x: Self) extends AnyVal {
    
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
    def setInstanceIdsVarargs(value: InstanceId*): Self = this.set("InstanceIds", js.Array(value :_*))
    
    @scala.inline
    def setInstanceIds(value: InstanceIdStringList): Self = this.set("InstanceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = this.set("Force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("Force", js.undefined)
    
    @scala.inline
    def setHibernate(value: Boolean): Self = this.set("Hibernate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHibernate: Self = this.set("Hibernate", js.undefined)
  }
}
