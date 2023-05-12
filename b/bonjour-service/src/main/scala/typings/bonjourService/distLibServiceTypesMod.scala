package typings.bonjourService

import typings.bonjourService.bonjourServiceStrings.tcp
import typings.bonjourService.bonjourServiceStrings.udp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibServiceTypesMod {
  
  @JSImport("bonjour-service/dist/lib/service-types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toString_(data: ServiceType): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(data.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def toType(string: String): ServiceType = ^.asInstanceOf[js.Dynamic].applyDynamic("toType")(string.asInstanceOf[js.Any]).asInstanceOf[ServiceType]
  
  trait ServiceType extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var protocol: js.UndefOr[tcp | udp | String | Null] = js.undefined
    
    var subtype: js.UndefOr[String] = js.undefined
  }
  object ServiceType {
    
    inline def apply(): ServiceType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServiceType] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProtocol(value: tcp | udp | String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolNull: Self = StObject.set(x, "protocol", null)
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
      
      inline def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
    }
  }
}
