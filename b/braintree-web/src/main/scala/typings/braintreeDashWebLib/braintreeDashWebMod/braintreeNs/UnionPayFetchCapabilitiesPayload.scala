package typings
package braintreeDashWebLib.braintreeDashWebMod.braintreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnionPayFetchCapabilitiesPayload extends js.Object {
  var isDebit: scala.Boolean
  var isUnionPay: scala.Boolean
  var unionPay: UnionPayProperties
}

object UnionPayFetchCapabilitiesPayload {
  @scala.inline
  def apply(isDebit: scala.Boolean, isUnionPay: scala.Boolean, unionPay: UnionPayProperties): UnionPayFetchCapabilitiesPayload = {
    val __obj = js.Dynamic.literal(isDebit = isDebit, isUnionPay = isUnionPay, unionPay = unionPay)
  
    __obj.asInstanceOf[UnionPayFetchCapabilitiesPayload]
  }
}

