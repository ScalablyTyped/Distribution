package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchRetryStrategy extends js.Object {
  /**
    * The number of times to attempt to retry, if the job fails. Valid values are 1–10.
    */
  var Attempts: js.UndefOr[Integer] = js.native
}

object BatchRetryStrategy {
  @scala.inline
  def apply(Attempts: Int | Double = null): BatchRetryStrategy = {
    val __obj = js.Dynamic.literal()
    if (Attempts != null) __obj.updateDynamic("Attempts")(Attempts.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchRetryStrategy]
  }
}

