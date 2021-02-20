package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeJobResponse extends StObject {
  
  /**
    * An S3 link to the job document.
    */
  var documentSource: js.UndefOr[JobDocumentSource] = js.native
  
  /**
    * Information about the job.
    */
  var job: js.UndefOr[Job] = js.native
}
object DescribeJobResponse {
  
  @scala.inline
  def apply(): DescribeJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobResponse]
  }
  
  @scala.inline
  implicit class DescribeJobResponseMutableBuilder[Self <: DescribeJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentSource(value: JobDocumentSource): Self = StObject.set(x, "documentSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentSourceUndefined: Self = StObject.set(x, "documentSource", js.undefined)
    
    @scala.inline
    def setJob(value: Job): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
  }
}
