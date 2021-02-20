package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProcessingJobResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the processing job.
    */
  var ProcessingJobArn: typings.awsSdk.sagemakerMod.ProcessingJobArn = js.native
}
object CreateProcessingJobResponse {
  
  @scala.inline
  def apply(ProcessingJobArn: ProcessingJobArn): CreateProcessingJobResponse = {
    val __obj = js.Dynamic.literal(ProcessingJobArn = ProcessingJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProcessingJobResponse]
  }
  
  @scala.inline
  implicit class CreateProcessingJobResponseMutableBuilder[Self <: CreateProcessingJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProcessingJobArn(value: ProcessingJobArn): Self = StObject.set(x, "ProcessingJobArn", value.asInstanceOf[js.Any])
  }
}
