package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSParameterProperty
import typings.babelTypes.babelTypesStrings.`protected`
import typings.babelTypes.babelTypesStrings.private_
import typings.babelTypes.babelTypesStrings.public
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSParameterProperty_
  extends StObject
     with BaseNode
     with LVal
     with TypeScript {
  
  var accessibility: public | private_ | `protected` | Null
  
  var decorators: js.Array[Decorator_] | Null
  
  var `override`: Boolean | Null
  
  var parameter: Identifier_ | AssignmentPattern_
  
  var readonly: Boolean | Null
  
  @JSName("type")
  var type_TSParameterProperty_ : TSParameterProperty
}
object TSParameterProperty_ {
  
  inline def apply(parameter: Identifier_ | AssignmentPattern_): TSParameterProperty_ = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any], accessibility = null, decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, readonly = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSParameterProperty")
    __obj.updateDynamic("override")(null)
    __obj.asInstanceOf[TSParameterProperty_]
  }
  
  extension [Self <: TSParameterProperty_](x: Self) {
    
    inline def setAccessibility(value: public | private_ | `protected`): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityNull: Self = StObject.set(x, "accessibility", null)
    
    inline def setDecorators(value: js.Array[Decorator_]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    inline def setDecoratorsNull: Self = StObject.set(x, "decorators", null)
    
    inline def setDecoratorsVarargs(value: Decorator_ *): Self = StObject.set(x, "decorators", js.Array(value*))
    
    inline def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    inline def setOverrideNull: Self = StObject.set(x, "override", null)
    
    inline def setParameter(value: Identifier_ | AssignmentPattern_): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyNull: Self = StObject.set(x, "readonly", null)
    
    inline def setType(value: TSParameterProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
