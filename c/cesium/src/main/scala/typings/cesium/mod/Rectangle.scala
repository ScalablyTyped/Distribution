package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Rectangle")
@js.native
class Rectangle () extends Packable {
  def this(west: Double) = this()
  def this(west: Double, south: Double) = this()
  def this(west: Unit, south: Double) = this()
  def this(west: Double, south: Double, east: Double) = this()
  def this(west: Double, south: Unit, east: Double) = this()
  def this(west: Unit, south: Double, east: Double) = this()
  def this(west: Unit, south: Unit, east: Double) = this()
  def this(west: Double, south: Double, east: Double, north: Double) = this()
  def this(west: Double, south: Double, east: Unit, north: Double) = this()
  def this(west: Double, south: Unit, east: Double, north: Double) = this()
  def this(west: Double, south: Unit, east: Unit, north: Double) = this()
  def this(west: Unit, south: Double, east: Double, north: Double) = this()
  def this(west: Unit, south: Double, east: Unit, north: Double) = this()
  def this(west: Unit, south: Unit, east: Double, north: Double) = this()
  def this(west: Unit, south: Unit, east: Unit, north: Double) = this()
  
  def clone(result: Rectangle): Rectangle = js.native
  
  var east: Double = js.native
  
  def equals(): Boolean = js.native
  def equals(other: Rectangle): Boolean = js.native
  
  def equalsEpsilon(other: Rectangle, epsilon: Double): Boolean = js.native
  
  var height: Double = js.native
  
  var north: Double = js.native
  
  var south: Double = js.native
  
  var west: Double = js.native
  
  var width: Double = js.native
}
object Rectangle {
  
