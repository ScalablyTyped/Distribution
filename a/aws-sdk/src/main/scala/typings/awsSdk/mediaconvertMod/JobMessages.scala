package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobMessages extends js.Object {
  /**
    * List of messages that are informational only and don't indicate a problem with your job.
    */
  var Info: js.UndefOr[listOfString] = js.native
  /**
    * List of messages that warn about conditions that might cause your job not to run or to fail.
    */
  var Warning: js.UndefOr[listOfString] = js.native
}

object JobMessages {
  @scala.inline
  def apply(Info: listOfString = null, Warning: listOfString = null): JobMessages = {
    val __obj = js.Dynamic.literal()
    if (Info != null) __obj.updateDynamic("Info")(Info.asInstanceOf[js.Any])
    if (Warning != null) __obj.updateDynamic("Warning")(Warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobMessages]
  }
}

