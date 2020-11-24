package typings.braintreeWeb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bin extends js.Object {
  
  var bin: String = js.native
  
  var cardType: String = js.native
  
  var isNetworkTokenized: Boolean = js.native
  
  var lastFour: String = js.native
  
  var lastTow: String = js.native
}
object Bin {
  
  @scala.inline
  def apply(bin: String, cardType: String, isNetworkTokenized: Boolean, lastFour: String, lastTow: String): Bin = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], isNetworkTokenized = isNetworkTokenized.asInstanceOf[js.Any], lastFour = lastFour.asInstanceOf[js.Any], lastTow = lastTow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bin]
  }
  
  @scala.inline
  implicit class BinOps[Self <: Bin] (val x: Self) extends AnyVal {
    
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
    def setBin(value: String): Self = this.set("bin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardType(value: String): Self = this.set("cardType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNetworkTokenized(value: Boolean): Self = this.set("isNetworkTokenized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastFour(value: String): Self = this.set("lastFour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastTow(value: String): Self = this.set("lastTow", value.asInstanceOf[js.Any])
  }
}
