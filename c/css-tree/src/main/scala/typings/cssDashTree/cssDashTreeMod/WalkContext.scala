package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WalkContext extends js.Object {
  var atrule: Atrule | Null
  var atrulePrelude: AtrulePrelude | Null
  var block: Block | Null
  var declaration: Declaration | Null
  var function: FunctionNode | PseudoClassSelector | PseudoElementSelector | Null
  var root: CssNode
  var rule: Rule | Null
  var selector: SelectorList | Null
  var stylesheet: StyleSheet | Null
}

object WalkContext {
  @scala.inline
  def apply(
    root: CssNode,
    atrule: Atrule = null,
    atrulePrelude: AtrulePrelude = null,
    block: Block = null,
    declaration: Declaration = null,
    function: FunctionNode | PseudoClassSelector | PseudoElementSelector = null,
    rule: Rule = null,
    selector: SelectorList = null,
    stylesheet: StyleSheet = null
  ): WalkContext = {
    val __obj = js.Dynamic.literal(root = root)
    if (atrule != null) __obj.updateDynamic("atrule")(atrule)
    if (atrulePrelude != null) __obj.updateDynamic("atrulePrelude")(atrulePrelude)
    if (block != null) __obj.updateDynamic("block")(block)
    if (declaration != null) __obj.updateDynamic("declaration")(declaration)
    if (function != null) __obj.updateDynamic("function")(function.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    if (stylesheet != null) __obj.updateDynamic("stylesheet")(stylesheet)
    __obj.asInstanceOf[WalkContext]
  }
}

