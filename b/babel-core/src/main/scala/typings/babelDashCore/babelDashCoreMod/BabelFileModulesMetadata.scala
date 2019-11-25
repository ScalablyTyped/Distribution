package typings.babelDashCore.babelDashCoreMod

import typings.babelDashCore.Anon_Exported
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BabelFileModulesMetadata extends js.Object {
  var exports: Anon_Exported
  var imports: js.Array[js.Object]
}

object BabelFileModulesMetadata {
  @scala.inline
  def apply(exports: Anon_Exported, imports: js.Array[js.Object]): BabelFileModulesMetadata = {
    val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BabelFileModulesMetadata]
  }
}

