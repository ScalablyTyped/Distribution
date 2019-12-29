package typings.bingmaps.Microsoft.Maps.SpatialMath

import org.scalablytyped.runtime.TopLevel
import typings.bingmaps.Microsoft.Maps.IPolygonOptions
import typings.bingmaps.Microsoft.Maps.IPolylineOptions
import typings.bingmaps.Microsoft.Maps.IPrimitive
import typings.bingmaps.Microsoft.Maps.Location
import typings.bingmaps.Microsoft.Maps.LocationRect
import typings.bingmaps.Microsoft.Maps.Polygon
import typings.bingmaps.Microsoft.Maps.Polyline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////
/// Geometry Calculations
//////////////////////////////////////////////
/**
* A colleciton of geometry calculations that can be performed against Bing Maps shapes.
* @requires The Microsoft.Maps.SpatialMath module.
*/
@JSGlobal("Microsoft.Maps.SpatialMath.Geometry")
@js.native
object Geometry extends js.Object {
  @js.native
  sealed trait BufferEndCap extends js.Object
  
  def area(shape: js.Array[IPrimitive]): Double = js.native
  def area(shape: js.Array[IPrimitive], areaUnits: AreaUnits): Double = js.native
  def area(shape: IPrimitive): Double = js.native
  def area(shape: IPrimitive, areaUnits: AreaUnits): Double = js.native
  def bounds(shapes: js.Array[Location | IPrimitive]): LocationRect = js.native
  def bounds(shapes: IPrimitive): LocationRect = js.native
  def bounds(shapes: Location): LocationRect = js.native
  def buffer(shape: js.Array[Location | IPrimitive], distance: Double): IPrimitive | js.Array[IPrimitive] = js.native
  def buffer(shape: js.Array[Location | IPrimitive], distance: Double, units: DistanceUnits): IPrimitive | js.Array[IPrimitive] = js.native
  def buffer(
    shape: js.Array[Location | IPrimitive],
    distance: Double,
    units: DistanceUnits,
    endCapType: BufferEndCap
  ): IPrimitive | js.Array[IPrimitive] = js.native
  def buffer(
    shape: js.Array[Location | IPrimitive],
    distance: Double,
    units: DistanceUnits,
    endCapType: BufferEndCap,
    options: IPolygonOptions
  ): IPrimitive | js.Array[IPrimitive] = js.native
  def buffer(shape: IPrimitive, distance: Double): IPrimitive | js.Array[IPrimitive] = js.native
  def buffer(shape: IPrimitive, distance: Double, units: DistanceUnits): IPrimitive | js.Array[IPrimitive] = js.native
  def buffer(shape: IPrimitive, distance: Double, units: DistanceUnits, endCapType: BufferEndCap): IPrimitive | js.Array[IPrimitive] = js.native
  def buffer(
    shape: IPrimitive,
    distance: Double,
    units: DistanceUnits,
    endCapType: BufferEndCap,
    options: IPolygonOptions
  ): IPrimitive | js.Array[IPrimitive] = js.native
  def buffer(shape: Location, distance: Double): IPrimitive | js.Array[IPrimitive] = js.native
  def buffer(shape: Location, distance: Double, units: DistanceUnits): IPrimitive | js.Array[IPrimitive] = js.native
  def buffer(shape: Location, distance: Double, units: DistanceUnits, endCapType: BufferEndCap): IPrimitive | js.Array[IPrimitive] = js.native
  def buffer(
    shape: Location,
    distance: Double,
    units: DistanceUnits,
    endCapType: BufferEndCap,
    options: IPolygonOptions
  ): IPrimitive | js.Array[IPrimitive] = js.native
  def calculateLength(shape: js.Array[IPrimitive]): Double = js.native
  def calculateLength(shape: js.Array[IPrimitive], units: DistanceUnits): Double = js.native
  def calculateLength(shape: js.Array[IPrimitive], units: DistanceUnits, highAccuracy: Boolean): Double = js.native
  def calculateLength(shape: IPrimitive): Double = js.native
  def calculateLength(shape: IPrimitive, units: DistanceUnits): Double = js.native
  def calculateLength(shape: IPrimitive, units: DistanceUnits, highAccuracy: Boolean): Double = js.native
  def centroid(shape: js.Array[IPrimitive]): Location = js.native
  def centroid(shape: IPrimitive): Location = js.native
  def concaveHull(shapes: js.Array[Location | IPrimitive]): IPrimitive | js.Array[IPrimitive] = js.native
  def concaveHull(shapes: js.Array[Location | IPrimitive], allowMultiPolygons: Boolean): IPrimitive | js.Array[IPrimitive] = js.native
  def concaveHull(shapes: js.Array[Location | IPrimitive], allowMultiPolygons: Boolean, allowHoles: Boolean): IPrimitive | js.Array[IPrimitive] = js.native
  def concaveHull(
    shapes: js.Array[Location | IPrimitive],
    allowMultiPolygons: Boolean,
    allowHoles: Boolean,
    options: IPolygonOptions
  ): IPrimitive | js.Array[IPrimitive] = js.native
  def concaveHull(shapes: IPrimitive): IPrimitive | js.Array[IPrimitive] = js.native
  def concaveHull(shapes: IPrimitive, allowMultiPolygons: Boolean): IPrimitive | js.Array[IPrimitive] = js.native
  def concaveHull(shapes: IPrimitive, allowMultiPolygons: Boolean, allowHoles: Boolean): IPrimitive | js.Array[IPrimitive] = js.native
  def concaveHull(shapes: IPrimitive, allowMultiPolygons: Boolean, allowHoles: Boolean, options: IPolygonOptions): IPrimitive | js.Array[IPrimitive] = js.native
  def concaveHull(shapes: Location): IPrimitive | js.Array[IPrimitive] = js.native
  def concaveHull(shapes: Location, allowMultiPolygons: Boolean): IPrimitive | js.Array[IPrimitive] = js.native
  def concaveHull(shapes: Location, allowMultiPolygons: Boolean, allowHoles: Boolean): IPrimitive | js.Array[IPrimitive] = js.native
  def concaveHull(shapes: Location, allowMultiPolygons: Boolean, allowHoles: Boolean, options: IPolygonOptions): IPrimitive | js.Array[IPrimitive] = js.native
  def contains(shapeA: js.Array[Location | IPrimitive], shapeB: js.Array[Location | IPrimitive]): Boolean = js.native
  def contains(shapeA: js.Array[Location | IPrimitive], shapeB: IPrimitive): Boolean = js.native
  def contains(shapeA: js.Array[Location | IPrimitive], shapeB: Location): Boolean = js.native
  def contains(shapeA: IPrimitive, shapeB: js.Array[Location | IPrimitive]): Boolean = js.native
  def contains(shapeA: IPrimitive, shapeB: IPrimitive): Boolean = js.native
  def contains(shapeA: IPrimitive, shapeB: Location): Boolean = js.native
  def contains(shapeA: Location, shapeB: js.Array[Location | IPrimitive]): Boolean = js.native
  def contains(shapeA: Location, shapeB: IPrimitive): Boolean = js.native
  def contains(shapeA: Location, shapeB: Location): Boolean = js.native
  def convexHull(shapes: js.Array[Location | IPrimitive]): IPrimitive | js.Array[IPrimitive] = js.native
  def convexHull(shapes: js.Array[Location | IPrimitive], options: IPolygonOptions): IPrimitive | js.Array[IPrimitive] = js.native
  def convexHull(shapes: IPrimitive): IPrimitive | js.Array[IPrimitive] = js.native
  def convexHull(shapes: IPrimitive, options: IPolygonOptions): IPrimitive | js.Array[IPrimitive] = js.native
  def convexHull(shapes: Location): IPrimitive | js.Array[IPrimitive] = js.native
  def convexHull(shapes: Location, options: IPolygonOptions): IPrimitive | js.Array[IPrimitive] = js.native
  def delaunayTriangles(shapes: js.Array[Location | IPrimitive]): js.Array[Polygon] = js.native
  def delaunayTriangles(shapes: js.Array[Location | IPrimitive], options: IPolygonOptions): js.Array[Polygon] = js.native
  def delaunayTriangles(shapes: IPrimitive): js.Array[Polygon] = js.native
  def delaunayTriangles(shapes: IPrimitive, options: IPolygonOptions): js.Array[Polygon] = js.native
  def delaunayTriangles(shapes: Location): js.Array[Polygon] = js.native
  def delaunayTriangles(shapes: Location, options: IPolygonOptions): js.Array[Polygon] = js.native
  def difference(shapeA: js.Array[IPrimitive], shapeB: js.Array[IPrimitive]): IPrimitive | js.Array[IPrimitive] = js.native
  def difference(shapeA: js.Array[IPrimitive], shapeB: IPrimitive): IPrimitive | js.Array[IPrimitive] = js.native
  def difference(shapeA: IPrimitive, shapeB: js.Array[IPrimitive]): IPrimitive | js.Array[IPrimitive] = js.native
  def difference(shapeA: IPrimitive, shapeB: IPrimitive): IPrimitive | js.Array[IPrimitive] = js.native
  def distance(shapeA: js.Array[Location | IPrimitive], shapeB: js.Array[Location | IPrimitive]): Double = js.native
  def distance(
    shapeA: js.Array[Location | IPrimitive],
    shapeB: js.Array[Location | IPrimitive],
    units: DistanceUnits
  ): Double = js.native
  def distance(
    shapeA: js.Array[Location | IPrimitive],
    shapeB: js.Array[Location | IPrimitive],
    units: DistanceUnits,
    highAccuracy: Boolean
  ): Double = js.native
  def distance(shapeA: js.Array[Location | IPrimitive], shapeB: IPrimitive): Double = js.native
  def distance(shapeA: js.Array[Location | IPrimitive], shapeB: IPrimitive, units: DistanceUnits): Double = js.native
  def distance(
    shapeA: js.Array[Location | IPrimitive],
    shapeB: IPrimitive,
    units: DistanceUnits,
    highAccuracy: Boolean
  ): Double = js.native
  def distance(shapeA: js.Array[Location | IPrimitive], shapeB: Location): Double = js.native
  def distance(shapeA: js.Array[Location | IPrimitive], shapeB: Location, units: DistanceUnits): Double = js.native
  def distance(
    shapeA: js.Array[Location | IPrimitive],
    shapeB: Location,
    units: DistanceUnits,
    highAccuracy: Boolean
  ): Double = js.native
  def distance(shapeA: IPrimitive, shapeB: js.Array[Location | IPrimitive]): Double = js.native
  def distance(shapeA: IPrimitive, shapeB: js.Array[Location | IPrimitive], units: DistanceUnits): Double = js.native
  def distance(
    shapeA: IPrimitive,
    shapeB: js.Array[Location | IPrimitive],
    units: DistanceUnits,
    highAccuracy: Boolean
  ): Double = js.native
  def distance(shapeA: IPrimitive, shapeB: IPrimitive): Double = js.native
  def distance(shapeA: IPrimitive, shapeB: IPrimitive, units: DistanceUnits): Double = js.native
  def distance(shapeA: IPrimitive, shapeB: IPrimitive, units: DistanceUnits, highAccuracy: Boolean): Double = js.native
  def distance(shapeA: IPrimitive, shapeB: Location): Double = js.native
  def distance(shapeA: IPrimitive, shapeB: Location, units: DistanceUnits): Double = js.native
  def distance(shapeA: IPrimitive, shapeB: Location, units: DistanceUnits, highAccuracy: Boolean): Double = js.native
  def distance(shapeA: Location, shapeB: js.Array[Location | IPrimitive]): Double = js.native
  def distance(shapeA: Location, shapeB: js.Array[Location | IPrimitive], units: DistanceUnits): Double = js.native
  def distance(
    shapeA: Location,
    shapeB: js.Array[Location | IPrimitive],
    units: DistanceUnits,
    highAccuracy: Boolean
  ): Double = js.native
  def distance(shapeA: Location, shapeB: IPrimitive): Double = js.native
  def distance(shapeA: Location, shapeB: IPrimitive, units: DistanceUnits): Double = js.native
  def distance(shapeA: Location, shapeB: IPrimitive, units: DistanceUnits, highAccuracy: Boolean): Double = js.native
  def distance(shapeA: Location, shapeB: Location): Double = js.native
  def distance(shapeA: Location, shapeB: Location, units: DistanceUnits): Double = js.native
  def distance(shapeA: Location, shapeB: Location, units: DistanceUnits, highAccuracy: Boolean): Double = js.native
  def intersection(shapeA: js.Array[IPrimitive], shapeB: js.Array[IPrimitive]): IPrimitive | js.Array[IPrimitive] = js.native
  def intersection(shapeA: js.Array[IPrimitive], shapeB: IPrimitive): IPrimitive | js.Array[IPrimitive] = js.native
  def intersection(shapeA: IPrimitive, shapeB: js.Array[IPrimitive]): IPrimitive | js.Array[IPrimitive] = js.native
  def intersection(shapeA: IPrimitive, shapeB: IPrimitive): IPrimitive | js.Array[IPrimitive] = js.native
  def intersects(shapeA: js.Array[Location | IPrimitive], shapeB: js.Array[Location | IPrimitive]): Boolean = js.native
  def intersects(shapeA: js.Array[Location | IPrimitive], shapeB: IPrimitive): Boolean = js.native
  def intersects(shapeA: js.Array[Location | IPrimitive], shapeB: Location): Boolean = js.native
  def intersects(shapeA: IPrimitive, shapeB: js.Array[Location | IPrimitive]): Boolean = js.native
  def intersects(shapeA: IPrimitive, shapeB: IPrimitive): Boolean = js.native
  def intersects(shapeA: IPrimitive, shapeB: Location): Boolean = js.native
  def intersects(shapeA: Location, shapeB: js.Array[Location | IPrimitive]): Boolean = js.native
  def intersects(shapeA: Location, shapeB: IPrimitive): Boolean = js.native
  def intersects(shapeA: Location, shapeB: Location): Boolean = js.native
  def isValid(shape: js.Array[IPrimitive]): Boolean = js.native
  def isValid(shape: IPrimitive): Boolean = js.native
  def makeValid(shape: js.Array[IPrimitive]): IPrimitive | js.Array[IPrimitive] = js.native
  def makeValid(shape: IPrimitive): IPrimitive | js.Array[IPrimitive] = js.native
  def nearestLocations(shapeA: js.Array[Location | IPrimitive], shapeB: js.Array[Location | IPrimitive]): js.Array[Location] = js.native
  def nearestLocations(shapeA: js.Array[Location | IPrimitive], shapeB: IPrimitive): js.Array[Location] = js.native
  def nearestLocations(shapeA: js.Array[Location | IPrimitive], shapeB: Location): js.Array[Location] = js.native
  def nearestLocations(shapeA: IPrimitive, shapeB: js.Array[Location | IPrimitive]): js.Array[Location] = js.native
  def nearestLocations(shapeA: IPrimitive, shapeB: IPrimitive): js.Array[Location] = js.native
  def nearestLocations(shapeA: IPrimitive, shapeB: Location): js.Array[Location] = js.native
  def nearestLocations(shapeA: Location, shapeB: js.Array[Location | IPrimitive]): js.Array[Location] = js.native
  def nearestLocations(shapeA: Location, shapeB: IPrimitive): js.Array[Location] = js.native
  def nearestLocations(shapeA: Location, shapeB: Location): js.Array[Location] = js.native
  def reduce(shape: js.Array[IPrimitive], tolerance: Double): IPrimitive | js.Array[IPrimitive] = js.native
  def reduce(shape: IPrimitive, tolerance: Double): IPrimitive | js.Array[IPrimitive] = js.native
  def rotate(shape: js.Array[IPrimitive], angle: Double): Unit = js.native
  def rotate(shape: js.Array[IPrimitive], angle: Double, origin: Location): Unit = js.native
  def rotate(shape: IPrimitive, angle: Double): Unit = js.native
  def rotate(shape: IPrimitive, angle: Double, origin: Location): Unit = js.native
  def shortestLineTo(shapeA: js.Array[Location | IPrimitive], shapeB: js.Array[Location | IPrimitive]): Polyline = js.native
  def shortestLineTo(
    shapeA: js.Array[Location | IPrimitive],
    shapeB: js.Array[Location | IPrimitive],
    options: IPolylineOptions
  ): Polyline = js.native
  def shortestLineTo(shapeA: js.Array[Location | IPrimitive], shapeB: IPrimitive): Polyline = js.native
  def shortestLineTo(shapeA: js.Array[Location | IPrimitive], shapeB: IPrimitive, options: IPolylineOptions): Polyline = js.native
  def shortestLineTo(shapeA: js.Array[Location | IPrimitive], shapeB: Location): Polyline = js.native
  def shortestLineTo(shapeA: js.Array[Location | IPrimitive], shapeB: Location, options: IPolylineOptions): Polyline = js.native
  def shortestLineTo(shapeA: IPrimitive, shapeB: js.Array[Location | IPrimitive]): Polyline = js.native
  def shortestLineTo(shapeA: IPrimitive, shapeB: js.Array[Location | IPrimitive], options: IPolylineOptions): Polyline = js.native
  def shortestLineTo(shapeA: IPrimitive, shapeB: IPrimitive): Polyline = js.native
  def shortestLineTo(shapeA: IPrimitive, shapeB: IPrimitive, options: IPolylineOptions): Polyline = js.native
  def shortestLineTo(shapeA: IPrimitive, shapeB: Location): Polyline = js.native
  def shortestLineTo(shapeA: IPrimitive, shapeB: Location, options: IPolylineOptions): Polyline = js.native
  def shortestLineTo(shapeA: Location, shapeB: js.Array[Location | IPrimitive]): Polyline = js.native
  def shortestLineTo(shapeA: Location, shapeB: js.Array[Location | IPrimitive], options: IPolylineOptions): Polyline = js.native
  def shortestLineTo(shapeA: Location, shapeB: IPrimitive): Polyline = js.native
  def shortestLineTo(shapeA: Location, shapeB: IPrimitive, options: IPolylineOptions): Polyline = js.native
  def shortestLineTo(shapeA: Location, shapeB: Location): Polyline = js.native
  def shortestLineTo(shapeA: Location, shapeB: Location, options: IPolylineOptions): Polyline = js.native
  def snapLocationsToShape(locs: js.Array[Location], shape: js.Array[IPrimitive]): Location | js.Array[Location] = js.native
  def snapLocationsToShape(locs: js.Array[Location], shape: js.Array[IPrimitive], tolerance: Double): Location | js.Array[Location] = js.native
  def snapLocationsToShape(
    locs: js.Array[Location],
    shape: js.Array[IPrimitive],
    tolerance: Double,
    toleranceUnits: DistanceUnits
  ): Location | js.Array[Location] = js.native
  def snapLocationsToShape(locs: js.Array[Location], shape: IPrimitive): Location | js.Array[Location] = js.native
  def snapLocationsToShape(locs: js.Array[Location], shape: IPrimitive, tolerance: Double): Location | js.Array[Location] = js.native
  def snapLocationsToShape(locs: js.Array[Location], shape: IPrimitive, tolerance: Double, toleranceUnits: DistanceUnits): Location | js.Array[Location] = js.native
  def snapLocationsToShape(locs: Location, shape: js.Array[IPrimitive]): Location | js.Array[Location] = js.native
  def snapLocationsToShape(locs: Location, shape: js.Array[IPrimitive], tolerance: Double): Location | js.Array[Location] = js.native
  def snapLocationsToShape(locs: Location, shape: js.Array[IPrimitive], tolerance: Double, toleranceUnits: DistanceUnits): Location | js.Array[Location] = js.native
  def snapLocationsToShape(locs: Location, shape: IPrimitive): Location | js.Array[Location] = js.native
  def snapLocationsToShape(locs: Location, shape: IPrimitive, tolerance: Double): Location | js.Array[Location] = js.native
  def snapLocationsToShape(locs: Location, shape: IPrimitive, tolerance: Double, toleranceUnits: DistanceUnits): Location | js.Array[Location] = js.native
  def snapShapeToShape(shapeToSnap: js.Array[IPrimitive], shape: js.Array[IPrimitive]): Unit = js.native
  def snapShapeToShape(shapeToSnap: js.Array[IPrimitive], shape: js.Array[IPrimitive], tolerance: Double): Unit = js.native
  def snapShapeToShape(
    shapeToSnap: js.Array[IPrimitive],
    shape: js.Array[IPrimitive],
    tolerance: Double,
    toleranceUnits: DistanceUnits
  ): Unit = js.native
  def snapShapeToShape(shapeToSnap: js.Array[IPrimitive], shape: IPrimitive): Unit = js.native
  def snapShapeToShape(shapeToSnap: js.Array[IPrimitive], shape: IPrimitive, tolerance: Double): Unit = js.native
  def snapShapeToShape(
    shapeToSnap: js.Array[IPrimitive],
    shape: IPrimitive,
    tolerance: Double,
    toleranceUnits: DistanceUnits
  ): Unit = js.native
  def snapShapeToShape(shapeToSnap: IPrimitive, shape: js.Array[IPrimitive]): Unit = js.native
  def snapShapeToShape(shapeToSnap: IPrimitive, shape: js.Array[IPrimitive], tolerance: Double): Unit = js.native
  def snapShapeToShape(
    shapeToSnap: IPrimitive,
    shape: js.Array[IPrimitive],
    tolerance: Double,
    toleranceUnits: DistanceUnits
  ): Unit = js.native
  def snapShapeToShape(shapeToSnap: IPrimitive, shape: IPrimitive): Unit = js.native
  def snapShapeToShape(shapeToSnap: IPrimitive, shape: IPrimitive, tolerance: Double): Unit = js.native
  def snapShapeToShape(shapeToSnap: IPrimitive, shape: IPrimitive, tolerance: Double, toleranceUnits: DistanceUnits): Unit = js.native
  def symDifference(shapeA: js.Array[IPrimitive], shapeB: js.Array[IPrimitive]): IPrimitive | js.Array[IPrimitive] = js.native
  def symDifference(shapeA: js.Array[IPrimitive], shapeB: IPrimitive): IPrimitive | js.Array[IPrimitive] = js.native
  def symDifference(shapeA: IPrimitive, shapeB: js.Array[IPrimitive]): IPrimitive | js.Array[IPrimitive] = js.native
  def symDifference(shapeA: IPrimitive, shapeB: IPrimitive): IPrimitive | js.Array[IPrimitive] = js.native
  def union(shapeA: js.Array[IPrimitive], shapeB: js.Array[IPrimitive]): IPrimitive | js.Array[IPrimitive] = js.native
  def union(shapeA: js.Array[IPrimitive], shapeB: IPrimitive): IPrimitive | js.Array[IPrimitive] = js.native
  def union(shapeA: IPrimitive, shapeB: js.Array[IPrimitive]): IPrimitive | js.Array[IPrimitive] = js.native
  def union(shapeA: IPrimitive, shapeB: IPrimitive): IPrimitive | js.Array[IPrimitive] = js.native
  def unionAggregate(shapes: js.Array[IPrimitive]): IPrimitive | js.Array[IPrimitive] = js.native
  def voronoiDiagram(shapes: js.Array[IPrimitive | Location]): js.Array[Polygon] = js.native
  def voronoiDiagram(shapes: js.Array[Location | IPrimitive], clipRegion: LocationRect): js.Array[Polygon] = js.native
  def voronoiDiagram(shapes: js.Array[Location | IPrimitive], clipRegion: LocationRect, options: IPolygonOptions): js.Array[Polygon] = js.native
  def voronoiDiagram(shapes: js.Array[Location | IPrimitive], clipRegion: Polygon): js.Array[Polygon] = js.native
  def voronoiDiagram(shapes: js.Array[Location | IPrimitive], clipRegion: Polygon, options: IPolygonOptions): js.Array[Polygon] = js.native
  def voronoiDiagram(shapes: IPrimitive): js.Array[Polygon] = js.native
  def voronoiDiagram(shapes: IPrimitive, clipRegion: LocationRect): js.Array[Polygon] = js.native
  def voronoiDiagram(shapes: IPrimitive, clipRegion: LocationRect, options: IPolygonOptions): js.Array[Polygon] = js.native
  def voronoiDiagram(shapes: IPrimitive, clipRegion: Polygon): js.Array[Polygon] = js.native
  def voronoiDiagram(shapes: IPrimitive, clipRegion: Polygon, options: IPolygonOptions): js.Array[Polygon] = js.native
  def voronoiDiagram(shapes: Location): js.Array[Polygon] = js.native
  def voronoiDiagram(shapes: Location, clipRegion: LocationRect): js.Array[Polygon] = js.native
  def voronoiDiagram(shapes: Location, clipRegion: LocationRect, options: IPolygonOptions): js.Array[Polygon] = js.native
  def voronoiDiagram(shapes: Location, clipRegion: Polygon): js.Array[Polygon] = js.native
  def voronoiDiagram(shapes: Location, clipRegion: Polygon, options: IPolygonOptions): js.Array[Polygon] = js.native
  @js.native
  object BufferEndCap extends js.Object {
    /** Adds a flat end to a buffered line that touches the end of the line. */
    @js.native
    sealed trait Flat extends BufferEndCap
    
    /** Adds a rounded end to a buffered line. */
    @js.native
    sealed trait Round extends BufferEndCap
    
    /** Adds a square end to a buffered line that has a buffer area at the end of the line. */
    @js.native
    sealed trait Square extends BufferEndCap
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[BufferEndCap with Double] = js.native
    /* 1 */ @js.native
    object Flat extends TopLevel[Flat with Double]
    
    /* 0 */ @js.native
    object Round extends TopLevel[Round with Double]
    
    /* 2 */ @js.native
    object Square extends TopLevel[Square with Double]
    
  }
  
}

