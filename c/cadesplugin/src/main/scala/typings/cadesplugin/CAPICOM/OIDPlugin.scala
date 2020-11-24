package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginNumbers.`0`
import typings.cadesplugin.cadespluginNumbers.`10`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OIDPlugin extends js.Object {
  
  val CAPICOM_OID_KEY_USAGE_EXTENSION: `10` = js.native
  
  val CAPICOM_OID_OTHER: `0` = js.native
}
object OIDPlugin {
  
  @scala.inline
  def apply(CAPICOM_OID_KEY_USAGE_EXTENSION: `10`, CAPICOM_OID_OTHER: `0`): OIDPlugin = {
    val __obj = js.Dynamic.literal(CAPICOM_OID_KEY_USAGE_EXTENSION = CAPICOM_OID_KEY_USAGE_EXTENSION.asInstanceOf[js.Any], CAPICOM_OID_OTHER = CAPICOM_OID_OTHER.asInstanceOf[js.Any])
    __obj.asInstanceOf[OIDPlugin]
  }
  
  @scala.inline
  implicit class OIDPluginOps[Self <: OIDPlugin] (val x: Self) extends AnyVal {
    
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
    def setCAPICOM_OID_KEY_USAGE_EXTENSION(value: `10`): Self = this.set("CAPICOM_OID_KEY_USAGE_EXTENSION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_OID_OTHER(value: `0`): Self = this.set("CAPICOM_OID_OTHER", value.asInstanceOf[js.Any])
  }
}
