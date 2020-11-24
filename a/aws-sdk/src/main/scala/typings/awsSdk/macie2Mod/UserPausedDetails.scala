package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPausedDetails extends js.Object {
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the job will expire and be cancelled if you don't resume it first. If you don't resume a job within 30 days of pausing it, the job expires and Amazon Macie cancels it.
    */
  var jobExpiresAt: js.UndefOr[timestampIso8601] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Health event that Amazon Macie sent to notify you of the job's pending expiration and cancellation. This value is null if a job has been paused for less than 23 days.
    */
  var jobImminentExpirationHealthEventArn: js.UndefOr[string] = js.native
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when you paused the job.
    */
  var jobPausedAt: js.UndefOr[timestampIso8601] = js.native
}
object UserPausedDetails {
  
  @scala.inline
  def apply(): UserPausedDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPausedDetails]
  }
  
  @scala.inline
  implicit class UserPausedDetailsOps[Self <: UserPausedDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setJobExpiresAt(value: timestampIso8601): Self = this.set("jobExpiresAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobExpiresAt: Self = this.set("jobExpiresAt", js.undefined)
    
    @scala.inline
    def setJobImminentExpirationHealthEventArn(value: string): Self = this.set("jobImminentExpirationHealthEventArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobImminentExpirationHealthEventArn: Self = this.set("jobImminentExpirationHealthEventArn", js.undefined)
    
    @scala.inline
    def setJobPausedAt(value: timestampIso8601): Self = this.set("jobPausedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobPausedAt: Self = this.set("jobPausedAt", js.undefined)
  }
}
