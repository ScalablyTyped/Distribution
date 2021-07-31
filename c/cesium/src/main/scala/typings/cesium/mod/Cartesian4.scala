package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Cartesian4")
@js.native
class Cartesian4 () extends Packable {
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
  
  def clone(result: Cartesian4): Cartesian4 = js.native
  
  def equals(): Boolean = js.native
  def equals(right: Cartesian4): Boolean = js.native
  
  def equalsEpsilon(right: Cartesian4, relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(right: Cartesian4, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
  
  var w: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
  
  var z: Double = js.native
}
object Cartesian4 {
  
  @JSImport("cesium", "Cartesian4")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian4.UNIT_W")
  @js.native
  def UNIT_W: Cartesian4 = js.native
  @scala.inline
  def UNIT_W_=(x: Cartesian4): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNIT_W")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Cartesian4.UNIT_X")
  @js.native
  def UNIT_X: Cartesian4 = js.native
  @scala.inline
  def UNIT_X_=(x: Cartesian4): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNIT_X")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Cartesian4.UNIT_Y")
  @js.native
  def UNIT_Y: Cartesian4 = js.native
  @scala.inline
  def UNIT_Y_=(x: Cartesian4): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNIT_Y")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Cartesian4.UNIT_Z")
  @js.native
  def UNIT_Z: Cartesian4 = js.native
  @scala.inline
  def UNIT_Z_=(x: Cartesian4): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNIT_Z")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Cartesian4.ZERO")
  @js.native
  def ZERO: Cartesian4 = js.native
  @scala.inline
  def ZERO_=(x: Cartesian4): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  
  /* static member */
  @scala.inline
  def abs(cartesian: Cartesian4, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("abs")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /* static member */
  @scala.inline
  def add(left: Cartesian4, right: Cartesian4, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /* static member */
  @scala.inline
  def clone_(cartesian: Cartesian4): Cartesian4 = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Cartesian4]
  @scala.inline
  def clone_(cartesian: Cartesian4, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /* static member */
  @scala.inline
  def distance(left: Cartesian4, right: Cartesian4): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def distanceSquared(left: Cartesian4, right: Cartesian4): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceSquared")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def divideByScalar(cartesian: Cartesian4, scalar: Double, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("divideByScalar")(cartesian.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /* static member */
  @scala.inline
  def dot(left: Cartesian4, right: Cartesian4): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def equalsEpsilon(left: Cartesian4, right: Cartesian4, relativeEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equalsEpsilon(left: Cartesian4, right: Cartesian4, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def equals_(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: Unit, right: Cartesian4): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: Cartesian4): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: Cartesian4, right: Cartesian4): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def fromArray(array: js.Array[Double]): Cartesian4 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[Cartesian4]
  @scala.inline
  def fromArray(array: js.Array[Double], startingIndex: Double): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  @scala.inline
  def fromArray(array: js.Array[Double], startingIndex: Double, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  @scala.inline
  def fromArray(array: js.Array[Double], startingIndex: Unit, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /* static member */
  @scala.inline
  def fromColor(color: Color): Cartesian4 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromColor")(color.asInstanceOf[js.Any]).asInstanceOf[Cartesian4]
  @scala.inline
  def fromColor(color: Color, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromColor")(color.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /* static member */
  @scala.inline
  def fromElements(x: Double, y: Double, z: Double, w: Double): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElements")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  @scala.inline
  def fromElements(x: Double, y: Double, z: Double, w: Double, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElements")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], w.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /* static member */
  @scala.inline
  def lerp(start: Cartesian4, end: Cartesian4, t: Double, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], t.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /* static member */
  @scala.inline
  def magnitude(cartesian: Cartesian4): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("magnitude")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def magnitudeSquared(cartesian: Cartesian4): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("magnitudeSquared")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def maximumByComponent(first: Cartesian4, second: Cartesian4, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("maximumByComponent")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /* static member */
  @scala.inline
  def maximumComponent(cartesian: Cartesian4): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("maximumComponent")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def minimumByComponent(first: Cartesian4, second: Cartesian4, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("minimumByComponent")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /* static member */
  @scala.inline
  def minimumComponent(cartesian: Cartesian4): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("minimumComponent")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def mostOrthogonalAxis(cartesian: Cartesian4, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("mostOrthogonalAxis")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /* static member */
  @scala.inline
  def multiplyByScalar(cartesian: Cartesian4, scalar: Double, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByScalar")(cartesian.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /* static member */
  @scala.inline
  def multiplyComponents(left: Cartesian4, right: Cartesian4, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyComponents")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /* static member */
  @scala.inline
  def negate(cartesian: Cartesian4, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("negate")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /* static member */
  @scala.inline
  def normalize(cartesian: Cartesian4, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /* static member */
  @scala.inline
  def pack(value: Cartesian4, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def pack(value: Cartesian4, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /* static member */
  @scala.inline
  def subtract(left: Cartesian4, right: Cartesian4, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  
  /* static member */
  @scala.inline
  def unpack(array: js.Array[Double]): Cartesian4 = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[Cartesian4]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Unit, result: Cartesian4): Cartesian4 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian4]
}
