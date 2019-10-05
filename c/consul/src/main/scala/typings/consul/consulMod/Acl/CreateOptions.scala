package typings.consul.consulMod.Acl

import typings.consul.consulMod.CommonOptions
import typings.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOptions extends CommonOptions {
  var name: js.UndefOr[String] = js.undefined
  var rules: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object CreateOptions {
  @scala.inline
  def apply(
    consistent: js.UndefOr[Boolean] = js.undefined,
    ctx: EventEmitter = null,
    dc: String = null,
    name: String = null,
    rules: String = null,
    stale: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    token: String = null,
    `type`: String = null,
    wait: String = null,
    wan: js.UndefOr[Boolean] = js.undefined
  ): CreateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(consistent)) __obj.updateDynamic("consistent")(consistent)
    if (ctx != null) __obj.updateDynamic("ctx")(ctx)
    if (dc != null) __obj.updateDynamic("dc")(dc)
    if (name != null) __obj.updateDynamic("name")(name)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    if (!js.isUndefined(stale)) __obj.updateDynamic("stale")(stale)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (wait != null) __obj.updateDynamic("wait")(wait)
    if (!js.isUndefined(wan)) __obj.updateDynamic("wan")(wan)
    __obj.asInstanceOf[CreateOptions]
  }
}

