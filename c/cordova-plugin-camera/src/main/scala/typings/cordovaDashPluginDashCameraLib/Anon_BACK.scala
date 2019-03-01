package typings
package cordovaDashPluginDashCameraLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BACK extends js.Object {
  var BACK: scala.Double
  var FRONT: scala.Double
}

object Anon_BACK {
  @scala.inline
  def apply(BACK: scala.Double, FRONT: scala.Double): Anon_BACK = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BACK")(BACK)
    __obj.updateDynamic("FRONT")(FRONT)
    __obj.asInstanceOf[Anon_BACK]
  }
}

