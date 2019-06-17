package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActivePath extends js.Object {
  var ActivePath: js.UndefOr[Override[_]] = js.undefined
  var Svg: js.UndefOr[Override[_]] = js.undefined
  var TrackPath: js.UndefOr[Override[_]] = js.undefined
}

object Anon_ActivePath {
  @scala.inline
  def apply(ActivePath: Override[_] = null, Svg: Override[_] = null, TrackPath: Override[_] = null): Anon_ActivePath = {
    val __obj = js.Dynamic.literal()
    if (ActivePath != null) __obj.updateDynamic("ActivePath")(ActivePath.asInstanceOf[js.Any])
    if (Svg != null) __obj.updateDynamic("Svg")(Svg.asInstanceOf[js.Any])
    if (TrackPath != null) __obj.updateDynamic("TrackPath")(TrackPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActivePath]
  }
}

