package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMultiplexRequest extends js.Object {
  /**
    * A list of availability zones for the multiplex. You must specify exactly two.
    */
  var AvailabilityZones: listOfString = js.native
  /**
    * Configuration for a multiplex event.
    */
  var MultiplexSettings: typings.awsSdk.medialiveMod.MultiplexSettings = js.native
  /**
    * Name of multiplex.
    */
  var Name: string = js.native
  /**
    * Unique request ID. This prevents retries from creating multiple
  resources.
    */
  var RequestId: string = js.native
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typings.awsSdk.medialiveMod.Tags] = js.native
}

object CreateMultiplexRequest {
  @scala.inline
  def apply(
    AvailabilityZones: listOfString,
    MultiplexSettings: MultiplexSettings,
    Name: string,
    RequestId: string,
    Tags: Tags = null
  ): CreateMultiplexRequest = {
    val __obj = js.Dynamic.literal(AvailabilityZones = AvailabilityZones.asInstanceOf[js.Any], MultiplexSettings = MultiplexSettings.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMultiplexRequest]
  }
}

