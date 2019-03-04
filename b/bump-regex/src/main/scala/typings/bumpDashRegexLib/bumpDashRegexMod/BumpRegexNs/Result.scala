package typings
package bumpDashRegexLib.bumpDashRegexMod.BumpRegexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends Options {
  var `new`: java.lang.String
  var prev: java.lang.String
}

object Result {
  @scala.inline
  def apply(
    `new`: java.lang.String,
    prev: java.lang.String,
    `case`: js.UndefOr[scala.Boolean] = js.undefined,
    global: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    keys: js.Array[java.lang.String] = null,
    preid: java.lang.String = null,
    regex: stdLib.RegExp = null,
    str: java.lang.String = null,
    `type`: bumpDashRegexLib.bumpDashRegexLibStrings.major | bumpDashRegexLib.bumpDashRegexLibStrings.minor | bumpDashRegexLib.bumpDashRegexLibStrings.patch | bumpDashRegexLib.bumpDashRegexLibStrings.prerelease = null,
    version: java.lang.String = null
  ): Result = {
    val __obj = js.Dynamic.literal(prev = prev)
    __obj.updateDynamic("new")(`new`)
    if (!js.isUndefined(`case`)) __obj.updateDynamic("case")(`case`)
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    if (key != null) __obj.updateDynamic("key")(key)
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (preid != null) __obj.updateDynamic("preid")(preid)
    if (regex != null) __obj.updateDynamic("regex")(regex)
    if (str != null) __obj.updateDynamic("str")(str)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Result]
  }
}

