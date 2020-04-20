package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLayerVersionPolicyRequest extends js.Object {
  /**
    * The name or Amazon Resource Name (ARN) of the layer.
    */
  var LayerName: typings.awsSdk.lambdaMod.LayerName = js.native
  /**
    * The version number.
    */
  var VersionNumber: LayerVersionNumber = js.native
}

object GetLayerVersionPolicyRequest {
  @scala.inline
  def apply(LayerName: LayerName, VersionNumber: LayerVersionNumber): GetLayerVersionPolicyRequest = {
    val __obj = js.Dynamic.literal(LayerName = LayerName.asInstanceOf[js.Any], VersionNumber = VersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLayerVersionPolicyRequest]
  }
}

