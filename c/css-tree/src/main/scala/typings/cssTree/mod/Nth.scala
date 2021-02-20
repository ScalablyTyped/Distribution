package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nth
  extends CssNodeCommon
     with CssNode {
  
  var nth: AnPlusB | Identifier = js.native
  
  var selector: SelectorList | Null = js.native
  
  @JSName("type")
  var type_Nth: typings.cssTree.cssTreeStrings.Nth = js.native
}
object Nth {
  
  @scala.inline
  def apply(nth: AnPlusB | Identifier, `type`: typings.cssTree.cssTreeStrings.Nth): Nth = {
    val __obj = js.Dynamic.literal(nth = nth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nth]
  }
  
  @scala.inline
  implicit class NthMutableBuilder[Self <: Nth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNth(value: AnPlusB | Identifier): Self = StObject.set(x, "nth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: SelectorList): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorNull: Self = StObject.set(x, "selector", null)
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.Nth): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
