package typings.cqrsDomain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// endregion
// region defineCommand
trait DefineCommandOptions extends js.Object {
  var existing: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var payload: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object DefineCommandOptions {
  @scala.inline
  def apply(
    existing: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    payload: String = null,
    version: Int | Double = null
  ): DefineCommandOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(existing)) __obj.updateDynamic("existing")(existing.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineCommandOptions]
  }
}

