package typings
package cqrsDashDomainLib.cqrsDashDomainMod.DomainNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// endregion
// region defineEvent
trait DefineEventOptions extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var payload: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[scala.Double] = js.undefined
}

object DefineEventOptions {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    payload: java.lang.String = null,
    version: scala.Int | scala.Double = null
  ): DefineEventOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineEventOptions]
  }
}

