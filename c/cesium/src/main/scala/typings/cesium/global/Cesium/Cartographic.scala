package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.Cartographic")
@js.native
class Cartographic ()
  extends typings.cesium.mod.Cartographic {
  def this(longitude: Double) = this()
  def this(longitude: Double, latitude: Double) = this()
  def this(longitude: Unit, latitude: Double) = this()
  def this(longitude: Double, latitude: Double, height: Double) = this()
  def this(longitude: Double, latitude: Unit, height: Double) = this()
  def this(longitude: Unit, latitude: Double, height: Double) = this()
  def this(longitude: Unit, latitude: Unit, height: Double) = this()
}
object Cartographic {
  
  @JSGlobal("Cesium.Cartographic")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Cesium.Cartographic.ZERO")
  @js.native
  def ZERO: typings.cesium.mod.Cartographic = js.native
  inline def ZERO_=(x: typings.cesium.mod.Cartographic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def clone_(cartographic: typings.cesium.mod.Cartographic): typings.cesium.mod.Cartographic = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(cartographic.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Cartographic]
  inline def clone_(cartographic: typings.cesium.mod.Cartographic, result: typings.cesium.mod.Cartographic): typings.cesium.mod.Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(cartographic.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartographic]
  
  /* static member */
  inline def equalsEpsilon(left: typings.cesium.mod.Cartographic, right: typings.cesium.mod.Cartographic, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def equals_(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals_(left: Unit, right: typings.cesium.mod.Cartographic): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(left: typings.cesium.mod.Cartographic): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals_(left: typings.cesium.mod.Cartographic, right: typings.cesium.mod.Cartographic): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def fromCartesian(cartesian: typings.cesium.mod.Cartesian3): typings.cesium.mod.Cartographic = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian")(cartesian.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Cartographic]
  inline def fromCartesian(cartesian: typings.cesium.mod.Cartesian3, ellipsoid: Unit, result: typings.cesium.mod.Cartographic): typings.cesium.mod.Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian")(cartesian.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartographic]
  inline def fromCartesian(cartesian: typings.cesium.mod.Cartesian3, ellipsoid: typings.cesium.mod.Ellipsoid): typings.cesium.mod.Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian")(cartesian.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartographic]
  inline def fromCartesian(
    cartesian: typings.cesium.mod.Cartesian3,
    ellipsoid: typings.cesium.mod.Ellipsoid,
    result: typings.cesium.mod.Cartographic
  ): typings.cesium.mod.Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian")(cartesian.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartographic]
  
  /* static member */
  inline def fromDegrees(longitude: Double, latitude: Double): typings.cesium.mod.Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartographic]
  inline def fromDegrees(longitude: Double, latitude: Double, height: Double): typings.cesium.mod.Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartographic]
  inline def fromDegrees(longitude: Double, latitude: Double, height: Double, result: typings.cesium.mod.Cartographic): typings.cesium.mod.Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartographic]
  inline def fromDegrees(longitude: Double, latitude: Double, height: Unit, result: typings.cesium.mod.Cartographic): typings.cesium.mod.Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartographic]
  
  /* static member */
  inline def fromRadians(longitude: Double, latitude: Double): typings.cesium.mod.Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartographic]
  inline def fromRadians(longitude: Double, latitude: Double, height: Double): typings.cesium.mod.Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartographic]
  inline def fromRadians(longitude: Double, latitude: Double, height: Double, result: typings.cesium.mod.Cartographic): typings.cesium.mod.Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartographic]
  inline def fromRadians(longitude: Double, latitude: Double, height: Unit, result: typings.cesium.mod.Cartographic): typings.cesium.mod.Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartographic]
  
  /* static member */
  inline def toCartesian(cartographic: typings.cesium.mod.Cartographic): typings.cesium.mod.Cartesian3 = ^.asInstanceOf[js.Dynamic].applyDynamic("toCartesian")(cartographic.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Cartesian3]
  inline def toCartesian(
    cartographic: typings.cesium.mod.Cartographic,
    ellipsoid: Unit,
    result: typings.cesium.mod.Cartesian3
  ): typings.cesium.mod.Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("toCartesian")(cartographic.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian3]
  inline def toCartesian(cartographic: typings.cesium.mod.Cartographic, ellipsoid: typings.cesium.mod.Ellipsoid): typings.cesium.mod.Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("toCartesian")(cartographic.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian3]
  inline def toCartesian(
    cartographic: typings.cesium.mod.Cartographic,
    ellipsoid: typings.cesium.mod.Ellipsoid,
    result: typings.cesium.mod.Cartesian3
  ): typings.cesium.mod.Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("toCartesian")(cartographic.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian3]
}
