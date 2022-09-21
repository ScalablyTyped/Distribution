package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobProgressSummary extends StObject {
  
  /**
    * 
    */
  var NumberOfTasksFailed: js.UndefOr[JobNumberOfTasksFailed] = js.undefined
  
  /**
    * 
    */
  var NumberOfTasksSucceeded: js.UndefOr[JobNumberOfTasksSucceeded] = js.undefined
  
  /**
    * The JobTimers attribute of a job's progress summary.
    */
  var Timers: js.UndefOr[JobTimers] = js.undefined
  
  /**
    * 
    */
  var TotalNumberOfTasks: js.UndefOr[JobTotalNumberOfTasks] = js.undefined
}
object JobProgressSummary {
  
  inline def apply(): JobProgressSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobProgressSummary]
  }
  
  extension [Self <: JobProgressSummary](x: Self) {
    
    inline def setNumberOfTasksFailed(value: JobNumberOfTasksFailed): Self = StObject.set(x, "NumberOfTasksFailed", value.asInstanceOf[js.Any])
    
    inline def setNumberOfTasksFailedUndefined: Self = StObject.set(x, "NumberOfTasksFailed", js.undefined)
    
    inline def setNumberOfTasksSucceeded(value: JobNumberOfTasksSucceeded): Self = StObject.set(x, "NumberOfTasksSucceeded", value.asInstanceOf[js.Any])
    
    inline def setNumberOfTasksSucceededUndefined: Self = StObject.set(x, "NumberOfTasksSucceeded", js.undefined)
    
    inline def setTimers(value: JobTimers): Self = StObject.set(x, "Timers", value.asInstanceOf[js.Any])
    
    inline def setTimersUndefined: Self = StObject.set(x, "Timers", js.undefined)
    
    inline def setTotalNumberOfTasks(value: JobTotalNumberOfTasks): Self = StObject.set(x, "TotalNumberOfTasks", value.asInstanceOf[js.Any])
    
    inline def setTotalNumberOfTasksUndefined: Self = StObject.set(x, "TotalNumberOfTasks", js.undefined)
  }
}
