package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `3D` extends js.Object {
  var `3D`: js.UndefOr[Features] = js.undefined
  var plugins: js.UndefOr[Npapi] = js.undefined
}

object `3D` {
  @scala.inline
  def apply(`3D`: Features = null, plugins: Npapi = null): `3D` = {
    val __obj = js.Dynamic.literal()
    if (`3D` != null) __obj.updateDynamic("3D")(`3D`.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3D`]
  }
}

