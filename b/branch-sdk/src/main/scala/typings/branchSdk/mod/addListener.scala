package typings.branchSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("branch-sdk", "addListener")
@js.native
object addListener extends js.Object {
  def apply(
    event: js.UndefOr[JourneyEvent],
    listener: js.Function2[/* event */ JourneyEvent, /* data */ js.Object, Unit]
  ): Unit = js.native
}

