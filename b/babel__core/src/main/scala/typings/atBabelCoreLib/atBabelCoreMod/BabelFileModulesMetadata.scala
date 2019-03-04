package typings
package atBabelCoreLib.atBabelCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BabelFileModulesMetadata extends js.Object {
  var exports: atBabelCoreLib.Anon_Exported
  var imports: js.Array[js.Object]
}

object BabelFileModulesMetadata {
  @scala.inline
  def apply(exports: atBabelCoreLib.Anon_Exported, imports: js.Array[js.Object]): BabelFileModulesMetadata = {
    val __obj = js.Dynamic.literal(exports = exports, imports = imports)
  
    __obj.asInstanceOf[BabelFileModulesMetadata]
  }
}

