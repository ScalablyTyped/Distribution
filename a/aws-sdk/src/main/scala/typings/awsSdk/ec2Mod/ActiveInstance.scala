package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveInstance extends StObject {
  
  /**
    * The health status of the instance. If the status of either the instance status check or the system status check is impaired, the health status of the instance is unhealthy. Otherwise, the health status is healthy.
    */
  var InstanceHealth: js.UndefOr[InstanceHealthStatus] = js.undefined
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Spot Instance request.
    */
  var SpotInstanceRequestId: js.UndefOr[String] = js.undefined
}
object ActiveInstance {
  
  @scala.inline
  def apply(): ActiveInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveInstance]
  }
  
  @scala.inline
  implicit class ActiveInstanceMutableBuilder[Self <: ActiveInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceHealth(value: InstanceHealthStatus): Self = StObject.set(x, "InstanceHealth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceHealthUndefined: Self = StObject.set(x, "InstanceHealth", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setSpotInstanceRequestId(value: String): Self = StObject.set(x, "SpotInstanceRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotInstanceRequestIdUndefined: Self = StObject.set(x, "SpotInstanceRequestId", js.undefined)
  }
}
