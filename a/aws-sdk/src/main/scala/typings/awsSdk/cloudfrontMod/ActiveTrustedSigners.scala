package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveTrustedSigners extends js.Object {
  /**
    * Enabled is true if any of the AWS accounts listed in the TrustedSigners complex type for this distribution have active CloudFront key pairs. If not, Enabled is false.
    */
  var Enabled: Boolean = js.native
  /**
    * A complex type that contains one Signer complex type for each trusted signer that is specified in the TrustedSigners complex type.
    */
  var Items: js.UndefOr[SignerList] = js.native
  /**
    * The number of trusted signers specified in the TrustedSigners complex type.
    */
  var Quantity: integer = js.native
}

object ActiveTrustedSigners {
  @scala.inline
  def apply(Enabled: Boolean, Quantity: integer): ActiveTrustedSigners = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveTrustedSigners]
  }
  @scala.inline
  implicit class ActiveTrustedSignersOps[Self <: ActiveTrustedSigners] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuantity(value: integer): Self = this.set("Quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: _Signer*): Self = this.set("Items", js.Array(value :_*))
    @scala.inline
    def setItems(value: SignerList): Self = this.set("Items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("Items", js.undefined)
  }
  
}

