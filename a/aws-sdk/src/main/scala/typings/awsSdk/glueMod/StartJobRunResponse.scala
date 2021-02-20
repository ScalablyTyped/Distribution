package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartJobRunResponse extends StObject {
  
  /**
    * The ID assigned to this job run.
    */
  var JobRunId: js.UndefOr[IdString] = js.native
}
object StartJobRunResponse {
  
  @scala.inline
  def apply(): StartJobRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartJobRunResponse]
  }
  
  @scala.inline
  implicit class StartJobRunResponseMutableBuilder[Self <: StartJobRunResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobRunId(value: IdString): Self = StObject.set(x, "JobRunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobRunIdUndefined: Self = StObject.set(x, "JobRunId", js.undefined)
  }
}
