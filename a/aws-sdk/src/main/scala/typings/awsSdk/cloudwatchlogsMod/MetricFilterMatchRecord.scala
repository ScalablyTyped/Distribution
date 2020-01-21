package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricFilterMatchRecord extends js.Object {
  /**
    * The raw event data.
    */
  var eventMessage: js.UndefOr[EventMessage] = js.native
  /**
    * The event number.
    */
  var eventNumber: js.UndefOr[EventNumber] = js.native
  /**
    * The values extracted from the event data by the filter.
    */
  var extractedValues: js.UndefOr[ExtractedValues] = js.native
}

object MetricFilterMatchRecord {
  @scala.inline
  def apply(
    eventMessage: EventMessage = null,
    eventNumber: Int | Double = null,
    extractedValues: ExtractedValues = null
  ): MetricFilterMatchRecord = {
    val __obj = js.Dynamic.literal()
    if (eventMessage != null) __obj.updateDynamic("eventMessage")(eventMessage.asInstanceOf[js.Any])
    if (eventNumber != null) __obj.updateDynamic("eventNumber")(eventNumber.asInstanceOf[js.Any])
    if (extractedValues != null) __obj.updateDynamic("extractedValues")(extractedValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricFilterMatchRecord]
  }
}

