package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ImageryLayer extends js.Object {
  var alpha: scala.Double
  var brightness: scala.Double
  var contrast: scala.Double
  var gamma: scala.Double
  var hue: scala.Double
  var imageryProvider: ImageryProvider
  var rectangle: Rectangle
  var saturation: scala.Double
  var show: scala.Boolean
  def destroy(): scala.Unit
  def isBaseLayer(): scala.Boolean
  def isDestroyed(): scala.Boolean
}

