package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTextTranslationJobRequest extends StObject {
  
  /**
    * The identifier that Amazon Translate generated for the job. The StartTextTranslationJob operation returns this identifier in its response.
    */
  var JobId: typings.awsSdk.translateMod.JobId = js.native
}
object DescribeTextTranslationJobRequest {
  
  @scala.inline
  def apply(JobId: JobId): DescribeTextTranslationJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTextTranslationJobRequest]
  }
  
  @scala.inline
  implicit class DescribeTextTranslationJobRequestMutableBuilder[Self <: DescribeTextTranslationJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
