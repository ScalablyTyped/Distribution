package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterDbRevisionsMessage extends js.Object {
  /**
    * A list of revisions.
    */
  var ClusterDbRevisions: js.UndefOr[ClusterDbRevisionsList] = js.native
  /**
    * A string representing the starting point for the next set of revisions. If a value is returned in a response, you can retrieve the next set of revisions by providing the value in the marker parameter and retrying the command. If the marker field is empty, all revisions have already been returned.
    */
  var Marker: js.UndefOr[String] = js.native
}

object ClusterDbRevisionsMessage {
  @scala.inline
  def apply(ClusterDbRevisions: ClusterDbRevisionsList = null, Marker: String = null): ClusterDbRevisionsMessage = {
    val __obj = js.Dynamic.literal()
    if (ClusterDbRevisions != null) __obj.updateDynamic("ClusterDbRevisions")(ClusterDbRevisions.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterDbRevisionsMessage]
  }
}

