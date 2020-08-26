package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetActionSummary extends js.Object {
  /**
    * The name of the action which automatically creates the data set's contents.
    */
  var actionName: js.UndefOr[DatasetActionName] = js.native
  /**
    * The type of action by which the data set's contents are automatically created.
    */
  var actionType: js.UndefOr[DatasetActionType] = js.native
}

object DatasetActionSummary {
  @scala.inline
  def apply(): DatasetActionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetActionSummary]
  }
  @scala.inline
  implicit class DatasetActionSummaryOps[Self <: DatasetActionSummary] (val x: Self) extends AnyVal {
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
    def setActionName(value: DatasetActionName): Self = this.set("actionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionName: Self = this.set("actionName", js.undefined)
    @scala.inline
    def setActionType(value: DatasetActionType): Self = this.set("actionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionType: Self = this.set("actionType", js.undefined)
  }
  
}

