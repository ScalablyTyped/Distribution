package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableRestoreStatusMessage extends js.Object {
  /**
    * A pagination token that can be used in a subsequent DescribeTableRestoreStatus request.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * A list of status details for one or more table restore requests.
    */
  var TableRestoreStatusDetails: js.UndefOr[TableRestoreStatusList] = js.native
}

object TableRestoreStatusMessage {
  @scala.inline
  def apply(): TableRestoreStatusMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRestoreStatusMessage]
  }
  @scala.inline
  implicit class TableRestoreStatusMessageOps[Self <: TableRestoreStatusMessage] (val x: Self) extends AnyVal {
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
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setTableRestoreStatusDetailsVarargs(value: TableRestoreStatus*): Self = this.set("TableRestoreStatusDetails", js.Array(value :_*))
    @scala.inline
    def setTableRestoreStatusDetails(value: TableRestoreStatusList): Self = this.set("TableRestoreStatusDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableRestoreStatusDetails: Self = this.set("TableRestoreStatusDetails", js.undefined)
  }
  
}

