package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkyBox extends js.Object {
  var show: scala.Boolean
  var sources: js.Any
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
  def update(): scala.Unit
}

object SkyBox {
  @scala.inline
  def apply(
    destroy: js.Function0[scala.Unit],
    isDestroyed: js.Function0[scala.Boolean],
    show: scala.Boolean,
    sources: js.Any,
    update: js.Function0[scala.Unit]
  ): SkyBox = {
    val __obj = js.Dynamic.literal(destroy = destroy, isDestroyed = isDestroyed, show = show, sources = sources, update = update)
  
    __obj.asInstanceOf[SkyBox]
  }
}

