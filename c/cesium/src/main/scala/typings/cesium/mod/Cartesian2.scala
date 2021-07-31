package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Cartesian2")
@js.native
class Cartesian2 () extends Packable {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  
  def clone(result: Cartesian2): Cartesian2 = js.native
  
  def equals(): Boolean = js.native
  def equals(right: Cartesian2): Boolean = js.native
  
  def equalsEpsilon(right: Cartesian2, relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(right: Cartesian2, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object Cartesian2 {
  
  @JSImport("cesium", "Cartesian2")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian2.UNIT_X")
  @js.native
  def UNIT_X: Cartesian2 = js.native
  @scala.inline
  def UNIT_X_=(x: Cartesian2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNIT_X")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Cartesian2.UNIT_Y")
  @js.native
  def UNIT_Y: Cartesian2 = js.native
  @scala.inline
  def UNIT_Y_=(x: Cartesian2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNIT_Y")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Cartesian2.ZERO")
  @js.native
  def ZERO: Cartesian2 = js.native
  @scala.inline
  def ZERO_=(x: Cartesian2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  
  /* static member */
  @scala.inline
  def abs(cartesian: Cartesian2, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("abs")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  
  /* static member */
  @scala.inline
  def add(left: Cartesian2, right: Cartesian2, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  
  /* static member */
  @scala.inline
  def angleBetween(left: Cartesian2, right: Cartesian2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angleBetween")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def clone_(cartesian: Cartesian2): Cartesian2 = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Cartesian2]
  @scala.inline
  def clone_(cartesian: Cartesian2, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  
  /* static member */
  @scala.inline
  def distance(left: Cartesian2, right: Cartesian2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def distanceSquared(left: Cartesian2, right: Cartesian2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceSquared")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def divideByScalar(cartesian: Cartesian2, scalar: Double, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("divideByScalar")(cartesian.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  
  /* static member */
  @scala.inline
  def dot(left: Cartesian2, right: Cartesian2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def equalsEpsilon(left: Cartesian2, right: Cartesian2, relativeEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equalsEpsilon(left: Cartesian2, right: Cartesian2, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def equals_(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: Unit, right: Cartesian2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: Cartesian2): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: Cartesian2, right: Cartesian2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def fromArray(array: js.Array[Double]): Cartesian2 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[Cartesian2]
  @scala.inline
  def fromArray(array: js.Array[Double], startingIndex: Double): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  @scala.inline
  def fromArray(array: js.Array[Double], startingIndex: Double, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  @scala.inline
  def fromArray(array: js.Array[Double], startingIndex: Unit, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  
  /* static member */
  @scala.inline
  def fromCartesian3(cartesian: Cartesian3): Cartesian2 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian3")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Cartesian2]
  @scala.inline
  def fromCartesian3(cartesian: Cartesian3, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian3")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  
  /* static member */
  @scala.inline
  def fromCartesian4(cartesian: Cartesian4): Cartesian2 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian4")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Cartesian2]
  @scala.inline
  def fromCartesian4(cartesian: Cartesian4, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian4")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  
  /* static member */
  @scala.inline
  def fromElements(x: Double, y: Double): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElements")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  @scala.inline
  def fromElements(x: Double, y: Double, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElements")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  
  /* static member */
  @scala.inline
  def lerp(start: Cartesian2, end: Cartesian2, t: Double, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], t.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  
  /* static member */
  @scala.inline
  def magnitude(cartesian: Cartesian2): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("magnitude")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def magnitudeSquared(cartesian: Cartesian2): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("magnitudeSquared")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def maximumByComponent(first: Cartesian2, second: Cartesian2, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("maximumByComponent")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  
  /* static member */
  @scala.inline
  def maximumComponent(cartesian: Cartesian2): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("maximumComponent")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def minimumByComponent(first: Cartesian2, second: Cartesian2, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("minimumByComponent")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  
  /* static member */
  @scala.inline
  def minimumComponent(cartesian: Cartesian2): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("minimumComponent")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def mostOrthogonalAxis(cartesian: Cartesian2, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("mostOrthogonalAxis")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  
  /* static member */
  @scala.inline
  def multiplyByScalar(cartesian: Cartesian2, scalar: Double, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByScalar")(cartesian.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  
  /* static member */
  @scala.inline
  def multiplyComponents(left: Cartesian2, right: Cartesian2, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyComponents")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  
  /* static member */
  @scala.inline
  def negate(cartesian: Cartesian2, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("negate")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  
  /* static member */
  @scala.inline
  def normalize(cartesian: Cartesian2, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  
  /* static member */
  @scala.inline
  def pack(value: Cartesian2, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def pack(value: Cartesian2, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /* static member */
  @scala.inline
  def subtract(left: Cartesian2, right: Cartesian2, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  
  /* static member */
  @scala.inline
  def unpack(array: js.Array[Double]): Cartesian2 = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[Cartesian2]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Unit, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
}
