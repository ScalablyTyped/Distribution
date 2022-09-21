package typings.awsSdk.snowdevicemanagementMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDeviceEc2Output extends StObject {
  
  /**
    * A list of structures containing information about each instance. 
    */
  var instances: js.UndefOr[InstanceSummaryList] = js.undefined
}
object DescribeDeviceEc2Output {
  
  inline def apply(): DescribeDeviceEc2Output = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeviceEc2Output]
  }
  
  extension [Self <: DescribeDeviceEc2Output](x: Self) {
    
    inline def setInstances(value: InstanceSummaryList): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: InstanceSummary*): Self = StObject.set(x, "instances", js.Array(value*))
  }
}
