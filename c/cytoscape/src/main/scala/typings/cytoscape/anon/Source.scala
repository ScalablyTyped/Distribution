package typings.cytoscape.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  var source: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[String] = js.undefined
}

object Source {
  @scala.inline
  def apply(source: String = null, target: String = null): Source = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

