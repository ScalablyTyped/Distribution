package typings
package bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.GeometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.SpatialMath.Geometry")
@js.native
object GeometryNsMembers extends js.Object {
  def area(shape: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive): scala.Double = js.native
  def area(
    shape: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    areaUnits: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.AreaUnits
  ): scala.Double = js.native
  def area(shape: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive]): scala.Double = js.native
  def area(
    shape: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive],
    areaUnits: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.AreaUnits
  ): scala.Double = js.native
  def bounds(shapes: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive): bingmapsLib.MicrosoftNs.MapsNs.LocationRect = js.native
  def bounds(shapes: bingmapsLib.MicrosoftNs.MapsNs.Location): bingmapsLib.MicrosoftNs.MapsNs.LocationRect = js.native
  def bounds(
    shapes: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ]
  ): bingmapsLib.MicrosoftNs.MapsNs.LocationRect = js.native
  def buffer(shape: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive, distance: scala.Double): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def buffer(
    shape: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    distance: scala.Double,
    units: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def buffer(
    shape: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    distance: scala.Double,
    units: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits,
    endCapType: BufferEndCap
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def buffer(
    shape: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    distance: scala.Double,
    units: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits,
    endCapType: BufferEndCap,
    options: bingmapsLib.MicrosoftNs.MapsNs.IPolygonOptions
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def buffer(shape: bingmapsLib.MicrosoftNs.MapsNs.Location, distance: scala.Double): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def buffer(
    shape: bingmapsLib.MicrosoftNs.MapsNs.Location,
    distance: scala.Double,
    units: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def buffer(
    shape: bingmapsLib.MicrosoftNs.MapsNs.Location,
    distance: scala.Double,
    units: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits,
    endCapType: BufferEndCap
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def buffer(
    shape: bingmapsLib.MicrosoftNs.MapsNs.Location,
    distance: scala.Double,
    units: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits,
    endCapType: BufferEndCap,
    options: bingmapsLib.MicrosoftNs.MapsNs.IPolygonOptions
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def buffer(
    shape: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    distance: scala.Double
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def buffer(
    shape: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    distance: scala.Double,
    units: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def buffer(
    shape: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    distance: scala.Double,
    units: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits,
    endCapType: BufferEndCap
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def buffer(
    shape: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    distance: scala.Double,
    units: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits,
    endCapType: BufferEndCap,
    options: bingmapsLib.MicrosoftNs.MapsNs.IPolygonOptions
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def calculateLength(shape: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive): scala.Double = js.native
  def calculateLength(
    shape: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    units: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits
  ): scala.Double = js.native
  def calculateLength(
    shape: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    units: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits,
    highAccuracy: scala.Boolean
  ): scala.Double = js.native
  def calculateLength(shape: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive]): scala.Double = js.native
  def calculateLength(
    shape: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive],
    units: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits
  ): scala.Double = js.native
  def calculateLength(
    shape: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive],
    units: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits,
    highAccuracy: scala.Boolean
  ): scala.Double = js.native
  def centroid(shape: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive): bingmapsLib.MicrosoftNs.MapsNs.Location = js.native
  def centroid(shape: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive]): bingmapsLib.MicrosoftNs.MapsNs.Location = js.native
  def concaveHull(shapes: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def concaveHull(shapes: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive, allowMultiPolygons: scala.Boolean): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def concaveHull(
    shapes: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    allowMultiPolygons: scala.Boolean,
    allowHoles: scala.Boolean
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def concaveHull(
    shapes: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    allowMultiPolygons: scala.Boolean,
    allowHoles: scala.Boolean,
    options: bingmapsLib.MicrosoftNs.MapsNs.IPolygonOptions
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def concaveHull(shapes: bingmapsLib.MicrosoftNs.MapsNs.Location): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def concaveHull(shapes: bingmapsLib.MicrosoftNs.MapsNs.Location, allowMultiPolygons: scala.Boolean): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def concaveHull(
    shapes: bingmapsLib.MicrosoftNs.MapsNs.Location,
    allowMultiPolygons: scala.Boolean,
    allowHoles: scala.Boolean
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def concaveHull(
    shapes: bingmapsLib.MicrosoftNs.MapsNs.Location,
    allowMultiPolygons: scala.Boolean,
    allowHoles: scala.Boolean,
    options: bingmapsLib.MicrosoftNs.MapsNs.IPolygonOptions
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def concaveHull(
    shapes: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ]
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def concaveHull(
    shapes: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    allowMultiPolygons: scala.Boolean
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def concaveHull(
    shapes: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    allowMultiPolygons: scala.Boolean,
    allowHoles: scala.Boolean
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def concaveHull(
    shapes: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    allowMultiPolygons: scala.Boolean,
    allowHoles: scala.Boolean,
    options: bingmapsLib.MicrosoftNs.MapsNs.IPolygonOptions
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def contains(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
  ): scala.Boolean = js.native
  def contains(shapeA: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive, shapeB: bingmapsLib.MicrosoftNs.MapsNs.Location): scala.Boolean = js.native
  def contains(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    shapeB: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ]
  ): scala.Boolean = js.native
  def contains(shapeA: bingmapsLib.MicrosoftNs.MapsNs.Location, shapeB: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive): scala.Boolean = js.native
  def contains(shapeA: bingmapsLib.MicrosoftNs.MapsNs.Location, shapeB: bingmapsLib.MicrosoftNs.MapsNs.Location): scala.Boolean = js.native
  def contains(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.Location,
    shapeB: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ]
  ): scala.Boolean = js.native
  def contains(
    shapeA: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
  ): scala.Boolean = js.native
  def contains(
    shapeA: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.Location
  ): scala.Boolean = js.native
  def contains(
    shapeA: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    shapeB: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ]
  ): scala.Boolean = js.native
  def convexHull(shapes: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def convexHull(
    shapes: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    options: bingmapsLib.MicrosoftNs.MapsNs.IPolygonOptions
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def convexHull(shapes: bingmapsLib.MicrosoftNs.MapsNs.Location): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def convexHull(
    shapes: bingmapsLib.MicrosoftNs.MapsNs.Location,
    options: bingmapsLib.MicrosoftNs.MapsNs.IPolygonOptions
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def convexHull(
    shapes: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ]
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def convexHull(
    shapes: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    options: bingmapsLib.MicrosoftNs.MapsNs.IPolygonOptions
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def delaunayTriangles(shapes: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Polygon] = js.native
  def delaunayTriangles(
    shapes: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    options: bingmapsLib.MicrosoftNs.MapsNs.IPolygonOptions
  ): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Polygon] = js.native
  def delaunayTriangles(shapes: bingmapsLib.MicrosoftNs.MapsNs.Location): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Polygon] = js.native
  def delaunayTriangles(
    shapes: bingmapsLib.MicrosoftNs.MapsNs.Location,
    options: bingmapsLib.MicrosoftNs.MapsNs.IPolygonOptions
  ): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Polygon] = js.native
  def delaunayTriangles(
    shapes: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ]
  ): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Polygon] = js.native
  def delaunayTriangles(
    shapes: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    options: bingmapsLib.MicrosoftNs.MapsNs.IPolygonOptions
  ): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Polygon] = js.native
  def difference(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def difference(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    shapeB: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive]
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def difference(
    shapeA: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive],
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def difference(
    shapeA: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive],
    shapeB: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive]
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def distance(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
  ): scala.Double = js.native
  def distance(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    units: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits
  ): scala.Double = js.native
  def distance(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    units: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits,
    highAccuracy: scala.Boolean
  ): scala.Double = js.native
  def distance(shapeA: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive, shapeB: bingmapsLib.MicrosoftNs.MapsNs.Location): scala.Double = js.native
  def distance(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.Location,
    units: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits
  ): scala.Double = js.native
  def distance(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.Location,
    units: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits,
    highAccuracy: scala.Boolean
  ): scala.Double = js.native
  def distance(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    shapeB: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ]
  ): scala.Double = js.native
  def distance(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    shapeB: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    units: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits
  ): scala.Double = js.native
  def distance(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    shapeB: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    units: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits,
    highAccuracy: scala.Boolean
  ): scala.Double = js.native
  def distance(shapeA: bingmapsLib.MicrosoftNs.MapsNs.Location, shapeB: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive): scala.Double = js.native
  def distance(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.Location,
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    units: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits
  ): scala.Double = js.native
  def distance(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.Location,
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    units: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits,
    highAccuracy: scala.Boolean
  ): scala.Double = js.native
  def distance(shapeA: bingmapsLib.MicrosoftNs.MapsNs.Location, shapeB: bingmapsLib.MicrosoftNs.MapsNs.Location): scala.Double = js.native
  def distance(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.Location,
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.Location,
    units: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits
  ): scala.Double = js.native
  def distance(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.Location,
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.Location,
    units: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits,
    highAccuracy: scala.Boolean
  ): scala.Double = js.native
  def distance(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.Location,
    shapeB: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ]
  ): scala.Double = js.native
  def distance(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.Location,
    shapeB: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    units: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits
  ): scala.Double = js.native
  def distance(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.Location,
    shapeB: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    units: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits,
    highAccuracy: scala.Boolean
  ): scala.Double = js.native
  def distance(
    shapeA: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
  ): scala.Double = js.native
  def distance(
    shapeA: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    units: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits
  ): scala.Double = js.native
  def distance(
    shapeA: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    units: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits,
    highAccuracy: scala.Boolean
  ): scala.Double = js.native
  def distance(
    shapeA: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.Location
  ): scala.Double = js.native
  def distance(
    shapeA: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.Location,
    units: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits
  ): scala.Double = js.native
  def distance(
    shapeA: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.Location,
    units: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits,
    highAccuracy: scala.Boolean
  ): scala.Double = js.native
  def distance(
    shapeA: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    shapeB: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ]
  ): scala.Double = js.native
  def distance(
    shapeA: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    shapeB: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    units: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits
  ): scala.Double = js.native
  def distance(
    shapeA: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    shapeB: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    units: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits,
    highAccuracy: scala.Boolean
  ): scala.Double = js.native
  def intersection(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def intersection(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    shapeB: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive]
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def intersection(
    shapeA: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive],
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def intersection(
    shapeA: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive],
    shapeB: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive]
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def intersects(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
  ): scala.Boolean = js.native
  def intersects(shapeA: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive, shapeB: bingmapsLib.MicrosoftNs.MapsNs.Location): scala.Boolean = js.native
  def intersects(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    shapeB: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ]
  ): scala.Boolean = js.native
  def intersects(shapeA: bingmapsLib.MicrosoftNs.MapsNs.Location, shapeB: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive): scala.Boolean = js.native
  def intersects(shapeA: bingmapsLib.MicrosoftNs.MapsNs.Location, shapeB: bingmapsLib.MicrosoftNs.MapsNs.Location): scala.Boolean = js.native
  def intersects(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.Location,
    shapeB: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ]
  ): scala.Boolean = js.native
  def intersects(
    shapeA: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
  ): scala.Boolean = js.native
  def intersects(
    shapeA: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.Location
  ): scala.Boolean = js.native
  def intersects(
    shapeA: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    shapeB: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ]
  ): scala.Boolean = js.native
  def isValid(shape: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive): scala.Boolean = js.native
  def isValid(shape: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive]): scala.Boolean = js.native
  def makeValid(shape: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def makeValid(shape: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive]): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def nearestLocations(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
  ): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  def nearestLocations(shapeA: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive, shapeB: bingmapsLib.MicrosoftNs.MapsNs.Location): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  def nearestLocations(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    shapeB: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ]
  ): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  def nearestLocations(shapeA: bingmapsLib.MicrosoftNs.MapsNs.Location, shapeB: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  def nearestLocations(shapeA: bingmapsLib.MicrosoftNs.MapsNs.Location, shapeB: bingmapsLib.MicrosoftNs.MapsNs.Location): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  def nearestLocations(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.Location,
    shapeB: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ]
  ): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  def nearestLocations(
    shapeA: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
  ): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  def nearestLocations(
    shapeA: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.Location
  ): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  def nearestLocations(
    shapeA: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    shapeB: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ]
  ): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  def reduce(shape: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive, tolerance: scala.Double): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def reduce(shape: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive], tolerance: scala.Double): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def rotate(shape: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive, angle: scala.Double): scala.Unit = js.native
  def rotate(
    shape: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    angle: scala.Double,
    origin: bingmapsLib.MicrosoftNs.MapsNs.Location
  ): scala.Unit = js.native
  def rotate(shape: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive], angle: scala.Double): scala.Unit = js.native
  def rotate(
    shape: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive],
    angle: scala.Double,
    origin: bingmapsLib.MicrosoftNs.MapsNs.Location
  ): scala.Unit = js.native
  def shortestLineTo(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
  ): bingmapsLib.MicrosoftNs.MapsNs.Polyline = js.native
  def shortestLineTo(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    options: bingmapsLib.MicrosoftNs.MapsNs.IPolylineOptions
  ): bingmapsLib.MicrosoftNs.MapsNs.Polyline = js.native
  def shortestLineTo(shapeA: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive, shapeB: bingmapsLib.MicrosoftNs.MapsNs.Location): bingmapsLib.MicrosoftNs.MapsNs.Polyline = js.native
  def shortestLineTo(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.Location,
    options: bingmapsLib.MicrosoftNs.MapsNs.IPolylineOptions
  ): bingmapsLib.MicrosoftNs.MapsNs.Polyline = js.native
  def shortestLineTo(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    shapeB: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ]
  ): bingmapsLib.MicrosoftNs.MapsNs.Polyline = js.native
  def shortestLineTo(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    shapeB: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    options: bingmapsLib.MicrosoftNs.MapsNs.IPolylineOptions
  ): bingmapsLib.MicrosoftNs.MapsNs.Polyline = js.native
  def shortestLineTo(shapeA: bingmapsLib.MicrosoftNs.MapsNs.Location, shapeB: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive): bingmapsLib.MicrosoftNs.MapsNs.Polyline = js.native
  def shortestLineTo(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.Location,
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    options: bingmapsLib.MicrosoftNs.MapsNs.IPolylineOptions
  ): bingmapsLib.MicrosoftNs.MapsNs.Polyline = js.native
  def shortestLineTo(shapeA: bingmapsLib.MicrosoftNs.MapsNs.Location, shapeB: bingmapsLib.MicrosoftNs.MapsNs.Location): bingmapsLib.MicrosoftNs.MapsNs.Polyline = js.native
  def shortestLineTo(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.Location,
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.Location,
    options: bingmapsLib.MicrosoftNs.MapsNs.IPolylineOptions
  ): bingmapsLib.MicrosoftNs.MapsNs.Polyline = js.native
  def shortestLineTo(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.Location,
    shapeB: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ]
  ): bingmapsLib.MicrosoftNs.MapsNs.Polyline = js.native
  def shortestLineTo(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.Location,
    shapeB: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    options: bingmapsLib.MicrosoftNs.MapsNs.IPolylineOptions
  ): bingmapsLib.MicrosoftNs.MapsNs.Polyline = js.native
  def shortestLineTo(
    shapeA: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
  ): bingmapsLib.MicrosoftNs.MapsNs.Polyline = js.native
  def shortestLineTo(
    shapeA: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    options: bingmapsLib.MicrosoftNs.MapsNs.IPolylineOptions
  ): bingmapsLib.MicrosoftNs.MapsNs.Polyline = js.native
  def shortestLineTo(
    shapeA: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.Location
  ): bingmapsLib.MicrosoftNs.MapsNs.Polyline = js.native
  def shortestLineTo(
    shapeA: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.Location,
    options: bingmapsLib.MicrosoftNs.MapsNs.IPolylineOptions
  ): bingmapsLib.MicrosoftNs.MapsNs.Polyline = js.native
  def shortestLineTo(
    shapeA: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    shapeB: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ]
  ): bingmapsLib.MicrosoftNs.MapsNs.Polyline = js.native
  def shortestLineTo(
    shapeA: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    shapeB: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    options: bingmapsLib.MicrosoftNs.MapsNs.IPolylineOptions
  ): bingmapsLib.MicrosoftNs.MapsNs.Polyline = js.native
  def snapLocationsToShape(locs: bingmapsLib.MicrosoftNs.MapsNs.Location, shape: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive): bingmapsLib.MicrosoftNs.MapsNs.Location | js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  def snapLocationsToShape(
    locs: bingmapsLib.MicrosoftNs.MapsNs.Location,
    shape: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    tolerance: scala.Double
  ): bingmapsLib.MicrosoftNs.MapsNs.Location | js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  def snapLocationsToShape(
    locs: bingmapsLib.MicrosoftNs.MapsNs.Location,
    shape: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    tolerance: scala.Double,
    toleranceUnits: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits
  ): bingmapsLib.MicrosoftNs.MapsNs.Location | js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  def snapLocationsToShape(
    locs: bingmapsLib.MicrosoftNs.MapsNs.Location,
    shape: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive]
  ): bingmapsLib.MicrosoftNs.MapsNs.Location | js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  def snapLocationsToShape(
    locs: bingmapsLib.MicrosoftNs.MapsNs.Location,
    shape: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive],
    tolerance: scala.Double
  ): bingmapsLib.MicrosoftNs.MapsNs.Location | js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  def snapLocationsToShape(
    locs: bingmapsLib.MicrosoftNs.MapsNs.Location,
    shape: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive],
    tolerance: scala.Double,
    toleranceUnits: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits
  ): bingmapsLib.MicrosoftNs.MapsNs.Location | js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  def snapLocationsToShape(
    locs: js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location],
    shape: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
  ): bingmapsLib.MicrosoftNs.MapsNs.Location | js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  def snapLocationsToShape(
    locs: js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location],
    shape: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    tolerance: scala.Double
  ): bingmapsLib.MicrosoftNs.MapsNs.Location | js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  def snapLocationsToShape(
    locs: js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location],
    shape: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    tolerance: scala.Double,
    toleranceUnits: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits
  ): bingmapsLib.MicrosoftNs.MapsNs.Location | js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  def snapLocationsToShape(
    locs: js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location],
    shape: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive]
  ): bingmapsLib.MicrosoftNs.MapsNs.Location | js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  def snapLocationsToShape(
    locs: js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location],
    shape: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive],
    tolerance: scala.Double
  ): bingmapsLib.MicrosoftNs.MapsNs.Location | js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  def snapLocationsToShape(
    locs: js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location],
    shape: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive],
    tolerance: scala.Double,
    toleranceUnits: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits
  ): bingmapsLib.MicrosoftNs.MapsNs.Location | js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  def snapShapeToShape(
    shapeToSnap: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    shape: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
  ): scala.Unit = js.native
  def snapShapeToShape(
    shapeToSnap: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    shape: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    tolerance: scala.Double
  ): scala.Unit = js.native
  def snapShapeToShape(
    shapeToSnap: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    shape: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    tolerance: scala.Double,
    toleranceUnits: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits
  ): scala.Unit = js.native
  def snapShapeToShape(
    shapeToSnap: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    shape: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive]
  ): scala.Unit = js.native
  def snapShapeToShape(
    shapeToSnap: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    shape: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive],
    tolerance: scala.Double
  ): scala.Unit = js.native
  def snapShapeToShape(
    shapeToSnap: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    shape: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive],
    tolerance: scala.Double,
    toleranceUnits: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits
  ): scala.Unit = js.native
  def snapShapeToShape(
    shapeToSnap: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive],
    shape: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
  ): scala.Unit = js.native
  def snapShapeToShape(
    shapeToSnap: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive],
    shape: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    tolerance: scala.Double
  ): scala.Unit = js.native
  def snapShapeToShape(
    shapeToSnap: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive],
    shape: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    tolerance: scala.Double,
    toleranceUnits: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits
  ): scala.Unit = js.native
  def snapShapeToShape(
    shapeToSnap: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive],
    shape: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive]
  ): scala.Unit = js.native
  def snapShapeToShape(
    shapeToSnap: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive],
    shape: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive],
    tolerance: scala.Double
  ): scala.Unit = js.native
  def snapShapeToShape(
    shapeToSnap: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive],
    shape: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive],
    tolerance: scala.Double,
    toleranceUnits: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits
  ): scala.Unit = js.native
  def symDifference(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def symDifference(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    shapeB: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive]
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def symDifference(
    shapeA: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive],
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def symDifference(
    shapeA: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive],
    shapeB: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive]
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def union(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def union(
    shapeA: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    shapeB: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive]
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def union(
    shapeA: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive],
    shapeB: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def union(
    shapeA: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive],
    shapeB: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive]
  ): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def unionAggregate(shapes: js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive]): bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | js.Array[bingmapsLib.MicrosoftNs.MapsNs.IPrimitive] = js.native
  def voronoiDiagram(shapes: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Polygon] = js.native
  def voronoiDiagram(
    shapes: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    clipRegion: bingmapsLib.MicrosoftNs.MapsNs.LocationRect
  ): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Polygon] = js.native
  def voronoiDiagram(
    shapes: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    clipRegion: bingmapsLib.MicrosoftNs.MapsNs.LocationRect,
    options: bingmapsLib.MicrosoftNs.MapsNs.IPolygonOptions
  ): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Polygon] = js.native
  def voronoiDiagram(
    shapes: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    clipRegion: bingmapsLib.MicrosoftNs.MapsNs.Polygon
  ): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Polygon] = js.native
  def voronoiDiagram(
    shapes: bingmapsLib.MicrosoftNs.MapsNs.IPrimitive,
    clipRegion: bingmapsLib.MicrosoftNs.MapsNs.Polygon,
    options: bingmapsLib.MicrosoftNs.MapsNs.IPolygonOptions
  ): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Polygon] = js.native
  def voronoiDiagram(shapes: bingmapsLib.MicrosoftNs.MapsNs.Location): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Polygon] = js.native
  def voronoiDiagram(
    shapes: bingmapsLib.MicrosoftNs.MapsNs.Location,
    clipRegion: bingmapsLib.MicrosoftNs.MapsNs.LocationRect
  ): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Polygon] = js.native
  def voronoiDiagram(
    shapes: bingmapsLib.MicrosoftNs.MapsNs.Location,
    clipRegion: bingmapsLib.MicrosoftNs.MapsNs.LocationRect,
    options: bingmapsLib.MicrosoftNs.MapsNs.IPolygonOptions
  ): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Polygon] = js.native
  def voronoiDiagram(
    shapes: bingmapsLib.MicrosoftNs.MapsNs.Location,
    clipRegion: bingmapsLib.MicrosoftNs.MapsNs.Polygon
  ): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Polygon] = js.native
  def voronoiDiagram(
    shapes: bingmapsLib.MicrosoftNs.MapsNs.Location,
    clipRegion: bingmapsLib.MicrosoftNs.MapsNs.Polygon,
    options: bingmapsLib.MicrosoftNs.MapsNs.IPolygonOptions
  ): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Polygon] = js.native
  def voronoiDiagram(
    shapes: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | bingmapsLib.MicrosoftNs.MapsNs.Location
    ]
  ): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Polygon] = js.native
  def voronoiDiagram(
    shapes: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    clipRegion: bingmapsLib.MicrosoftNs.MapsNs.LocationRect
  ): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Polygon] = js.native
  def voronoiDiagram(
    shapes: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    clipRegion: bingmapsLib.MicrosoftNs.MapsNs.LocationRect,
    options: bingmapsLib.MicrosoftNs.MapsNs.IPolygonOptions
  ): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Polygon] = js.native
  def voronoiDiagram(
    shapes: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    clipRegion: bingmapsLib.MicrosoftNs.MapsNs.Polygon
  ): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Polygon] = js.native
  def voronoiDiagram(
    shapes: js.Array[
      bingmapsLib.MicrosoftNs.MapsNs.Location | bingmapsLib.MicrosoftNs.MapsNs.IPrimitive
    ],
    clipRegion: bingmapsLib.MicrosoftNs.MapsNs.Polygon,
    options: bingmapsLib.MicrosoftNs.MapsNs.IPolygonOptions
  ): js.Array[bingmapsLib.MicrosoftNs.MapsNs.Polygon] = js.native
}

