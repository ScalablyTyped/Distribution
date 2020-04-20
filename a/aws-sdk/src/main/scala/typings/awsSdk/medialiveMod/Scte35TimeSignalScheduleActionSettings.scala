package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scte35TimeSignalScheduleActionSettings extends js.Object {
  /**
    * The list of SCTE-35 descriptors accompanying the SCTE-35 time_signal.
    */
  var Scte35Descriptors: listOfScte35Descriptor = js.native
}

object Scte35TimeSignalScheduleActionSettings {
  @scala.inline
  def apply(Scte35Descriptors: listOfScte35Descriptor): Scte35TimeSignalScheduleActionSettings = {
    val __obj = js.Dynamic.literal(Scte35Descriptors = Scte35Descriptors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scte35TimeSignalScheduleActionSettings]
  }
}

