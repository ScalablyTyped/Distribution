package typings.commonErrors.anon

import typings.commonErrors.mod.Error
import typings.commonErrors.mod.GenerateMessageMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Args extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.undefined
  var `extends`: js.UndefOr[Error] = js.undefined
  var generateMessage: js.UndefOr[GenerateMessageMethod] = js.undefined
  var globalize: js.UndefOr[Boolean] = js.undefined
}

object Args {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    `extends`: Error = null,
    generateMessage: () => String = null,
    globalize: js.UndefOr[Boolean] = js.undefined
  ): Args = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (generateMessage != null) __obj.updateDynamic("generateMessage")(js.Any.fromFunction0(generateMessage))
    if (!js.isUndefined(globalize)) __obj.updateDynamic("globalize")(globalize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
}

