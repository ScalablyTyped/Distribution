package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeClassificationJobRequest extends StObject {
  
  /**
    * The unique identifier for the classification job.
    */
  var jobId: string = js.native
}
object DescribeClassificationJobRequest {
  
  @scala.inline
  def apply(jobId: string): DescribeClassificationJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClassificationJobRequest]
  }
  
  @scala.inline
  implicit class DescribeClassificationJobRequestMutableBuilder[Self <: DescribeClassificationJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: string): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
  }
}
