package typings.babelPluginMacros.mod

import typings.babelPluginMacros.anon.TypeofBabel
import typings.babelPluginMacros.anon.defaultArrayNodePathNodeR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MacroParams extends js.Object {
  var babel: TypeofBabel
  var references: defaultArrayNodePathNodeR
  var state: js.Any
}

object MacroParams {
  @scala.inline
  def apply(babel: TypeofBabel, references: defaultArrayNodePathNodeR, state: js.Any): MacroParams = {
    val __obj = js.Dynamic.literal(babel = babel.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacroParams]
  }
}

