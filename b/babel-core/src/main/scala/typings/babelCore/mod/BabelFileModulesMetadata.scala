package typings.babelCore.mod

import typings.babelCore.AnonExported
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BabelFileModulesMetadata extends js.Object {
  var exports: AnonExported
  var imports: js.Array[js.Object]
}

object BabelFileModulesMetadata {
  @scala.inline
  def apply(exports: AnonExported, imports: js.Array[js.Object]): BabelFileModulesMetadata = {
    val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any])
    __obj.asInstanceOf[BabelFileModulesMetadata]
  }
}

