package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.SwitchCase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchCase_
  extends BaseNode
     with _Node {
  
  var consequent: js.Array[Statement] = js.native
  
  var test: Expression | Null = js.native
  
  @JSName("type")
  var type_SwitchCase_ : SwitchCase = js.native
}
object SwitchCase_ {
  
  @scala.inline
  def apply(consequent: js.Array[Statement], `type`: SwitchCase): SwitchCase_ = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
