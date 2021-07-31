package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSInferType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSInferType_
  extends StObject
     with BaseNode
     with TSType {
  
  var typeParameter: TSTypeParameter_
  
  @JSName("type")
  var type_TSInferType_ : TSInferType
}
object TSInferType_ {
  
  @scala.inline
  def apply(typeParameter: TSTypeParameter_): TSInferType_ = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSInferType")
    __obj.asInstanceOf[TSInferType_]
  }
  
  @scala.inline
  implicit class TSInferType_MutableBuilder[Self <: TSInferType_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSInferType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameter(value: TSTypeParameter_): Self = StObject.set(x, "typeParameter", value.asInstanceOf[js.Any])
  }
}
