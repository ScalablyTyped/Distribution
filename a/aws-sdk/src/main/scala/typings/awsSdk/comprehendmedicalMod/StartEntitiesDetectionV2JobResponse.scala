package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartEntitiesDetectionV2JobResponse extends StObject {
  
  /**
    * The identifier generated for the job. To get the status of a job, use this identifier with the DescribeEntitiesDetectionV2Job operation.
    */
  var JobId: js.UndefOr[typings.awsSdk.comprehendmedicalMod.JobId] = js.undefined
}
object StartEntitiesDetectionV2JobResponse {
  
  @scala.inline
  def apply(): StartEntitiesDetectionV2JobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartEntitiesDetectionV2JobResponse]
  }
  
  @scala.inline
  implicit class StartEntitiesDetectionV2JobResponseMutableBuilder[Self <: StartEntitiesDetectionV2JobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
