package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanLoopConfig extends js.Object {
  /**
    * Sets attributes of the input data.
    */
  var DataAttributes: js.UndefOr[HumanLoopDataAttributes] = js.native
  /**
    * The Amazon Resource Name (ARN) of the flow definition. You can create a flow definition by using the Amazon Sagemaker CreateFlowDefinition Operation. 
    */
  var FlowDefinitionArn: typings.awsSdk.rekognitionMod.FlowDefinitionArn = js.native
  /**
    * The name of the human review used for this image. This should be kept unique within a region.
    */
  var HumanLoopName: typings.awsSdk.rekognitionMod.HumanLoopName = js.native
}

object HumanLoopConfig {
  @scala.inline
  def apply(FlowDefinitionArn: FlowDefinitionArn, HumanLoopName: HumanLoopName): HumanLoopConfig = {
    val __obj = js.Dynamic.literal(FlowDefinitionArn = FlowDefinitionArn.asInstanceOf[js.Any], HumanLoopName = HumanLoopName.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanLoopConfig]
  }
  @scala.inline
  implicit class HumanLoopConfigOps[Self <: HumanLoopConfig] (val x: Self) extends AnyVal {
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
    def setFlowDefinitionArn(value: FlowDefinitionArn): Self = this.set("FlowDefinitionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setHumanLoopName(value: HumanLoopName): Self = this.set("HumanLoopName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataAttributes(value: HumanLoopDataAttributes): Self = this.set("DataAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataAttributes: Self = this.set("DataAttributes", js.undefined)
  }
  
}

