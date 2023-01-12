package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TypeParameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeParameter_
  extends StObject
     with BaseNode
     with Flow
     with Node {
  
  var default: js.UndefOr[FlowType | Null] = js.undefined
  
  var bound: js.UndefOr[TypeAnnotation_ | Null] = js.undefined
  
  var name: String
  
  @JSName("type")
  var type_TypeParameter_ : TypeParameter
  
  var variance: js.UndefOr[Variance_ | Null] = js.undefined
}
object TypeParameter_ {
  
  inline def apply(name: String): TypeParameter_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeParameter")
    __obj.asInstanceOf[TypeParameter_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeParameter_] (val x: Self) extends AnyVal {
    
    inline def setBound(value: TypeAnnotation_): Self = StObject.set(x, "bound", value.asInstanceOf[js.Any])
    
    inline def setBoundNull: Self = StObject.set(x, "bound", null)
    
    inline def setBoundUndefined: Self = StObject.set(x, "bound", js.undefined)
    
    inline def setDefault(value: FlowType): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultNull: Self = StObject.set(x, "default", null)
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: TypeParameter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVariance(value: Variance_): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
    
    inline def setVarianceNull: Self = StObject.set(x, "variance", null)
    
    inline def setVarianceUndefined: Self = StObject.set(x, "variance", js.undefined)
  }
}
