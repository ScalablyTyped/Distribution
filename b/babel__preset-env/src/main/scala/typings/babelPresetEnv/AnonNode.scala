package typings.babelPresetEnv

import typings.babelPresetEnv.babelPresetEnvBooleans.`true`
import typings.babelPresetEnv.babelPresetEnvStrings.current
import typings.babelPresetEnv.mod._TargetsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNode extends _TargetsOptions {
  var node: String | current | `true`
}

object AnonNode {
  @scala.inline
  def apply(node: String | current | `true`): AnonNode = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNode]
  }
}

