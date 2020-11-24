package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviousNetworkTransactionId extends js.Object {
  
  var previousNetworkTransactionId: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[String] = js.native
}
object PreviousNetworkTransactionId {
  
  @scala.inline
  def apply(): PreviousNetworkTransactionId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviousNetworkTransactionId]
  }
  
  @scala.inline
  implicit class PreviousNetworkTransactionIdOps[Self <: PreviousNetworkTransactionId] (val x: Self) extends AnyVal {
    
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
    def setPreviousNetworkTransactionId(value: String): Self = this.set("previousNetworkTransactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousNetworkTransactionId: Self = this.set("previousNetworkTransactionId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
