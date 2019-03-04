package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HomeButtonViewModel extends js.Object {
  var command: Command
  var duration: scala.Double
  var scene: Scene
  var tooltip: java.lang.String
}

object HomeButtonViewModel {
  @scala.inline
  def apply(command: Command, duration: scala.Double, scene: Scene, tooltip: java.lang.String): HomeButtonViewModel = {
    val __obj = js.Dynamic.literal(command = command, duration = duration, scene = scene, tooltip = tooltip)
  
    __obj.asInstanceOf[HomeButtonViewModel]
  }
}

