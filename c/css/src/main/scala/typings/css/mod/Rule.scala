package typings.css.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rule extends Node {
  /** Array of nodes with the types declaration and comment. */
  var declarations: js.UndefOr[js.Array[Declaration | Comment]] = js.native
  /** The list of selectors of the rule, split on commas. Each selector is trimmed from whitespace and comments. */
  var selectors: js.UndefOr[js.Array[String]] = js.native
}

object Rule {
  @scala.inline
  def apply(): Rule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rule]
  }
  @scala.inline
  implicit class RuleOps[Self <: Rule] (val x: Self) extends AnyVal {
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
    def setDeclarationsVarargs(value: (Declaration | Comment)*): Self = this.set("declarations", js.Array(value :_*))
    @scala.inline
    def setDeclarations(value: js.Array[Declaration | Comment]): Self = this.set("declarations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeclarations: Self = this.set("declarations", js.undefined)
    @scala.inline
    def setSelectorsVarargs(value: String*): Self = this.set("selectors", js.Array(value :_*))
    @scala.inline
    def setSelectors(value: js.Array[String]): Self = this.set("selectors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectors: Self = this.set("selectors", js.undefined)
  }
  
}

