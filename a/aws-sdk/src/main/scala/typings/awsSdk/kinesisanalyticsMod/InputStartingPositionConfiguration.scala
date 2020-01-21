package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputStartingPositionConfiguration extends js.Object {
  /**
    * The starting position on the stream.    NOW - Start reading just after the most recent record in the stream, start at the request time stamp that the customer issued.    TRIM_HORIZON - Start reading at the last untrimmed record in the stream, which is the oldest record available in the stream. This option is not available for an Amazon Kinesis Firehose delivery stream.    LAST_STOPPED_POINT - Resume reading from where the application last stopped reading.  
    */
  var InputStartingPosition: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.InputStartingPosition] = js.native
}

object InputStartingPositionConfiguration {
  @scala.inline
  def apply(InputStartingPosition: InputStartingPosition = null): InputStartingPositionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (InputStartingPosition != null) __obj.updateDynamic("InputStartingPosition")(InputStartingPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputStartingPositionConfiguration]
  }
}

