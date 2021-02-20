package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobLogs extends StObject {
  
  /**
    * A link to an Amazon S3 presigned URL where the job completion report is located.
    */
  var JobCompletionReportURI: js.UndefOr[String] = js.native
  
  /**
    * A link to an Amazon S3 presigned URL where the job failure log is located.
    */
  var JobFailureLogURI: js.UndefOr[String] = js.native
  
  /**
    * A link to an Amazon S3 presigned URL where the job success log is located.
    */
  var JobSuccessLogURI: js.UndefOr[String] = js.native
}
object JobLogs {
  
  @scala.inline
  def apply(): JobLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobLogs]
  }
  
  @scala.inline
  implicit class JobLogsMutableBuilder[Self <: JobLogs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobCompletionReportURI(value: String): Self = StObject.set(x, "JobCompletionReportURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobCompletionReportURIUndefined: Self = StObject.set(x, "JobCompletionReportURI", js.undefined)
    
    @scala.inline
    def setJobFailureLogURI(value: String): Self = StObject.set(x, "JobFailureLogURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobFailureLogURIUndefined: Self = StObject.set(x, "JobFailureLogURI", js.undefined)
    
    @scala.inline
    def setJobSuccessLogURI(value: String): Self = StObject.set(x, "JobSuccessLogURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobSuccessLogURIUndefined: Self = StObject.set(x, "JobSuccessLogURI", js.undefined)
  }
}
