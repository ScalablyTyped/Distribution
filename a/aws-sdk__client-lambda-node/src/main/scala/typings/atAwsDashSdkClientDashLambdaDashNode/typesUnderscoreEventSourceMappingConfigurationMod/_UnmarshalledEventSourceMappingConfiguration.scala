package typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreEventSourceMappingConfigurationMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledEventSourceMappingConfiguration extends _EventSourceMappingConfiguration {
  /**
    * <p>The UTC time string indicating the last time the event mapping was updated.</p>
    */
  @JSName("LastModified")
  var LastModified__UnmarshalledEventSourceMappingConfiguration: js.UndefOr[Date] = js.undefined
}

object _UnmarshalledEventSourceMappingConfiguration {
  @scala.inline
  def apply(
    BatchSize: Int | Double = null,
    EventSourceArn: String = null,
    FunctionArn: String = null,
    LastModified: Date = null,
    LastProcessingResult: String = null,
    State: String = null,
    StateTransitionReason: String = null,
    UUID: String = null
  ): _UnmarshalledEventSourceMappingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (BatchSize != null) __obj.updateDynamic("BatchSize")(BatchSize.asInstanceOf[js.Any])
    if (EventSourceArn != null) __obj.updateDynamic("EventSourceArn")(EventSourceArn)
    if (FunctionArn != null) __obj.updateDynamic("FunctionArn")(FunctionArn)
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified)
    if (LastProcessingResult != null) __obj.updateDynamic("LastProcessingResult")(LastProcessingResult)
    if (State != null) __obj.updateDynamic("State")(State)
    if (StateTransitionReason != null) __obj.updateDynamic("StateTransitionReason")(StateTransitionReason)
    if (UUID != null) __obj.updateDynamic("UUID")(UUID)
    __obj.asInstanceOf[_UnmarshalledEventSourceMappingConfiguration]
  }
}

