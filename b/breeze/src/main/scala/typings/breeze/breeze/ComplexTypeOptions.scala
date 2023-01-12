package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComplexTypeOptions extends StObject {
  
  var custom: js.UndefOr[js.Object] = js.undefined
  
  var dataProperties: js.UndefOr[js.Array[DataProperty]] = js.undefined
  
  var namespace: js.UndefOr[String] = js.undefined
  
  var shortName: js.UndefOr[String] = js.undefined
}
object ComplexTypeOptions {
  
  inline def apply(): ComplexTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplexTypeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComplexTypeOptions] (val x: Self) extends AnyVal {
    
    inline def setCustom(value: js.Object): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setDataProperties(value: js.Array[DataProperty]): Self = StObject.set(x, "dataProperties", value.asInstanceOf[js.Any])
    
    inline def setDataPropertiesUndefined: Self = StObject.set(x, "dataProperties", js.undefined)
    
    inline def setDataPropertiesVarargs(value: DataProperty*): Self = StObject.set(x, "dataProperties", js.Array(value*))
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
    
    inline def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
  }
}
