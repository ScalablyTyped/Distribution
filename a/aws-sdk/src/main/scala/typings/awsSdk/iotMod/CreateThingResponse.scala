package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateThingResponse extends js.Object {
  /**
    * The ARN of the new thing.
    */
  var thingArn: js.UndefOr[ThingArn] = js.native
  /**
    * The thing ID.
    */
  var thingId: js.UndefOr[ThingId] = js.native
  /**
    * The name of the new thing.
    */
  var thingName: js.UndefOr[ThingName] = js.native
}

object CreateThingResponse {
  @scala.inline
  def apply(thingArn: ThingArn = null, thingId: ThingId = null, thingName: ThingName = null): CreateThingResponse = {
    val __obj = js.Dynamic.literal()
    if (thingArn != null) __obj.updateDynamic("thingArn")(thingArn.asInstanceOf[js.Any])
    if (thingId != null) __obj.updateDynamic("thingId")(thingId.asInstanceOf[js.Any])
    if (thingName != null) __obj.updateDynamic("thingName")(thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateThingResponse]
  }
}

