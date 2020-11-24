package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreOpenModePlugin extends js.Object {
  
  val CAPICOM_STORE_OPEN_MAXIMUM_ALLOWED: `2` = js.native
}
object StoreOpenModePlugin {
  
  @scala.inline
  def apply(CAPICOM_STORE_OPEN_MAXIMUM_ALLOWED: `2`): StoreOpenModePlugin = {
    val __obj = js.Dynamic.literal(CAPICOM_STORE_OPEN_MAXIMUM_ALLOWED = CAPICOM_STORE_OPEN_MAXIMUM_ALLOWED.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreOpenModePlugin]
  }
  
  @scala.inline
  implicit class StoreOpenModePluginOps[Self <: StoreOpenModePlugin] (val x: Self) extends AnyVal {
    
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
    def setCAPICOM_STORE_OPEN_MAXIMUM_ALLOWED(value: `2`): Self = this.set("CAPICOM_STORE_OPEN_MAXIMUM_ALLOWED", value.asInstanceOf[js.Any])
  }
}
