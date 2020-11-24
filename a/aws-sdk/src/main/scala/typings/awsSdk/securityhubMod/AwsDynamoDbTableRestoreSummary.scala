package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsDynamoDbTableRestoreSummary extends js.Object {
  
  /**
    * Indicates the point in time that the table was restored to. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var RestoreDateTime: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Whether a restore is currently in progress.
    */
  var RestoreInProgress: js.UndefOr[Boolean] = js.native
  
  /**
    * The ARN of the source backup from which the table was restored.
    */
  var SourceBackupArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The ARN of the source table for the backup.
    */
  var SourceTableArn: js.UndefOr[NonEmptyString] = js.native
}
object AwsDynamoDbTableRestoreSummary {
  
  @scala.inline
  def apply(): AwsDynamoDbTableRestoreSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsDynamoDbTableRestoreSummary]
  }
  
  @scala.inline
  implicit class AwsDynamoDbTableRestoreSummaryOps[Self <: AwsDynamoDbTableRestoreSummary] (val x: Self) extends AnyVal {
    
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
    def setRestoreDateTime(value: NonEmptyString): Self = this.set("RestoreDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestoreDateTime: Self = this.set("RestoreDateTime", js.undefined)
    
    @scala.inline
    def setRestoreInProgress(value: Boolean): Self = this.set("RestoreInProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestoreInProgress: Self = this.set("RestoreInProgress", js.undefined)
    
    @scala.inline
    def setSourceBackupArn(value: NonEmptyString): Self = this.set("SourceBackupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceBackupArn: Self = this.set("SourceBackupArn", js.undefined)
    
    @scala.inline
    def setSourceTableArn(value: NonEmptyString): Self = this.set("SourceTableArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceTableArn: Self = this.set("SourceTableArn", js.undefined)
  }
}
