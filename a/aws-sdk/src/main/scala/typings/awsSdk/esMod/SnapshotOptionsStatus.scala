package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotOptionsStatus extends js.Object {
  /**
    * Specifies the daily snapshot options specified for the Elasticsearch domain.
    */
  var Options: SnapshotOptions = js.native
  /**
    * Specifies the status of a daily automated snapshot.
    */
  var Status: OptionStatus = js.native
}

object SnapshotOptionsStatus {
  @scala.inline
  def apply(Options: SnapshotOptions, Status: OptionStatus): SnapshotOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotOptionsStatus]
  }
}

