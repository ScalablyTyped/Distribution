package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentsPerAttribute extends StObject {
  
  var componentDatatype: js.UndefOr[typings.cesium.mod.ComponentDatatype] = js.undefined
  
  var componentsPerAttribute: js.UndefOr[Double] = js.undefined
  
  var normalize: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[js.Array[Double]] = js.undefined
}
object ComponentsPerAttribute {
  
  @scala.inline
  def apply(): ComponentsPerAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentsPerAttribute]
  }
  
  @scala.inline
  implicit class ComponentsPerAttributeMutableBuilder[Self <: ComponentsPerAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentDatatype(value: typings.cesium.mod.ComponentDatatype): Self = StObject.set(x, "componentDatatype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentDatatypeUndefined: Self = StObject.set(x, "componentDatatype", js.undefined)
    
    @scala.inline
    def setComponentsPerAttribute(value: Double): Self = StObject.set(x, "componentsPerAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsPerAttributeUndefined: Self = StObject.set(x, "componentsPerAttribute", js.undefined)
    
    @scala.inline
    def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    
    @scala.inline
    def setValue(value: js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
