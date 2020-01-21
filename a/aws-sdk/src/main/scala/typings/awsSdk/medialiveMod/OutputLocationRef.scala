package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputLocationRef extends js.Object {
  var DestinationRefId: js.UndefOr[string] = js.native
}

object OutputLocationRef {
  @scala.inline
  def apply(DestinationRefId: string = null): OutputLocationRef = {
    val __obj = js.Dynamic.literal()
    if (DestinationRefId != null) __obj.updateDynamic("DestinationRefId")(DestinationRefId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputLocationRef]
  }
}

