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

