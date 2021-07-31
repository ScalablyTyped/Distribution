package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.SwitchCase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchCase_
  extends StObject
     with BaseNode
     with _Node {
  
  var consequent: js.Array[Statement]
  
  var test: Expression | Null
  
  @JSName("type")
  var type_SwitchCase_ : SwitchCase
}
object SwitchCase_ {
  
  @scala.inline
  def apply(consequent: js.Array[Statement]): SwitchCase_ = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, test = null, trailingComments = null)
    __obj.updateDynamic("type")("SwitchCase")
    __obj.asInstanceOf[SwitchCase_]
  }
  
  @scala.inline
  implicit class SwitchCase_MutableBuilder[Self <: SwitchCase_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsequent(value: js.Array[Statement]): Self = StObject.set(x, "consequent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsequentVarargs(value: Statement*): Self = StObject.set(x, "consequent", js.Array(value :_*))
    
    @scala.inline
    def setTest(value: Expression): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestNull: Self = StObject.set(x, "test", null)
    
    @scala.inline
    def setType(value: SwitchCase): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
