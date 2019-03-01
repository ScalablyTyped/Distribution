package typings
package cordovaDashPluginDashMapsforgeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var mapsforge: MapsforgePlugin
}

object Window {
  @scala.inline
  def apply(mapsforge: MapsforgePlugin): Window = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mapsforge")(mapsforge)
    __obj.asInstanceOf[Window]
  }
}

