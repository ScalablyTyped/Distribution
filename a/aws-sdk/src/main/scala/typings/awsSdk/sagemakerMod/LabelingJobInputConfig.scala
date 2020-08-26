package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelingJobInputConfig extends js.Object {
  /**
    * Attributes of the data specified by the customer.
    */
  var DataAttributes: js.UndefOr[LabelingJobDataAttributes] = js.native
  /**
    * The location of the input data.
    */
  var DataSource: LabelingJobDataSource = js.native
}

object LabelingJobInputConfig {
  @scala.inline
  def apply(DataSource: LabelingJobDataSource): LabelingJobInputConfig = {
    val __obj = js.Dynamic.literal(DataSource = DataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelingJobInputConfig]
  }
  @scala.inline
  implicit class LabelingJobInputConfigOps[Self <: LabelingJobInputConfig] (val x: Self) extends AnyVal {
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
    def setDataSource(value: LabelingJobDataSource): Self = this.set("DataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataAttributes(value: LabelingJobDataAttributes): Self = this.set("DataAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataAttributes: Self = this.set("DataAttributes", js.undefined)
  }
  
}

