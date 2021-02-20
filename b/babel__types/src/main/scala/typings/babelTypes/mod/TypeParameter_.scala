package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TypeParameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait TypeParameter_
  extends Flow
     with BaseNode {
  
  var default: FlowType | Null = js.native
  
  var bound: TypeAnnotation_ | Null = js.native
  
  var name: String = js.native
  
  @JSName("type")
  var type_TypeParameter_ : TypeParameter = js.native
  
  var variance: Variance_ | Null = js.native
}
object TypeParameter_ {
  
  @scala.inline
  def apply(name: String, `type`: TypeParameter): TypeParameter_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
