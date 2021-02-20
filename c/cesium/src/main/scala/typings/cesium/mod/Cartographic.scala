package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Cartographic")
@js.native
class Cartographic () extends StObject {
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
object Cartographic {
  
  @JSImport("cesium", "Cartographic")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "Cartographic.ZERO")
  @js.native
  def ZERO: Cartographic = js.native
  @scala.inline
  def ZERO_=(x: Cartographic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Cartographic.clone")
  @js.native
  def clone_(cartographic: Cartographic): Cartographic = js.native
  @JSImport("cesium", "Cartographic.clone")
  @js.native
  def clone_(cartographic: Cartographic, result: Cartographic): Cartographic = js.native
  
  /* static member */
  @JSImport("cesium", "Cartographic.equalsEpsilon")
  @js.native
  def equalsEpsilon(left: Cartographic, right: Cartographic, epsilon: Double): Boolean = js.native
  
  /* static member */
  @JSImport("cesium", "Cartographic.equals")
  @js.native
  def equals_(): Boolean = js.native
  @JSImport("cesium", "Cartographic.equals")
  @js.native
  def equals_(left: js.UndefOr[scala.Nothing], right: Cartographic): Boolean = js.native
  @JSImport("cesium", "Cartographic.equals")
  @js.native
  def equals_(left: Cartographic): Boolean = js.native
  @JSImport("cesium", "Cartographic.equals")
  @js.native
  def equals_(left: Cartographic, right: Cartographic): Boolean = js.native
  
  /* static member */
  @JSImport("cesium", "Cartographic.fromCartesian")
  @js.native
  def fromCartesian(cartesian: Cartesian3): Cartographic = js.native
  @JSImport("cesium", "Cartographic.fromCartesian")
  @js.native
  def fromCartesian(cartesian: Cartesian3, ellipsoid: js.UndefOr[scala.Nothing], result: Cartographic): Cartographic = js.native
  @JSImport("cesium", "Cartographic.fromCartesian")
  @js.native
  def fromCartesian(cartesian: Cartesian3, ellipsoid: Ellipsoid): Cartographic = js.native
  @JSImport("cesium", "Cartographic.fromCartesian")
  @js.native
  def fromCartesian(cartesian: Cartesian3, ellipsoid: Ellipsoid, result: Cartographic): Cartographic = js.native
  
  /* static member */
  @JSImport("cesium", "Cartographic.fromDegrees")
  @js.native
  def fromDegrees(longitude: Double, latitude: Double): Cartographic = js.native
  @JSImport("cesium", "Cartographic.fromDegrees")
  @js.native
  def fromDegrees(longitude: Double, latitude: Double, height: js.UndefOr[scala.Nothing], result: Cartographic): Cartographic = js.native
  @JSImport("cesium", "Cartographic.fromDegrees")
  @js.native
  def fromDegrees(longitude: Double, latitude: Double, height: Double): Cartographic = js.native
  @JSImport("cesium", "Cartographic.fromDegrees")
  @js.native
  def fromDegrees(longitude: Double, latitude: Double, height: Double, result: Cartographic): Cartographic = js.native
  
  /* static member */
  @JSImport("cesium", "Cartographic.fromRadians")
  @js.native
  def fromRadians(longitude: Double, latitude: Double): Cartographic = js.native
  @JSImport("cesium", "Cartographic.fromRadians")
  @js.native
  def fromRadians(longitude: Double, latitude: Double, height: js.UndefOr[scala.Nothing], result: Cartographic): Cartographic = js.native
  @JSImport("cesium", "Cartographic.fromRadians")
  @js.native
  def fromRadians(longitude: Double, latitude: Double, height: Double): Cartographic = js.native
  @JSImport("cesium", "Cartographic.fromRadians")
  @js.native
  def fromRadians(longitude: Double, latitude: Double, height: Double, result: Cartographic): Cartographic = js.native
  
  /* static member */
  @JSImport("cesium", "Cartographic.toCartesian")
  @js.native
  def toCartesian(cartographic: Cartographic): Cartesian3 = js.native
  @JSImport("cesium", "Cartographic.toCartesian")
  @js.native
  def toCartesian(cartographic: Cartographic, ellipsoid: js.UndefOr[scala.Nothing], result: Cartesian3): Cartesian3 = js.native
  @JSImport("cesium", "Cartographic.toCartesian")
  @js.native
  def toCartesian(cartographic: Cartographic, ellipsoid: Ellipsoid): Cartesian3 = js.native
  @JSImport("cesium", "Cartographic.toCartesian")
  @js.native
  def toCartesian(cartographic: Cartographic, ellipsoid: Ellipsoid, result: Cartesian3): Cartesian3 = js.native
}
