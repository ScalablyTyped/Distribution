package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchArrayProperties extends js.Object {
  /**
    * The size of the array, if this is an array batch job. Valid values are integers between 2 and 10,000.
    */
  var Size: js.UndefOr[Integer] = js.native
}

object BatchArrayProperties {
  @scala.inline
  def apply(Size: Int | Double = null): BatchArrayProperties = {
    val __obj = js.Dynamic.literal()
    if (Size != null) __obj.updateDynamic("Size")(Size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchArrayProperties]
  }
}

