package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WalkContext extends js.Object {
  var atrule: Atrule | Null = js.native
  var atrulePrelude: AtrulePrelude | Null = js.native
  var block: Block | Null = js.native
  var declaration: Declaration | Null = js.native
  var function: FunctionNode | PseudoClassSelector | PseudoElementSelector | Null = js.native
  var root: CssNode = js.native
  var rule: Rule | Null = js.native
  var selector: SelectorList | Null = js.native
  var stylesheet: StyleSheet | Null = js.native
}

object WalkContext {
  @scala.inline
  def apply(root: CssNode): WalkContext = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalkContext]
  }
  @scala.inline
  implicit class WalkContextOps[Self <: WalkContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRoot(value: CssNode): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def setAtrule(value: Atrule): Self = this.set("atrule", value.asInstanceOf[js.Any])
    @scala.inline
    def setAtruleNull: Self = this.set("atrule", null)
    @scala.inline
    def setAtrulePrelude(value: AtrulePrelude): Self = this.set("atrulePrelude", value.asInstanceOf[js.Any])
    @scala.inline
    def setAtrulePreludeNull: Self = this.set("atrulePrelude", null)
    @scala.inline
    def setBlock(value: Block): Self = this.set("block", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlockNull: Self = this.set("block", null)
    @scala.inline
    def setDeclaration(value: Declaration): Self = this.set("declaration", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeclarationNull: Self = this.set("declaration", null)
    @scala.inline
    def setFunction(value: FunctionNode | PseudoClassSelector | PseudoElementSelector): Self = this.set("function", value.asInstanceOf[js.Any])
    @scala.inline
    def setFunctionNull: Self = this.set("function", null)
    @scala.inline
    def setRule(value: Rule): Self = this.set("rule", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleNull: Self = this.set("rule", null)
    @scala.inline
    def setSelector(value: SelectorList): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorNull: Self = this.set("selector", null)
    @scala.inline
    def setStylesheet(value: StyleSheet): Self = this.set("stylesheet", value.asInstanceOf[js.Any])
    @scala.inline
    def setStylesheetNull: Self = this.set("stylesheet", null)
  }
  
}

