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
  def apply(): ComplianceByResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceByResource]
  }
  @scala.inline
  implicit class ComplianceByResourceOps[Self <: ComplianceByResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCompliance(value: Compliance): Self = this.set("Compliance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompliance: Self = this.set("Compliance", js.undefined)
    @scala.inline
    def setResourceId(value: BaseResourceId): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceId: Self = this.set("ResourceId", js.undefined)
    @scala.inline
    def setResourceType(value: StringWithCharLimit256): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
  }
  
}

