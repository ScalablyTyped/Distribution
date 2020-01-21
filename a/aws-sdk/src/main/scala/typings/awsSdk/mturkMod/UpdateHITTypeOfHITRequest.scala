package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateHITTypeOfHITRequest extends js.Object {
  /**
    * The HIT to update.
    */
  var HITId: EntityId = js.native
  /**
    * The ID of the new HIT type.
    */
  var HITTypeId: EntityId = js.native
}

object UpdateHITTypeOfHITRequest {
  @scala.inline
  def apply(HITId: EntityId, HITTypeId: EntityId): UpdateHITTypeOfHITRequest = {
    val __obj = js.Dynamic.literal(HITId = HITId.asInstanceOf[js.Any], HITTypeId = HITTypeId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateHITTypeOfHITRequest]
  }
}

