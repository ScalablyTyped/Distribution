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
    * 
    */
  var TotalNumberOfTasks: js.UndefOr[JobTotalNumberOfTasks] = js.undefined
}
object JobProgressSummary {
  
  @scala.inline
  def apply(): JobProgressSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobProgressSummary]
  }
  
  @scala.inline
  implicit class JobProgressSummaryMutableBuilder[Self <: JobProgressSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumberOfTasksFailed(value: JobNumberOfTasksFailed): Self = StObject.set(x, "NumberOfTasksFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfTasksFailedUndefined: Self = StObject.set(x, "NumberOfTasksFailed", js.undefined)
    
    @scala.inline
    def setNumberOfTasksSucceeded(value: JobNumberOfTasksSucceeded): Self = StObject.set(x, "NumberOfTasksSucceeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfTasksSucceededUndefined: Self = StObject.set(x, "NumberOfTasksSucceeded", js.undefined)
    
    @scala.inline
    def setTotalNumberOfTasks(value: JobTotalNumberOfTasks): Self = StObject.set(x, "TotalNumberOfTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalNumberOfTasksUndefined: Self = StObject.set(x, "TotalNumberOfTasks", js.undefined)
  }
}
