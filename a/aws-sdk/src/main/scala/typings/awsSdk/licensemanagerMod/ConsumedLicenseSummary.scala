package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsumedLicenseSummary extends js.Object {
  /**
    * Number of licenses consumed by the resource.
    */
  var ConsumedLicenses: js.UndefOr[BoxLong] = js.native
  /**
    * Resource type of the resource consuming a license.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.licensemanagerMod.ResourceType] = js.native
}

object ConsumedLicenseSummary {
  @scala.inline
  def apply(ConsumedLicenses: js.UndefOr[BoxLong] = js.undefined, ResourceType: ResourceType = null): ConsumedLicenseSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ConsumedLicenses)) __obj.updateDynamic("ConsumedLicenses")(ConsumedLicenses.get.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumedLicenseSummary]
  }
}

