package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteHapgResponse extends js.Object {
  /**
    * The status of the action.
    */
  var Status: String = js.native
}

object DeleteHapgResponse {
  @scala.inline
  def apply(Status: String): DeleteHapgResponse = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHapgResponse]
  }
}

