package typings.braintreeDashWeb.braintreeDashWebMod

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
    val __obj = js.Dynamic.literal(isDebit = isDebit, isUnionPay = isUnionPay, unionPay = unionPay)
  
    __obj.asInstanceOf[UnionPayFetchCapabilitiesPayload]
  }
}

