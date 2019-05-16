package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MerchantAccountGateway extends js.Object {
  def all(): js.Promise[js.Array[MerchantAccount]] = js.native
  def create(request: MerchantAccountCreateRequest): js.Promise[ValidatedResponse[MerchantAccount]] = js.native
  def createForCurrency(currency: java.lang.String): js.Promise[ValidatedResponse[MerchantAccount]] = js.native
  def createForCurrency(currency: java.lang.String, id: java.lang.String): js.Promise[ValidatedResponse[MerchantAccount]] = js.native
  def find(merchantAccountId: java.lang.String): js.Promise[MerchantAccount] = js.native
  def update(merchantAccountId: java.lang.String, updates: MerchantAccountUpdateRequest): js.Promise[ValidatedResponse[MerchantAccount]] = js.native
}

