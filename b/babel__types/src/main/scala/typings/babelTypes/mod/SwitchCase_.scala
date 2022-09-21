package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.SwitchCase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait SwitchCase_
  extends StObject
     with BaseNode
     with Standardized {
  
  var consequent: js.Array[Statement]
  
  var test: Expression | Null
  
  @JSName("type")
  var type_SwitchCase_ : SwitchCase
}
object SwitchCase_ {
  
  inline def apply(consequent: js.Array[Statement]): SwitchCase_ = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, test = null, trailingComments = null)
    __obj.updateDynamic("type")("SwitchCase")
    __obj.asInstanceOf[SwitchCase_]
  }
  
  extension [Self <: SwitchCase_](x: Self) {
    
    inline def setConsequent(value: js.Array[Statement]): Self = StObject.set(x, "consequent", value.asInstanceOf[js.Any])
    
    inline def setConsequentVarargs(value: Statement*): Self = StObject.set(x, "consequent", js.Array(value*))
    
    inline def setTest(value: Expression): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestNull: Self = StObject.set(x, "test", null)
    
    inline def setType(value: SwitchCase): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
