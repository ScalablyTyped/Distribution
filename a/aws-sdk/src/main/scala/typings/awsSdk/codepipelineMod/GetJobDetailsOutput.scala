package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetJobDetailsOutput extends StObject {
  
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
  implicit class GetJobDetailsOutputMutableBuilder[Self <: GetJobDetailsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobDetails(value: JobDetails): Self = StObject.set(x, "jobDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobDetailsUndefined: Self = StObject.set(x, "jobDetails", js.undefined)
  }
}
