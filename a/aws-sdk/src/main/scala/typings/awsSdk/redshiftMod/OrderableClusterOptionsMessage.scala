package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderableClusterOptionsMessage extends js.Object {
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * An OrderableClusterOption structure containing information about orderable options for the cluster.
    */
  var OrderableClusterOptions: js.UndefOr[OrderableClusterOptionsList] = js.native
}

object OrderableClusterOptionsMessage {
  @scala.inline
  def apply(Marker: String = null, OrderableClusterOptions: OrderableClusterOptionsList = null): OrderableClusterOptionsMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (OrderableClusterOptions != null) __obj.updateDynamic("OrderableClusterOptions")(OrderableClusterOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderableClusterOptionsMessage]
  }
}

