package typings.contentfulManagement.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined type-fest.type-fest.Except<contentful-management.contentful-management/dist/typings/entities/locale.LocaleProps, 'sys'> */
@js.native
trait ExceptLocalePropssys extends StObject {
  
  var default: Boolean = js.native
  
  var code: String = js.native
  
  var contentDeliveryApi: Boolean = js.native
  
  var contentManagementApi: Boolean = js.native
  
  var fallbackCode: String = js.native
  
  var name: String = js.native
  
  var optional: Boolean = js.native
}
object ExceptLocalePropssys {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ExceptLocalePropssysMutableBuilder[Self <: ExceptLocalePropssys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentDeliveryApi(value: Boolean): Self = StObject.set(x, "contentDeliveryApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentManagementApi(value: Boolean): Self = StObject.set(x, "contentManagementApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackCode(value: String): Self = StObject.set(x, "fallbackCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
  }
}
