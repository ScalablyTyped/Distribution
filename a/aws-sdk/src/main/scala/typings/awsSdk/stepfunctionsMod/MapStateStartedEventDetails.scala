package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapStateStartedEventDetails extends js.Object {
  /**
    * The size of the array for Map state iterations.
    */
  var length: js.UndefOr[UnsignedInteger] = js.native
}

object MapStateStartedEventDetails {
  @scala.inline
  def apply(length: js.UndefOr[UnsignedInteger] = js.undefined): MapStateStartedEventDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapStateStartedEventDetails]
  }
}

