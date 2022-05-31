package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.Cartesian4")
@js.native
class Cartesian4 ()
  extends typings.cesium.mod.Cartesian4 {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Unit, z: Double) = this()
  def this(x: Unit, y: Double, z: Double) = this()
  def this(x: Unit, y: Unit, z: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
  def this(x: Double, y: Double, z: Unit, w: Double) = this()
  def this(x: Double, y: Unit, z: Double, w: Double) = this()
  def this(x: Double, y: Unit, z: Unit, w: Double) = this()
  def this(x: Unit, y: Double, z: Double, w: Double) = this()
  def this(x: Unit, y: Double, z: Unit, w: Double) = this()
  def this(x: Unit, y: Unit, z: Double, w: Double) = this()
  def this(x: Unit, y: Unit, z: Unit, w: Double) = this()
}
object Cartesian4 {
  
  @JSGlobal("Cesium.Cartesian4")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Cesium.Cartesian4.UNIT_W")
  @js.native
  def UNIT_W: typings.cesium.mod.Cartesian4 = js.native
  inline def UNIT_W_=(x: typings.cesium.mod.Cartesian4): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNIT_W")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.Cartesian4.UNIT_X")
  @js.native
  def UNIT_X: typings.cesium.mod.Cartesian4 = js.native
  inline def UNIT_X_=(x: typings.cesium.mod.Cartesian4): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNIT_X")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.Cartesian4.UNIT_Y")
  @js.native
  def UNIT_Y: typings.cesium.mod.Cartesian4 = js.native
  inline def UNIT_Y_=(x: typings.cesium.mod.Cartesian4): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNIT_Y")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.Cartesian4.UNIT_Z")
  @js.native
  def UNIT_Z: typings.cesium.mod.Cartesian4 = js.native
  inline def UNIT_Z_=(x: typings.cesium.mod.Cartesian4): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNIT_Z")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.Cartesian4.ZERO")
  @js.native
  def ZERO: typings.cesium.mod.Cartesian4 = js.native
  inline def ZERO_=(x: typings.cesium.mod.Cartesian4): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def abs(cartesian: typings.cesium.mod.Cartesian4, result: typings.cesium.mod.Cartesian4): typings.cesium.mod.Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("abs")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian4]
  
  /* static member */
  inline def add(
    left: typings.cesium.mod.Cartesian4,
    right: typings.cesium.mod.Cartesian4,
    result: typings.cesium.mod.Cartesian4
  ): typings.cesium.mod.Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian4]
  
  /* static member */
  inline def clone_(cartesian: typings.cesium.mod.Cartesian4): typings.cesium.mod.Cartesian4 = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(cartesian.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Cartesian4]
  inline def clone_(cartesian: typings.cesium.mod.Cartesian4, result: typings.cesium.mod.Cartesian4): typings.cesium.mod.Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian4]
  
  /* static member */
  inline def distance(left: typings.cesium.mod.Cartesian4, right: typings.cesium.mod.Cartesian4): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def distanceSquared(left: typings.cesium.mod.Cartesian4, right: typings.cesium.mod.Cartesian4): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceSquared")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def divideByScalar(cartesian: typings.cesium.mod.Cartesian4, scalar: Double, result: typings.cesium.mod.Cartesian4): typings.cesium.mod.Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("divideByScalar")(cartesian.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian4]
  
  /* static member */
  inline def dot(left: typings.cesium.mod.Cartesian4, right: typings.cesium.mod.Cartesian4): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def equalsEpsilon(left: typings.cesium.mod.Cartesian4, right: typings.cesium.mod.Cartesian4, relativeEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(
    left: typings.cesium.mod.Cartesian4,
    right: typings.cesium.mod.Cartesian4,
    relativeEpsilon: Double,
    absoluteEpsilon: Double
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def equals_(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals_(left: Unit, right: typings.cesium.mod.Cartesian4): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(left: typings.cesium.mod.Cartesian4): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals_(left: typings.cesium.mod.Cartesian4, right: typings.cesium.mod.Cartesian4): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def fromArray(array: js.Array[Double]): typings.cesium.mod.Cartesian4 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Cartesian4]
  inline def fromArray(array: js.Array[Double], startingIndex: Double): typings.cesium.mod.Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian4]
  inline def fromArray(array: js.Array[Double], startingIndex: Double, result: typings.cesium.mod.Cartesian4): typings.cesium.mod.Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian4]
  inline def fromArray(array: js.Array[Double], startingIndex: Unit, result: typings.cesium.mod.Cartesian4): typings.cesium.mod.Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian4]
  
  /* static member */
  inline def fromColor(color: typings.cesium.mod.Color): typings.cesium.mod.Cartesian4 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromColor")(color.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Cartesian4]
  inline def fromColor(color: typings.cesium.mod.Color, result: typings.cesium.mod.Cartesian4): typings.cesium.mod.Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromColor")(color.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian4]
  
  /* static member */
  inline def fromElements(x: Double, y: Double, z: Double, w: Double): typings.cesium.mod.Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElements")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian4]
  inline def fromElements(x: Double, y: Double, z: Double, w: Double, result: typings.cesium.mod.Cartesian4): typings.cesium.mod.Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElements")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], w.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian4]
  
  /* static member */
  inline def lerp(
    start: typings.cesium.mod.Cartesian4,
    end: typings.cesium.mod.Cartesian4,
    t: Double,
    result: typings.cesium.mod.Cartesian4
  ): typings.cesium.mod.Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], t.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian4]
  
  /* static member */
  inline def magnitude(cartesian: typings.cesium.mod.Cartesian4): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("magnitude")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def magnitudeSquared(cartesian: typings.cesium.mod.Cartesian4): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("magnitudeSquared")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def maximumByComponent(
    first: typings.cesium.mod.Cartesian4,
    second: typings.cesium.mod.Cartesian4,
    result: typings.cesium.mod.Cartesian4
  ): typings.cesium.mod.Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("maximumByComponent")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian4]
  
  /* static member */
  inline def maximumComponent(cartesian: typings.cesium.mod.Cartesian4): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("maximumComponent")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def minimumByComponent(
    first: typings.cesium.mod.Cartesian4,
    second: typings.cesium.mod.Cartesian4,
    result: typings.cesium.mod.Cartesian4
  ): typings.cesium.mod.Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("minimumByComponent")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian4]
  
  /* static member */
  inline def minimumComponent(cartesian: typings.cesium.mod.Cartesian4): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("minimumComponent")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def mostOrthogonalAxis(cartesian: typings.cesium.mod.Cartesian4, result: typings.cesium.mod.Cartesian4): typings.cesium.mod.Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("mostOrthogonalAxis")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian4]
  
  /* static member */
  inline def multiplyByScalar(cartesian: typings.cesium.mod.Cartesian4, scalar: Double, result: typings.cesium.mod.Cartesian4): typings.cesium.mod.Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByScalar")(cartesian.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian4]
  
  /* static member */
  inline def multiplyComponents(
    left: typings.cesium.mod.Cartesian4,
    right: typings.cesium.mod.Cartesian4,
    result: typings.cesium.mod.Cartesian4
  ): typings.cesium.mod.Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyComponents")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian4]
  
  /* static member */
  inline def negate(cartesian: typings.cesium.mod.Cartesian4, result: typings.cesium.mod.Cartesian4): typings.cesium.mod.Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("negate")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian4]
  
  /* static member */
  inline def normalize(cartesian: typings.cesium.mod.Cartesian4, result: typings.cesium.mod.Cartesian4): typings.cesium.mod.Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian4]
  
  /* static member */
  inline def pack(value: typings.cesium.mod.Cartesian4, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def pack(value: typings.cesium.mod.Cartesian4, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /* static member */
  inline def subtract(
    left: typings.cesium.mod.Cartesian4,
    right: typings.cesium.mod.Cartesian4,
    result: typings.cesium.mod.Cartesian4
  ): typings.cesium.mod.Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian4]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): typings.cesium.mod.Cartesian4 = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Cartesian4]
  inline def unpack(array: js.Array[Double], startingIndex: Double): typings.cesium.mod.Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian4]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: typings.cesium.mod.Cartesian4): typings.cesium.mod.Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian4]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: typings.cesium.mod.Cartesian4): typings.cesium.mod.Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian4]
}
