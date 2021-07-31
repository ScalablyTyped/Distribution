package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPausedDetails extends StObject {
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the job will expire and be cancelled if you don't resume it first. If you don't resume a job within 30 days of pausing it, the job expires and Amazon Macie cancels it.
    */
  var jobExpiresAt: js.UndefOr[timestampIso8601] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Health event that Amazon Macie sent to notify you of the job's pending expiration and cancellation. This value is null if a job has been paused for less than 23 days.
    */
  var jobImminentExpirationHealthEventArn: js.UndefOr[string] = js.undefined
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when you paused the job.
    */
  var jobPausedAt: js.UndefOr[timestampIso8601] = js.undefined
}
object UserPausedDetails {
  
  @scala.inline
  def apply(): UserPausedDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPausedDetails]
  }
  
  @scala.inline
  implicit class UserPausedDetailsMutableBuilder[Self <: UserPausedDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobExpiresAt(value: timestampIso8601): Self = StObject.set(x, "jobExpiresAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobExpiresAtUndefined: Self = StObject.set(x, "jobExpiresAt", js.undefined)
    
    @scala.inline
    def setJobImminentExpirationHealthEventArn(value: string): Self = StObject.set(x, "jobImminentExpirationHealthEventArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobImminentExpirationHealthEventArnUndefined: Self = StObject.set(x, "jobImminentExpirationHealthEventArn", js.undefined)
    
    @scala.inline
    def setJobPausedAt(value: timestampIso8601): Self = StObject.set(x, "jobPausedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobPausedAtUndefined: Self = StObject.set(x, "jobPausedAt", js.undefined)
  }
}
