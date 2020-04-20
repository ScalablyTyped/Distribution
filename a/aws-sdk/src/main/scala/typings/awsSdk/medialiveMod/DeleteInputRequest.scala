package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInputRequest extends js.Object {
  /**
    * Unique ID of the input
    */
  var InputId: string = js.native
}

object DeleteInputRequest {
  @scala.inline
  def apply(InputId: string): DeleteInputRequest = {
    val __obj = js.Dynamic.literal(InputId = InputId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInputRequest]
  }
}

