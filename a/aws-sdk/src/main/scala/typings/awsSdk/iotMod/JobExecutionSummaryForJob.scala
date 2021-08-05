package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobExecutionSummaryForJob extends StObject {
  
  /**
    * Contains a subset of information about a job execution.
    */
  var jobExecutionSummary: js.UndefOr[JobExecutionSummary] = js.undefined
  
  /**
    * The ARN of the thing on which the job execution is running.
    */
  var thingArn: js.UndefOr[ThingArn] = js.undefined
}
object JobExecutionSummaryForJob {
  
  inline def apply(): JobExecutionSummaryForJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecutionSummaryForJob]
  }
  
  extension [Self <: JobExecutionSummaryForJob](x: Self) {
    
    inline def setJobExecutionSummary(value: JobExecutionSummary): Self = StObject.set(x, "jobExecutionSummary", value.asInstanceOf[js.Any])
    
    inline def setJobExecutionSummaryUndefined: Self = StObject.set(x, "jobExecutionSummary", js.undefined)
    
    inline def setThingArn(value: ThingArn): Self = StObject.set(x, "thingArn", value.asInstanceOf[js.Any])
    
    inline def setThingArnUndefined: Self = StObject.set(x, "thingArn", js.undefined)
  }
}
