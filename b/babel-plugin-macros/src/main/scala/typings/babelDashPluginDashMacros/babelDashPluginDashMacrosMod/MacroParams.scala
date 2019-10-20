package typings.babelDashPluginDashMacros.babelDashPluginDashMacrosMod

import typings.babelDashPluginDashMacros.Anon_Default
import typings.babelDashPluginDashMacros.References
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
    val __obj = js.Dynamic.literal(babel = babel, references = references, state = state)
  
    __obj.asInstanceOf[MacroParams]
  }
}

