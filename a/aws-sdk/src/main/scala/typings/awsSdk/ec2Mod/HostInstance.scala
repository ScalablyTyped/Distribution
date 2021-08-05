package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostInstance extends StObject {
  
  /**
    * The ID of instance that is running on the Dedicated Host.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * The instance type (for example, m3.medium) of the running instance.
    */
  var InstanceType: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the AWS account that owns the instance.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
}
object HostInstance {
  
  inline def apply(): HostInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostInstance]
  }
  
  extension [Self <: HostInstance](x: Self) {
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
  }
}
