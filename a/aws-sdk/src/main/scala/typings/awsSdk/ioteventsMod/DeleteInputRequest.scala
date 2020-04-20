package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInputRequest extends js.Object {
  /**
    * The name of the input to delete.
    */
  var inputName: InputName = js.native
}

object DeleteInputRequest {
  @scala.inline
  def apply(inputName: InputName): DeleteInputRequest = {
    val __obj = js.Dynamic.literal(inputName = inputName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInputRequest]
  }
}

