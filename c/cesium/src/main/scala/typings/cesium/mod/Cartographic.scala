package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Cartographic")
@js.native
class Cartographic () extends StObject {
  def this(longitude: Double) = this()
  def this(longitude: Double, latitude: Double) = this()
  def this(longitude: Unit, latitude: Double) = this()
  def this(longitude: Double, latitude: Double, height: Double) = this()
  def this(longitude: Double, latitude: Unit, height: Double) = this()
  def this(longitude: Unit, latitude: Double, height: Double) = this()
  def this(longitude: Unit, latitude: Unit, height: Double) = this()
  
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
  @scala.inline
  def clone_(cartographic: Cartographic): Cartographic = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(cartographic.asInstanceOf[js.Any]).asInstanceOf[Cartographic]
  @scala.inline
  def clone_(cartographic: Cartographic, result: Cartographic): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(cartographic.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  
  /* static member */
  @scala.inline
  def equalsEpsilon(left: Cartographic, right: Cartographic, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def equals_(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: Unit, right: Cartographic): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: Cartographic): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: Cartographic, right: Cartographic): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def fromCartesian(cartesian: Cartesian3): Cartographic = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Cartographic]
  @scala.inline
  def fromCartesian(cartesian: Cartesian3, ellipsoid: Unit, result: Cartographic): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian")(cartesian.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  @scala.inline
  def fromCartesian(cartesian: Cartesian3, ellipsoid: Ellipsoid): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian")(cartesian.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  @scala.inline
  def fromCartesian(cartesian: Cartesian3, ellipsoid: Ellipsoid, result: Cartographic): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian")(cartesian.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  
  /* static member */
  @scala.inline
  def fromDegrees(longitude: Double, latitude: Double): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  @scala.inline
  def fromDegrees(longitude: Double, latitude: Double, height: Double): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  @scala.inline
  def fromDegrees(longitude: Double, latitude: Double, height: Double, result: Cartographic): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  @scala.inline
  def fromDegrees(longitude: Double, latitude: Double, height: Unit, result: Cartographic): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  
  /* static member */
  @scala.inline
  def fromRadians(longitude: Double, latitude: Double): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  @scala.inline
  def fromRadians(longitude: Double, latitude: Double, height: Double): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  @scala.inline
  def fromRadians(longitude: Double, latitude: Double, height: Double, result: Cartographic): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  @scala.inline
  def fromRadians(longitude: Double, latitude: Double, height: Unit, result: Cartographic): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  
  /* static member */
  @scala.inline
  def toCartesian(cartographic: Cartographic): Cartesian3 = ^.asInstanceOf[js.Dynamic].applyDynamic("toCartesian")(cartographic.asInstanceOf[js.Any]).asInstanceOf[Cartesian3]
  @scala.inline
  def toCartesian(cartographic: Cartographic, ellipsoid: Unit, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("toCartesian")(cartographic.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  @scala.inline
  def toCartesian(cartographic: Cartographic, ellipsoid: Ellipsoid): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("toCartesian")(cartographic.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  @scala.inline
  def toCartesian(cartographic: Cartographic, ellipsoid: Ellipsoid, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("toCartesian")(cartographic.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
}
