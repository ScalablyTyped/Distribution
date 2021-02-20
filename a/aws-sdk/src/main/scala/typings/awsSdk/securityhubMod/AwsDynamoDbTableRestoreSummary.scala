package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsDynamoDbTableRestoreSummary extends StObject {
  
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
  implicit class AwsDynamoDbTableRestoreSummaryMutableBuilder[Self <: AwsDynamoDbTableRestoreSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRestoreDateTime(value: NonEmptyString): Self = StObject.set(x, "RestoreDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreDateTimeUndefined: Self = StObject.set(x, "RestoreDateTime", js.undefined)
    
    @scala.inline
    def setRestoreInProgress(value: Boolean): Self = StObject.set(x, "RestoreInProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreInProgressUndefined: Self = StObject.set(x, "RestoreInProgress", js.undefined)
    
    @scala.inline
    def setSourceBackupArn(value: NonEmptyString): Self = StObject.set(x, "SourceBackupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBackupArnUndefined: Self = StObject.set(x, "SourceBackupArn", js.undefined)
    
    @scala.inline
    def setSourceTableArn(value: NonEmptyString): Self = StObject.set(x, "SourceTableArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTableArnUndefined: Self = StObject.set(x, "SourceTableArn", js.undefined)
  }
}
