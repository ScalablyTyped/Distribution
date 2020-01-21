package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BillingGroupMetadata extends js.Object {
  /**
    * The date the billing group was created.
    */
  var creationDate: js.UndefOr[CreationDate] = js.native
}

object BillingGroupMetadata {
  @scala.inline
  def apply(creationDate: CreationDate = null): BillingGroupMetadata = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingGroupMetadata]
  }
}

