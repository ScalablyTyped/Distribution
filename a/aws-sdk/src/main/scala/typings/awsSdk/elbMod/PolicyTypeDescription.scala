package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyTypeDescription extends js.Object {
  /**
    * A description of the policy type.
    */
  var Description: js.UndefOr[typings.awsSdk.elbMod.Description] = js.native
  /**
    * The description of the policy attributes associated with the policies defined by Elastic Load Balancing.
    */
  var PolicyAttributeTypeDescriptions: js.UndefOr[typings.awsSdk.elbMod.PolicyAttributeTypeDescriptions] = js.native
  /**
    * The name of the policy type.
    */
  var PolicyTypeName: js.UndefOr[typings.awsSdk.elbMod.PolicyTypeName] = js.native
}

object PolicyTypeDescription {
  @scala.inline
  def apply(
    Description: Description = null,
    PolicyAttributeTypeDescriptions: PolicyAttributeTypeDescriptions = null,
    PolicyTypeName: PolicyTypeName = null
  ): PolicyTypeDescription = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (PolicyAttributeTypeDescriptions != null) __obj.updateDynamic("PolicyAttributeTypeDescriptions")(PolicyAttributeTypeDescriptions.asInstanceOf[js.Any])
    if (PolicyTypeName != null) __obj.updateDynamic("PolicyTypeName")(PolicyTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyTypeDescription]
  }
}

