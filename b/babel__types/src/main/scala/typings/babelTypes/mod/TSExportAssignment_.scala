package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSExportAssignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSExportAssignment_
  extends StObject
     with BaseNode
     with Statement {
  
  var expression: Expression
  
  @JSName("type")
  var type_TSExportAssignment_ : TSExportAssignment
}
object TSExportAssignment_ {
  
  @scala.inline
  def apply(expression: Expression): TSExportAssignment_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSExportAssignment")
    __obj.asInstanceOf[TSExportAssignment_]
  }
  
  @scala.inline
  implicit class TSExportAssignment_MutableBuilder[Self <: TSExportAssignment_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSExportAssignment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
