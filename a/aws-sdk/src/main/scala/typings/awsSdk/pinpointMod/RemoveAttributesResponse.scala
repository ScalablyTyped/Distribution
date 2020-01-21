package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveAttributesResponse extends js.Object {
  var AttributesResource: typings.awsSdk.pinpointMod.AttributesResource = js.native
}

object RemoveAttributesResponse {
  @scala.inline
  def apply(AttributesResource: AttributesResource): RemoveAttributesResponse = {
    val __obj = js.Dynamic.literal(AttributesResource = AttributesResource.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoveAttributesResponse]
  }
}

