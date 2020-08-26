package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHumanTaskUiResponse extends js.Object {
  /**
    * The timestamp when the human task user interface was created.
    */
  var CreationTime: Timestamp = js.native
  /**
    * The Amazon Resource Name (ARN) of the human task user interface (worker task template).
    */
  var HumanTaskUiArn: typings.awsSdk.sagemakerMod.HumanTaskUiArn = js.native
  /**
    * The name of the human task user interface (worker task template).
    */
  var HumanTaskUiName: typings.awsSdk.sagemakerMod.HumanTaskUiName = js.native
  /**
    * The status of the human task user interface (worker task template). Valid values are listed below.
    */
  var HumanTaskUiStatus: js.UndefOr[typings.awsSdk.sagemakerMod.HumanTaskUiStatus] = js.native
  var UiTemplate: UiTemplateInfo = js.native
}

object DescribeHumanTaskUiResponse {
  @scala.inline
  def apply(
    CreationTime: Timestamp,
    HumanTaskUiArn: HumanTaskUiArn,
    HumanTaskUiName: HumanTaskUiName,
    UiTemplate: UiTemplateInfo
  ): DescribeHumanTaskUiResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], HumanTaskUiArn = HumanTaskUiArn.asInstanceOf[js.Any], HumanTaskUiName = HumanTaskUiName.asInstanceOf[js.Any], UiTemplate = UiTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHumanTaskUiResponse]
  }
  @scala.inline
  implicit class DescribeHumanTaskUiResponseOps[Self <: DescribeHumanTaskUiResponse] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setHumanTaskUiArn(value: HumanTaskUiArn): Self = this.set("HumanTaskUiArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setHumanTaskUiName(value: HumanTaskUiName): Self = this.set("HumanTaskUiName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUiTemplate(value: UiTemplateInfo): Self = this.set("UiTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def setHumanTaskUiStatus(value: HumanTaskUiStatus): Self = this.set("HumanTaskUiStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHumanTaskUiStatus: Self = this.set("HumanTaskUiStatus", js.undefined)
  }
  
}

