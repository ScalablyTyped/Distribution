package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLabelsRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  /**
    * Flag to request removal of all labels from the specified resource.
    */
  var DeleteAll: js.UndefOr[BooleanType] = js.native
  /**
    * List of labels to delete from the resource.
    */
  var Labels: js.UndefOr[SharedLabels] = js.native
  /**
    * The ID of the resource.
    */
  var ResourceId: ResourceIdType = js.native
}

object DeleteLabelsRequest {
  @scala.inline
  def apply(ResourceId: ResourceIdType): DeleteLabelsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLabelsRequest]
  }
  @scala.inline
  implicit class DeleteLabelsRequestOps[Self <: DeleteLabelsRequest] (val x: Self) extends AnyVal {
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
    def setResourceId(value: ResourceIdType): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = this.set("AuthenticationToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthenticationToken: Self = this.set("AuthenticationToken", js.undefined)
    @scala.inline
    def setDeleteAll(value: BooleanType): Self = this.set("DeleteAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteAll: Self = this.set("DeleteAll", js.undefined)
    @scala.inline
    def setLabelsVarargs(value: SharedLabel*): Self = this.set("Labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: SharedLabels): Self = this.set("Labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("Labels", js.undefined)
  }
  
}

