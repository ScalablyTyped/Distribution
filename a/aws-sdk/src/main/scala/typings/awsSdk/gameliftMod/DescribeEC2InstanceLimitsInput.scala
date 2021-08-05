package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEC2InstanceLimitsInput extends StObject {
  
  /**
    * Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Amazon GameLift supports the following EC2 instance types. See Amazon EC2 Instance Types for detailed descriptions. Leave this parameter blank to retrieve limits for all types.
    */
  var EC2InstanceType: js.UndefOr[typings.awsSdk.gameliftMod.EC2InstanceType] = js.undefined
}
object DescribeEC2InstanceLimitsInput {
  
  inline def apply(): DescribeEC2InstanceLimitsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEC2InstanceLimitsInput]
  }
  
  extension [Self <: DescribeEC2InstanceLimitsInput](x: Self) {
    
    inline def setEC2InstanceType(value: EC2InstanceType): Self = StObject.set(x, "EC2InstanceType", value.asInstanceOf[js.Any])
    
    inline def setEC2InstanceTypeUndefined: Self = StObject.set(x, "EC2InstanceType", js.undefined)
  }
}
