package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreRestoreSummaryMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _RestoreSummary extends js.Object {
  /**
    * <p>Point in time or source backup time.</p>
    */
  var RestoreDateTime: Date | String | Double
  /**
    * <p>Indicates if a restore is in progress or not.</p>
    */
  var RestoreInProgress: Boolean
  /**
    * <p>ARN of the backup from which the table was restored.</p>
    */
  var SourceBackupArn: js.UndefOr[String] = js.undefined
  /**
    * <p>ARN of the source table of the backup that is being restored.</p>
    */
  var SourceTableArn: js.UndefOr[String] = js.undefined
}

object _RestoreSummary {
  @scala.inline
  def apply(
    RestoreDateTime: Date | String | Double,
    RestoreInProgress: Boolean,
    SourceBackupArn: String = null,
    SourceTableArn: String = null
  ): _RestoreSummary = {
    val __obj = js.Dynamic.literal(RestoreDateTime = RestoreDateTime.asInstanceOf[js.Any], RestoreInProgress = RestoreInProgress.asInstanceOf[js.Any])
    if (SourceBackupArn != null) __obj.updateDynamic("SourceBackupArn")(SourceBackupArn.asInstanceOf[js.Any])
    if (SourceTableArn != null) __obj.updateDynamic("SourceTableArn")(SourceTableArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[_RestoreSummary]
  }
}

