package typings.cesium

import typings.cesium.mod.Cartesian2
import typings.cesium.mod.Cartesian3
import typings.cesium.mod.Cartesian4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cartesian2Mod {
  
  @JSImport("cesium/Source/Core/Cartesian2", JSImport.Default)
  @js.native
  open class default () extends Cartesian2 {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/Cartesian2", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * An immutable Cartesian2 instance initialized to (1.0, 1.0).
      */
    @JSImport("cesium/Source/Core/Cartesian2", "default.ONE")
    @js.native
    val ONE: Cartesian2 = js.native
    
    /**
      * An immutable Cartesian2 instance initialized to (1.0, 0.0).
      */
    @JSImport("cesium/Source/Core/Cartesian2", "default.UNIT_X")
    @js.native
    val UNIT_X: Cartesian2 = js.native
    
    /**
      * An immutable Cartesian2 instance initialized to (0.0, 1.0).
      */
    @JSImport("cesium/Source/Core/Cartesian2", "default.UNIT_Y")
    @js.native
    val UNIT_Y: Cartesian2 = js.native
    
    /**
      * An immutable Cartesian2 instance initialized to (0.0, 0.0).
      */
    @JSImport("cesium/Source/Core/Cartesian2", "default.ZERO")
    @js.native
    val ZERO: Cartesian2 = js.native
    
    /**
      * Computes the absolute value of the provided Cartesian.
      * @param cartesian - The Cartesian whose absolute value is to be computed.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def abs(cartesian: Cartesian2, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("abs")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
    
    /**
      * Computes the componentwise sum of two Cartesians.
      * @param left - The first Cartesian.
      * @param right - The second Cartesian.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def add(left: Cartesian2, right: Cartesian2, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
    
    /**
      * Returns the angle, in radians, between the provided Cartesians.
      * @param left - The first Cartesian.
      * @param right - The second Cartesian.
      * @returns The angle between the Cartesians.
      */
    inline def angleBetween(left: Cartesian2, right: Cartesian2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angleBetween")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Constrain a value to lie between two values.
      * @param value - The value to clamp.
      * @param min - The minimum bound.
      * @param max - The maximum bound.
      * @param result - The object into which to store the result.
      * @returns The clamped value such that min <= result <= max.
      */
    inline def clamp(value: Cartesian2, min: Cartesian2, max: Cartesian2, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
    
    /**
      * Duplicates a Cartesian2 instance.
      * @param cartesian - The Cartesian to duplicate.
      * @param [result] - The object onto which to store the result.
      * @returns The modified result parameter or a new Cartesian2 instance if one was not provided. (Returns undefined if cartesian is undefined)
      */
    inline def clone(cartesian: Cartesian2): Cartesian2 = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Cartesian2]
    inline def clone(cartesian: Cartesian2, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
    
    /**
      * Computes the magnitude of the cross product that would result from implicitly setting the Z coordinate of the input vectors to 0
      * @param left - The first Cartesian.
      * @param right - The second Cartesian.
      * @returns The cross product.
      */
    inline def cross(left: Cartesian2, right: Cartesian2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Computes the distance between two points.
      * @example
      * // Returns 1.0
      * const d = Cesium.Cartesian2.distance(new Cesium.Cartesian2(1.0, 0.0), new Cesium.Cartesian2(2.0, 0.0));
      * @param left - The first point to compute the distance from.
      * @param right - The second point to compute the distance to.
      * @returns The distance between two points.
      */
    inline def distance(left: Cartesian2, right: Cartesian2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Computes the squared distance between two points.  Comparing squared distances
      * using this function is more efficient than comparing distances using {@link Cartesian2#distance}.
      * @example
      * // Returns 4.0, not 2.0
      * const d = Cesium.Cartesian2.distance(new Cesium.Cartesian2(1.0, 0.0), new Cesium.Cartesian2(3.0, 0.0));
      * @param left - The first point to compute the distance from.
      * @param right - The second point to compute the distance to.
      * @returns The distance between two points.
      */
    inline def distanceSquared(left: Cartesian2, right: Cartesian2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceSquared")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Divides the provided Cartesian componentwise by the provided scalar.
      * @param cartesian - The Cartesian to be divided.
      * @param scalar - The scalar to divide by.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def divideByScalar(cartesian: Cartesian2, scalar: Double, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("divideByScalar")(cartesian.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
    
    /**
      * Computes the componentwise quotient of two Cartesians.
      * @param left - The first Cartesian.
      * @param right - The second Cartesian.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def divideComponents(left: Cartesian2, right: Cartesian2, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("divideComponents")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
    
    /**
      * Computes the dot (scalar) product of two Cartesians.
      * @param left - The first Cartesian.
      * @param right - The second Cartesian.
      * @returns The dot product.
      */
    inline def dot(left: Cartesian2, right: Cartesian2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Compares the provided Cartesians componentwise and returns
      * <code>true</code> if they are equal, <code>false</code> otherwise.
      * @param [left] - The first Cartesian.
      * @param [right] - The second Cartesian.
      * @returns <code>true</code> if left and right are equal, <code>false</code> otherwise.
      */
    inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
    inline def equals(left: Unit, right: Cartesian2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(left: Cartesian2): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(left: Cartesian2, right: Cartesian2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Compares the provided Cartesians componentwise and returns
      * <code>true</code> if they pass an absolute or relative tolerance test,
      * <code>false</code> otherwise.
      * @param [left] - The first Cartesian.
      * @param [right] - The second Cartesian.
      * @param [relativeEpsilon = 0] - The relative epsilon tolerance to use for equality testing.
      * @param [absoluteEpsilon = relativeEpsilon] - The absolute epsilon tolerance to use for equality testing.
      * @returns <code>true</code> if left and right are within the provided epsilon, <code>false</code> otherwise.
      */
    inline def equalsEpsilon(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")().asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Unit, right: Unit, relativeEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Unit, right: Unit, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Unit, right: Unit, relativeEpsilon: Unit, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Unit, right: Cartesian2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Unit, right: Cartesian2, relativeEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Unit, right: Cartesian2, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Unit, right: Cartesian2, relativeEpsilon: Unit, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Cartesian2): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Cartesian2, right: Unit, relativeEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Cartesian2, right: Unit, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Cartesian2, right: Unit, relativeEpsilon: Unit, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Cartesian2, right: Cartesian2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Cartesian2, right: Cartesian2, relativeEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Cartesian2, right: Cartesian2, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equalsEpsilon(left: Cartesian2, right: Cartesian2, relativeEpsilon: Unit, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Creates a Cartesian2 from two consecutive elements in an array.
      * @example
      * // Create a Cartesian2 with (1.0, 2.0)
      * const v = [1.0, 2.0];
      * const p = Cesium.Cartesian2.fromArray(v);
      *
      * // Create a Cartesian2 with (1.0, 2.0) using an offset into an array
      * const v2 = [0.0, 0.0, 1.0, 2.0];
      * const p2 = Cesium.Cartesian2.fromArray(v2, 2);
      * @param array - The array whose two consecutive elements correspond to the x and y components, respectively.
      * @param [startingIndex = 0] - The offset into the array of the first element, which corresponds to the x component.
      * @param [result] - The object onto which to store the result.
      * @returns The modified result parameter or a new Cartesian2 instance if one was not provided.
      */
    inline def fromArray(array: js.Array[Double]): Cartesian2 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[Cartesian2]
    inline def fromArray(array: js.Array[Double], startingIndex: Double): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
    inline def fromArray(array: js.Array[Double], startingIndex: Double, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
    inline def fromArray(array: js.Array[Double], startingIndex: Unit, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
    
    /**
      * Creates a Cartesian2 instance from an existing Cartesian3.  This simply takes the
      * x and y properties of the Cartesian3 and drops z.
      * @param cartesian - The Cartesian3 instance to create a Cartesian2 instance from.
      * @param [result] - The object onto which to store the result.
      * @returns The modified result parameter or a new Cartesian2 instance if one was not provided.
      */
    inline def fromCartesian3(cartesian: Cartesian3): Cartesian2 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian3")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Cartesian2]
    inline def fromCartesian3(cartesian: Cartesian3, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian3")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
    
    /**
      * Creates a Cartesian2 instance from an existing Cartesian4.  This simply takes the
      * x and y properties of the Cartesian4 and drops z and w.
      * @param cartesian - The Cartesian4 instance to create a Cartesian2 instance from.
      * @param [result] - The object onto which to store the result.
      * @returns The modified result parameter or a new Cartesian2 instance if one was not provided.
      */
    inline def fromCartesian4(cartesian: Cartesian4): Cartesian2 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian4")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Cartesian2]
    inline def fromCartesian4(cartesian: Cartesian4, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian4")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
    
    /**
      * Creates a Cartesian2 instance from x and y coordinates.
      * @param x - The x coordinate.
      * @param y - The y coordinate.
      * @param [result] - The object onto which to store the result.
      * @returns The modified result parameter or a new Cartesian2 instance if one was not provided.
      */
    inline def fromElements(x: Double, y: Double): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElements")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
    inline def fromElements(x: Double, y: Double, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElements")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
    
    /**
      * Computes the linear interpolation or extrapolation at t using the provided cartesians.
      * @param start - The value corresponding to t at 0.0.
      * @param end - The value corresponding to t at 1.0.
      * @param t - The point along t at which to interpolate.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def lerp(start: Cartesian2, end: Cartesian2, t: Double, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], t.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
    
    /**
      * Computes the Cartesian's magnitude (length).
      * @param cartesian - The Cartesian instance whose magnitude is to be computed.
      * @returns The magnitude.
      */
    inline def magnitude(cartesian: Cartesian2): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("magnitude")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Computes the provided Cartesian's squared magnitude.
      * @param cartesian - The Cartesian instance whose squared magnitude is to be computed.
      * @returns The squared magnitude.
      */
    inline def magnitudeSquared(cartesian: Cartesian2): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("magnitudeSquared")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Compares two Cartesians and computes a Cartesian which contains the maximum components of the supplied Cartesians.
      * @param first - A cartesian to compare.
      * @param second - A cartesian to compare.
      * @param result - The object into which to store the result.
      * @returns A cartesian with the maximum components.
      */
    inline def maximumByComponent(first: Cartesian2, second: Cartesian2, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("maximumByComponent")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
    
    /**
      * Computes the value of the maximum component for the supplied Cartesian.
      * @param cartesian - The cartesian to use.
      * @returns The value of the maximum component.
      */
    inline def maximumComponent(cartesian: Cartesian2): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("maximumComponent")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Compares two Cartesians and computes a Cartesian which contains the minimum components of the supplied Cartesians.
      * @param first - A cartesian to compare.
      * @param second - A cartesian to compare.
      * @param result - The object into which to store the result.
      * @returns A cartesian with the minimum components.
      */
    inline def minimumByComponent(first: Cartesian2, second: Cartesian2, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("minimumByComponent")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
    
    /**
      * Computes the value of the minimum component for the supplied Cartesian.
      * @param cartesian - The cartesian to use.
      * @returns The value of the minimum component.
      */
    inline def minimumComponent(cartesian: Cartesian2): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("minimumComponent")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns the axis that is most orthogonal to the provided Cartesian.
      * @param cartesian - The Cartesian on which to find the most orthogonal axis.
      * @param result - The object onto which to store the result.
      * @returns The most orthogonal axis.
      */
    inline def mostOrthogonalAxis(cartesian: Cartesian2, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("mostOrthogonalAxis")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
    
    /**
      * Multiplies the provided Cartesian componentwise by the provided scalar.
      * @param cartesian - The Cartesian to be scaled.
      * @param scalar - The scalar to multiply with.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def multiplyByScalar(cartesian: Cartesian2, scalar: Double, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByScalar")(cartesian.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
    
    /**
      * Computes the componentwise product of two Cartesians.
      * @param left - The first Cartesian.
      * @param right - The second Cartesian.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def multiplyComponents(left: Cartesian2, right: Cartesian2, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyComponents")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
    
    /**
      * Negates the provided Cartesian.
      * @param cartesian - The Cartesian to be negated.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def negate(cartesian: Cartesian2, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("negate")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
    
    /**
      * Computes the normalized form of the supplied Cartesian.
      * @param cartesian - The Cartesian to be normalized.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def normalize(cartesian: Cartesian2, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
    
    /**
      * Stores the provided instance into the provided array.
      * @param value - The value to pack.
      * @param array - The array to pack into.
      * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
      * @returns The array that was packed into
      */
    inline def pack(value: Cartesian2, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def pack(value: Cartesian2, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * Flattens an array of Cartesian2s into an array of components.
      * @param array - The array of cartesians to pack.
      * @param [result] - The array onto which to store the result. If this is a typed array, it must have array.length * 2 components, else a {@link DeveloperError} will be thrown. If it is a regular array, it will be resized to have (array.length * 2) elements.
      * @returns The packed array.
      */
    inline def packArray(array: js.Array[Cartesian2]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("packArray")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    inline def packArray(array: js.Array[Cartesian2], result: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("packArray")(array.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * The number of elements used to pack the object into an array.
      */
    @JSImport("cesium/Source/Core/Cartesian2", "default.packedLength")
    @js.native
    def packedLength: Double = js.native
    inline def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
    
    /**
      * Computes the componentwise difference of two Cartesians.
      * @param left - The first Cartesian.
      * @param right - The second Cartesian.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter.
      */
    inline def subtract(left: Cartesian2, right: Cartesian2, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
    
    /**
      * Retrieves an instance from a packed array.
      * @param array - The packed array.
      * @param [startingIndex = 0] - The starting index of the element to be unpacked.
      * @param [result] - The object into which to store the result.
      * @returns The modified result parameter or a new Cartesian2 instance if one was not provided.
      */
    inline def unpack(array: js.Array[Double]): Cartesian2 = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[Cartesian2]
    inline def unpack(array: js.Array[Double], startingIndex: Double): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
    inline def unpack(array: js.Array[Double], startingIndex: Double, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
    inline def unpack(array: js.Array[Double], startingIndex: Unit, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
    
    /**
      * Unpacks an array of cartesian components into an array of Cartesian2s.
      * @param array - The array of components to unpack.
      * @param [result] - The array onto which to store the result.
      * @returns The unpacked array.
      */
    inline def unpackArray(array: js.Array[Double]): js.Array[Cartesian2] = ^.asInstanceOf[js.Dynamic].applyDynamic("unpackArray")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Cartesian2]]
    inline def unpackArray(array: js.Array[Double], result: js.Array[Cartesian2]): js.Array[Cartesian2] = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackArray")(array.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian2]]
  }
}
