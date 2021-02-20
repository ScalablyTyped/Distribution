package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopInstancesRequest extends StObject {
  
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
  implicit class StopInstancesRequestMutableBuilder[Self <: StopInstancesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "Force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "Force", js.undefined)
    
    @scala.inline
    def setHibernate(value: Boolean): Self = StObject.set(x, "Hibernate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHibernateUndefined: Self = StObject.set(x, "Hibernate", js.undefined)
    
    @scala.inline
    def setInstanceIds(value: InstanceIdStringList): Self = StObject.set(x, "InstanceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdsVarargs(value: InstanceId*): Self = StObject.set(x, "InstanceIds", js.Array(value :_*))
  }
}
