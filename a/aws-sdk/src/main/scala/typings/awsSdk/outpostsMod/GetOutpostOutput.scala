package typings.awsSdk.outpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOutpostOutput extends js.Object {
  var Outpost: js.UndefOr[typings.awsSdk.outpostsMod.Outpost] = js.native
}

object GetOutpostOutput {
  @scala.inline
  def apply(Outpost: Outpost = null): GetOutpostOutput = {
    val __obj = js.Dynamic.literal()
    if (Outpost != null) __obj.updateDynamic("Outpost")(Outpost.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOutpostOutput]
  }
}

