package typings
package babelDashCoreLib.babelDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BabelFileModulesMetadata extends js.Object {
  var exports: babelDashCoreLib.Anon_Exported
  var imports: js.Array[js.Object]
}

object BabelFileModulesMetadata {
  @scala.inline
  def apply(exports: babelDashCoreLib.Anon_Exported, imports: js.Array[js.Object]): BabelFileModulesMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exports")(exports)
    __obj.updateDynamic("imports")(imports)
    __obj.asInstanceOf[BabelFileModulesMetadata]
  }
}

