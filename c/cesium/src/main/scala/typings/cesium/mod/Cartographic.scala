package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Cartographic")
@js.native
class Cartographic () extends js.Object {
  def this(longitude: Double) = this()
  def this(longitude: js.UndefOr[scala.Nothing], latitude: Double) = this()
  def this(longitude: Double, latitude: Double) = this()
  def this(longitude: js.UndefOr[scala.Nothing], latitude: js.UndefOr[scala.Nothing], height: Double) = this()
  def this(longitude: js.UndefOr[scala.Nothing], latitude: Double, height: Double) = this()
  def this(longitude: Double, latitude: js.UndefOr[scala.Nothing], height: Double) = this()
  def this(longitude: Double, latitude: Double, height: Double) = this()
  
  def clone(result: Cartographic): Cartographic = js.native
  
  def equals(): Boolean = js.native
  def equals(right: Cartographic): Boolean = js.native
  
  def equalsEpsilon(right: Cartographic, epsilon: Double): Boolean = js.native
  
  var height: Double = js.native
  
  var latitude: Double = js.native
  
  var longitude: Double = js.native
}
/* static members */
@JSImport("cesium", "Cartographic")
@js.native
object Cartographic extends js.Object {
  
  var ZERO: Cartographic = js.native
  
  def clone(cartographic: Cartographic): Cartographic = js.native
  def clone(cartographic: Cartographic, result: Cartographic): Cartographic = js.native
  
  def equals(): Boolean = js.native
  def equals(left: js.UndefOr[scala.Nothing], right: Cartographic): Boolean = js.native
  def equals(left: Cartographic): Boolean = js.native
  def equals(left: Cartographic, right: Cartographic): Boolean = js.native
  
  def equalsEpsilon(left: Cartographic, right: Cartographic, epsilon: Double): Boolean = js.native
  
  def fromCartesian(cartesian: Cartesian3): Cartographic = js.native
  def fromCartesian(cartesian: Cartesian3, ellipsoid: js.UndefOr[scala.Nothing], result: Cartographic): Cartographic = js.native
  def fromCartesian(cartesian: Cartesian3, ellipsoid: Ellipsoid): Cartographic = js.native
  def fromCartesian(cartesian: Cartesian3, ellipsoid: Ellipsoid, result: Cartographic): Cartographic = js.native
  
  def fromDegrees(longitude: Double, latitude: Double): Cartographic = js.native
  def fromDegrees(longitude: Double, latitude: Double, height: js.UndefOr[scala.Nothing], result: Cartographic): Cartographic = js.native
  def fromDegrees(longitude: Double, latitude: Double, height: Double): Cartographic = js.native
  def fromDegrees(longitude: Double, latitude: Double, height: Double, result: Cartographic): Cartographic = js.native
  
  def fromRadians(longitude: Double, latitude: Double): Cartographic = js.native
  def fromRadians(longitude: Double, latitude: Double, height: js.UndefOr[scala.Nothing], result: Cartographic): Cartographic = js.native
  def fromRadians(longitude: Double, latitude: Double, height: Double): Cartographic = js.native
  def fromRadians(longitude: Double, latitude: Double, height: Double, result: Cartographic): Cartographic = js.native
  
  def toCartesian(cartographic: Cartographic): Cartesian3 = js.native
  def toCartesian(cartographic: Cartographic, ellipsoid: js.UndefOr[scala.Nothing], result: Cartesian3): Cartesian3 = js.native
  def toCartesian(cartographic: Cartographic, ellipsoid: Ellipsoid): Cartesian3 = js.native
  def toCartesian(cartographic: Cartographic, ellipsoid: Ellipsoid, result: Cartesian3): Cartesian3 = js.native
}
