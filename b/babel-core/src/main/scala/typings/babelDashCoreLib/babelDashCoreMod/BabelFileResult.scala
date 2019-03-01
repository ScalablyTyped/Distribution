package typings
package babelDashCoreLib.babelDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BabelFileResult extends js.Object {
  var ast: js.UndefOr[Node] = js.undefined
  var code: js.UndefOr[java.lang.String] = js.undefined
  var ignored: js.UndefOr[scala.Boolean] = js.undefined
  var map: js.UndefOr[js.Object] = js.undefined
  var metadata: js.UndefOr[BabelFileMetadata] = js.undefined
}

object BabelFileResult {
  @scala.inline
  def apply(
    ast: Node = null,
    code: java.lang.String = null,
    ignored: js.UndefOr[scala.Boolean] = js.undefined,
    map: js.Object = null,
    metadata: BabelFileMetadata = null
  ): BabelFileResult = {
    val __obj = js.Dynamic.literal()
    if (ast != null) __obj.updateDynamic("ast")(ast)
    if (code != null) __obj.updateDynamic("code")(code)
    if (!js.isUndefined(ignored)) __obj.updateDynamic("ignored")(ignored)
    if (map != null) __obj.updateDynamic("map")(map)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[BabelFileResult]
  }
}

