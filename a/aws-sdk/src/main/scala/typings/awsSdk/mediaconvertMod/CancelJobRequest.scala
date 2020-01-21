package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelJobRequest extends js.Object {
  /**
    * The Job ID of the job to be cancelled.
    */
  var Id: string = js.native
}

object CancelJobRequest {
  @scala.inline
  def apply(Id: string): CancelJobRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CancelJobRequest]
  }
}

