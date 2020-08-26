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
    RequestId: string
  ): CreateMultiplexRequest = {
    val __obj = js.Dynamic.literal(AvailabilityZones = AvailabilityZones.asInstanceOf[js.Any], MultiplexSettings = MultiplexSettings.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMultiplexRequest]
  }
  @scala.inline
  implicit class CreateMultiplexRequestOps[Self <: CreateMultiplexRequest] (val x: Self) extends AnyVal {
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
    def setAvailabilityZonesVarargs(value: string*): Self = this.set("AvailabilityZones", js.Array(value :_*))
    @scala.inline
    def setAvailabilityZones(value: listOfString): Self = this.set("AvailabilityZones", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiplexSettings(value: MultiplexSettings): Self = this.set("MultiplexSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestId(value: string): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

