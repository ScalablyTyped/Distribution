package typings.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JournalS3ExportDescription extends js.Object {
  /**
    * The exclusive end date and time for the range of journal contents that are specified in the original export request.
    */
  var ExclusiveEndTime: Timestamp = js.native
  /**
    * The date and time, in epoch time format, when the export job was created. (Epoch time format is the number of seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
    */
  var ExportCreationTime: Timestamp = js.native
  /**
    * The unique ID of the journal export job.
    */
  var ExportId: UniqueId = js.native
  /**
    * The inclusive start date and time for the range of journal contents that are specified in the original export request.
    */
  var InclusiveStartTime: Timestamp = js.native
  /**
    * The name of the ledger.
    */
  var LedgerName: typings.awsSdk.qldbMod.LedgerName = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal export job to do the following:   Write objects into your Amazon Simple Storage Service (Amazon S3) bucket.   (Optional) Use your customer master key (CMK) in AWS Key Management Service (AWS KMS) for server-side encryption of your exported data.  
    */
  var RoleArn: Arn = js.native
  var S3ExportConfiguration: typings.awsSdk.qldbMod.S3ExportConfiguration = js.native
  /**
    * The current state of the journal export job.
    */
  var Status: ExportStatus = js.native
}

object JournalS3ExportDescription {
  @scala.inline
  def apply(
    ExclusiveEndTime: Timestamp,
    ExportCreationTime: Timestamp,
    ExportId: UniqueId,
    InclusiveStartTime: Timestamp,
    LedgerName: LedgerName,
    RoleArn: Arn,
    S3ExportConfiguration: S3ExportConfiguration,
    Status: ExportStatus
  ): JournalS3ExportDescription = {
    val __obj = js.Dynamic.literal(ExclusiveEndTime = ExclusiveEndTime.asInstanceOf[js.Any], ExportCreationTime = ExportCreationTime.asInstanceOf[js.Any], ExportId = ExportId.asInstanceOf[js.Any], InclusiveStartTime = InclusiveStartTime.asInstanceOf[js.Any], LedgerName = LedgerName.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], S3ExportConfiguration = S3ExportConfiguration.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[JournalS3ExportDescription]
  }
  @scala.inline
  implicit class JournalS3ExportDescriptionOps[Self <: JournalS3ExportDescription] (val x: Self) extends AnyVal {
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
    def setExclusiveEndTime(value: Timestamp): Self = this.set("ExclusiveEndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setExportCreationTime(value: Timestamp): Self = this.set("ExportCreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setExportId(value: UniqueId): Self = this.set("ExportId", value.asInstanceOf[js.Any])
    @scala.inline
    def setInclusiveStartTime(value: Timestamp): Self = this.set("InclusiveStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setLedgerName(value: LedgerName): Self = this.set("LedgerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: Arn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setS3ExportConfiguration(value: S3ExportConfiguration): Self = this.set("S3ExportConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: ExportStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
  }
  
}

