package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timeline extends js.Object {
  var container: stdLib.Element
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
  def resize(): scala.Unit
  def zoomTo(startTime: JulianDate, stopTime: JulianDate): scala.Unit
}

object Timeline {
  @scala.inline
  def apply(
    container: stdLib.Element,
    destroy: () => scala.Unit,
    isDestroyed: () => scala.Boolean,
    resize: () => scala.Unit,
    zoomTo: (JulianDate, JulianDate) => scala.Unit
  ): Timeline = {
    val __obj = js.Dynamic.literal(container = container, destroy = js.Any.fromFunction0(destroy), isDestroyed = js.Any.fromFunction0(isDestroyed), resize = js.Any.fromFunction0(resize), zoomTo = js.Any.fromFunction2(zoomTo))
  
    __obj.asInstanceOf[Timeline]
  }
}

