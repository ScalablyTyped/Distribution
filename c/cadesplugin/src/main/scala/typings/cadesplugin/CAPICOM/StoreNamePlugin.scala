package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginStrings.My
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreNamePlugin extends js.Object {
  
  val CAPICOM_MY_STORE: My = js.native
}
object StoreNamePlugin {
  
  @scala.inline
  def apply(CAPICOM_MY_STORE: My): StoreNamePlugin = {
    val __obj = js.Dynamic.literal(CAPICOM_MY_STORE = CAPICOM_MY_STORE.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreNamePlugin]
  }
  
  @scala.inline
  implicit class StoreNamePluginOps[Self <: StoreNamePlugin] (val x: Self) extends AnyVal {
    
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
    def setCAPICOM_MY_STORE(value: My): Self = this.set("CAPICOM_MY_STORE", value.asInstanceOf[js.Any])
  }
}
