package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLagRequest extends js.Object {
  /**
    * The ID of the LAG.
    */
  var lagId: LagId = js.native
}

object DeleteLagRequest {
  @scala.inline
  def apply(lagId: LagId): DeleteLagRequest = {
    val __obj = js.Dynamic.literal(lagId = lagId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteLagRequest]
  }
}

