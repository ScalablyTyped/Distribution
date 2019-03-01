package typings
package cfbLib.cfbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CFB$WritingOptions extends CFB$CommonOptions {
  /** Enable compression (ZIP only) */
  var compression: js.UndefOr[scala.Boolean] = js.undefined
  /** Output file type */
  var fileType: js.UndefOr[cfbLib.cfbLibStrings.cfb | cfbLib.cfbLibStrings.zip] = js.undefined
  /** Override default root entry name (CFB only) */
  var root: js.UndefOr[java.lang.String] = js.undefined
}

object CFB$WritingOptions {
  @scala.inline
  def apply(
    WTF: js.UndefOr[scala.Boolean] = js.undefined,
    compression: js.UndefOr[scala.Boolean] = js.undefined,
    fileType: cfbLib.cfbLibStrings.cfb | cfbLib.cfbLibStrings.zip = null,
    root: java.lang.String = null,
    `type`: cfbLib.cfbLibStrings.base64 | cfbLib.cfbLibStrings.binary | cfbLib.cfbLibStrings.buffer | cfbLib.cfbLibStrings.file | cfbLib.cfbLibStrings.array = null
  ): CFB$WritingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(WTF)) __obj.updateDynamic("WTF")(WTF)
    if (!js.isUndefined(compression)) __obj.updateDynamic("compression")(compression)
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CFB$WritingOptions]
  }
}

