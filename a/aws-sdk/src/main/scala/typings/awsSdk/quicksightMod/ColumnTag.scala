package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnTag extends js.Object {
  /**
    * A geospatial role for a column.
    */
  var ColumnGeographicRole: js.UndefOr[GeoSpatialDataRole] = js.native
}

object ColumnTag {
  @scala.inline
  def apply(): ColumnTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnTag]
  }
  @scala.inline
  implicit class ColumnTagOps[Self <: ColumnTag] (val x: Self) extends AnyVal {
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
    def setColumnGeographicRole(value: GeoSpatialDataRole): Self = this.set("ColumnGeographicRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnGeographicRole: Self = this.set("ColumnGeographicRole", js.undefined)
  }
  
}

