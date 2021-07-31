package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.SwitchStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait SwitchStatement_
  extends StObject
     with BaseNode
     with BlockParent
     with Scopable
     with Statement {
  
  var cases: js.Array[SwitchCase_]
  
  var discriminant: Expression
  
  @JSName("type")
  var type_SwitchStatement_ : SwitchStatement
}
object SwitchStatement_ {
  
  @scala.inline
  def apply(cases: js.Array[SwitchCase_], discriminant: Expression): SwitchStatement_ = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("SwitchStatement")
    __obj.asInstanceOf[SwitchStatement_]
  }
  
  @scala.inline
  implicit class SwitchStatement_MutableBuilder[Self <: SwitchStatement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCases(value: js.Array[SwitchCase_]): Self = StObject.set(x, "cases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCasesVarargs(value: SwitchCase_ *): Self = StObject.set(x, "cases", js.Array(value :_*))
    
    @scala.inline
    def setDiscriminant(value: Expression): Self = StObject.set(x, "discriminant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: SwitchStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
