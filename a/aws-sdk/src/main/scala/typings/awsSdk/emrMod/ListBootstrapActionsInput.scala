package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBootstrapActionsInput extends js.Object {
  /**
    * The cluster identifier for the bootstrap actions to list.
    */
  var ClusterId: typings.awsSdk.emrMod.ClusterId = js.native
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsSdk.emrMod.Marker] = js.native
}

object ListBootstrapActionsInput {
  @scala.inline
  def apply(ClusterId: ClusterId, Marker: Marker = null): ListBootstrapActionsInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBootstrapActionsInput]
  }
}

