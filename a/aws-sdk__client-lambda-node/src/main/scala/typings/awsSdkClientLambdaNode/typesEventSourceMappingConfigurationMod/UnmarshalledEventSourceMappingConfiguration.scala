package typings.awsSdkClientLambdaNode.typesEventSourceMappingConfigurationMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledEventSourceMappingConfiguration extends EventSourceMappingConfiguration {
  /**
    * <p>The UTC time string indicating the last time the event mapping was updated.</p>
    */
  @JSName("LastModified")
  var LastModified_UnmarshalledEventSourceMappingConfiguration: js.UndefOr[Date] = js.undefined
}

object UnmarshalledEventSourceMappingConfiguration {
  @scala.inline
  def apply(
    BatchSize: js.UndefOr[Double] = js.undefined,
    EventSourceArn: String = null,
    FunctionArn: String = null,
    LastModified: Date = null,
    LastProcessingResult: String = null,
    State: String = null,
    StateTransitionReason: String = null,
    UUID: String = null
  ): UnmarshalledEventSourceMappingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BatchSize)) __obj.updateDynamic("BatchSize")(BatchSize.get.asInstanceOf[js.Any])
    if (EventSourceArn != null) __obj.updateDynamic("EventSourceArn")(EventSourceArn.asInstanceOf[js.Any])
    if (FunctionArn != null) __obj.updateDynamic("FunctionArn")(FunctionArn.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (LastProcessingResult != null) __obj.updateDynamic("LastProcessingResult")(LastProcessingResult.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateTransitionReason != null) __obj.updateDynamic("StateTransitionReason")(StateTransitionReason.asInstanceOf[js.Any])
    if (UUID != null) __obj.updateDynamic("UUID")(UUID.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledEventSourceMappingConfiguration]
  }
}

