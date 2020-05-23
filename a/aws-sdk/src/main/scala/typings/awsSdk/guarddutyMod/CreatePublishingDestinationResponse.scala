package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePublishingDestinationResponse extends js.Object {
  /**
    * The ID of the publishing destination that is created.
    */
  var DestinationId: String = js.native
}

object CreatePublishingDestinationResponse {
  @scala.inline
  def apply(DestinationId: String): CreatePublishingDestinationResponse = {
    val __obj = js.Dynamic.literal(DestinationId = DestinationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePublishingDestinationResponse]
  }
}

