package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetJobDetailsOutput extends js.Object {
  
  /**
    * The details of the job.  If AWSSessionCredentials is used, a long-running job can call GetJobDetails again to obtain new credentials. 
    */
  var jobDetails: js.UndefOr[JobDetails] = js.native
}
object GetJobDetailsOutput {
  
  @scala.inline
  def apply(): GetJobDetailsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobDetailsOutput]
  }
  
  @scala.inline
  implicit class GetJobDetailsOutputOps[Self <: GetJobDetailsOutput] (val x: Self) extends AnyVal {
    
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
    def setJobDetails(value: JobDetails): Self = this.set("jobDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobDetails: Self = this.set("jobDetails", js.undefined)
  }
}
