package typings.bumpDashRegex.bumpDashRegexMod

import typings.bumpDashRegex.bumpDashRegexStrings.major
import typings.bumpDashRegex.bumpDashRegexStrings.minor
import typings.bumpDashRegex.bumpDashRegexStrings.patch
import typings.bumpDashRegex.bumpDashRegexStrings.prerelease
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends Options {
  var `new`: String
  var prev: String
}

object Result {
  @scala.inline
  def apply(
    `new`: String,
    prev: String,
    `case`: js.UndefOr[Boolean] = js.undefined,
    global: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    keys: js.Array[String] = null,
    preid: String = null,
    regex: RegExp = null,
    str: String = null,
    `type`: major | minor | patch | prerelease = null,
    version: String = null
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

