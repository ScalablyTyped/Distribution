package typings.awsSdk.snowdevicemanagementMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDeviceInput extends StObject {
  
  /**
    * The ID of the device that you are checking the information of.
    */
  var managedDeviceId: ManagedDeviceId
}
object DescribeDeviceInput {
  
  inline def apply(managedDeviceId: ManagedDeviceId): DescribeDeviceInput = {
    val __obj = js.Dynamic.literal(managedDeviceId = managedDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDeviceInput]
  }
  
  extension [Self <: DescribeDeviceInput](x: Self) {
    
    inline def setManagedDeviceId(value: ManagedDeviceId): Self = StObject.set(x, "managedDeviceId", value.asInstanceOf[js.Any])
  }
}
