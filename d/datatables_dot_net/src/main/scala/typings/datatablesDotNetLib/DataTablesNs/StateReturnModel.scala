package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateReturnModel extends js.Object {
  var columns: js.Array[StateReturnModelColumns]
  var length: scala.Double
  var order: js.Array[js.Array[java.lang.String | scala.Double]]
  var search: SearchSettings
  var start: scala.Double
  var time: scala.Double
}

object StateReturnModel {
  @scala.inline
  def apply(
    columns: js.Array[StateReturnModelColumns],
    length: scala.Double,
    order: js.Array[js.Array[java.lang.String | scala.Double]],
    search: SearchSettings,
    start: scala.Double,
    time: scala.Double
  ): StateReturnModel = {
    val __obj = js.Dynamic.literal(columns = columns, length = length, order = order, search = search, start = start, time = time)
  
    __obj.asInstanceOf[StateReturnModel]
  }
}

