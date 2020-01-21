package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MerchantAccountGateway extends js.Object {
  def all(): js.Promise[js.Array[MerchantAccount]] = js.native
  def create(request: MerchantAccountCreateRequest): js.Promise[ValidatedResponse[MerchantAccount]] = js.native
  def createForCurrency(currency: String): js.Promise[ValidatedResponse[MerchantAccount]] = js.native
  def createForCurrency(currency: String, id: String): js.Promise[ValidatedResponse[MerchantAccount]] = js.native
  def find(merchantAccountId: String): js.Promise[MerchantAccount] = js.native
  def update(merchantAccountId: String, updates: MerchantAccountUpdateRequest): js.Promise[ValidatedResponse[MerchantAccount]] = js.native
}

