package typings.awsSdk.textractMod

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
    * The Amazon Resource Name (ARN) of the flow definition.
    */
  var FlowDefinitionArn: typings.awsSdk.textractMod.FlowDefinitionArn = js.native
  /**
    * The name of the human workflow used for this image. This should be kept unique within a region.
    */
  var HumanLoopName: typings.awsSdk.textractMod.HumanLoopName = js.native
}

object HumanLoopConfig {
  @scala.inline
  def apply(
    FlowDefinitionArn: FlowDefinitionArn,
    HumanLoopName: HumanLoopName,
    DataAttributes: HumanLoopDataAttributes = null
  ): HumanLoopConfig = {
    val __obj = js.Dynamic.literal(FlowDefinitionArn = FlowDefinitionArn.asInstanceOf[js.Any], HumanLoopName = HumanLoopName.asInstanceOf[js.Any])
    if (DataAttributes != null) __obj.updateDynamic("DataAttributes")(DataAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanLoopConfig]
  }
}

