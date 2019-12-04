package typings.babelDashPluginDashMacros.babelDashPluginDashMacrosMod

import typings.babelDashPluginDashMacros.Anon_Default
import typings.babelDashPluginDashMacros.TypeofBabel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MacroParams extends js.Object {
  var babel: TypeofBabel
  var references: Anon_Default with References
  var state: js.Any
}

object MacroParams {
  @scala.inline
  def apply(babel: TypeofBabel, references: Anon_Default with References, state: js.Any): MacroParams = {
    val __obj = js.Dynamic.literal(babel = babel.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MacroParams]
  }
}

