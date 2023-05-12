package typings.chevrotainTypes.anon

import typings.chevrotainTypes.mod.Rule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Idx extends StObject {
  
  var idx: js.UndefOr[Double] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var nonTerminalName: String
  
  var referencedRule: js.UndefOr[Rule] = js.undefined
}
object Idx {
  
  inline def apply(nonTerminalName: String): Idx = {
    val __obj = js.Dynamic.literal(nonTerminalName = nonTerminalName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Idx]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Idx] (val x: Self) extends AnyVal {
    
    inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
    
    inline def setIdxUndefined: Self = StObject.set(x, "idx", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setNonTerminalName(value: String): Self = StObject.set(x, "nonTerminalName", value.asInstanceOf[js.Any])
    
    inline def setReferencedRule(value: Rule): Self = StObject.set(x, "referencedRule", value.asInstanceOf[js.Any])
    
    inline def setReferencedRuleUndefined: Self = StObject.set(x, "referencedRule", js.undefined)
  }
}
