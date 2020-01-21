package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartStackRequest extends js.Object {
  /**
    * The stack ID.
    */
  var StackId: String = js.native
}

object StartStackRequest {
  @scala.inline
  def apply(StackId: String): StartStackRequest = {
    val __obj = js.Dynamic.literal(StackId = StackId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StartStackRequest]
  }
}

