package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.OptionalIndexedAccessType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait OptionalIndexedAccessType_
  extends StObject
     with BaseNode
     with Flow
     with FlowType {
  
  var indexType: FlowType
  
  var objectType: FlowType
  
  var optional: Boolean
  
  @JSName("type")
  var type_OptionalIndexedAccessType_ : OptionalIndexedAccessType
}
object OptionalIndexedAccessType_ {
  
  inline def apply(indexType: FlowType, objectType: FlowType, optional: Boolean): OptionalIndexedAccessType_ = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("OptionalIndexedAccessType")
    __obj.asInstanceOf[OptionalIndexedAccessType_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionalIndexedAccessType_] (val x: Self) extends AnyVal {
    
    inline def setIndexType(value: FlowType): Self = StObject.set(x, "indexType", value.asInstanceOf[js.Any])
    
    inline def setObjectType(value: FlowType): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setType(value: OptionalIndexedAccessType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
