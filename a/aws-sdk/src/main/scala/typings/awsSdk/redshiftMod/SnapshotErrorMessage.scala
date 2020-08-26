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
  def apply(): SnapshotErrorMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotErrorMessage]
  }
  @scala.inline
  implicit class SnapshotErrorMessageOps[Self <: SnapshotErrorMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFailureCode(value: String): Self = this.set("FailureCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureCode: Self = this.set("FailureCode", js.undefined)
    @scala.inline
    def setFailureReason(value: String): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
    @scala.inline
    def setSnapshotClusterIdentifier(value: String): Self = this.set("SnapshotClusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotClusterIdentifier: Self = this.set("SnapshotClusterIdentifier", js.undefined)
    @scala.inline
    def setSnapshotIdentifier(value: String): Self = this.set("SnapshotIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotIdentifier: Self = this.set("SnapshotIdentifier", js.undefined)
  }
  
}

