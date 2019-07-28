package typings.cfb.cfbMod

import typings.cfb.cfbStrings.array
import typings.cfb.cfbStrings.base64
import typings.cfb.cfbStrings.binary
import typings.cfb.cfbStrings.buffer
import typings.cfb.cfbStrings.file
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CFB$CommonOptions extends js.Object {
  /** If true, throw errors when features are not understood */
  var WTF: js.UndefOr[Boolean] = js.undefined
  /** Input data encoding */
  var `type`: js.UndefOr[base64 | binary | buffer | file | array] = js.undefined
}

object CFB$CommonOptions {
  @scala.inline
  def apply(WTF: js.UndefOr[Boolean] = js.undefined, `type`: base64 | binary | buffer | file | array = null): CFB$CommonOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(WTF)) __obj.updateDynamic("WTF")(WTF)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CFB$CommonOptions]
  }
}

