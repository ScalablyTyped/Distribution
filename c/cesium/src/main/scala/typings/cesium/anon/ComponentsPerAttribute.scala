package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentsPerAttribute extends StObject {
  
  var componentDatatype: typings.cesium.mod.ComponentDatatype
  
  var componentsPerAttribute: Double
  
  var normalize: js.UndefOr[Boolean] = js.undefined
  
  var value: js.Array[Double]
}
object ComponentsPerAttribute {
  
  inline def apply(
    componentDatatype: typings.cesium.mod.ComponentDatatype,
    componentsPerAttribute: Double,
    value: js.Array[Double]
  ): ComponentsPerAttribute = {
    val __obj = js.Dynamic.literal(componentDatatype = componentDatatype.asInstanceOf[js.Any], componentsPerAttribute = componentsPerAttribute.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentsPerAttribute]
  }
  
  extension [Self <: ComponentsPerAttribute](x: Self) {
    
    inline def setComponentDatatype(value: typings.cesium.mod.ComponentDatatype): Self = StObject.set(x, "componentDatatype", value.asInstanceOf[js.Any])
    
    inline def setComponentsPerAttribute(value: Double): Self = StObject.set(x, "componentsPerAttribute", value.asInstanceOf[js.Any])
    
    inline def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
    
    inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    
    inline def setValue(value: js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
