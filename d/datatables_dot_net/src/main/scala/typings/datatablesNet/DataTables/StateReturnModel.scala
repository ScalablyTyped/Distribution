package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateReturnModel extends js.Object {
  var columns: js.Array[StateReturnModelColumns]
  var length: Double
  var order: js.Array[js.Array[String | Double]]
  var search: SearchSettings
  var start: Double
  var time: Double
}

object StateReturnModel {
  @scala.inline
  def apply(
    columns: js.Array[StateReturnModelColumns],
    length: Double,
    order: js.Array[js.Array[String | Double]],
    search: SearchSettings,
    start: Double,
    time: Double
  ): StateReturnModel = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateReturnModel]
  }
}

