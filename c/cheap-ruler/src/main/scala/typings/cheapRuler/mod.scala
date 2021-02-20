package typings.cheapRuler

import typings.cheapRuler.anon.Index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cheap-ruler", JSImport.Default)
  @js.native
  class default protected () extends CheapRuler {
    def this(lat: Double) = this()
    def this(lat: Double, units: String) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cheap-ruler", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("cheap-ruler", "default.fromTile")
    @js.native
    def fromTile(y: Double, z: Double): CheapRuler = js.native
    @JSImport("cheap-ruler", "default.fromTile")
    @js.native
    def fromTile(y: Double, z: Double, units: String): CheapRuler = js.native
    
    @JSImport("cheap-ruler", "default.units")
    @js.native
    def units: Factors = js.native
    @scala.inline
    def units_=(x: Factors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("units")(x.asInstanceOf[js.Any])
  }
  
  type BBox = js.Tuple4[Double, Double, Double, Double]
  
  @js.native
  trait CheapRuler extends StObject {
    
    def along(line: Line, dist: Double): Point = js.native
    
    def area(polygon: Polygon): Double = js.native
    
    def bearing(a: Point, b: Point): Double = js.native
    
    def bufferBBox(bbox: BBox, buffer: Double): BBox = js.native
    
    def bufferPoint(p: Point, buffer: Double): BBox = js.native
    
    def destination(p: Point, dist: Double, bearing: Double): Point = js.native
    
    def distance(a: Point, b: Point): Double = js.native
    
    def insideBBox(p: Point, bbox: BBox): Boolean = js.native
    
    def lineDistance(points: Points): Double = js.native
    
    def lineSlice(start: Point, stop: Point, line: Line): Line = js.native
    
    def lineSliceAlong(start: Double, stop: Double, line: Line): Line = js.native
    
    def offset(p: Point, dx: Double, dy: Double): Point = js.native
    
    def pointOnLine(line: Line, p: Point): Index = js.native
  }
  object CheapRuler {
    
    @scala.inline
    def apply(
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
      pointOnLine: (Line, Point) => Index
    ): CheapRuler = {
      val __obj = js.Dynamic.literal(along = js.Any.fromFunction2(along), area = js.Any.fromFunction1(area), bearing = js.Any.fromFunction2(bearing), bufferBBox = js.Any.fromFunction2(bufferBBox), bufferPoint = js.Any.fromFunction2(bufferPoint), destination = js.Any.fromFunction3(destination), distance = js.Any.fromFunction2(distance), insideBBox = js.Any.fromFunction2(insideBBox), lineDistance = js.Any.fromFunction1(lineDistance), lineSlice = js.Any.fromFunction3(lineSlice), lineSliceAlong = js.Any.fromFunction3(lineSliceAlong), offset = js.Any.fromFunction3(offset), pointOnLine = js.Any.fromFunction2(pointOnLine))
      __obj.asInstanceOf[CheapRuler]
    }
    
    @scala.inline
    implicit class CheapRulerMutableBuilder[Self <: CheapRuler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlong(value: (Line, Double) => Point): Self = StObject.set(x, "along", js.Any.fromFunction2(value))
      
      @scala.inline
      def setArea(value: Polygon => Double): Self = StObject.set(x, "area", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBearing(value: (Point, Point) => Double): Self = StObject.set(x, "bearing", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBufferBBox(value: (BBox, Double) => BBox): Self = StObject.set(x, "bufferBBox", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBufferPoint(value: (Point, Double) => BBox): Self = StObject.set(x, "bufferPoint", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDestination(value: (Point, Double, Double) => Point): Self = StObject.set(x, "destination", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDistance(value: (Point, Point) => Double): Self = StObject.set(x, "distance", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInsideBBox(value: (Point, BBox) => Boolean): Self = StObject.set(x, "insideBBox", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLineDistance(value: Points => Double): Self = StObject.set(x, "lineDistance", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLineSlice(value: (Point, Point, Line) => Line): Self = StObject.set(x, "lineSlice", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLineSliceAlong(value: (Double, Double, Line) => Line): Self = StObject.set(x, "lineSliceAlong", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOffset(value: (Point, Double, Double) => Point): Self = StObject.set(x, "offset", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPointOnLine(value: (Line, Point) => Index): Self = StObject.set(x, "pointOnLine", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Factors extends StObject {
    
    var feet: Double = js.native
    
    var inches: Double = js.native
    
    var kilometers: Double = js.native
    
    var meters: Double = js.native
    
    var metres: Double = js.native
    
    var miles: Double = js.native
    
    var nauticalmiles: Double = js.native
    
    var yards: Double = js.native
  }
  object Factors {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class FactorsMutableBuilder[Self <: Factors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFeet(value: Double): Self = StObject.set(x, "feet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInches(value: Double): Self = StObject.set(x, "inches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKilometers(value: Double): Self = StObject.set(x, "kilometers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeters(value: Double): Self = StObject.set(x, "meters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetres(value: Double): Self = StObject.set(x, "metres", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiles(value: Double): Self = StObject.set(x, "miles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNauticalmiles(value: Double): Self = StObject.set(x, "nauticalmiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYards(value: Double): Self = StObject.set(x, "yards", value.asInstanceOf[js.Any])
    }
  }
  
  type Line = js.Array[Point]
  
  type Point = js.Tuple2[Double, Double]
  
  type Points = js.Array[Point]
  
  type Polygon = js.Array[js.Array[Point]]
}
