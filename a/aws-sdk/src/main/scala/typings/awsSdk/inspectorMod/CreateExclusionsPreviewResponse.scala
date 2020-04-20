package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateExclusionsPreviewResponse extends js.Object {
  /**
    * Specifies the unique identifier of the requested exclusions preview. You can use the unique identifier to retrieve the exclusions preview when running the GetExclusionsPreview API.
    */
  var previewToken: UUID = js.native
}

object CreateExclusionsPreviewResponse {
  @scala.inline
  def apply(previewToken: UUID): CreateExclusionsPreviewResponse = {
    val __obj = js.Dynamic.literal(previewToken = previewToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExclusionsPreviewResponse]
  }
}

