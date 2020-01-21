package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Cartographic")
@js.native
class Cartographic () extends js.Object {
  def this(longitude: Double) = this()
  def this(longitude: Double, latitude: Double) = this()
  def this(longitude: Double, latitude: Double, height: Double) = this()
  var height: Double = js.native
  var latitude: Double = js.native
  var longitude: Double = js.native
  def clone(result: Cartographic): Cartographic = js.native
  def equals(): Boolean = js.native
  def equals(right: Cartographic): Boolean = js.native
  def equalsEpsilon(right: Cartographic, epsilon: Double): Boolean = js.native
}

/* static members */
@JSImport("cesium", "Cartographic")
@js.native
object Cartographic extends js.Object {
  var ZERO: Cartographic = js.native
  def clone(cartographic: Cartographic): Cartographic = js.native
  def clone(cartographic: Cartographic, result: Cartographic): Cartographic = js.native
  def equals(): Boolean = js.native
  def equals(left: Cartographic): Boolean = js.native
  def equals(left: Cartographic, right: Cartographic): Boolean = js.native
  def equalsEpsilon(left: Cartographic, right: Cartographic, epsilon: Double): Boolean = js.native
  def fromCartesian(cartesian: Cartesian3): Cartographic = js.native
  def fromCartesian(cartesian: Cartesian3, ellipsoid: Ellipsoid): Cartographic = js.native
  def fromCartesian(cartesian: Cartesian3, ellipsoid: Ellipsoid, result: Cartographic): Cartographic = js.native
  def fromDegrees(longitude: Double, latitude: Double): Cartographic = js.native
  def fromDegrees(longitude: Double, latitude: Double, height: Double): Cartographic = js.native
  def fromDegrees(longitude: Double, latitude: Double, height: Double, result: Cartographic): Cartographic = js.native
  def fromRadians(longitude: Double, latitude: Double): Cartographic = js.native
  def fromRadians(longitude: Double, latitude: Double, height: Double): Cartographic = js.native
  def fromRadians(longitude: Double, latitude: Double, height: Double, result: Cartographic): Cartographic = js.native
  def toCartesian(cartographic: Cartographic): Cartesian3 = js.native
  def toCartesian(cartographic: Cartographic, ellipsoid: Ellipsoid): Cartesian3 = js.native
  def toCartesian(cartographic: Cartographic, ellipsoid: Ellipsoid, result: Cartesian3): Cartesian3 = js.native
}

