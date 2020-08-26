package typings.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportJournalToS3Request extends js.Object {
  /**
    * The exclusive end date and time for the range of journal contents that you want to export. The ExclusiveEndTime must be in ISO 8601 date and time format and in Universal Coordinated Time (UTC). For example: 2019-06-13T21:36:34Z  The ExclusiveEndTime must be less than or equal to the current UTC date and time.
    */
  var ExclusiveEndTime: Timestamp = js.native
  /**
    * The inclusive start date and time for the range of journal contents that you want to export. The InclusiveStartTime must be in ISO 8601 date and time format and in Universal Coordinated Time (UTC). For example: 2019-06-13T21:36:34Z  The InclusiveStartTime must be before ExclusiveEndTime. If you provide an InclusiveStartTime that is before the ledger's CreationDateTime, Amazon QLDB defaults it to the ledger's CreationDateTime.
    */
  var InclusiveStartTime: Timestamp = js.native
  /**
    * The name of the ledger.
    */
  var Name: LedgerName = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal export job to do the following:   Write objects into your Amazon Simple Storage Service (Amazon S3) bucket.   (Optional) Use your customer master key (CMK) in AWS Key Management Service (AWS KMS) for server-side encryption of your exported data.  
    */
  var RoleArn: Arn = js.native
  /**
    * The configuration settings of the Amazon S3 bucket destination for your export request.
    */
  var S3ExportConfiguration: typings.awsSdk.qldbMod.S3ExportConfiguration = js.native
}

object ExportJournalToS3Request {
  @scala.inline
  def apply(
    ExclusiveEndTime: Timestamp,
    InclusiveStartTime: Timestamp,
    Name: LedgerName,
    RoleArn: Arn,
    S3ExportConfiguration: S3ExportConfiguration
  ): ExportJournalToS3Request = {
    val __obj = js.Dynamic.literal(ExclusiveEndTime = ExclusiveEndTime.asInstanceOf[js.Any], InclusiveStartTime = InclusiveStartTime.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], S3ExportConfiguration = S3ExportConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportJournalToS3Request]
  }
  @scala.inline
  implicit class ExportJournalToS3RequestOps[Self <: ExportJournalToS3Request] (val x: Self) extends AnyVal {
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
    def setInclusiveStartTime(value: Timestamp): Self = this.set("InclusiveStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: LedgerName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: Arn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setS3ExportConfiguration(value: S3ExportConfiguration): Self = this.set("S3ExportConfiguration", value.asInstanceOf[js.Any])
  }
  
}

