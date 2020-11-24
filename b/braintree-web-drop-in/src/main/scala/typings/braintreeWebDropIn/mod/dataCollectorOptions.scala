package typings.braintreeWebDropIn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dataCollectorOptions extends js.Object {
  
  var kount: js.UndefOr[Boolean] = js.native
}
object dataCollectorOptions {
  
  @scala.inline
  def apply(): dataCollectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dataCollectorOptions]
  }
  
  @scala.inline
  implicit class dataCollectorOptionsOps[Self <: dataCollectorOptions] (val x: Self) extends AnyVal {
    
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
    def setKount(value: Boolean): Self = this.set("kount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKount: Self = this.set("kount", js.undefined)
  }
}
