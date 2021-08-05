package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemStatus extends StObject {
  
  /**
    * CPU utilization metrics for the instance.
    */
  var CPUUtilization: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.CPUUtilization] = js.undefined
  
  /**
    * Load average in the last 1-minute, 5-minute, and 15-minute periods. For more information, see Operating System Metrics.
    */
  var LoadAverage: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.LoadAverage] = js.undefined
}
object SystemStatus {
  
  inline def apply(): SystemStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemStatus]
  }
  
  extension [Self <: SystemStatus](x: Self) {
    
    inline def setCPUUtilization(value: CPUUtilization): Self = StObject.set(x, "CPUUtilization", value.asInstanceOf[js.Any])
    
    inline def setCPUUtilizationUndefined: Self = StObject.set(x, "CPUUtilization", js.undefined)
    
    inline def setLoadAverage(value: LoadAverage): Self = StObject.set(x, "LoadAverage", value.asInstanceOf[js.Any])
    
    inline def setLoadAverageUndefined: Self = StObject.set(x, "LoadAverage", js.undefined)
    
    inline def setLoadAverageVarargs(value: LoadAverageValue*): Self = StObject.set(x, "LoadAverage", js.Array(value :_*))
  }
}
