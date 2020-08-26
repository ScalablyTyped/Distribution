package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrustedSigners extends js.Object {
  /**
    * Specifies whether you want to require viewers to use signed URLs to access the files specified by PathPattern and TargetOriginId.
    */
  var Enabled: Boolean = js.native
  /**
    *  Optional: A complex type that contains trusted signers for this cache behavior. If Quantity is 0, you can omit Items.
    */
  var Items: js.UndefOr[AwsAccountNumberList] = js.native
  /**
    * The number of trusted signers for this cache behavior.
    */
  var Quantity: integer = js.native
}

object TrustedSigners {
  @scala.inline
  def apply(Enabled: Boolean, Quantity: integer): TrustedSigners = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustedSigners]
  }
  @scala.inline
  implicit class TrustedSignersOps[Self <: TrustedSigners] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: String*): Self = this.set("Items", js.Array(value :_*))
    @scala.inline
    def setItems(value: AwsAccountNumberList): Self = this.set("Items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("Items", js.undefined)
  }
  
}

