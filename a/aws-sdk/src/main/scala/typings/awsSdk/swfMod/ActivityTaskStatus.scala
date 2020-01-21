package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityTaskStatus extends js.Object {
  /**
    * Set to true if cancellation of the task is requested.
    */
  var cancelRequested: Canceled = js.native
}

object ActivityTaskStatus {
  @scala.inline
  def apply(cancelRequested: Canceled): ActivityTaskStatus = {
    val __obj = js.Dynamic.literal(cancelRequested = cancelRequested.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActivityTaskStatus]
  }
}

