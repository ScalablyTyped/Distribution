package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Thing extends js.Object {
  /**
    * The ARN of the thing.
    */
  var thingArn: js.UndefOr[ThingArn] = js.native
  /**
    * The name of the thing.
    */
  var thingName: js.UndefOr[ThingName] = js.native
}

object Thing {
  @scala.inline
  def apply(thingArn: ThingArn = null, thingName: ThingName = null): Thing = {
    val __obj = js.Dynamic.literal()
    if (thingArn != null) __obj.updateDynamic("thingArn")(thingArn.asInstanceOf[js.Any])
    if (thingName != null) __obj.updateDynamic("thingName")(thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Thing]
  }
}

