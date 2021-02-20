package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteInstanceRequest extends StObject {
  
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
  implicit class DeleteInstanceRequestMutableBuilder[Self <: DeleteInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteElasticIp(value: Boolean): Self = StObject.set(x, "DeleteElasticIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteElasticIpUndefined: Self = StObject.set(x, "DeleteElasticIp", js.undefined)
    
    @scala.inline
    def setDeleteVolumes(value: Boolean): Self = StObject.set(x, "DeleteVolumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteVolumesUndefined: Self = StObject.set(x, "DeleteVolumes", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
