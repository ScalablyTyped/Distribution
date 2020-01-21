package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsVpcPeeredResult extends js.Object {
  /**
    * Returns true if the Lightsail VPC is peered; otherwise, false.
    */
  var isPeered: js.UndefOr[Boolean] = js.native
}

object IsVpcPeeredResult {
  @scala.inline
  def apply(isPeered: js.UndefOr[Boolean] = js.undefined): IsVpcPeeredResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isPeered)) __obj.updateDynamic("isPeered")(isPeered.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsVpcPeeredResult]
  }
}

