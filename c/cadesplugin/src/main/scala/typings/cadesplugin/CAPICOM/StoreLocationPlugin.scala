package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginNumbers.`1`
import typings.cadesplugin.cadespluginNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreLocationPlugin extends js.Object {
  
  val CAPICOM_CURRENT_USER_STORE: `2` = js.native
  
  val CAPICOM_LOCAL_MACHINE_STORE: `1` = js.native
}
object StoreLocationPlugin {
  
  @scala.inline
  def apply(CAPICOM_CURRENT_USER_STORE: `2`, CAPICOM_LOCAL_MACHINE_STORE: `1`): StoreLocationPlugin = {
    val __obj = js.Dynamic.literal(CAPICOM_CURRENT_USER_STORE = CAPICOM_CURRENT_USER_STORE.asInstanceOf[js.Any], CAPICOM_LOCAL_MACHINE_STORE = CAPICOM_LOCAL_MACHINE_STORE.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreLocationPlugin]
  }
  
  @scala.inline
  implicit class StoreLocationPluginOps[Self <: StoreLocationPlugin] (val x: Self) extends AnyVal {
    
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
    def setCAPICOM_CURRENT_USER_STORE(value: `2`): Self = this.set("CAPICOM_CURRENT_USER_STORE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_LOCAL_MACHINE_STORE(value: `1`): Self = this.set("CAPICOM_LOCAL_MACHINE_STORE", value.asInstanceOf[js.Any])
  }
}
