package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rule
  extends CssNodeCommon
     with CssNode {
  
  var block: Block = js.native
  
  var prelude: SelectorList | Raw = js.native
  
  @JSName("type")
  var type_Rule: typings.cssTree.cssTreeStrings.Rule = js.native
}
object Rule {
  
  @scala.inline
  def apply(block: Block, prelude: SelectorList | Raw, `type`: typings.cssTree.cssTreeStrings.Rule): Rule = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], prelude = prelude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  
  @scala.inline
  implicit class RuleMutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock(value: Block): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrelude(value: SelectorList | Raw): Self = StObject.set(x, "prelude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.Rule): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
