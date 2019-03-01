package typings
package copyDashWebpackDashPluginLib.copyDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiniMatchGlob
  extends minimatchLib.minimatchMod.MNs.IOptions {
  var glob: java.lang.String
}

object MiniMatchGlob {
  @scala.inline
  def apply(
    glob: java.lang.String,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    dot: js.UndefOr[scala.Boolean] = js.undefined,
    flipNegate: js.UndefOr[scala.Boolean] = js.undefined,
    matchBase: js.UndefOr[scala.Boolean] = js.undefined,
    nobrace: js.UndefOr[scala.Boolean] = js.undefined,
    nocase: js.UndefOr[scala.Boolean] = js.undefined,
    nocomment: js.UndefOr[scala.Boolean] = js.undefined,
    noext: js.UndefOr[scala.Boolean] = js.undefined,
    noglobstar: js.UndefOr[scala.Boolean] = js.undefined,
    nonegate: js.UndefOr[scala.Boolean] = js.undefined,
    nonull: js.UndefOr[scala.Boolean] = js.undefined
  ): MiniMatchGlob = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("glob")(glob)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot)
    if (!js.isUndefined(flipNegate)) __obj.updateDynamic("flipNegate")(flipNegate)
    if (!js.isUndefined(matchBase)) __obj.updateDynamic("matchBase")(matchBase)
    if (!js.isUndefined(nobrace)) __obj.updateDynamic("nobrace")(nobrace)
    if (!js.isUndefined(nocase)) __obj.updateDynamic("nocase")(nocase)
    if (!js.isUndefined(nocomment)) __obj.updateDynamic("nocomment")(nocomment)
    if (!js.isUndefined(noext)) __obj.updateDynamic("noext")(noext)
    if (!js.isUndefined(noglobstar)) __obj.updateDynamic("noglobstar")(noglobstar)
    if (!js.isUndefined(nonegate)) __obj.updateDynamic("nonegate")(nonegate)
    if (!js.isUndefined(nonull)) __obj.updateDynamic("nonull")(nonull)
    __obj.asInstanceOf[MiniMatchGlob]
  }
}

