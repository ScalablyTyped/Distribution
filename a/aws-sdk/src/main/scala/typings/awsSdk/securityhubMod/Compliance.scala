package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compliance extends js.Object {
  /**
    * List of requirements that are related to a standards control.
    */
  var RelatedRequirements: js.UndefOr[RelatedRequirementsList] = js.native
  /**
    * The result of a standards check.
    */
  var Status: js.UndefOr[ComplianceStatus] = js.native
}

object Compliance {
  @scala.inline
  def apply(RelatedRequirements: RelatedRequirementsList = null, Status: ComplianceStatus = null): Compliance = {
    val __obj = js.Dynamic.literal()
    if (RelatedRequirements != null) __obj.updateDynamic("RelatedRequirements")(RelatedRequirements.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compliance]
  }
}

