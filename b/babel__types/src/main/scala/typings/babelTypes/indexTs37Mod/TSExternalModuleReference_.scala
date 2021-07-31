package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSExternalModuleReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSExternalModuleReference_
  extends StObject
     with BaseNode
     with _Node {
  
  var expression: StringLiteral_
  
  @JSName("type")
  var type_TSExternalModuleReference_ : TSExternalModuleReference
}
object TSExternalModuleReference_ {
  
  @scala.inline
  def apply(expression: StringLiteral_): TSExternalModuleReference_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSExternalModuleReference")
    __obj.asInstanceOf[TSExternalModuleReference_]
  }
  
  @scala.inline
  implicit class TSExternalModuleReference_MutableBuilder[Self <: TSExternalModuleReference_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: StringLiteral_): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSExternalModuleReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
