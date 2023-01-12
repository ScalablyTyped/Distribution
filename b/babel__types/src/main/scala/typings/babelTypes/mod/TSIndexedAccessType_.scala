package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSIndexedAccessType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSIndexedAccessType_
  extends StObject
     with BaseNode
     with TSType
     with TypeScript {
  
  var indexType: TSType
  
  var objectType: TSType
  
  @JSName("type")
  var type_TSIndexedAccessType_ : TSIndexedAccessType
}
object TSIndexedAccessType_ {
  
  inline def apply(indexType: TSType, objectType: TSType): TSIndexedAccessType_ = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSIndexedAccessType")
    __obj.asInstanceOf[TSIndexedAccessType_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSIndexedAccessType_] (val x: Self) extends AnyVal {
    
    inline def setIndexType(value: TSType): Self = StObject.set(x, "indexType", value.asInstanceOf[js.Any])
    
    inline def setObjectType(value: TSType): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setType(value: TSIndexedAccessType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
