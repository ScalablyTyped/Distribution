package typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreProvisionedCapacityDescriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ProvisionedCapacityDescription extends js.Object {
  /**
    * <p>The ID that identifies the provisioned capacity unit.</p>
    */
  var CapacityId: js.UndefOr[String] = js.undefined
  /**
    * <p>The date that the provisioned capacity unit expires, in Universal Coordinated Time (UTC).</p>
    */
  var ExpirationDate: js.UndefOr[String] = js.undefined
  /**
    * <p>The date that the provisioned capacity unit was purchased, in Universal Coordinated Time (UTC).</p>
    */
  var StartDate: js.UndefOr[String] = js.undefined
}

object _ProvisionedCapacityDescription {
  @scala.inline
  def apply(CapacityId: String = null, ExpirationDate: String = null, StartDate: String = null): _ProvisionedCapacityDescription = {
    val __obj = js.Dynamic.literal()
    if (CapacityId != null) __obj.updateDynamic("CapacityId")(CapacityId)
    if (ExpirationDate != null) __obj.updateDynamic("ExpirationDate")(ExpirationDate)
    if (StartDate != null) __obj.updateDynamic("StartDate")(StartDate)
    __obj.asInstanceOf[_ProvisionedCapacityDescription]
  }
}

