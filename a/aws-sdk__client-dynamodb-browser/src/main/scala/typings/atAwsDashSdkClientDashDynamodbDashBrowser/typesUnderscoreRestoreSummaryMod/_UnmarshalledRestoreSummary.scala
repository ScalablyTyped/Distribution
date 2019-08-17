package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreRestoreSummaryMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledRestoreSummary extends _RestoreSummary {
  /**
    * <p>Point in time or source backup time.</p>
    */
  @JSName("RestoreDateTime")
  var RestoreDateTime__UnmarshalledRestoreSummary: Date
}

object _UnmarshalledRestoreSummary {
  @scala.inline
  def apply(
    RestoreDateTime: Date,
    RestoreInProgress: Boolean,
    SourceBackupArn: String = null,
    SourceTableArn: String = null
  ): _UnmarshalledRestoreSummary = {
    val __obj = js.Dynamic.literal(RestoreDateTime = RestoreDateTime, RestoreInProgress = RestoreInProgress)
    if (SourceBackupArn != null) __obj.updateDynamic("SourceBackupArn")(SourceBackupArn)
    if (SourceTableArn != null) __obj.updateDynamic("SourceTableArn")(SourceTableArn)
    __obj.asInstanceOf[_UnmarshalledRestoreSummary]
  }
}

