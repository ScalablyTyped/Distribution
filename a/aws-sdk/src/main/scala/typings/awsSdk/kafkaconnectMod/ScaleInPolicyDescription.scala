package typings.awsSdk.kafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleInPolicyDescription extends StObject {
  
  /**
    * Specifies the CPU utilization percentage threshold at which you want connector scale in to be triggered.
    */
  var cpuUtilizationPercentage: js.UndefOr[integer] = js.undefined
}
object ScaleInPolicyDescription {
  
  inline def apply(): ScaleInPolicyDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleInPolicyDescription]
  }
  
  extension [Self <: ScaleInPolicyDescription](x: Self) {
    
    inline def setCpuUtilizationPercentage(value: integer): Self = StObject.set(x, "cpuUtilizationPercentage", value.asInstanceOf[js.Any])
    
    inline def setCpuUtilizationPercentageUndefined: Self = StObject.set(x, "cpuUtilizationPercentage", js.undefined)
  }
}
