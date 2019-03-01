package typings
package atBabelParserLib.atBabelParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecoratorsPluginOptions extends js.Object {
  var decoratorsBeforeExport: js.UndefOr[scala.Boolean] = js.undefined
}

object DecoratorsPluginOptions {
  @scala.inline
  def apply(decoratorsBeforeExport: js.UndefOr[scala.Boolean] = js.undefined): DecoratorsPluginOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decoratorsBeforeExport)) __obj.updateDynamic("decoratorsBeforeExport")(decoratorsBeforeExport)
    __obj.asInstanceOf[DecoratorsPluginOptions]
  }
}

