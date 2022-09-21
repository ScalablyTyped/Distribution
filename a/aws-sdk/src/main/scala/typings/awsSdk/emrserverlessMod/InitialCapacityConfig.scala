package typings.awsSdk.emrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitialCapacityConfig extends StObject {
  
  /**
    * The resource configuration of the initial capacity configuration.
    */
  var workerConfiguration: js.UndefOr[WorkerResourceConfig] = js.undefined
  
  /**
    * The number of workers in the initial capacity configuration.
    */
  var workerCount: WorkerCounts
}
object InitialCapacityConfig {
  
  inline def apply(workerCount: WorkerCounts): InitialCapacityConfig = {
    val __obj = js.Dynamic.literal(workerCount = workerCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialCapacityConfig]
  }
  
  extension [Self <: InitialCapacityConfig](x: Self) {
    
    inline def setWorkerConfiguration(value: WorkerResourceConfig): Self = StObject.set(x, "workerConfiguration", value.asInstanceOf[js.Any])
    
    inline def setWorkerConfigurationUndefined: Self = StObject.set(x, "workerConfiguration", js.undefined)
    
    inline def setWorkerCount(value: WorkerCounts): Self = StObject.set(x, "workerCount", value.asInstanceOf[js.Any])
  }
}
