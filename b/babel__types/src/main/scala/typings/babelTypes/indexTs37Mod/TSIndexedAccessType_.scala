package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSIndexedAccessType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait TSIndexedAccessType_
  extends StObject
     with BaseNode
     with TSType {
  
  var indexType: TSType
  
  var objectType: TSType
  
  @JSName("type")
  var type_TSIndexedAccessType_ : TSIndexedAccessType
}
object TSIndexedAccessType_ {
  
  @scala.inline
  def apply(indexType: TSType, objectType: TSType): TSIndexedAccessType_ = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSIndexedAccessType")
    __obj.asInstanceOf[TSIndexedAccessType_]
  }
  
  @scala.inline
  implicit class TSIndexedAccessType_MutableBuilder[Self <: TSIndexedAccessType_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexType(value: TSType): Self = StObject.set(x, "indexType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectType(value: TSType): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSIndexedAccessType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
