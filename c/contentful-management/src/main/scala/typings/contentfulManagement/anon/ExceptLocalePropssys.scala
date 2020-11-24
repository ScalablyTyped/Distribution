package typings.contentfulManagement.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined type-fest.type-fest.Except<contentful-management.contentful-management/dist/typings/entities/locale.LocaleProps, 'sys'> */
@js.native
trait ExceptLocalePropssys extends js.Object {
  
  var code: String = js.native
  
  var contentDeliveryApi: Boolean = js.native
  
  var contentManagementApi: Boolean = js.native
  
  var default: Boolean = js.native
  
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
  implicit class ExceptLocalePropssysOps[Self <: ExceptLocalePropssys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentDeliveryApi(value: Boolean): Self = this.set("contentDeliveryApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentManagementApi(value: Boolean): Self = this.set("contentManagementApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: Boolean): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackCode(value: String): Self = this.set("fallbackCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
  }
}
