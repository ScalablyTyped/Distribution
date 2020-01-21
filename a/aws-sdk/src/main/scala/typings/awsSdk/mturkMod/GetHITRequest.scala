package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHITRequest extends js.Object {
  /**
    * The ID of the HIT to be retrieved.
    */
  var HITId: EntityId = js.native
}

object GetHITRequest {
  @scala.inline
  def apply(HITId: EntityId): GetHITRequest = {
    val __obj = js.Dynamic.literal(HITId = HITId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetHITRequest]
  }
}

