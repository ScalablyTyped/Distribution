package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSInferType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TSInferType_
  extends TSType
     with BaseNode {
  
  var typeParameter: TSTypeParameter_ = js.native
  
  @JSName("type")
  var type_TSInferType_ : TSInferType = js.native
}
object TSInferType_ {
  
  @scala.inline
  def apply(`type`: TSInferType, typeParameter: TSTypeParameter_): TSInferType_ = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
