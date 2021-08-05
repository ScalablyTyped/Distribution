package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindMatchesTaskRunProperties extends StObject {
  
  /**
    * The job ID for the Find Matches task run.
    */
  var JobId: js.UndefOr[HashString] = js.undefined
  
  /**
    * The name assigned to the job for the Find Matches task run.
    */
  var JobName: js.UndefOr[NameString] = js.undefined
  
  /**
    * The job run ID for the Find Matches task run.
    */
  var JobRunId: js.UndefOr[HashString] = js.undefined
}
object FindMatchesTaskRunProperties {
  
  inline def apply(): FindMatchesTaskRunProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindMatchesTaskRunProperties]
  }
  
  extension [Self <: FindMatchesTaskRunProperties](x: Self) {
    
    inline def setJobId(value: HashString): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setJobName(value: NameString): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    inline def setJobRunId(value: HashString): Self = StObject.set(x, "JobRunId", value.asInstanceOf[js.Any])
    
    inline def setJobRunIdUndefined: Self = StObject.set(x, "JobRunId", js.undefined)
  }
}
