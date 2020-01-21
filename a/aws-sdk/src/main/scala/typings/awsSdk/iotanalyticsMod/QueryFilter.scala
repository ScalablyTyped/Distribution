package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryFilter extends js.Object {
  /**
    * Used to limit data to that which has arrived since the last execution of the action.
    */
  var deltaTime: js.UndefOr[DeltaTime] = js.native
}

object QueryFilter {
  @scala.inline
  def apply(deltaTime: DeltaTime = null): QueryFilter = {
    val __obj = js.Dynamic.literal()
    if (deltaTime != null) __obj.updateDynamic("deltaTime")(deltaTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryFilter]
  }
}

