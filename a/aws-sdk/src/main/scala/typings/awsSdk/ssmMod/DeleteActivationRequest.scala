package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteActivationRequest extends js.Object {
  /**
    * The ID of the activation that you want to delete.
    */
  var ActivationId: typings.awsSdk.ssmMod.ActivationId = js.native
}

object DeleteActivationRequest {
  @scala.inline
  def apply(ActivationId: ActivationId): DeleteActivationRequest = {
    val __obj = js.Dynamic.literal(ActivationId = ActivationId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteActivationRequest]
  }
}

