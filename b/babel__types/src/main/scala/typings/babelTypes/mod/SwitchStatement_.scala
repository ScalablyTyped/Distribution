package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.SwitchStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait SwitchStatement_
  extends BlockParent
     with BaseNode
     with Scopable
     with Statement {
  
  var cases: js.Array[SwitchCase_] = js.native
  
  var discriminant: Expression = js.native
  
  @JSName("type")
  var type_SwitchStatement_ : SwitchStatement = js.native
}
object SwitchStatement_ {
  
  @scala.inline
  def apply(cases: js.Array[SwitchCase_], discriminant: Expression, `type`: SwitchStatement): SwitchStatement_ = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
