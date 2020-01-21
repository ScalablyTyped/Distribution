package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionedCapacityDescription extends js.Object {
  /**
    * The ID that identifies the provisioned capacity unit.
    */
  var CapacityId: js.UndefOr[String] = js.native
  /**
    * The date that the provisioned capacity unit expires, in Universal Coordinated Time (UTC).
    */
  var ExpirationDate: js.UndefOr[String] = js.native
  /**
    * The date that the provisioned capacity unit was purchased, in Universal Coordinated Time (UTC).
    */
  var StartDate: js.UndefOr[String] = js.native
}

object ProvisionedCapacityDescription {
  @scala.inline
  def apply(CapacityId: String = null, ExpirationDate: String = null, StartDate: String = null): ProvisionedCapacityDescription = {
    val __obj = js.Dynamic.literal()
    if (CapacityId != null) __obj.updateDynamic("CapacityId")(CapacityId.asInstanceOf[js.Any])
    if (ExpirationDate != null) __obj.updateDynamic("ExpirationDate")(ExpirationDate.asInstanceOf[js.Any])
    if (StartDate != null) __obj.updateDynamic("StartDate")(StartDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionedCapacityDescription]
  }
}

