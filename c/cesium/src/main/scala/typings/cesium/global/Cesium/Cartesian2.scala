package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.Cartesian2")
@js.native
class Cartesian2 ()
  extends typings.cesium.mod.Cartesian2 {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
}
object Cartesian2 {
  
  @JSGlobal("Cesium.Cartesian2")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Cesium.Cartesian2.UNIT_X")
  @js.native
  def UNIT_X: typings.cesium.mod.Cartesian2 = js.native
  inline def UNIT_X_=(x: typings.cesium.mod.Cartesian2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNIT_X")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.Cartesian2.UNIT_Y")
  @js.native
  def UNIT_Y: typings.cesium.mod.Cartesian2 = js.native
  inline def UNIT_Y_=(x: typings.cesium.mod.Cartesian2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNIT_Y")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Cesium.Cartesian2.ZERO")
  @js.native
  def ZERO: typings.cesium.mod.Cartesian2 = js.native
  inline def ZERO_=(x: typings.cesium.mod.Cartesian2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def abs(cartesian: typings.cesium.mod.Cartesian2, result: typings.cesium.mod.Cartesian2): typings.cesium.mod.Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("abs")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian2]
  
  /* static member */
  inline def add(
    left: typings.cesium.mod.Cartesian2,
    right: typings.cesium.mod.Cartesian2,
    result: typings.cesium.mod.Cartesian2
  ): typings.cesium.mod.Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian2]
  
  /* static member */
  inline def angleBetween(left: typings.cesium.mod.Cartesian2, right: typings.cesium.mod.Cartesian2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angleBetween")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def clone_(cartesian: typings.cesium.mod.Cartesian2): typings.cesium.mod.Cartesian2 = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(cartesian.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Cartesian2]
  inline def clone_(cartesian: typings.cesium.mod.Cartesian2, result: typings.cesium.mod.Cartesian2): typings.cesium.mod.Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian2]
  
  /* static member */
  inline def distance(left: typings.cesium.mod.Cartesian2, right: typings.cesium.mod.Cartesian2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def distanceSquared(left: typings.cesium.mod.Cartesian2, right: typings.cesium.mod.Cartesian2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceSquared")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def divideByScalar(cartesian: typings.cesium.mod.Cartesian2, scalar: Double, result: typings.cesium.mod.Cartesian2): typings.cesium.mod.Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("divideByScalar")(cartesian.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian2]
  
  /* static member */
  inline def dot(left: typings.cesium.mod.Cartesian2, right: typings.cesium.mod.Cartesian2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def equalsEpsilon(left: typings.cesium.mod.Cartesian2, right: typings.cesium.mod.Cartesian2, relativeEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(
    left: typings.cesium.mod.Cartesian2,
    right: typings.cesium.mod.Cartesian2,
    relativeEpsilon: Double,
    absoluteEpsilon: Double
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def equals_(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals_(left: Unit, right: typings.cesium.mod.Cartesian2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(left: typings.cesium.mod.Cartesian2): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals_(left: typings.cesium.mod.Cartesian2, right: typings.cesium.mod.Cartesian2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def fromArray(array: js.Array[Double]): typings.cesium.mod.Cartesian2 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Cartesian2]
  inline def fromArray(array: js.Array[Double], startingIndex: Double): typings.cesium.mod.Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian2]
  inline def fromArray(array: js.Array[Double], startingIndex: Double, result: typings.cesium.mod.Cartesian2): typings.cesium.mod.Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian2]
  inline def fromArray(array: js.Array[Double], startingIndex: Unit, result: typings.cesium.mod.Cartesian2): typings.cesium.mod.Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian2]
  
  /* static member */
  inline def fromCartesian3(cartesian: typings.cesium.mod.Cartesian3): typings.cesium.mod.Cartesian2 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian3")(cartesian.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Cartesian2]
  inline def fromCartesian3(cartesian: typings.cesium.mod.Cartesian3, result: typings.cesium.mod.Cartesian2): typings.cesium.mod.Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian3")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian2]
  
  /* static member */
  inline def fromCartesian4(cartesian: typings.cesium.mod.Cartesian4): typings.cesium.mod.Cartesian2 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian4")(cartesian.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Cartesian2]
  inline def fromCartesian4(cartesian: typings.cesium.mod.Cartesian4, result: typings.cesium.mod.Cartesian2): typings.cesium.mod.Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian4")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian2]
  
  /* static member */
  inline def fromElements(x: Double, y: Double): typings.cesium.mod.Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElements")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian2]
  inline def fromElements(x: Double, y: Double, result: typings.cesium.mod.Cartesian2): typings.cesium.mod.Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElements")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian2]
  
  /* static member */
  inline def lerp(
    start: typings.cesium.mod.Cartesian2,
    end: typings.cesium.mod.Cartesian2,
    t: Double,
    result: typings.cesium.mod.Cartesian2
  ): typings.cesium.mod.Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], t.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian2]
  
  /* static member */
  inline def magnitude(cartesian: typings.cesium.mod.Cartesian2): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("magnitude")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def magnitudeSquared(cartesian: typings.cesium.mod.Cartesian2): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("magnitudeSquared")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def maximumByComponent(
    first: typings.cesium.mod.Cartesian2,
    second: typings.cesium.mod.Cartesian2,
    result: typings.cesium.mod.Cartesian2
  ): typings.cesium.mod.Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("maximumByComponent")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian2]
  
  /* static member */
  inline def maximumComponent(cartesian: typings.cesium.mod.Cartesian2): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("maximumComponent")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def minimumByComponent(
    first: typings.cesium.mod.Cartesian2,
    second: typings.cesium.mod.Cartesian2,
    result: typings.cesium.mod.Cartesian2
  ): typings.cesium.mod.Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("minimumByComponent")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian2]
  
  /* static member */
  inline def minimumComponent(cartesian: typings.cesium.mod.Cartesian2): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("minimumComponent")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def mostOrthogonalAxis(cartesian: typings.cesium.mod.Cartesian2, result: typings.cesium.mod.Cartesian2): typings.cesium.mod.Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("mostOrthogonalAxis")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian2]
  
  /* static member */
  inline def multiplyByScalar(cartesian: typings.cesium.mod.Cartesian2, scalar: Double, result: typings.cesium.mod.Cartesian2): typings.cesium.mod.Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByScalar")(cartesian.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian2]
  
  /* static member */
  inline def multiplyComponents(
    left: typings.cesium.mod.Cartesian2,
    right: typings.cesium.mod.Cartesian2,
    result: typings.cesium.mod.Cartesian2
  ): typings.cesium.mod.Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyComponents")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian2]
  
  /* static member */
  inline def negate(cartesian: typings.cesium.mod.Cartesian2, result: typings.cesium.mod.Cartesian2): typings.cesium.mod.Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("negate")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian2]
  
  /* static member */
  inline def normalize(cartesian: typings.cesium.mod.Cartesian2, result: typings.cesium.mod.Cartesian2): typings.cesium.mod.Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian2]
  
  /* static member */
  inline def pack(value: typings.cesium.mod.Cartesian2, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def pack(value: typings.cesium.mod.Cartesian2, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /* static member */
  inline def subtract(
    left: typings.cesium.mod.Cartesian2,
    right: typings.cesium.mod.Cartesian2,
    result: typings.cesium.mod.Cartesian2
  ): typings.cesium.mod.Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian2]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): typings.cesium.mod.Cartesian2 = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Cartesian2]
  inline def unpack(array: js.Array[Double], startingIndex: Double): typings.cesium.mod.Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian2]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: typings.cesium.mod.Cartesian2): typings.cesium.mod.Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian2]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: typings.cesium.mod.Cartesian2): typings.cesium.mod.Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian2]
}
