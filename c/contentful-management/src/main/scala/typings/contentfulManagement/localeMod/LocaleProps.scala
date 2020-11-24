package typings.contentfulManagement.localeMod

import typings.contentfulManagement.commonTypesMod.MetaSysProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocaleProps extends js.Object {
  
  /**
    * Locale code (example: en-us)
    */
  var code: String = js.native
  
  /**
    *  If the content under this locale should be available on the CDA (for public reading)
    */
  var contentDeliveryApi: Boolean = js.native
  
  /**
    * If the content under this locale should be available on the CMA (for editing)
    */
  var contentManagementApi: Boolean = js.native
  
  /**
    * If this is the default locale
    */
  var default: Boolean = js.native
  
  /**
    * Locale code to fallback to when there is not content for the current locale
    */
  var fallbackCode: String = js.native
  
  /**
    * Locale name
    */
  var name: String = js.native
  
  /**
    * If the locale needs to be filled in on entries or not
    */
  var optional: Boolean = js.native
  
  var sys: MetaSysProps = js.native
}
object LocaleProps {
  
  @scala.inline
  def apply(
    code: String,
    contentDeliveryApi: Boolean,
    contentManagementApi: Boolean,
    default: Boolean,
    fallbackCode: String,
    name: String,
    optional: Boolean,
    sys: MetaSysProps
  ): LocaleProps = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], contentDeliveryApi = contentDeliveryApi.asInstanceOf[js.Any], contentManagementApi = contentManagementApi.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], fallbackCode = fallbackCode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleProps]
  }
  
  @scala.inline
  implicit class LocalePropsOps[Self <: LocaleProps] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setSys(value: MetaSysProps): Self = this.set("sys", value.asInstanceOf[js.Any])
  }
}
