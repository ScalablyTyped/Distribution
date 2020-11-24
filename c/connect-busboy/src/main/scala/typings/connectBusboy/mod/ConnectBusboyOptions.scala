package typings.connectBusboy.mod

import typings.busboy.busboy.BusboyConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectBusboyOptions extends BusboyConfig {
  
  var immediate: js.UndefOr[Boolean] = js.native
}
object ConnectBusboyOptions {
  
  @scala.inline
  def apply(): ConnectBusboyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectBusboyOptions]
  }
  
  @scala.inline
  implicit class ConnectBusboyOptionsOps[Self <: ConnectBusboyOptions] (val x: Self) extends AnyVal {
    
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
    def setImmediate(value: Boolean): Self = this.set("immediate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImmediate: Self = this.set("immediate", js.undefined)
  }
}
