package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcknowledgeJobInput extends js.Object {
  
  /**
    * The unique system-generated ID of the job for which you want to confirm receipt.
    */
  var jobId: JobId = js.native
  
  /**
    * A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by only one job worker. Get this number from the response of the PollForJobs request that returned this job.
    */
  var nonce: Nonce = js.native
}
object AcknowledgeJobInput {
  
  @scala.inline
  def apply(jobId: JobId, nonce: Nonce): AcknowledgeJobInput = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcknowledgeJobInput]
  }
  
  @scala.inline
  implicit class AcknowledgeJobInputOps[Self <: AcknowledgeJobInput] (val x: Self) extends AnyVal {
    
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
    def setJobId(value: JobId): Self = this.set("jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonce(value: Nonce): Self = this.set("nonce", value.asInstanceOf[js.Any])
  }
}
