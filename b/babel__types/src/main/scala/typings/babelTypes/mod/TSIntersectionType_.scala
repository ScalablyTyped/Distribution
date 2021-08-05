package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSIntersectionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSIntersectionType_
  extends StObject
     with BaseNode
     with TSType {
  
  @JSName("type")
  var type_TSIntersectionType_ : TSIntersectionType
  
  var types: js.Array[TSType]
}
object TSIntersectionType_ {
  
  inline def apply(types: js.Array[TSType]): TSIntersectionType_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSIntersectionType")
    __obj.asInstanceOf[TSIntersectionType_]
  }
  
  extension [Self <: TSIntersectionType_](x: Self) {
    
    inline def setType(value: TSIntersectionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: js.Array[TSType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: TSType*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
