package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanaryTimeline extends js.Object {
  /**
    * The date and time the canary was created.
    */
  var Created: js.UndefOr[Timestamp] = js.native
  /**
    * The date and time the canary was most recently modified.
    */
  var LastModified: js.UndefOr[Timestamp] = js.native
  /**
    * The date and time that the canary's most recent run started.
    */
  var LastStarted: js.UndefOr[Timestamp] = js.native
  /**
    * The date and time that the canary's most recent run ended.
    */
  var LastStopped: js.UndefOr[Timestamp] = js.native
}

object CanaryTimeline {
  @scala.inline
  def apply(
    Created: Timestamp = null,
    LastModified: Timestamp = null,
    LastStarted: Timestamp = null,
    LastStopped: Timestamp = null
  ): CanaryTimeline = {
    val __obj = js.Dynamic.literal()
    if (Created != null) __obj.updateDynamic("Created")(Created.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (LastStarted != null) __obj.updateDynamic("LastStarted")(LastStarted.asInstanceOf[js.Any])
    if (LastStopped != null) __obj.updateDynamic("LastStopped")(LastStopped.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanaryTimeline]
  }
}

