package typings.awsSdk.kafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleOutPolicyUpdate extends StObject {
  
  /**
    * The target CPU utilization percentage threshold at which you want connector scale out to be triggered.
    */
  var cpuUtilizationPercentage: integerMin1Max100
}
object ScaleOutPolicyUpdate {
  
  inline def apply(cpuUtilizationPercentage: integerMin1Max100): ScaleOutPolicyUpdate = {
    val __obj = js.Dynamic.literal(cpuUtilizationPercentage = cpuUtilizationPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleOutPolicyUpdate]
  }
  
  extension [Self <: ScaleOutPolicyUpdate](x: Self) {
    
    inline def setCpuUtilizationPercentage(value: integerMin1Max100): Self = StObject.set(x, "cpuUtilizationPercentage", value.asInstanceOf[js.Any])
  }
}
