package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProfilerMoreRowsNotificationParams extends js.Object {
  var data: IProfilerTableRow
  var rowCount: Double
  var uri: String
}

object IProfilerMoreRowsNotificationParams {
  @scala.inline
  def apply(data: IProfilerTableRow, rowCount: Double, uri: String): IProfilerMoreRowsNotificationParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProfilerMoreRowsNotificationParams]
  }
}

