package typings.contentfulManagement.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined type-fest.type-fest.Except<contentful-management.contentful-management/dist/typings/entities/locale.LocaleProps, 'sys'> */
trait ExceptLocalePropssys extends StObject {
  
  var default: Boolean
  
  var code: String
  
  var contentDeliveryApi: Boolean
  
  var contentManagementApi: Boolean
  
  var fallbackCode: String
  
  var name: String
  
  var optional: Boolean
}
object ExceptLocalePropssys {
  
  inline def apply(
    code: String,
    contentDeliveryApi: Boolean,
    contentManagementApi: Boolean,
    default: Boolean,
    fallbackCode: String,
    name: String,
    optional: Boolean
  ): ExceptLocalePropssys = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], contentDeliveryApi = contentDeliveryApi.asInstanceOf[js.Any], contentManagementApi = contentManagementApi.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], fallbackCode = fallbackCode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptLocalePropssys]
  }
  
  extension [Self <: ExceptLocalePropssys](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setContentDeliveryApi(value: Boolean): Self = StObject.set(x, "contentDeliveryApi", value.asInstanceOf[js.Any])
    
    inline def setContentManagementApi(value: Boolean): Self = StObject.set(x, "contentManagementApi", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setFallbackCode(value: String): Self = StObject.set(x, "fallbackCode", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
  }
}
