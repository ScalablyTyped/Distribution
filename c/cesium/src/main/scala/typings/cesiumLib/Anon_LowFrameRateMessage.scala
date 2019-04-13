package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LowFrameRateMessage extends js.Object {
  var lowFrameRateMessage: js.UndefOr[java.lang.String] = js.undefined
  var scene: cesiumLib.cesiumMod.Scene
}

object Anon_LowFrameRateMessage {
  @scala.inline
  def apply(scene: cesiumLib.cesiumMod.Scene, lowFrameRateMessage: java.lang.String = null): Anon_LowFrameRateMessage = {
    val __obj = js.Dynamic.literal(scene = scene)
    if (lowFrameRateMessage != null) __obj.updateDynamic("lowFrameRateMessage")(lowFrameRateMessage)
    __obj.asInstanceOf[Anon_LowFrameRateMessage]
  }
}

