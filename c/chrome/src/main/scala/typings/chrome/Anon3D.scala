package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon3D extends js.Object {
  var `3D`: js.UndefOr[AnonFeatures] = js.undefined
  var plugins: js.UndefOr[AnonNpapi] = js.undefined
}

object Anon3D {
  @scala.inline
  def apply(`3D`: AnonFeatures = null, plugins: AnonNpapi = null): Anon3D = {
    val __obj = js.Dynamic.literal()
    if (`3D` != null) __obj.updateDynamic("3D")(`3D`.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon3D]
  }
}

