package typings.babelCore.mod

import typings.babelCore.anon.Exported
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BabelFileModulesMetadata extends js.Object {
  var exports: Exported
  var imports: js.Array[js.Object]
}

object BabelFileModulesMetadata {
  @scala.inline
  def apply(exports: Exported, imports: js.Array[js.Object]): BabelFileModulesMetadata = {
    val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any])
    __obj.asInstanceOf[BabelFileModulesMetadata]
  }
}

