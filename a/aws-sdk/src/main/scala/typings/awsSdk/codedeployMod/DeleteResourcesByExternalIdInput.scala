package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteResourcesByExternalIdInput extends js.Object {
  /**
    * The unique ID of an external resource (for example, a CloudFormation stack ID) that is linked to one or more CodeDeploy resources.
    */
  var externalId: js.UndefOr[ExternalId] = js.native
}

object DeleteResourcesByExternalIdInput {
  @scala.inline
  def apply(externalId: ExternalId = null): DeleteResourcesByExternalIdInput = {
    val __obj = js.Dynamic.literal()
    if (externalId != null) __obj.updateDynamic("externalId")(externalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourcesByExternalIdInput]
  }
}

