package typings.commonDashErrors

import typings.commonDashErrors.commonDashErrorsMod.Error
import typings.commonDashErrors.commonDashErrorsMod.GenerateMessageMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.undefined
  var `extends`: js.UndefOr[Error] = js.undefined
  var generateMessage: js.UndefOr[GenerateMessageMethod] = js.undefined
  var globalize: js.UndefOr[Boolean] = js.undefined
}

object Anon_Args {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    `extends`: Error = null,
    generateMessage: GenerateMessageMethod = null,
    globalize: js.UndefOr[Boolean] = js.undefined
  ): Anon_Args = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`)
    if (generateMessage != null) __obj.updateDynamic("generateMessage")(generateMessage)
    if (!js.isUndefined(globalize)) __obj.updateDynamic("globalize")(globalize)
    __obj.asInstanceOf[Anon_Args]
  }
}

