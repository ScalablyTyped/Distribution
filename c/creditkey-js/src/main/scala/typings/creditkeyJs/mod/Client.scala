package typings.creditkeyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("creditkey-js", "Client")
@js.native
class Client protected () extends js.Object {
  def this(key: String) = this()
  def this(key: String, platform: Platform) = this()
  
  def begin_checkout(
    cartItems: js.Array[CartItem],
    billingAddress: Address,
    shippingAddress: Address,
    charges: Charges,
    remoteId: String,
    customerId: String,
    returnUrl: String,
    cancelUrl: String,
    mode: Mode,
    merchantData: js.Any
  ): js.Promise[CheckoutResponse] = js.native
  
  def get_customer(email: String, customer_id: String): js.Promise[CustomerResponse] = js.native
  
  def get_marketing_display(charges: Charges): js.Promise[String] = js.native
  def get_marketing_display(
    charges: Charges,
    `type`: js.UndefOr[scala.Nothing],
    display: js.UndefOr[scala.Nothing],
    size: Size
  ): js.Promise[String] = js.native
  def get_marketing_display(charges: Charges, `type`: js.UndefOr[scala.Nothing], display: Display): js.Promise[String] = js.native
  def get_marketing_display(charges: Charges, `type`: js.UndefOr[scala.Nothing], display: Display, size: Size): js.Promise[String] = js.native
  def get_marketing_display(charges: Charges, `type`: Copy): js.Promise[String] = js.native
  def get_marketing_display(charges: Charges, `type`: Copy, display: js.UndefOr[scala.Nothing], size: Size): js.Promise[String] = js.native
  def get_marketing_display(charges: Charges, `type`: Copy, display: Display): js.Promise[String] = js.native
  def get_marketing_display(charges: Charges, `type`: Copy, display: Display, size: Size): js.Promise[String] = js.native
  
  def is_displayed_in_checkout(cartItems: js.Array[CartItem]): js.Promise[Boolean] = js.native
}
