package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateLabelsPayload extends js.Object {
  /**
    * Kubernetes labels to be added or updated.
    */
  var addOrUpdateLabels: js.UndefOr[labelsMap] = js.native
  /**
    * Kubernetes labels to be removed.
    */
  var removeLabels: js.UndefOr[labelsKeyList] = js.native
}

object UpdateLabelsPayload {
  @scala.inline
  def apply(): UpdateLabelsPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateLabelsPayload]
  }
  @scala.inline
  implicit class UpdateLabelsPayloadOps[Self <: UpdateLabelsPayload] (val x: Self) extends AnyVal {
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
    def setAddOrUpdateLabels(value: labelsMap): Self = this.set("addOrUpdateLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddOrUpdateLabels: Self = this.set("addOrUpdateLabels", js.undefined)
    @scala.inline
    def setRemoveLabelsVarargs(value: String*): Self = this.set("removeLabels", js.Array(value :_*))
    @scala.inline
    def setRemoveLabels(value: labelsKeyList): Self = this.set("removeLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveLabels: Self = this.set("removeLabels", js.undefined)
  }
  
}

