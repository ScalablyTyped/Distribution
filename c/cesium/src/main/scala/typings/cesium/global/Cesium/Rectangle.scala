package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.Rectangle")
@js.native
class Rectangle ()
  extends typings.cesium.mod.Rectangle {
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
}
object Rectangle {
  
  @JSGlobal("Cesium.Rectangle")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Cesium.Rectangle.MAX_VALUE")
  @js.native
  def MAX_VALUE: typings.cesium.mod.Rectangle = js.native
  inline def MAX_VALUE_=(x: typings.cesium.mod.Rectangle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_VALUE")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def center(rectangle: typings.cesium.mod.Rectangle): typings.cesium.mod.Cartographic = ^.asInstanceOf[js.Dynamic].applyDynamic("center")(rectangle.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Cartographic]
  inline def center(rectangle: typings.cesium.mod.Rectangle, result: typings.cesium.mod.Cartographic): typings.cesium.mod.Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("center")(rectangle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartographic]
  
  /* static member */
  inline def clone_(rectangle: typings.cesium.mod.Rectangle): typings.cesium.mod.Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(rectangle.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def clone_(rectangle: typings.cesium.mod.Rectangle, result: typings.cesium.mod.Rectangle): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(rectangle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  
  /* static member */
  inline def computeHeight(rectangle: typings.cesium.mod.Rectangle): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeHeight")(rectangle.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def computeWidth(rectangle: typings.cesium.mod.Rectangle): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeWidth")(rectangle.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def contains(rectangle: typings.cesium.mod.Rectangle, cartographic: typings.cesium.mod.Cartographic): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(rectangle.asInstanceOf[js.Any], cartographic.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def equals_(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals_(left: Unit, right: typings.cesium.mod.Rectangle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(left: typings.cesium.mod.Rectangle): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals_(left: typings.cesium.mod.Rectangle, right: typings.cesium.mod.Rectangle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def fromCartographicArray(cartographics: js.Array[typings.cesium.mod.Cartographic]): typings.cesium.mod.Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCartographicArray")(cartographics.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def fromCartographicArray(cartographics: js.Array[typings.cesium.mod.Cartographic], result: typings.cesium.mod.Rectangle): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCartographicArray")(cartographics.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  
  /* static member */
  inline def fromDegrees(): typings.cesium.mod.Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")().asInstanceOf[typings.cesium.mod.Rectangle]
  inline def fromDegrees(west: Double): typings.cesium.mod.Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def fromDegrees(west: Double, south: Double): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def fromDegrees(west: Double, south: Double, east: Double): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def fromDegrees(west: Double, south: Double, east: Double, north: Double): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def fromDegrees(west: Double, south: Double, east: Double, north: Double, result: typings.cesium.mod.Rectangle): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def fromDegrees(west: Double, south: Double, east: Double, north: Unit, result: typings.cesium.mod.Rectangle): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def fromDegrees(west: Double, south: Double, east: Unit, north: Double): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def fromDegrees(west: Double, south: Double, east: Unit, north: Double, result: typings.cesium.mod.Rectangle): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def fromDegrees(west: Double, south: Double, east: Unit, north: Unit, result: typings.cesium.mod.Rectangle): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def fromDegrees(west: Double, south: Unit, east: Double): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def fromDegrees(west: Double, south: Unit, east: Double, north: Double): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def fromDegrees(west: Double, south: Unit, east: Double, north: Double, result: typings.cesium.mod.Rectangle): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def fromDegrees(west: Double, south: Unit, east: Double, north: Unit, result: typings.cesium.mod.Rectangle): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def fromDegrees(west: Double, south: Unit, east: Unit, north: Double): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def fromDegrees(west: Double, south: Unit, east: Unit, north: Double, result: typings.cesium.mod.Rectangle): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def fromDegrees(west: Double, south: Unit, east: Unit, north: Unit, result: typings.cesium.mod.Rectangle): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def fromDegrees(west: Unit, south: Double): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def fromDegrees(west: Unit, south: Double, east: Double): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def fromDegrees(west: Unit, south: Double, east: Double, north: Double): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def fromDegrees(west: Unit, south: Double, east: Double, north: Double, result: typings.cesium.mod.Rectangle): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def fromDegrees(west: Unit, south: Double, east: Double, north: Unit, result: typings.cesium.mod.Rectangle): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def fromDegrees(west: Unit, south: Double, east: Unit, north: Double): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def fromDegrees(west: Unit, south: Double, east: Unit, north: Double, result: typings.cesium.mod.Rectangle): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def fromDegrees(west: Unit, south: Double, east: Unit, north: Unit, result: typings.cesium.mod.Rectangle): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def fromDegrees(west: Unit, south: Unit, east: Double): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def fromDegrees(west: Unit, south: Unit, east: Double, north: Double): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def fromDegrees(west: Unit, south: Unit, east: Double, north: Double, result: typings.cesium.mod.Rectangle): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def fromDegrees(west: Unit, south: Unit, east: Double, north: Unit, result: typings.cesium.mod.Rectangle): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def fromDegrees(west: Unit, south: Unit, east: Unit, north: Double): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def fromDegrees(west: Unit, south: Unit, east: Unit, north: Double, result: typings.cesium.mod.Rectangle): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def fromDegrees(west: Unit, south: Unit, east: Unit, north: Unit, result: typings.cesium.mod.Rectangle): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(west.asInstanceOf[js.Any], south.asInstanceOf[js.Any], east.asInstanceOf[js.Any], north.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  
  /* static member */
  inline def intersection(rectangle: typings.cesium.mod.Rectangle, otherRectangle: typings.cesium.mod.Rectangle): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(rectangle.asInstanceOf[js.Any], otherRectangle.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def intersection(
    rectangle: typings.cesium.mod.Rectangle,
    otherRectangle: typings.cesium.mod.Rectangle,
    result: typings.cesium.mod.Rectangle
  ): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(rectangle.asInstanceOf[js.Any], otherRectangle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  
  /* static member */
  inline def northeast(rectangle: typings.cesium.mod.Rectangle): typings.cesium.mod.Cartographic = ^.asInstanceOf[js.Dynamic].applyDynamic("northeast")(rectangle.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Cartographic]
  inline def northeast(rectangle: typings.cesium.mod.Rectangle, result: typings.cesium.mod.Cartographic): typings.cesium.mod.Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("northeast")(rectangle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartographic]
  
  /* static member */
  inline def northwest(rectangle: typings.cesium.mod.Rectangle): typings.cesium.mod.Cartographic = ^.asInstanceOf[js.Dynamic].applyDynamic("northwest")(rectangle.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Cartographic]
  inline def northwest(rectangle: typings.cesium.mod.Rectangle, result: typings.cesium.mod.Cartographic): typings.cesium.mod.Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("northwest")(rectangle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartographic]
  
  /* static member */
  inline def pack(value: typings.cesium.mod.Rectangle, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def pack(value: typings.cesium.mod.Rectangle, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /* static member */
  inline def southeast(rectangle: typings.cesium.mod.Rectangle): typings.cesium.mod.Cartographic = ^.asInstanceOf[js.Dynamic].applyDynamic("southeast")(rectangle.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Cartographic]
  inline def southeast(rectangle: typings.cesium.mod.Rectangle, result: typings.cesium.mod.Cartographic): typings.cesium.mod.Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("southeast")(rectangle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartographic]
  
  /* static member */
  inline def southwest(rectangle: typings.cesium.mod.Rectangle): typings.cesium.mod.Cartographic = ^.asInstanceOf[js.Dynamic].applyDynamic("southwest")(rectangle.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Cartographic]
  inline def southwest(rectangle: typings.cesium.mod.Rectangle, result: typings.cesium.mod.Cartographic): typings.cesium.mod.Cartographic = (^.asInstanceOf[js.Dynamic].applyDynamic("southwest")(rectangle.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartographic]
  
  /* static member */
  inline def subsample(rectangle: typings.cesium.mod.Rectangle): js.Array[typings.cesium.mod.Cartesian3] = ^.asInstanceOf[js.Dynamic].applyDynamic("subsample")(rectangle.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.cesium.mod.Cartesian3]]
  inline def subsample(rectangle: typings.cesium.mod.Rectangle, ellipsoid: Unit, surfaceHeight: Double): js.Array[typings.cesium.mod.Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("subsample")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.cesium.mod.Cartesian3]]
  inline def subsample(
    rectangle: typings.cesium.mod.Rectangle,
    ellipsoid: Unit,
    surfaceHeight: Double,
    result: js.Array[typings.cesium.mod.Cartesian3]
  ): js.Array[typings.cesium.mod.Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("subsample")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.cesium.mod.Cartesian3]]
  inline def subsample(
    rectangle: typings.cesium.mod.Rectangle,
    ellipsoid: Unit,
    surfaceHeight: Unit,
    result: js.Array[typings.cesium.mod.Cartesian3]
  ): js.Array[typings.cesium.mod.Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("subsample")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.cesium.mod.Cartesian3]]
  inline def subsample(rectangle: typings.cesium.mod.Rectangle, ellipsoid: typings.cesium.mod.Ellipsoid): js.Array[typings.cesium.mod.Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("subsample")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.cesium.mod.Cartesian3]]
  inline def subsample(
    rectangle: typings.cesium.mod.Rectangle,
    ellipsoid: typings.cesium.mod.Ellipsoid,
    surfaceHeight: Double
  ): js.Array[typings.cesium.mod.Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("subsample")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.cesium.mod.Cartesian3]]
  inline def subsample(
    rectangle: typings.cesium.mod.Rectangle,
    ellipsoid: typings.cesium.mod.Ellipsoid,
    surfaceHeight: Double,
    result: js.Array[typings.cesium.mod.Cartesian3]
  ): js.Array[typings.cesium.mod.Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("subsample")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.cesium.mod.Cartesian3]]
  inline def subsample(
    rectangle: typings.cesium.mod.Rectangle,
    ellipsoid: typings.cesium.mod.Ellipsoid,
    surfaceHeight: Unit,
    result: js.Array[typings.cesium.mod.Cartesian3]
  ): js.Array[typings.cesium.mod.Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("subsample")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], surfaceHeight.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.cesium.mod.Cartesian3]]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): typings.cesium.mod.Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def unpack(array: js.Array[Double], startingIndex: Double): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: typings.cesium.mod.Rectangle): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: typings.cesium.mod.Rectangle): typings.cesium.mod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Rectangle]
  
  /* static member */
  inline def validate(rectangle: typings.cesium.mod.Rectangle): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(rectangle.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
