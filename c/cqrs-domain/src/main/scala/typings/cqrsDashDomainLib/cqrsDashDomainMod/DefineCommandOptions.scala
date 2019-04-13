package typings
package cqrsDashDomainLib.cqrsDashDomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// endregion
// region defineCommand
trait DefineCommandOptions extends js.Object {
  var existing: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var payload: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[scala.Double] = js.undefined
}

object DefineCommandOptions {
  @scala.inline
  def apply(
    existing: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    payload: java.lang.String = null,
    version: scala.Int | scala.Double = null
  ): DefineCommandOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(existing)) __obj.updateDynamic("existing")(existing)
    if (name != null) __obj.updateDynamic("name")(name)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineCommandOptions]
  }
}

