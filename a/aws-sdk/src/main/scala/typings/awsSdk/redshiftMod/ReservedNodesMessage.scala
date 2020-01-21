package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservedNodesMessage extends js.Object {
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The list of ReservedNode objects.
    */
  var ReservedNodes: js.UndefOr[ReservedNodeList] = js.native
}

object ReservedNodesMessage {
  @scala.inline
  def apply(Marker: String = null, ReservedNodes: ReservedNodeList = null): ReservedNodesMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (ReservedNodes != null) __obj.updateDynamic("ReservedNodes")(ReservedNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReservedNodesMessage]
  }
}

