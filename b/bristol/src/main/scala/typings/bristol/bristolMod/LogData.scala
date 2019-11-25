package typings.bristol.bristolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogData extends js.Object {
  var code: js.UndefOr[Double] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var error: js.UndefOr[LogError] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object LogData {
  @scala.inline
  def apply(
    code: Int | Double = null,
    data: js.Any = null,
    error: LogError = null,
    id: String = null,
    path: String = null
  ): LogData = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogData]
  }
}

