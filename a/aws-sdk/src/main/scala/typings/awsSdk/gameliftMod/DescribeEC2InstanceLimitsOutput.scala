package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEC2InstanceLimitsOutput extends StObject {
  
  /**
    * The maximum number of instances for the specified instance type.
    */
  var EC2InstanceLimits: js.UndefOr[EC2InstanceLimitList] = js.undefined
}
object DescribeEC2InstanceLimitsOutput {
  
  inline def apply(): DescribeEC2InstanceLimitsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEC2InstanceLimitsOutput]
  }
  
  extension [Self <: DescribeEC2InstanceLimitsOutput](x: Self) {
    
    inline def setEC2InstanceLimits(value: EC2InstanceLimitList): Self = StObject.set(x, "EC2InstanceLimits", value.asInstanceOf[js.Any])
    
    inline def setEC2InstanceLimitsUndefined: Self = StObject.set(x, "EC2InstanceLimits", js.undefined)
    
    inline def setEC2InstanceLimitsVarargs(value: EC2InstanceLimit*): Self = StObject.set(x, "EC2InstanceLimits", js.Array(value*))
  }
}
