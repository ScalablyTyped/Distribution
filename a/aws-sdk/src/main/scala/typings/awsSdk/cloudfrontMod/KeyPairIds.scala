package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyPairIds extends js.Object {
  /**
    * A complex type that lists the active CloudFront key pairs, if any, that are associated with AwsAccountNumber. For more information, see ActiveTrustedSigners.
    */
  var Items: js.UndefOr[KeyPairIdList] = js.native
  /**
    * The number of active CloudFront key pairs for AwsAccountNumber. For more information, see ActiveTrustedSigners.
    */
  var Quantity: integer = js.native
}

object KeyPairIds {
  @scala.inline
  def apply(Quantity: integer, Items: KeyPairIdList = null): KeyPairIds = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    if (Items != null) __obj.updateDynamic("Items")(Items.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPairIds]
  }
}

