package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSOptionalType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait TSOptionalType_
  extends StObject
     with BaseNode
     with TSType {
  
  var typeAnnotation: TSType
  
  @JSName("type")
  var type_TSOptionalType_ : TSOptionalType
}
object TSOptionalType_ {
  
  @scala.inline
  def apply(typeAnnotation: TSType): TSOptionalType_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSOptionalType")
    __obj.asInstanceOf[TSOptionalType_]
  }
  
  @scala.inline
  implicit class TSOptionalType_MutableBuilder[Self <: TSOptionalType_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSOptionalType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
