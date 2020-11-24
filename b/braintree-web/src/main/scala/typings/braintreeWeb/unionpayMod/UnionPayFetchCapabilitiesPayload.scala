package typings.braintreeWeb.unionpayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnionPayFetchCapabilitiesPayload extends js.Object {
  
  var isDebit: Boolean = js.native
  
  var isUnionPay: Boolean = js.native
  
  var unionPay: UnionPayProperties = js.native
}
object UnionPayFetchCapabilitiesPayload {
  
  @scala.inline
  def apply(isDebit: Boolean, isUnionPay: Boolean, unionPay: UnionPayProperties): UnionPayFetchCapabilitiesPayload = {
    val __obj = js.Dynamic.literal(isDebit = isDebit.asInstanceOf[js.Any], isUnionPay = isUnionPay.asInstanceOf[js.Any], unionPay = unionPay.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnionPayFetchCapabilitiesPayload]
  }
  
  @scala.inline
  implicit class UnionPayFetchCapabilitiesPayloadOps[Self <: UnionPayFetchCapabilitiesPayload] (val x: Self) extends AnyVal {
    
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
    def setIsDebit(value: Boolean): Self = this.set("isDebit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUnionPay(value: Boolean): Self = this.set("isUnionPay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnionPay(value: UnionPayProperties): Self = this.set("unionPay", value.asInstanceOf[js.Any])
  }
}
