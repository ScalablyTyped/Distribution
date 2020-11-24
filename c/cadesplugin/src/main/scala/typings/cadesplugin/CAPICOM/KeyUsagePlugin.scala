package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginNumbers.`128`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyUsagePlugin extends js.Object {
  
  val CAPICOM_DIGITAL_SIGNATURE_KEY_USAGE: `128` = js.native
}
object KeyUsagePlugin {
  
  @scala.inline
  def apply(CAPICOM_DIGITAL_SIGNATURE_KEY_USAGE: `128`): KeyUsagePlugin = {
    val __obj = js.Dynamic.literal(CAPICOM_DIGITAL_SIGNATURE_KEY_USAGE = CAPICOM_DIGITAL_SIGNATURE_KEY_USAGE.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyUsagePlugin]
  }
  
  @scala.inline
  implicit class KeyUsagePluginOps[Self <: KeyUsagePlugin] (val x: Self) extends AnyVal {
    
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
    def setCAPICOM_DIGITAL_SIGNATURE_KEY_USAGE(value: `128`): Self = this.set("CAPICOM_DIGITAL_SIGNATURE_KEY_USAGE", value.asInstanceOf[js.Any])
  }
}
