package typings
package cpyLib.cpyMod.cpyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CpyOptions extends js.Object {
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var parents: js.UndefOr[scala.Boolean] = js.undefined
  var rename: js.UndefOr[
    java.lang.String | (js.Function1[/* basename */ java.lang.String, java.lang.String])
  ] = js.undefined
}

object CpyOptions {
  @scala.inline
  def apply(
    cwd: java.lang.String = null,
    parents: js.UndefOr[scala.Boolean] = js.undefined,
    rename: java.lang.String | (js.Function1[/* basename */ java.lang.String, java.lang.String]) = null
  ): CpyOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(parents)) __obj.updateDynamic("parents")(parents)
    if (rename != null) __obj.updateDynamic("rename")(rename.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpyOptions]
  }
}

