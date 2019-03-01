package typings
package dargsLib.dargsMod.dargsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var aliases: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var allowCamelCase: js.UndefOr[scala.Boolean] = js.undefined
  var excludes: js.UndefOr[js.Array[java.lang.String | stdLib.RegExp]] = js.undefined
  var ignoreFalse: js.UndefOr[scala.Boolean] = js.undefined
  var includes: js.UndefOr[js.Array[java.lang.String | stdLib.RegExp]] = js.undefined
  var useEquals: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    aliases: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    allowCamelCase: js.UndefOr[scala.Boolean] = js.undefined,
    excludes: js.Array[java.lang.String | stdLib.RegExp] = null,
    ignoreFalse: js.UndefOr[scala.Boolean] = js.undefined,
    includes: js.Array[java.lang.String | stdLib.RegExp] = null,
    useEquals: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (aliases != null) __obj.updateDynamic("aliases")(aliases)
    if (!js.isUndefined(allowCamelCase)) __obj.updateDynamic("allowCamelCase")(allowCamelCase)
    if (excludes != null) __obj.updateDynamic("excludes")(excludes)
    if (!js.isUndefined(ignoreFalse)) __obj.updateDynamic("ignoreFalse")(ignoreFalse)
    if (includes != null) __obj.updateDynamic("includes")(includes)
    if (!js.isUndefined(useEquals)) __obj.updateDynamic("useEquals")(useEquals)
    __obj.asInstanceOf[Options]
  }
}

