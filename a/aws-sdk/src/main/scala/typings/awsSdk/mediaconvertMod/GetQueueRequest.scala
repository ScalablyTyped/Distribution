package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetQueueRequest extends js.Object {
  /**
    * The name of the queue that you want information about.
    */
  var Name: string = js.native
}

object GetQueueRequest {
  @scala.inline
  def apply(Name: string): GetQueueRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetQueueRequest]
  }
}

