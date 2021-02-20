package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopJobRunRequest extends StObject {
  
  /**
    * The name of the job to be stopped.
    */
  var Name: JobName = js.native
  
  /**
    * The ID of the job run to be stopped.
    */
  var RunId: JobRunId = js.native
}
object StopJobRunRequest {
  
  @scala.inline
  def apply(Name: JobName, RunId: JobRunId): StopJobRunRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RunId = RunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopJobRunRequest]
  }
  
  @scala.inline
  implicit class StopJobRunRequestMutableBuilder[Self <: StopJobRunRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: JobName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunId(value: JobRunId): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
  }
}
