package typings.consoleStamp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  var label: js.UndefOr[js.Any] = js.undefined
  var metadata: js.UndefOr[js.Any] = js.undefined
  var stamp: js.UndefOr[js.Any] = js.undefined
}

object Label {
  @scala.inline
  def apply(label: js.Any = null, metadata: js.Any = null, stamp: js.Any = null): Label = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (stamp != null) __obj.updateDynamic("stamp")(stamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

