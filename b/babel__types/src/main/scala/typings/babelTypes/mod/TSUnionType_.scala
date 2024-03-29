package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSUnionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSUnionType_
  extends StObject
     with BaseNode
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSUnionType_ : TSUnionType
  
  var types: js.Array[TSType]
}
object TSUnionType_ {
  
  inline def apply(types: js.Array[TSType]): TSUnionType_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSUnionType")
    __obj.asInstanceOf[TSUnionType_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSUnionType_] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSUnionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: js.Array[TSType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: TSType*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
