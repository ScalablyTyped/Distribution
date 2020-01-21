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
  def apply(addOrUpdateLabels: labelsMap = null, removeLabels: labelsKeyList = null): UpdateLabelsPayload = {
    val __obj = js.Dynamic.literal()
    if (addOrUpdateLabels != null) __obj.updateDynamic("addOrUpdateLabels")(addOrUpdateLabels.asInstanceOf[js.Any])
    if (removeLabels != null) __obj.updateDynamic("removeLabels")(removeLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLabelsPayload]
  }
}

