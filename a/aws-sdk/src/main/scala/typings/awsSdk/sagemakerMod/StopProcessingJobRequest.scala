package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopProcessingJobRequest extends StObject {
  
  /**
    * The name of the processing job to stop.
    */
  var ProcessingJobName: typings.awsSdk.sagemakerMod.ProcessingJobName = js.native
}
object StopProcessingJobRequest {
  
  @scala.inline
  def apply(ProcessingJobName: ProcessingJobName): StopProcessingJobRequest = {
    val __obj = js.Dynamic.literal(ProcessingJobName = ProcessingJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopProcessingJobRequest]
  }
  
  @scala.inline
  implicit class StopProcessingJobRequestMutableBuilder[Self <: StopProcessingJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProcessingJobName(value: ProcessingJobName): Self = StObject.set(x, "ProcessingJobName", value.asInstanceOf[js.Any])
  }
}
