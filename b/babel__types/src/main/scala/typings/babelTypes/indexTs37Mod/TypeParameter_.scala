package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TypeParameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait TypeParameter_
  extends StObject
     with BaseNode
     with Flow {
  
  var default: FlowType | Null
  
  var bound: TypeAnnotation_ | Null
  
  var name: String
  
  @JSName("type")
  var type_TypeParameter_ : TypeParameter
  
  var variance: Variance_ | Null
}
object TypeParameter_ {
  
  @scala.inline
  def apply(name: String): TypeParameter_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], bound = null, default = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, variance = null)
    __obj.updateDynamic("type")("TypeParameter")
    __obj.asInstanceOf[TypeParameter_]
  }
  
  @scala.inline
  implicit class TypeParameter_MutableBuilder[Self <: TypeParameter_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBound(value: TypeAnnotation_): Self = StObject.set(x, "bound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundNull: Self = StObject.set(x, "bound", null)
    
    @scala.inline
    def setDefault(value: FlowType): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultNull: Self = StObject.set(x, "default", null)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TypeParameter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariance(value: Variance_): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVarianceNull: Self = StObject.set(x, "variance", null)
  }
}
