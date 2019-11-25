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
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    if (atrule != null) __obj.updateDynamic("atrule")(atrule.asInstanceOf[js.Any])
    if (atrulePrelude != null) __obj.updateDynamic("atrulePrelude")(atrulePrelude.asInstanceOf[js.Any])
    if (block != null) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (declaration != null) __obj.updateDynamic("declaration")(declaration.asInstanceOf[js.Any])
    if (function != null) __obj.updateDynamic("function")(function.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (stylesheet != null) __obj.updateDynamic("stylesheet")(stylesheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalkContext]
  }
}

