package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NthPlain
  extends CssNodeCommon
     with CssNodePlain {
  
  var nth: AnPlusB | Identifier = js.native
  
  var selector: SelectorListPlain | Null = js.native
  
  @JSName("type")
  var type_NthPlain: typings.cssTree.cssTreeStrings.Nth = js.native
}
object NthPlain {
  
  @scala.inline
  def apply(nth: AnPlusB | Identifier, `type`: typings.cssTree.cssTreeStrings.Nth): NthPlain = {
    val __obj = js.Dynamic.literal(nth = nth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NthPlain]
  }
  
  @scala.inline
  implicit class NthPlainMutableBuilder[Self <: NthPlain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNth(value: AnPlusB | Identifier): Self = StObject.set(x, "nth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: SelectorListPlain): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorNull: Self = StObject.set(x, "selector", null)
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.Nth): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
