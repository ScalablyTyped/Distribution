package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLabelsRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  /**
    * List of labels to add to the resource.
    */
  var Labels: SharedLabels = js.native
  /**
    * The ID of the resource.
    */
  var ResourceId: ResourceIdType = js.native
}

object CreateLabelsRequest {
  @scala.inline
  def apply(
    Labels: SharedLabels,
    ResourceId: ResourceIdType,
    AuthenticationToken: AuthenticationHeaderType = null
  ): CreateLabelsRequest = {
    val __obj = js.Dynamic.literal(Labels = Labels.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLabelsRequest]
  }
}

