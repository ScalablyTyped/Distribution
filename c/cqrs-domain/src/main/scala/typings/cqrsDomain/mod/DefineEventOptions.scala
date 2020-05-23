package typings.cqrsDomain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// endregion
// region defineEvent
trait DefineEventOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var payload: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object DefineEventOptions {
  @scala.inline
  def apply(name: String = null, payload: String = null, version: js.UndefOr[Double] = js.undefined): DefineEventOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineEventOptions]
  }
}

