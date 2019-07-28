package typings.bumpDashRegex.bumpDashRegexMod

import typings.bumpDashRegex.bumpDashRegexStrings.major
import typings.bumpDashRegex.bumpDashRegexStrings.minor
import typings.bumpDashRegex.bumpDashRegexStrings.patch
import typings.bumpDashRegex.bumpDashRegexStrings.prerelease
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var `case`: js.UndefOr[Boolean] = js.undefined
  var global: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var keys: js.UndefOr[js.Array[String]] = js.undefined
  var preid: js.UndefOr[String] = js.undefined
  var regex: js.UndefOr[RegExp] = js.undefined
  var str: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[major | minor | patch | prerelease] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    `case`: js.UndefOr[Boolean] = js.undefined,
    global: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    keys: js.Array[String] = null,
    preid: String = null,
    regex: RegExp = null,
    str: String = null,
    `type`: major | minor | patch | prerelease = null,
    version: String = null
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

