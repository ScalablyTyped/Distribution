package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplianceByResource extends js.Object {
  /**
    * Indicates whether the AWS resource complies with all of the AWS Config rules that evaluated it.
    */
  var Compliance: js.UndefOr[typings.awsSdk.configserviceMod.Compliance] = js.native
  /**
    * The ID of the AWS resource that was evaluated.
    */
  var ResourceId: js.UndefOr[BaseResourceId] = js.native
  /**
    * The type of the AWS resource that was evaluated.
    */
  var ResourceType: js.UndefOr[StringWithCharLimit256] = js.native
}

object ComplianceByResource {
  @scala.inline
  def apply(
    Compliance: Compliance = null,
    ResourceId: BaseResourceId = null,
    ResourceType: StringWithCharLimit256 = null
  ): ComplianceByResource = {
    val __obj = js.Dynamic.literal()
    if (Compliance != null) __obj.updateDynamic("Compliance")(Compliance.asInstanceOf[js.Any])
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplianceByResource]
  }
}