  @JSImport("cesium", "Rectangle")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "Rectangle.MAX_VALUE")
  @js.native
  def MAX_VALUE: Rectangle = js.native
  @scala.inline
  def MAX_VALUE_=(x: Rectangle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_VALUE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @scala.inline
  def center(rectangle: Rectangle): Cartographic = ^.asInstanceOf[js.Dynamic].applyDynamic("center")(rectangle.asInstanceOf[js.Any]).asInstanceOf[Cartographic]
  @scala.inline
  def center(rectangle: Rectangle, result: Cartographic): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("center")(rectangle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  
  /* static member */
  @scala.inline
  def clone_(rectangle: Rectangle): Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(rectangle.asInstanceOf[js.Any]).asInstanceOf[Rectangle]
  @scala.inline
  def clone_(rectangle: Rectangle, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(rectangle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  
  /* static member */
  @scala.inline
  def computeHeight(rectangle: Rectangle): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeHeight")(rectangle.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def computeWidth(rectangle: Rectangle): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeWidth")(rectangle.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def contains(rectangle: Rectangle, cartographic: Cartographic): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(rectangle.asInstanceOf[js.Any], cartographic.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def equals_(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: Unit, right: Rectangle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: Rectangle): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: Rectangle, right: Rectangle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def fromCartographicArray(cartographics: js.Array[Cartographic]): Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCartographicArray")(cartographics.asInstanceOf[js.Any]).asInstanceOf[Rectangle]
  @scala.inline
  def fromCartographicArray(cartographics: js.Array[Cartographic], result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCartographicArray")(cartographics.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  
  /* static member */
  @scala.inline
  def fromDegrees(): Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")().asInstanceOf[Rectangle]
  @scala.inline
  def fromDegrees(west: Double): Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any]).asInstanceOf[Rectangle]
  @scala.inline
  def fromDegrees(west: Double, south: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  @scala.inline
  def fromDegrees(west: Double, south: Double, east: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  @scala.inline
  def fromDegrees(west: Double, south: Double, east: Double, north: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  @scala.inline
  def fromDegrees(west: Double, south: Double, east: Double, north: Double, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  @scala.inline
  def fromDegrees(west: Double, south: Double, east: Double, north: Unit, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  @scala.inline
  def fromDegrees(west: Double, south: Double, east: Unit, north: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  @scala.inline
  def fromDegrees(west: Double, south: Double, east: Unit, north: Double, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  @scala.inline
  def fromDegrees(west: Double, south: Double, east: Unit, north: Unit, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  @scala.inline
  def fromDegrees(west: Double, south: Unit, east: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  @scala.inline
  def fromDegrees(west: Double, south: Unit, east: Double, north: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  @scala.inline
  def fromDegrees(west: Double, south: Unit, east: Double, north: Double, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  @scala.inline
  def fromDegrees(west: Double, south: Unit, east: Double, north: Unit, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  @scala.inline
  def fromDegrees(west: Double, south: Unit, east: Unit, north: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  @scala.inline
  def fromDegrees(west: Double, south: Unit, east: Unit, north: Double, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  @scala.inline
  def fromDegrees(west: Double, south: Unit, east: Unit, north: Unit, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  @scala.inline
  def fromDegrees(west: Unit, south: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  @scala.inline
  def fromDegrees(west: Unit, south: Double, east: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  @scala.inline
  def fromDegrees(west: Unit, south: Double, east: Double, north: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  @scala.inline
  def fromDegrees(west: Unit, south: Double, east: Double, north: Double, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  @scala.inline
  def fromDegrees(west: Unit, south: Double, east: Double, north: Unit, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  @scala.inline
  def fromDegrees(west: Unit, south: Double, east: Unit, north: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  @scala.inline
  def fromDegrees(west: Unit, south: Double, east: Unit, north: Double, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  @scala.inline
  def fromDegrees(west: Unit, south: Double, east: Unit, north: Unit, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  @scala.inline
  def fromDegrees(west: Unit, south: Unit, east: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  @scala.inline
  def fromDegrees(west: Unit, south: Unit, east: Double, north: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  @scala.inline
  def fromDegrees(west: Unit, south: Unit, east: Double, north: Double, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  @scala.inline
  def fromDegrees(west: Unit, south: Unit, east: Double, north: Unit, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  @scala.inline
  def fromDegrees(west: Unit, south: Unit, east: Unit, north: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  @scala.inline
  def fromDegrees(west: Unit, south: Unit, east: Unit, north: Double, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  @scala.inline
  def fromDegrees(west: Unit, south: Unit, east: Unit, north: Unit, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  
  /* static member */
  @scala.inline
  def intersection(rectangle: Rectangle, otherRectangle: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(rectangle.asInstanceOf[js.Any], otherRectangle.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  @scala.inline
  def intersection(rectangle: Rectangle, otherRectangle: Rectangle, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(rectangle.asInstanceOf[js.Any], otherRectangle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  
  /* static member */
  @scala.inline
  def northeast(rectangle: Rectangle): Cartographic = ^.asInstanceOf[js.Dynamic].applyDynamic("northeast")(rectangle.asInstanceOf[js.Any]).asInstanceOf[Cartographic]
  @scala.inline
  def northeast(rectangle: Rectangle, result: Cartographic): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("northeast")(rectangle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  
  /* static member */
  @scala.inline
  def northwest(rectangle: Rectangle): Cartographic = ^.asInstanceOf[js.Dynamic].applyDynamic("northwest")(rectangle.asInstanceOf[js.Any]).asInstanceOf[Cartographic]
  @scala.inline
  def northwest(rectangle: Rectangle, result: Cartographic): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("northwest")(rectangle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  
  /* static member */
  @scala.inline
  def pack(value: Rectangle, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def pack(value: Rectangle, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /* static member */
  @scala.inline
  def southeast(rectangle: Rectangle): Cartographic = ^.asInstanceOf[js.Dynamic].applyDynamic("southeast")(rectangle.asInstanceOf[js.Any]).asInstanceOf[Cartographic]
  @scala.inline
  def southeast(rectangle: Rectangle, result: Cartographic): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("southeast")(rectangle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  
  /* static member */
  @scala.inline
  def southwest(rectangle: Rectangle): Cartographic = ^.asInstanceOf[js.Dynamic].applyDynamic("southwest")(rectangle.asInstanceOf[js.Any]).asInstanceOf[Cartographic]
  @scala.inline
  def southwest(rectangle: Rectangle, result: Cartographic): Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("southwest")(rectangle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartographic]
  
  /* static member */
  @scala.inline
  def subsample(rectangle: Rectangle): js.Array[Cartesian3] = ^.asInstanceOf[js.Dynamic].applyDynamic("subsample")(rectangle.asInstanceOf[js.Any]).asInstanceOf[js.Array[Cartesian3]]
  @scala.inline
  def subsample(rectangle: Rectangle, ellipsoid: Unit, surfaceHeight: Double): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("subsample")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  @scala.inline
  def subsample(rectangle: Rectangle, ellipsoid: Unit, surfaceHeight: Double, result: js.Array[Cartesian3]): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("subsample")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  @scala.inline
  def subsample(rectangle: Rectangle, ellipsoid: Unit, surfaceHeight: Unit, result: js.Array[Cartesian3]): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("subsample")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  @scala.inline
  def subsample(rectangle: Rectangle, ellipsoid: Ellipsoid): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("subsample")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  @scala.inline
  def subsample(rectangle: Rectangle, ellipsoid: Ellipsoid, surfaceHeight: Double): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("subsample")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  @scala.inline
  def subsample(rectangle: Rectangle, ellipsoid: Ellipsoid, surfaceHeight: Double, result: js.Array[Cartesian3]): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("subsample")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  @scala.inline
  def subsample(rectangle: Rectangle, ellipsoid: Ellipsoid, surfaceHeight: Unit, result: js.Array[Cartesian3]): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("subsample")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  
  /* static member */
  @scala.inline
  def unpack(array: js.Array[Double]): Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[Rectangle]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Unit, result: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  
  /* static member */
  @scala.inline
  def validate(rectangle: Rectangle): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(rectangle.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
