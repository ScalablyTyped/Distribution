package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WalkContext extends js.Object {
  var atrule: Atrule
  var atrulePrelude: AtrulePrelude
  var block: Block
  var declaration: Declaration
  var function: FunctionNode | PseudoClassSelector | PseudoElementSelector
  var root: CssNode
  var rule: Rule
  var selector: SelectorList
  var stylesheet: StyleSheet
}

object WalkContext {
  @scala.inline
  def apply(
    atrule: Atrule,
    atrulePrelude: AtrulePrelude,
    block: Block,
    declaration: Declaration,
    function: FunctionNode | PseudoClassSelector | PseudoElementSelector,
    root: CssNode,
    rule: Rule,
    selector: SelectorList,
    stylesheet: StyleSheet
  ): WalkContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("atrule")(atrule)
    __obj.updateDynamic("atrulePrelude")(atrulePrelude)
    __obj.updateDynamic("block")(block)
    __obj.updateDynamic("declaration")(declaration)
    __obj.updateDynamic("function")(function.asInstanceOf[js.Any])
    __obj.updateDynamic("root")(root)
    __obj.updateDynamic("rule")(rule)
    __obj.updateDynamic("selector")(selector)
    __obj.updateDynamic("stylesheet")(stylesheet)
    __obj.asInstanceOf[WalkContext]
  }
}

