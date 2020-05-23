package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeConfigurationOption extends js.Object {
  /**
    * The estimated disk utilizaton percentage.
    */
  var EstimatedDiskUtilizationPercent: js.UndefOr[DoubleOptional] = js.native
  /**
    * The category of the node configuration recommendation.
    */
  var Mode: js.UndefOr[typings.awsSdk.redshiftMod.Mode] = js.native
  /**
    * The node type, such as, "ds2.8xlarge".
    */
  var NodeType: js.UndefOr[String] = js.native
  /**
    * The number of nodes.
    */
  var NumberOfNodes: js.UndefOr[Integer] = js.native
}

object NodeConfigurationOption {
  @scala.inline
  def apply(
    EstimatedDiskUtilizationPercent: js.UndefOr[DoubleOptional] = js.undefined,
    Mode: Mode = null,
    NodeType: String = null,
    NumberOfNodes: js.UndefOr[Integer] = js.undefined
  ): NodeConfigurationOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(EstimatedDiskUtilizationPercent)) __obj.updateDynamic("EstimatedDiskUtilizationPercent")(EstimatedDiskUtilizationPercent.get.asInstanceOf[js.Any])
    if (Mode != null) __obj.updateDynamic("Mode")(Mode.asInstanceOf[js.Any])
    if (NodeType != null) __obj.updateDynamic("NodeType")(NodeType.asInstanceOf[js.Any])
    if (!js.isUndefined(NumberOfNodes)) __obj.updateDynamic("NumberOfNodes")(NumberOfNodes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeConfigurationOption]
  }
}

