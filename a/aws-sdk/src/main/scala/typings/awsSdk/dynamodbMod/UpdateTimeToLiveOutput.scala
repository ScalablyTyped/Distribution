package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTimeToLiveOutput extends js.Object {
  /**
    * Represents the output of an UpdateTimeToLive operation.
    */
  var TimeToLiveSpecification: js.UndefOr[typings.awsSdk.dynamodbMod.TimeToLiveSpecification] = js.native
}

object UpdateTimeToLiveOutput {
  @scala.inline
  def apply(TimeToLiveSpecification: TimeToLiveSpecification = null): UpdateTimeToLiveOutput = {
    val __obj = js.Dynamic.literal()
    if (TimeToLiveSpecification != null) __obj.updateDynamic("TimeToLiveSpecification")(TimeToLiveSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTimeToLiveOutput]
  }
}

