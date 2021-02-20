package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MailboxExportJob extends StObject {
  
  /**
    * The mailbox export job description.
    */
  var Description: js.UndefOr[typings.awsSdk.workmailMod.Description] = js.native
  
  /**
    * The mailbox export job end timestamp.
    */
  var EndTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The identifier of the user or resource associated with the mailbox.
    */
  var EntityId: js.UndefOr[WorkMailIdentifier] = js.native
  
  /**
    * The estimated progress of the mailbox export job, in percentage points.
    */
  var EstimatedProgress: js.UndefOr[Percentage] = js.native
  
  /**
    * The identifier of the mailbox export job.
    */
  var JobId: js.UndefOr[MailboxExportJobId] = js.native
  
  /**
    * The name of the S3 bucket.
    */
  var S3BucketName: js.UndefOr[typings.awsSdk.workmailMod.S3BucketName] = js.native
  
  /**
    * The path to the S3 bucket and file that the mailbox export job exports to.
    */
  var S3Path: js.UndefOr[S3ObjectKey] = js.native
  
  /**
    * The mailbox export job start timestamp.
    */
  var StartTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The state of the mailbox export job.
    */
  var State: js.UndefOr[MailboxExportJobState] = js.native
}
object MailboxExportJob {
  
  @scala.inline
  def apply(): MailboxExportJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailboxExportJob]
  }
  
  @scala.inline
  implicit class MailboxExportJobMutableBuilder[Self <: MailboxExportJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setEntityId(value: WorkMailIdentifier): Self = StObject.set(x, "EntityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityIdUndefined: Self = StObject.set(x, "EntityId", js.undefined)
    
    @scala.inline
    def setEstimatedProgress(value: Percentage): Self = StObject.set(x, "EstimatedProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedProgressUndefined: Self = StObject.set(x, "EstimatedProgress", js.undefined)
    
    @scala.inline
    def setJobId(value: MailboxExportJobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    @scala.inline
    def setS3BucketName(value: S3BucketName): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketNameUndefined: Self = StObject.set(x, "S3BucketName", js.undefined)
    
    @scala.inline
    def setS3Path(value: S3ObjectKey): Self = StObject.set(x, "S3Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3PathUndefined: Self = StObject.set(x, "S3Path", js.undefined)
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setState(value: MailboxExportJobState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
