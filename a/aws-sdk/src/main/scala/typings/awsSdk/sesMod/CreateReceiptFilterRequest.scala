package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateReceiptFilterRequest extends js.Object {
  
  /**
    * A data structure that describes the IP address filter to create, which consists of a name, an IP address range, and whether to allow or block mail from it.
    */
  var Filter: ReceiptFilter = js.native
}
object CreateReceiptFilterRequest {
  
  @scala.inline
  def apply(Filter: ReceiptFilter): CreateReceiptFilterRequest = {
    val __obj = js.Dynamic.literal(Filter = Filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReceiptFilterRequest]
  }
  
  @scala.inline
  implicit class CreateReceiptFilterRequestOps[Self <: CreateReceiptFilterRequest] (val x: Self) extends AnyVal {
    
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
    def setFilter(value: ReceiptFilter): Self = this.set("Filter", value.asInstanceOf[js.Any])
  }
}
