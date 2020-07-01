package typings.babelCore.mod

import typings.babelTraverse.mod.Hub
import typings.babelTraverse.mod.Scope
import typings.babelTypes.mod.File_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BabelFile extends js.Object {
  var ast: File_
  var code: String
  var hub: Hub
  var inputMap: js.Object | Null
  var metadata: js.Object
  var opts: TransformOptions
  var path: typings.babelTraverse.mod.NodePath[typings.babelTraverse.mod.Node]
  var scope: Scope
}

object BabelFile {
  @scala.inline
  def apply(
    ast: File_,
    code: String,
    hub: Hub,
    metadata: js.Object,
    opts: TransformOptions,
    path: typings.babelTraverse.mod.NodePath[typings.babelTraverse.mod.Node],
    scope: Scope,
    inputMap: js.Object = null
  ): BabelFile = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], hub = hub.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], inputMap = inputMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[BabelFile]
  }
}

