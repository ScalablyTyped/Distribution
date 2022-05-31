package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.Ellipsoid")
@js.native
class Ellipsoid ()
  extends typings.cesium.mod.Ellipsoid {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Unit, z: Double) = this()
  def this(x: Unit, y: Double, z: Double) = this()
  def this(x: Unit, y: Unit, z: Double) = this()
}
object Ellipsoid {
  
  @JSGlobal("Cesium.Ellipsoid")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Cesium.Ellipsoid.MOON")
  @js.native
  def MOON: typings.cesium.mod.Ellipsoid = js.native
  inline def MOON_=(x: typings.cesium.mod.Ellipsoid): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOON")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.Ellipsoid.UNIT_SPHERE")
  @js.native
  def UNIT_SPHERE: typings.cesium.mod.Ellipsoid = js.native
  inline def UNIT_SPHERE_=(x: typings.cesium.mod.Ellipsoid): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNIT_SPHERE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.Ellipsoid.WGS84")
  @js.native
  def WGS84: typings.cesium.mod.Ellipsoid = js.native
  inline def WGS84_=(x: typings.cesium.mod.Ellipsoid): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WGS84")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def clone_(ellipsoid: typings.cesium.mod.Ellipsoid): typings.cesium.mod.Ellipsoid = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(ellipsoid.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Ellipsoid]
  inline def clone_(ellipsoid: typings.cesium.mod.Ellipsoid, result: typings.cesium.mod.Ellipsoid): typings.cesium.mod.Ellipsoid = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Ellipsoid]
  
  /* static member */
  inline def fromCartesian3(): typings.cesium.mod.Ellipsoid = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian3")().asInstanceOf[typings.cesium.mod.Ellipsoid]
  inline def fromCartesian3(radii: typings.cesium.mod.Cartesian3): typings.cesium.mod.Ellipsoid = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian3")(radii.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Ellipsoid]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): typings.cesium.mod.Ellipsoid = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Ellipsoid]
  inline def unpack(array: js.Array[Double], startingIndex: Double): typings.cesium.mod.Ellipsoid = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Ellipsoid]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: typings.cesium.mod.Ellipsoid): typings.cesium.mod.Ellipsoid = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Ellipsoid]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: typings.cesium.mod.Ellipsoid): typings.cesium.mod.Ellipsoid = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Ellipsoid]
}
