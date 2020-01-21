package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteStackRequest extends js.Object {
  /**
    * The stack ID.
    */
  var StackId: String = js.native
}

object DeleteStackRequest {
  @scala.inline
  def apply(StackId: String): DeleteStackRequest = {
    val __obj = js.Dynamic.literal(StackId = StackId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteStackRequest]
  }
}

