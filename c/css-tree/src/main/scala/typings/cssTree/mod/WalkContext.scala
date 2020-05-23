package typings.cssTree.mod

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
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any], atrule = atrule.asInstanceOf[js.Any], atrulePrelude = atrulePrelude.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], declaration = declaration.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], stylesheet = stylesheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalkContext]
  }
}

