package typings.cssSelectorParser.selectorMod

import typings.cssSelectorParser.cssSelectorParserStrings.selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Selectors
  extends Selector
     with SelectorEntity {
  
  var selectors: js.Array[RuleSet] = js.native
  
  var `type`: selectors = js.native
}
object Selectors {
  
  @scala.inline
  def apply(selectors: js.Array[RuleSet], `type`: selectors): Selectors = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selectors]
  }
  
  @scala.inline
  implicit class SelectorsOps[Self <: Selectors] (val x: Self) extends AnyVal {
    
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
    def setSelectorsVarargs(value: RuleSet*): Self = this.set("selectors", js.Array(value :_*))
    
    @scala.inline
    def setSelectors(value: js.Array[RuleSet]): Self = this.set("selectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: selectors): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
