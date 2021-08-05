package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopJobRunRequest extends StObject {
  
  /**
    * The name of the job to be stopped.
    */
  var Name: JobName
  
  /**
    * The ID of the job run to be stopped.
    */
  var RunId: JobRunId
}
object StopJobRunRequest {
  
  inline def apply(Name: JobName, RunId: JobRunId): StopJobRunRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RunId = RunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopJobRunRequest]
  }
  
  extension [Self <: StopJobRunRequest](x: Self) {
    
    inline def setName(value: JobName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRunId(value: JobRunId): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
  }
}
