package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_3D extends js.Object {
  var `3D`: js.UndefOr[Anon_Features] = js.undefined
  var plugins: js.UndefOr[Anon_Npapi] = js.undefined
}

object Anon_3D {
  @scala.inline
  def apply(`3D`: Anon_Features = null, plugins: Anon_Npapi = null): Anon_3D = {
    val __obj = js.Dynamic.literal()
    if (`3D` != null) __obj.updateDynamic("3D")(`3D`)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    __obj.asInstanceOf[Anon_3D]
  }
}

