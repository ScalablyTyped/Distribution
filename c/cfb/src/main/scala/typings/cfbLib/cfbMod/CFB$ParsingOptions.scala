package typings
package cfbLib.cfbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CFB$ParsingOptions extends CFB$CommonOptions {
  /** If true, include raw data in output */
  var raw: js.UndefOr[scala.Boolean] = js.undefined
}

object CFB$ParsingOptions {
  @scala.inline
  def apply(
    WTF: js.UndefOr[scala.Boolean] = js.undefined,
    raw: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: cfbLib.cfbLibStrings.base64 | cfbLib.cfbLibStrings.binary | cfbLib.cfbLibStrings.buffer | cfbLib.cfbLibStrings.file | cfbLib.cfbLibStrings.array = null
  ): CFB$ParsingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(WTF)) __obj.updateDynamic("WTF")(WTF)
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CFB$ParsingOptions]
  }
}

