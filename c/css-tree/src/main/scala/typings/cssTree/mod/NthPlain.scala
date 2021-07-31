package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NthPlain
  extends StObject
     with CssNodeCommon
     with CssNodePlain {
  
  var nth: AnPlusB | Identifier
  
  var selector: SelectorListPlain | Null
  
  @JSName("type")
  var type_NthPlain: typings.cssTree.cssTreeStrings.Nth
}
object NthPlain {
  
  @scala.inline
  def apply(nth: AnPlusB | Identifier): NthPlain = {
    val __obj = js.Dynamic.literal(nth = nth.asInstanceOf[js.Any], selector = null)
    __obj.updateDynamic("type")("Nth")
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
