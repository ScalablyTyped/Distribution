package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotErrorMessage extends js.Object {
  /**
    * The failure code for the error.
    */
  var FailureCode: js.UndefOr[String] = js.native
  /**
    * The text message describing the error.
    */
  var FailureReason: js.UndefOr[String] = js.native
  /**
    * A unique identifier for the cluster.
    */
  var SnapshotClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * A unique identifier for the snapshot returning the error.
    */
  var SnapshotIdentifier: js.UndefOr[String] = js.native
}

object SnapshotErrorMessage {
  @scala.inline
  def apply(
    FailureCode: String = null,
    FailureReason: String = null,
    SnapshotClusterIdentifier: String = null,
    SnapshotIdentifier: String = null
  ): SnapshotErrorMessage = {
    val __obj = js.Dynamic.literal()
    if (FailureCode != null) __obj.updateDynamic("FailureCode")(FailureCode.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (SnapshotClusterIdentifier != null) __obj.updateDynamic("SnapshotClusterIdentifier")(SnapshotClusterIdentifier.asInstanceOf[js.Any])
    if (SnapshotIdentifier != null) __obj.updateDynamic("SnapshotIdentifier")(SnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotErrorMessage]
  }
}

