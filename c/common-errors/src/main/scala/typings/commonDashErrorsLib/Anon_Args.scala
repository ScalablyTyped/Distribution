package typings
package commonDashErrorsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var `extends`: js.UndefOr[commonDashErrorsLib.commonDashErrorsMod.Error] = js.undefined
  var generateMessage: js.UndefOr[commonDashErrorsLib.commonDashErrorsMod.GenerateMessageMethod] = js.undefined
  var globalize: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Args {
  @scala.inline
  def apply(
    args: js.Array[java.lang.String] = null,
    `extends`: commonDashErrorsLib.commonDashErrorsMod.Error = null,
    generateMessage: commonDashErrorsLib.commonDashErrorsMod.GenerateMessageMethod = null,
    globalize: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Args = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`)
    if (generateMessage != null) __obj.updateDynamic("generateMessage")(generateMessage)
    if (!js.isUndefined(globalize)) __obj.updateDynamic("globalize")(globalize)
    __obj.asInstanceOf[Anon_Args]
  }
}

