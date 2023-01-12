package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSExternalModuleReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSExternalModuleReference_
  extends StObject
     with BaseNode
     with TypeScript {
  
  var expression: StringLiteral_
  
  @JSName("type")
  var type_TSExternalModuleReference_ : TSExternalModuleReference
}
object TSExternalModuleReference_ {
  
  inline def apply(expression: StringLiteral_): TSExternalModuleReference_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSExternalModuleReference")
    __obj.asInstanceOf[TSExternalModuleReference_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSExternalModuleReference_] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: StringLiteral_): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: TSExternalModuleReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
