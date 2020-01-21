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
  def apply(ColumnGeographicRole: GeoSpatialDataRole = null): ColumnTag = {
    val __obj = js.Dynamic.literal()
    if (ColumnGeographicRole != null) __obj.updateDynamic("ColumnGeographicRole")(ColumnGeographicRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnTag]
  }
}

