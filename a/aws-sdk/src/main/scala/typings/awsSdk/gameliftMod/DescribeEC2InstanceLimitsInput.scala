package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEC2InstanceLimitsInput extends StObject {
  
  /**
    * Name of an Amazon EC2 instance type that is supported in GameLift. A fleet instance type determines the computing resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Do not specify a value for this parameter to retrieve limits for all instance types.
    */
  var EC2InstanceType: js.UndefOr[typings.awsSdk.gameliftMod.EC2InstanceType] = js.undefined
  
  /**
    * The name of a remote location to request instance limits for, in the form of an Amazon Web Services Region code such as us-west-2.
    */
  var Location: js.UndefOr[LocationStringModel] = js.undefined
}
object DescribeEC2InstanceLimitsInput {
  
  inline def apply(): DescribeEC2InstanceLimitsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEC2InstanceLimitsInput]
  }
  
  extension [Self <: DescribeEC2InstanceLimitsInput](x: Self) {
    
    inline def setEC2InstanceType(value: EC2InstanceType): Self = StObject.set(x, "EC2InstanceType", value.asInstanceOf[js.Any])
    
    inline def setEC2InstanceTypeUndefined: Self = StObject.set(x, "EC2InstanceType", js.undefined)
    
    inline def setLocation(value: LocationStringModel): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
  }
}
