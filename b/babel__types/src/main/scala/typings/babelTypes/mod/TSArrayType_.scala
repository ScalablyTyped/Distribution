package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSArrayType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSArrayType_
  extends StObject
     with BaseNode
     with TSType {
  
  var elementType: TSType
  
  @JSName("type")
  var type_TSArrayType_ : TSArrayType
}
object TSArrayType_ {
  
  @scala.inline
  def apply(elementType: TSType): TSArrayType_ = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSArrayType")
    __obj.asInstanceOf[TSArrayType_]
  }
  
  @scala.inline
  implicit class TSArrayType_MutableBuilder[Self <: TSArrayType_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElementType(value: TSType): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSArrayType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
