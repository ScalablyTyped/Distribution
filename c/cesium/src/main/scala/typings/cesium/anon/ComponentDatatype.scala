package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentDatatype extends StObject {
  
  var componentDatatype: js.UndefOr[typings.cesium.mod.ComponentDatatype] = js.native
  
  var componentsPerAttribute: js.UndefOr[Double] = js.native
  
  var normalize: js.UndefOr[Boolean] = js.native
  
  var values: js.UndefOr[js.Array[Double]] = js.native
}
object ComponentDatatype {
  
  @scala.inline
  def apply(): ComponentDatatype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentDatatype]
  }
  
  @scala.inline
  implicit class ComponentDatatypeMutableBuilder[Self <: ComponentDatatype] (val x: Self) extends AnyVal {
    
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
    def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
