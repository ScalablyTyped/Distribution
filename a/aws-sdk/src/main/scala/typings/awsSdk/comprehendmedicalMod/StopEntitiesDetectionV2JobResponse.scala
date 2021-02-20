package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopEntitiesDetectionV2JobResponse extends StObject {
  
  /**
    * The identifier of the medical entities detection job that was stopped.
    */
  var JobId: js.UndefOr[typings.awsSdk.comprehendmedicalMod.JobId] = js.native
}
object StopEntitiesDetectionV2JobResponse {
  
  @scala.inline
  def apply(): StopEntitiesDetectionV2JobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopEntitiesDetectionV2JobResponse]
  }
  
  @scala.inline
  implicit class StopEntitiesDetectionV2JobResponseMutableBuilder[Self <: StopEntitiesDetectionV2JobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
