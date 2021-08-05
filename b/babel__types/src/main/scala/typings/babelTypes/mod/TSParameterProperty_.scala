package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSParameterProperty
import typings.babelTypes.babelTypesStrings.`private`
import typings.babelTypes.babelTypesStrings.`protected`
import typings.babelTypes.babelTypesStrings.public
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSParameterProperty_
  extends StObject
     with BaseNode
     with LVal {
  
  var accessibility: public | `private` | `protected` | Null
  
  var parameter: Identifier_ | AssignmentPattern_
  
  var readonly: Boolean | Null
  
  @JSName("type")
  var type_TSParameterProperty_ : TSParameterProperty
}
object TSParameterProperty_ {
  
  inline def apply(parameter: Identifier_ | AssignmentPattern_): TSParameterProperty_ = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any], accessibility = null, end = null, innerComments = null, leadingComments = null, loc = null, readonly = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSParameterProperty")
    __obj.asInstanceOf[TSParameterProperty_]
  }
  
  extension [Self <: TSParameterProperty_](x: Self) {
    
    inline def setAccessibility(value: public | `private` | `protected`): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityNull: Self = StObject.set(x, "accessibility", null)
    
    inline def setParameter(value: Identifier_ | AssignmentPattern_): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyNull: Self = StObject.set(x, "readonly", null)
    
    inline def setType(value: TSParameterProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
