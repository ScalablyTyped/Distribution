package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerLowFrameRateMessage extends js.Object {
  var container: stdLib.Element | java.lang.String
  var lowFrameRateMessage: js.UndefOr[java.lang.String] = js.undefined
  var scene: cesiumLib.cesiumMod.Scene
}

object Anon_ContainerLowFrameRateMessage {
  @scala.inline
  def apply(
    container: stdLib.Element | java.lang.String,
    scene: cesiumLib.cesiumMod.Scene,
    lowFrameRateMessage: java.lang.String = null
  ): Anon_ContainerLowFrameRateMessage = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], scene = scene)
    if (lowFrameRateMessage != null) __obj.updateDynamic("lowFrameRateMessage")(lowFrameRateMessage)
    __obj.asInstanceOf[Anon_ContainerLowFrameRateMessage]
  }
}

