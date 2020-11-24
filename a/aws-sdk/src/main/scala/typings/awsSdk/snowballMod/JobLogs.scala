package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobLogs extends js.Object {
  
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
  implicit class JobLogsOps[Self <: JobLogs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setJobCompletionReportURI(value: String): Self = this.set("JobCompletionReportURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobCompletionReportURI: Self = this.set("JobCompletionReportURI", js.undefined)
    
    @scala.inline
    def setJobFailureLogURI(value: String): Self = this.set("JobFailureLogURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobFailureLogURI: Self = this.set("JobFailureLogURI", js.undefined)
    
    @scala.inline
    def setJobSuccessLogURI(value: String): Self = this.set("JobSuccessLogURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobSuccessLogURI: Self = this.set("JobSuccessLogURI", js.undefined)
  }
}
