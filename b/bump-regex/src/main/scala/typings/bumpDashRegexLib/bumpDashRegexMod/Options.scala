package typings
package bumpDashRegexLib.bumpDashRegexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var `case`: js.UndefOr[scala.Boolean] = js.undefined
  var global: js.UndefOr[scala.Boolean] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var keys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var preid: js.UndefOr[java.lang.String] = js.undefined
  var regex: js.UndefOr[stdLib.RegExp] = js.undefined
  var str: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[
    bumpDashRegexLib.bumpDashRegexLibStrings.major | bumpDashRegexLib.bumpDashRegexLibStrings.minor | bumpDashRegexLib.bumpDashRegexLibStrings.patch | bumpDashRegexLib.bumpDashRegexLibStrings.prerelease
  ] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    `case`: js.UndefOr[scala.Boolean] = js.undefined,
    global: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    keys: js.Array[java.lang.String] = null,
    preid: java.lang.String = null,
    regex: stdLib.RegExp = null,
    str: java.lang.String = null,
    `type`: bumpDashRegexLib.bumpDashRegexLibStrings.major | bumpDashRegexLib.bumpDashRegexLibStrings.minor | bumpDashRegexLib.bumpDashRegexLibStrings.patch | bumpDashRegexLib.bumpDashRegexLibStrings.prerelease = null,
    version: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`case`)) __obj.updateDynamic("case")(`case`)
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    if (key != null) __obj.updateDynamic("key")(key)
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (preid != null) __obj.updateDynamic("preid")(preid)
    if (regex != null) __obj.updateDynamic("regex")(regex)
    if (str != null) __obj.updateDynamic("str")(str)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Options]
  }
}

