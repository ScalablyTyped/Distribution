package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Multiplex extends js.Object {
  /**
    * The unique arn of the multiplex.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * A list of availability zones for the multiplex.
    */
  var AvailabilityZones: js.UndefOr[listOfString] = js.native
  /**
    * A list of the multiplex output destinations.
    */
  var Destinations: js.UndefOr[listOfMultiplexOutputDestination] = js.native
  /**
    * The unique id of the multiplex.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * Configuration for a multiplex event.
    */
  var MultiplexSettings: js.UndefOr[typings.awsSdk.medialiveMod.MultiplexSettings] = js.native
  /**
    * The name of the multiplex.
    */
  var Name: js.UndefOr[string] = js.native
  /**
    * The number of currently healthy pipelines.
    */
  var PipelinesRunningCount: js.UndefOr[integer] = js.native
  /**
    * The number of programs in the multiplex.
    */
  var ProgramCount: js.UndefOr[integer] = js.native
  /**
    * The current state of the multiplex.
    */
  var State: js.UndefOr[MultiplexState] = js.native
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typings.awsSdk.medialiveMod.Tags] = js.native
}

object Multiplex {
  @scala.inline
  def apply(): Multiplex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Multiplex]
  }
  @scala.inline
  implicit class MultiplexOps[Self <: Multiplex] (val x: Self) extends AnyVal {
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
    def setArn(value: string): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setAvailabilityZonesVarargs(value: string*): Self = this.set("AvailabilityZones", js.Array(value :_*))
    @scala.inline
    def setAvailabilityZones(value: listOfString): Self = this.set("AvailabilityZones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("AvailabilityZones", js.undefined)
    @scala.inline
    def setDestinationsVarargs(value: MultiplexOutputDestination*): Self = this.set("Destinations", js.Array(value :_*))
    @scala.inline
    def setDestinations(value: listOfMultiplexOutputDestination): Self = this.set("Destinations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinations: Self = this.set("Destinations", js.undefined)
    @scala.inline
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setMultiplexSettings(value: MultiplexSettings): Self = this.set("MultiplexSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiplexSettings: Self = this.set("MultiplexSettings", js.undefined)
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setPipelinesRunningCount(value: integer): Self = this.set("PipelinesRunningCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePipelinesRunningCount: Self = this.set("PipelinesRunningCount", js.undefined)
    @scala.inline
    def setProgramCount(value: integer): Self = this.set("ProgramCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgramCount: Self = this.set("ProgramCount", js.undefined)
    @scala.inline
    def setState(value: MultiplexState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

