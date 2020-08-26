package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLabelsRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
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
  def apply(Labels: SharedLabels, ResourceId: ResourceIdType): CreateLabelsRequest = {
    val __obj = js.Dynamic.literal(Labels = Labels.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLabelsRequest]
  }
  @scala.inline
  implicit class CreateLabelsRequestOps[Self <: CreateLabelsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLabelsVarargs(value: SharedLabel*): Self = this.set("Labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: SharedLabels): Self = this.set("Labels", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceId(value: ResourceIdType): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = this.set("AuthenticationToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthenticationToken: Self = this.set("AuthenticationToken", js.undefined)
  }
  
}

