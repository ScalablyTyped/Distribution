package typings.cheapRuler

import typings.cheapRuler.anon.Index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cheap-ruler", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with CheapRuler {
    def this(lat: Double) = this()
    def this(lat: Double, units: String) = this()
    
    /* CompleteClass */
    override def along(line: Line, dist: Double): Point = js.native
    
    /* CompleteClass */
    override def area(polygon: Polygon): Double = js.native
    
    /* CompleteClass */
    override def bearing(a: Point, b: Point): Double = js.native
    
    /* CompleteClass */
    override def bufferBBox(bbox: BBox, buffer: Double): BBox = js.native
    
    /* CompleteClass */
    override def bufferPoint(p: Point, buffer: Double): BBox = js.native
    
    /* CompleteClass */
    override def destination(p: Point, dist: Double, bearing: Double): Point = js.native
    
    /* CompleteClass */
    override def distance(a: Point, b: Point): Double = js.native
    
    /* CompleteClass */
    override def insideBBox(p: Point, bbox: BBox): Boolean = js.native
    
    /* CompleteClass */
    override def lineDistance(points: Points): Double = js.native
    
    /* CompleteClass */
    override def lineSlice(start: Point, stop: Point, line: Line): Line = js.native
    
    /* CompleteClass */
    override def lineSliceAlong(start: Double, stop: Double, line: Line): Line = js.native
    
    /* CompleteClass */
    override def offset(p: Point, dx: Double, dy: Double): Point = js.native
    
    /* CompleteClass */
    override def pointOnLine(line: Line, p: Point): Index = js.native
    
    /* CompleteClass */
    override def pointToSegmentDistance(p: Point, a: Point, b: Point): Double = js.native
  }
  /* static members */
  object default {
    
    @JSImport("cheap-ruler", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromTile(y: Double, z: Double): CheapRuler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTile")(y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[CheapRuler]
    inline def fromTile(y: Double, z: Double, units: String): CheapRuler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTile")(y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], units.asInstanceOf[js.Any])).asInstanceOf[CheapRuler]
    
    @JSImport("cheap-ruler", "default.units")
    @js.native
    def units: Factors = js.native
    inline def units_=(x: Factors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("units")(x.asInstanceOf[js.Any])
  }
  
  type BBox = js.Tuple4[Double, Double, Double, Double]
  
  trait CheapRuler extends StObject {
    
    def along(line: Line, dist: Double): Point
    
    def area(polygon: Polygon): Double
    
    def bearing(a: Point, b: Point): Double
    
    def bufferBBox(bbox: BBox, buffer: Double): BBox
    
    def bufferPoint(p: Point, buffer: Double): BBox
    
    def destination(p: Point, dist: Double, bearing: Double): Point
    
    def distance(a: Point, b: Point): Double
    
    def insideBBox(p: Point, bbox: BBox): Boolean
    
    def lineDistance(points: Points): Double
    
    def lineSlice(start: Point, stop: Point, line: Line): Line
    
    def lineSliceAlong(start: Double, stop: Double, line: Line): Line
    
    def offset(p: Point, dx: Double, dy: Double): Point
    
    def pointOnLine(line: Line, p: Point): Index
    
    def pointToSegmentDistance(p: Point, a: Point, b: Point): Double
  }
  object CheapRuler {
    
    inline def apply(
      along: (Line, Double) => Point,
      area: Polygon => Double,
      bearing: (Point, Point) => Double,
      bufferBBox: (BBox, Double) => BBox,
      bufferPoint: (Point, Double) => BBox,
      destination: (Point, Double, Double) => Point,
      distance: (Point, Point) => Double,
      insideBBox: (Point, BBox) => Boolean,
      lineDistance: Points => Double,
      lineSlice: (Point, Point, Line) => Line,
      lineSliceAlong: (Double, Double, Line) => Line,
      offset: (Point, Double, Double) => Point,
      pointOnLine: (Line, Point) => Index,
      pointToSegmentDistance: (Point, Point, Point) => Double
    ): CheapRuler = {
      val __obj = js.Dynamic.literal(along = js.Any.fromFunction2(along), area = js.Any.fromFunction1(area), bearing = js.Any.fromFunction2(bearing), bufferBBox = js.Any.fromFunction2(bufferBBox), bufferPoint = js.Any.fromFunction2(bufferPoint), destination = js.Any.fromFunction3(destination), distance = js.Any.fromFunction2(distance), insideBBox = js.Any.fromFunction2(insideBBox), lineDistance = js.Any.fromFunction1(lineDistance), lineSlice = js.Any.fromFunction3(lineSlice), lineSliceAlong = js.Any.fromFunction3(lineSliceAlong), offset = js.Any.fromFunction3(offset), pointOnLine = js.Any.fromFunction2(pointOnLine), pointToSegmentDistance = js.Any.fromFunction3(pointToSegmentDistance))
      __obj.asInstanceOf[CheapRuler]
    }
    
    extension [Self <: CheapRuler](x: Self) {
      
      inline def setAlong(value: (Line, Double) => Point): Self = StObject.set(x, "along", js.Any.fromFunction2(value))
      
      inline def setArea(value: Polygon => Double): Self = StObject.set(x, "area", js.Any.fromFunction1(value))
      
      inline def setBearing(value: (Point, Point) => Double): Self = StObject.set(x, "bearing", js.Any.fromFunction2(value))
      
      inline def setBufferBBox(value: (BBox, Double) => BBox): Self = StObject.set(x, "bufferBBox", js.Any.fromFunction2(value))
      
      inline def setBufferPoint(value: (Point, Double) => BBox): Self = StObject.set(x, "bufferPoint", js.Any.fromFunction2(value))
      
      inline def setDestination(value: (Point, Double, Double) => Point): Self = StObject.set(x, "destination", js.Any.fromFunction3(value))
      
      inline def setDistance(value: (Point, Point) => Double): Self = StObject.set(x, "distance", js.Any.fromFunction2(value))
      
      inline def setInsideBBox(value: (Point, BBox) => Boolean): Self = StObject.set(x, "insideBBox", js.Any.fromFunction2(value))
      
      inline def setLineDistance(value: Points => Double): Self = StObject.set(x, "lineDistance", js.Any.fromFunction1(value))
      
      inline def setLineSlice(value: (Point, Point, Line) => Line): Self = StObject.set(x, "lineSlice", js.Any.fromFunction3(value))
      
      inline def setLineSliceAlong(value: (Double, Double, Line) => Line): Self = StObject.set(x, "lineSliceAlong", js.Any.fromFunction3(value))
      
      inline def setOffset(value: (Point, Double, Double) => Point): Self = StObject.set(x, "offset", js.Any.fromFunction3(value))
      
      inline def setPointOnLine(value: (Line, Point) => Index): Self = StObject.set(x, "pointOnLine", js.Any.fromFunction2(value))
      
      inline def setPointToSegmentDistance(value: (Point, Point, Point) => Double): Self = StObject.set(x, "pointToSegmentDistance", js.Any.fromFunction3(value))
    }
  }
  
  trait Factors extends StObject {
    
    var feet: Double
    
    var inches: Double
    
    var kilometers: Double
    
    var meters: Double
    
    var metres: Double
    
    var miles: Double
    
    var nauticalmiles: Double
    
    var yards: Double
  }
  object Factors {
    
    inline def apply(
      feet: Double,
      inches: Double,
      kilometers: Double,
      meters: Double,
      metres: Double,
      miles: Double,
      nauticalmiles: Double,
      yards: Double
    ): Factors = {
      val __obj = js.Dynamic.literal(feet = feet.asInstanceOf[js.Any], inches = inches.asInstanceOf[js.Any], kilometers = kilometers.asInstanceOf[js.Any], meters = meters.asInstanceOf[js.Any], metres = metres.asInstanceOf[js.Any], miles = miles.asInstanceOf[js.Any], nauticalmiles = nauticalmiles.asInstanceOf[js.Any], yards = yards.asInstanceOf[js.Any])
      __obj.asInstanceOf[Factors]
    }
    
    extension [Self <: Factors](x: Self) {
      
      inline def setFeet(value: Double): Self = StObject.set(x, "feet", value.asInstanceOf[js.Any])
      
      inline def setInches(value: Double): Self = StObject.set(x, "inches", value.asInstanceOf[js.Any])
      
      inline def setKilometers(value: Double): Self = StObject.set(x, "kilometers", value.asInstanceOf[js.Any])
      
      inline def setMeters(value: Double): Self = StObject.set(x, "meters", value.asInstanceOf[js.Any])
      
      inline def setMetres(value: Double): Self = StObject.set(x, "metres", value.asInstanceOf[js.Any])
      
      inline def setMiles(value: Double): Self = StObject.set(x, "miles", value.asInstanceOf[js.Any])
      
      inline def setNauticalmiles(value: Double): Self = StObject.set(x, "nauticalmiles", value.asInstanceOf[js.Any])
      
      inline def setYards(value: Double): Self = StObject.set(x, "yards", value.asInstanceOf[js.Any])
    }
  }
  
  type Line = js.Array[Point]
  
  type Point = js.Tuple2[Double, Double]
  
  type Points = js.Array[Point]
  
  type Polygon = js.Array[js.Array[Point]]
}
