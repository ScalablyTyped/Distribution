package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapIterationEventDetails extends js.Object {
  /**
    * The index of the array belonging to the Map state iteration.
    */
  var index: js.UndefOr[UnsignedInteger] = js.native
  /**
    * The name of the iteration’s parent Map state.
    */
  var name: js.UndefOr[Name] = js.native
}

object MapIterationEventDetails {
  @scala.inline
  def apply(index: js.UndefOr[UnsignedInteger] = js.undefined, name: Name = null): MapIterationEventDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapIterationEventDetails]
  }
}

