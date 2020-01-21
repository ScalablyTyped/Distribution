package typings.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetQueueAttributesResult extends js.Object {
  /**
    * A map of attributes to their respective values.
    */
  var Attributes: js.UndefOr[QueueAttributeMap] = js.native
}

object GetQueueAttributesResult {
  @scala.inline
  def apply(Attributes: QueueAttributeMap = null): GetQueueAttributesResult = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueueAttributesResult]
  }
}

