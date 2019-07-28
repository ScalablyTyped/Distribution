package typings.consoleDashStamp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Label extends js.Object {
  var label: js.UndefOr[js.Any] = js.undefined
  var metadata: js.UndefOr[js.Any] = js.undefined
  var stamp: js.UndefOr[js.Any] = js.undefined
}

object Anon_Label {
  @scala.inline
  def apply(label: js.Any = null, metadata: js.Any = null, stamp: js.Any = null): Anon_Label = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (stamp != null) __obj.updateDynamic("stamp")(stamp)
    __obj.asInstanceOf[Anon_Label]
  }
}

