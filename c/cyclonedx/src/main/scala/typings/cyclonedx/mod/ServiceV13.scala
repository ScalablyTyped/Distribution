package typings.cyclonedx.mod

import typings.cyclonedx.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceV13
  extends StObject
     with ServiceBase {
  
  var properties: js.UndefOr[Properties] = js.undefined
  
  var services: js.UndefOr[js.Array[ServiceV13]] = js.undefined
}
object ServiceV13 {
  
  inline def apply(name: String): ServiceV13 = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceV13]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceV13] (val x: Self) extends AnyVal {
    
    inline def setProperties(value: Properties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: Name*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setServices(value: js.Array[ServiceV13]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: ServiceV13*): Self = StObject.set(x, "services", js.Array(value*))
  }
}
