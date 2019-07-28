package typings.cqrsDashDomain.cqrsDashDomainMod

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
  def apply(name: String = null, payload: String = null, version: Int | Double = null): DefineEventOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineEventOptions]
  }
}

