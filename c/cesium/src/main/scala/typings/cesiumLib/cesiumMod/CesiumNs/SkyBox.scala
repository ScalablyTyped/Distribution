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
    destroy: () => scala.Unit,
    isDestroyed: () => scala.Boolean,
    show: scala.Boolean,
    sources: js.Any,
    update: () => scala.Unit
  ): SkyBox = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), isDestroyed = js.Any.fromFunction0(isDestroyed), show = show, sources = sources, update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[SkyBox]
  }
}

