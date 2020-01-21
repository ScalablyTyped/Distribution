package typings.braintreeWeb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnionPayFetchCapabilitiesPayload extends js.Object {
  var isDebit: Boolean
  var isUnionPay: Boolean
  var unionPay: UnionPayProperties
}

object UnionPayFetchCapabilitiesPayload {
  @scala.inline
  def apply(isDebit: Boolean, isUnionPay: Boolean, unionPay: UnionPayProperties): UnionPayFetchCapabilitiesPayload = {
    val __obj = js.Dynamic.literal(isDebit = isDebit.asInstanceOf[js.Any], isUnionPay = isUnionPay.asInstanceOf[js.Any], unionPay = unionPay.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnionPayFetchCapabilitiesPayload]
  }
}

