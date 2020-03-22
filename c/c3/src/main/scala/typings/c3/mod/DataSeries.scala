package typings.c3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSeries extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var id_org: js.UndefOr[String] = js.undefined
  var values: js.Array[DataPoint]
}

object DataSeries {
  @scala.inline
  def apply(values: js.Array[DataPoint], id: String = null, id_org: String = null): DataSeries = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (id_org != null) __obj.updateDynamic("id_org")(id_org.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSeries]
  }
}

