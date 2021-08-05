package typings.bingmaps.global.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.IPolygonOptions
import typings.bingmaps.Microsoft.Maps.IPolylineOptions
import typings.bingmaps.Microsoft.Maps.IPrimitive
import typings.bingmaps.Microsoft.Maps.SpatialMath.AreaUnits
import typings.bingmaps.Microsoft.Maps.SpatialMath.DistanceUnits
import typings.bingmaps.Microsoft.Maps.SpatialMath.Geometry.BufferEndCap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This module provides a bunch of useful spatial math calculations.
  * @requires The Microsoft.Maps.SpatialMath module.
  */
object SpatialMath {
  
  @JSGlobal("Microsoft.Maps.SpatialMath")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("Microsoft.Maps.SpatialMath.AreaUnits")
  @js.native
  object AreaUnits extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.bingmaps.Microsoft.Maps.SpatialMath.AreaUnits & Double] = js.native
    
    /* 5 */ val Acres: typings.bingmaps.Microsoft.Maps.SpatialMath.AreaUnits.Acres & Double = js.native
    
    /* 6 */ val Hectares: typings.bingmaps.Microsoft.Maps.SpatialMath.AreaUnits.Hectares & Double = js.native
    
    /* 3 */ val SquareFeet: typings.bingmaps.Microsoft.Maps.SpatialMath.AreaUnits.SquareFeet & Double = js.native
    
    /* 1 */ val SquareKilometers: typings.bingmaps.Microsoft.Maps.SpatialMath.AreaUnits.SquareKilometers & Double = js.native
    
    /* 0 */ val SquareMeters: typings.bingmaps.Microsoft.Maps.SpatialMath.AreaUnits.SquareMeters & Double = js.native
    
    /* 2 */ val SquareMiles: typings.bingmaps.Microsoft.Maps.SpatialMath.AreaUnits.SquareMiles & Double = js.native
    
    /* 4 */ val SquareYards: typings.bingmaps.Microsoft.Maps.SpatialMath.AreaUnits.SquareYards & Double = js.native
  }
  
  @JSGlobal("Microsoft.Maps.SpatialMath.DistanceUnits")
  @js.native
  object DistanceUnits extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.bingmaps.Microsoft.Maps.SpatialMath.DistanceUnits & Double] = js.native
    
    /* 3 */ val Feet: typings.bingmaps.Microsoft.Maps.SpatialMath.DistanceUnits.Feet & Double = js.native
    
    /* 1 */ val Kilometers: typings.bingmaps.Microsoft.Maps.SpatialMath.DistanceUnits.Kilometers & Double = js.native
    
    /* 0 */ val Meters: typings.bingmaps.Microsoft.Maps.SpatialMath.DistanceUnits.Meters & Double = js.native
    
    /* 2 */ val Miles: typings.bingmaps.Microsoft.Maps.SpatialMath.DistanceUnits.Miles & Double = js.native
    
    /* 5 */ val NauticalMiles: typings.bingmaps.Microsoft.Maps.SpatialMath.DistanceUnits.NauticalMiles & Double = js.native
    
    /* 4 */ val Yards: typings.bingmaps.Microsoft.Maps.SpatialMath.DistanceUnits.Yards & Double = js.native
  }
  
  //////////////////////////////////////////////
  /// Geometry Calculations
  //////////////////////////////////////////////
  /**
  * A colleciton of geometry calculations that can be performed against Bing Maps shapes.
  * @requires The Microsoft.Maps.SpatialMath module.
  */
  object Geometry {
    
    @JSGlobal("Microsoft.Maps.SpatialMath.Geometry")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Microsoft.Maps.SpatialMath.Geometry.BufferEndCap")
    @js.native
    object BufferEndCap extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.bingmaps.Microsoft.Maps.SpatialMath.Geometry.BufferEndCap & Double] = js.native
      
      /* 1 */ val Flat: typings.bingmaps.Microsoft.Maps.SpatialMath.Geometry.BufferEndCap.Flat & Double = js.native
      
      /* 0 */ val Round: typings.bingmaps.Microsoft.Maps.SpatialMath.Geometry.BufferEndCap.Round & Double = js.native
      
      /* 2 */ val Square: typings.bingmaps.Microsoft.Maps.SpatialMath.Geometry.BufferEndCap.Square & Double = js.native
    }
    
    inline def area(shape: js.Array[IPrimitive]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("area")(shape.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def area(shape: js.Array[IPrimitive], areaUnits: AreaUnits): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(shape.asInstanceOf[js.Any], areaUnits.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def area(shape: IPrimitive): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("area")(shape.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def area(shape: IPrimitive, areaUnits: AreaUnits): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(shape.asInstanceOf[js.Any], areaUnits.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def bounds(shapes: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive]): typings.bingmaps.Microsoft.Maps.LocationRect = ^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(shapes.asInstanceOf[js.Any]).asInstanceOf[typings.bingmaps.Microsoft.Maps.LocationRect]
    inline def bounds(shapes: IPrimitive): typings.bingmaps.Microsoft.Maps.LocationRect = ^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(shapes.asInstanceOf[js.Any]).asInstanceOf[typings.bingmaps.Microsoft.Maps.LocationRect]
    inline def bounds(shapes: typings.bingmaps.Microsoft.Maps.Location): typings.bingmaps.Microsoft.Maps.LocationRect = ^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(shapes.asInstanceOf[js.Any]).asInstanceOf[typings.bingmaps.Microsoft.Maps.LocationRect]
    
    inline def buffer(shape: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive], distance: Double): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def buffer(
      shape: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      distance: Double,
      units: Unit,
      endCapType: Unit,
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], units.asInstanceOf[js.Any], endCapType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def buffer(
      shape: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      distance: Double,
      units: Unit,
      endCapType: BufferEndCap
    ): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], units.asInstanceOf[js.Any], endCapType.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def buffer(
      shape: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      distance: Double,
      units: Unit,
      endCapType: BufferEndCap,
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], units.asInstanceOf[js.Any], endCapType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def buffer(
      shape: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      distance: Double,
      units: DistanceUnits
    ): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], units.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def buffer(
      shape: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      distance: Double,
      units: DistanceUnits,
      endCapType: Unit,
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], units.asInstanceOf[js.Any], endCapType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def buffer(
      shape: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      distance: Double,
      units: DistanceUnits,
      endCapType: BufferEndCap
    ): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], units.asInstanceOf[js.Any], endCapType.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def buffer(
      shape: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      distance: Double,
      units: DistanceUnits,
      endCapType: BufferEndCap,
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], units.asInstanceOf[js.Any], endCapType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def buffer(shape: IPrimitive, distance: Double): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def buffer(shape: IPrimitive, distance: Double, units: Unit, endCapType: Unit, options: IPolygonOptions): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], units.asInstanceOf[js.Any], endCapType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def buffer(shape: IPrimitive, distance: Double, units: Unit, endCapType: BufferEndCap): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], units.asInstanceOf[js.Any], endCapType.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def buffer(
      shape: IPrimitive,
      distance: Double,
      units: Unit,
      endCapType: BufferEndCap,
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], units.asInstanceOf[js.Any], endCapType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def buffer(shape: IPrimitive, distance: Double, units: DistanceUnits): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], units.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def buffer(
      shape: IPrimitive,
      distance: Double,
      units: DistanceUnits,
      endCapType: Unit,
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], units.asInstanceOf[js.Any], endCapType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def buffer(shape: IPrimitive, distance: Double, units: DistanceUnits, endCapType: BufferEndCap): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], units.asInstanceOf[js.Any], endCapType.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def buffer(
      shape: IPrimitive,
      distance: Double,
      units: DistanceUnits,
      endCapType: BufferEndCap,
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], units.asInstanceOf[js.Any], endCapType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def buffer(shape: typings.bingmaps.Microsoft.Maps.Location, distance: Double): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def buffer(
      shape: typings.bingmaps.Microsoft.Maps.Location,
      distance: Double,
      units: Unit,
      endCapType: Unit,
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], units.asInstanceOf[js.Any], endCapType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def buffer(
      shape: typings.bingmaps.Microsoft.Maps.Location,
      distance: Double,
      units: Unit,
      endCapType: BufferEndCap
    ): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], units.asInstanceOf[js.Any], endCapType.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def buffer(
      shape: typings.bingmaps.Microsoft.Maps.Location,
      distance: Double,
      units: Unit,
      endCapType: BufferEndCap,
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], units.asInstanceOf[js.Any], endCapType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def buffer(shape: typings.bingmaps.Microsoft.Maps.Location, distance: Double, units: DistanceUnits): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], units.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def buffer(
      shape: typings.bingmaps.Microsoft.Maps.Location,
      distance: Double,
      units: DistanceUnits,
      endCapType: Unit,
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], units.asInstanceOf[js.Any], endCapType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def buffer(
      shape: typings.bingmaps.Microsoft.Maps.Location,
      distance: Double,
      units: DistanceUnits,
      endCapType: BufferEndCap
    ): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], units.asInstanceOf[js.Any], endCapType.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def buffer(
      shape: typings.bingmaps.Microsoft.Maps.Location,
      distance: Double,
      units: DistanceUnits,
      endCapType: BufferEndCap,
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], units.asInstanceOf[js.Any], endCapType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    
    inline def calculateLength(shape: js.Array[IPrimitive]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateLength")(shape.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def calculateLength(shape: js.Array[IPrimitive], units: Unit, highAccuracy: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateLength")(shape.asInstanceOf[js.Any], units.asInstanceOf[js.Any], highAccuracy.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def calculateLength(shape: js.Array[IPrimitive], units: DistanceUnits): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateLength")(shape.asInstanceOf[js.Any], units.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def calculateLength(shape: js.Array[IPrimitive], units: DistanceUnits, highAccuracy: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateLength")(shape.asInstanceOf[js.Any], units.asInstanceOf[js.Any], highAccuracy.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def calculateLength(shape: IPrimitive): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateLength")(shape.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def calculateLength(shape: IPrimitive, units: Unit, highAccuracy: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateLength")(shape.asInstanceOf[js.Any], units.asInstanceOf[js.Any], highAccuracy.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def calculateLength(shape: IPrimitive, units: DistanceUnits): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateLength")(shape.asInstanceOf[js.Any], units.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def calculateLength(shape: IPrimitive, units: DistanceUnits, highAccuracy: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateLength")(shape.asInstanceOf[js.Any], units.asInstanceOf[js.Any], highAccuracy.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def centroid(shape: js.Array[IPrimitive]): typings.bingmaps.Microsoft.Maps.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("centroid")(shape.asInstanceOf[js.Any]).asInstanceOf[typings.bingmaps.Microsoft.Maps.Location]
    inline def centroid(shape: IPrimitive): typings.bingmaps.Microsoft.Maps.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("centroid")(shape.asInstanceOf[js.Any]).asInstanceOf[typings.bingmaps.Microsoft.Maps.Location]
    
    inline def concaveHull(shapes: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive]): IPrimitive | js.Array[IPrimitive] = ^.asInstanceOf[js.Dynamic].applyDynamic("concaveHull")(shapes.asInstanceOf[js.Any]).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def concaveHull(
      shapes: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      allowMultiPolygons: Boolean
    ): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("concaveHull")(shapes.asInstanceOf[js.Any], allowMultiPolygons.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def concaveHull(
      shapes: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      allowMultiPolygons: Boolean,
      allowHoles: Boolean
    ): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("concaveHull")(shapes.asInstanceOf[js.Any], allowMultiPolygons.asInstanceOf[js.Any], allowHoles.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def concaveHull(
      shapes: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      allowMultiPolygons: Boolean,
      allowHoles: Boolean,
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("concaveHull")(shapes.asInstanceOf[js.Any], allowMultiPolygons.asInstanceOf[js.Any], allowHoles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def concaveHull(
      shapes: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      allowMultiPolygons: Boolean,
      allowHoles: Unit,
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("concaveHull")(shapes.asInstanceOf[js.Any], allowMultiPolygons.asInstanceOf[js.Any], allowHoles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def concaveHull(
      shapes: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      allowMultiPolygons: Unit,
      allowHoles: Boolean
    ): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("concaveHull")(shapes.asInstanceOf[js.Any], allowMultiPolygons.asInstanceOf[js.Any], allowHoles.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def concaveHull(
      shapes: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      allowMultiPolygons: Unit,
      allowHoles: Boolean,
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("concaveHull")(shapes.asInstanceOf[js.Any], allowMultiPolygons.asInstanceOf[js.Any], allowHoles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def concaveHull(
      shapes: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      allowMultiPolygons: Unit,
      allowHoles: Unit,
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("concaveHull")(shapes.asInstanceOf[js.Any], allowMultiPolygons.asInstanceOf[js.Any], allowHoles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def concaveHull(shapes: IPrimitive): IPrimitive | js.Array[IPrimitive] = ^.asInstanceOf[js.Dynamic].applyDynamic("concaveHull")(shapes.asInstanceOf[js.Any]).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def concaveHull(shapes: IPrimitive, allowMultiPolygons: Boolean): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("concaveHull")(shapes.asInstanceOf[js.Any], allowMultiPolygons.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def concaveHull(shapes: IPrimitive, allowMultiPolygons: Boolean, allowHoles: Boolean): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("concaveHull")(shapes.asInstanceOf[js.Any], allowMultiPolygons.asInstanceOf[js.Any], allowHoles.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def concaveHull(shapes: IPrimitive, allowMultiPolygons: Boolean, allowHoles: Boolean, options: IPolygonOptions): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("concaveHull")(shapes.asInstanceOf[js.Any], allowMultiPolygons.asInstanceOf[js.Any], allowHoles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def concaveHull(shapes: IPrimitive, allowMultiPolygons: Boolean, allowHoles: Unit, options: IPolygonOptions): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("concaveHull")(shapes.asInstanceOf[js.Any], allowMultiPolygons.asInstanceOf[js.Any], allowHoles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def concaveHull(shapes: IPrimitive, allowMultiPolygons: Unit, allowHoles: Boolean): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("concaveHull")(shapes.asInstanceOf[js.Any], allowMultiPolygons.asInstanceOf[js.Any], allowHoles.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def concaveHull(shapes: IPrimitive, allowMultiPolygons: Unit, allowHoles: Boolean, options: IPolygonOptions): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("concaveHull")(shapes.asInstanceOf[js.Any], allowMultiPolygons.asInstanceOf[js.Any], allowHoles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def concaveHull(shapes: IPrimitive, allowMultiPolygons: Unit, allowHoles: Unit, options: IPolygonOptions): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("concaveHull")(shapes.asInstanceOf[js.Any], allowMultiPolygons.asInstanceOf[js.Any], allowHoles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def concaveHull(shapes: typings.bingmaps.Microsoft.Maps.Location): IPrimitive | js.Array[IPrimitive] = ^.asInstanceOf[js.Dynamic].applyDynamic("concaveHull")(shapes.asInstanceOf[js.Any]).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def concaveHull(shapes: typings.bingmaps.Microsoft.Maps.Location, allowMultiPolygons: Boolean): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("concaveHull")(shapes.asInstanceOf[js.Any], allowMultiPolygons.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def concaveHull(shapes: typings.bingmaps.Microsoft.Maps.Location, allowMultiPolygons: Boolean, allowHoles: Boolean): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("concaveHull")(shapes.asInstanceOf[js.Any], allowMultiPolygons.asInstanceOf[js.Any], allowHoles.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def concaveHull(
      shapes: typings.bingmaps.Microsoft.Maps.Location,
      allowMultiPolygons: Boolean,
      allowHoles: Boolean,
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("concaveHull")(shapes.asInstanceOf[js.Any], allowMultiPolygons.asInstanceOf[js.Any], allowHoles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def concaveHull(
      shapes: typings.bingmaps.Microsoft.Maps.Location,
      allowMultiPolygons: Boolean,
      allowHoles: Unit,
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("concaveHull")(shapes.asInstanceOf[js.Any], allowMultiPolygons.asInstanceOf[js.Any], allowHoles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def concaveHull(shapes: typings.bingmaps.Microsoft.Maps.Location, allowMultiPolygons: Unit, allowHoles: Boolean): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("concaveHull")(shapes.asInstanceOf[js.Any], allowMultiPolygons.asInstanceOf[js.Any], allowHoles.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def concaveHull(
      shapes: typings.bingmaps.Microsoft.Maps.Location,
      allowMultiPolygons: Unit,
      allowHoles: Boolean,
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("concaveHull")(shapes.asInstanceOf[js.Any], allowMultiPolygons.asInstanceOf[js.Any], allowHoles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def concaveHull(
      shapes: typings.bingmaps.Microsoft.Maps.Location,
      allowMultiPolygons: Unit,
      allowHoles: Unit,
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("concaveHull")(shapes.asInstanceOf[js.Any], allowMultiPolygons.asInstanceOf[js.Any], allowHoles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    
    inline def contains(
      shapeA: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive]
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def contains(shapeA: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive], shapeB: IPrimitive): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def contains(
      shapeA: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: typings.bingmaps.Microsoft.Maps.Location
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def contains(shapeA: IPrimitive, shapeB: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def contains(shapeA: IPrimitive, shapeB: IPrimitive): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def contains(shapeA: IPrimitive, shapeB: typings.bingmaps.Microsoft.Maps.Location): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def contains(
      shapeA: typings.bingmaps.Microsoft.Maps.Location,
      shapeB: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive]
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def contains(shapeA: typings.bingmaps.Microsoft.Maps.Location, shapeB: IPrimitive): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def contains(shapeA: typings.bingmaps.Microsoft.Maps.Location, shapeB: typings.bingmaps.Microsoft.Maps.Location): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def convexHull(shapes: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive]): IPrimitive | js.Array[IPrimitive] = ^.asInstanceOf[js.Dynamic].applyDynamic("convexHull")(shapes.asInstanceOf[js.Any]).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def convexHull(shapes: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive], options: IPolygonOptions): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("convexHull")(shapes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def convexHull(shapes: IPrimitive): IPrimitive | js.Array[IPrimitive] = ^.asInstanceOf[js.Dynamic].applyDynamic("convexHull")(shapes.asInstanceOf[js.Any]).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def convexHull(shapes: IPrimitive, options: IPolygonOptions): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("convexHull")(shapes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def convexHull(shapes: typings.bingmaps.Microsoft.Maps.Location): IPrimitive | js.Array[IPrimitive] = ^.asInstanceOf[js.Dynamic].applyDynamic("convexHull")(shapes.asInstanceOf[js.Any]).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def convexHull(shapes: typings.bingmaps.Microsoft.Maps.Location, options: IPolygonOptions): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("convexHull")(shapes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    
    inline def delaunayTriangles(shapes: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive]): js.Array[typings.bingmaps.Microsoft.Maps.Polygon] = ^.asInstanceOf[js.Dynamic].applyDynamic("delaunayTriangles")(shapes.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Polygon]]
    inline def delaunayTriangles(shapes: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive], options: IPolygonOptions): js.Array[typings.bingmaps.Microsoft.Maps.Polygon] = (^.asInstanceOf[js.Dynamic].applyDynamic("delaunayTriangles")(shapes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Polygon]]
    inline def delaunayTriangles(shapes: IPrimitive): js.Array[typings.bingmaps.Microsoft.Maps.Polygon] = ^.asInstanceOf[js.Dynamic].applyDynamic("delaunayTriangles")(shapes.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Polygon]]
    inline def delaunayTriangles(shapes: IPrimitive, options: IPolygonOptions): js.Array[typings.bingmaps.Microsoft.Maps.Polygon] = (^.asInstanceOf[js.Dynamic].applyDynamic("delaunayTriangles")(shapes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Polygon]]
    inline def delaunayTriangles(shapes: typings.bingmaps.Microsoft.Maps.Location): js.Array[typings.bingmaps.Microsoft.Maps.Polygon] = ^.asInstanceOf[js.Dynamic].applyDynamic("delaunayTriangles")(shapes.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Polygon]]
    inline def delaunayTriangles(shapes: typings.bingmaps.Microsoft.Maps.Location, options: IPolygonOptions): js.Array[typings.bingmaps.Microsoft.Maps.Polygon] = (^.asInstanceOf[js.Dynamic].applyDynamic("delaunayTriangles")(shapes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Polygon]]
    
    inline def difference(shapeA: js.Array[IPrimitive], shapeB: js.Array[IPrimitive]): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("difference")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def difference(shapeA: js.Array[IPrimitive], shapeB: IPrimitive): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("difference")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def difference(shapeA: IPrimitive, shapeB: js.Array[IPrimitive]): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("difference")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def difference(shapeA: IPrimitive, shapeB: IPrimitive): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("difference")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    
    inline def distance(
      shapeA: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive]
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(
      shapeA: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      units: Unit,
      highAccuracy: Boolean
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], units.asInstanceOf[js.Any], highAccuracy.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(
      shapeA: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      units: DistanceUnits
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], units.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(
      shapeA: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      units: DistanceUnits,
      highAccuracy: Boolean
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], units.asInstanceOf[js.Any], highAccuracy.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(shapeA: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive], shapeB: IPrimitive): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(
      shapeA: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: IPrimitive,
      units: Unit,
      highAccuracy: Boolean
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], units.asInstanceOf[js.Any], highAccuracy.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(
      shapeA: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: IPrimitive,
      units: DistanceUnits
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], units.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(
      shapeA: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: IPrimitive,
      units: DistanceUnits,
      highAccuracy: Boolean
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], units.asInstanceOf[js.Any], highAccuracy.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(
      shapeA: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: typings.bingmaps.Microsoft.Maps.Location
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(
      shapeA: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: typings.bingmaps.Microsoft.Maps.Location,
      units: Unit,
      highAccuracy: Boolean
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], units.asInstanceOf[js.Any], highAccuracy.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(
      shapeA: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: typings.bingmaps.Microsoft.Maps.Location,
      units: DistanceUnits
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], units.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(
      shapeA: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: typings.bingmaps.Microsoft.Maps.Location,
      units: DistanceUnits,
      highAccuracy: Boolean
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], units.asInstanceOf[js.Any], highAccuracy.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(shapeA: IPrimitive, shapeB: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(
      shapeA: IPrimitive,
      shapeB: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      units: Unit,
      highAccuracy: Boolean
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], units.asInstanceOf[js.Any], highAccuracy.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(
      shapeA: IPrimitive,
      shapeB: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      units: DistanceUnits
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], units.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(
      shapeA: IPrimitive,
      shapeB: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      units: DistanceUnits,
      highAccuracy: Boolean
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], units.asInstanceOf[js.Any], highAccuracy.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(shapeA: IPrimitive, shapeB: IPrimitive): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(shapeA: IPrimitive, shapeB: IPrimitive, units: Unit, highAccuracy: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], units.asInstanceOf[js.Any], highAccuracy.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(shapeA: IPrimitive, shapeB: IPrimitive, units: DistanceUnits): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], units.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(shapeA: IPrimitive, shapeB: IPrimitive, units: DistanceUnits, highAccuracy: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], units.asInstanceOf[js.Any], highAccuracy.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(shapeA: IPrimitive, shapeB: typings.bingmaps.Microsoft.Maps.Location): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(
      shapeA: IPrimitive,
      shapeB: typings.bingmaps.Microsoft.Maps.Location,
      units: Unit,
      highAccuracy: Boolean
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], units.asInstanceOf[js.Any], highAccuracy.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(shapeA: IPrimitive, shapeB: typings.bingmaps.Microsoft.Maps.Location, units: DistanceUnits): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], units.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(
      shapeA: IPrimitive,
      shapeB: typings.bingmaps.Microsoft.Maps.Location,
      units: DistanceUnits,
      highAccuracy: Boolean
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], units.asInstanceOf[js.Any], highAccuracy.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(
      shapeA: typings.bingmaps.Microsoft.Maps.Location,
      shapeB: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive]
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(
      shapeA: typings.bingmaps.Microsoft.Maps.Location,
      shapeB: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      units: Unit,
      highAccuracy: Boolean
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], units.asInstanceOf[js.Any], highAccuracy.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(
      shapeA: typings.bingmaps.Microsoft.Maps.Location,
      shapeB: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      units: DistanceUnits
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], units.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(
      shapeA: typings.bingmaps.Microsoft.Maps.Location,
      shapeB: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      units: DistanceUnits,
      highAccuracy: Boolean
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], units.asInstanceOf[js.Any], highAccuracy.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(shapeA: typings.bingmaps.Microsoft.Maps.Location, shapeB: IPrimitive): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(
      shapeA: typings.bingmaps.Microsoft.Maps.Location,
      shapeB: IPrimitive,
      units: Unit,
      highAccuracy: Boolean
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], units.asInstanceOf[js.Any], highAccuracy.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(shapeA: typings.bingmaps.Microsoft.Maps.Location, shapeB: IPrimitive, units: DistanceUnits): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], units.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(
      shapeA: typings.bingmaps.Microsoft.Maps.Location,
      shapeB: IPrimitive,
      units: DistanceUnits,
      highAccuracy: Boolean
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], units.asInstanceOf[js.Any], highAccuracy.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(shapeA: typings.bingmaps.Microsoft.Maps.Location, shapeB: typings.bingmaps.Microsoft.Maps.Location): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(
      shapeA: typings.bingmaps.Microsoft.Maps.Location,
      shapeB: typings.bingmaps.Microsoft.Maps.Location,
      units: Unit,
      highAccuracy: Boolean
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], units.asInstanceOf[js.Any], highAccuracy.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(
      shapeA: typings.bingmaps.Microsoft.Maps.Location,
      shapeB: typings.bingmaps.Microsoft.Maps.Location,
      units: DistanceUnits
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], units.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def distance(
      shapeA: typings.bingmaps.Microsoft.Maps.Location,
      shapeB: typings.bingmaps.Microsoft.Maps.Location,
      units: DistanceUnits,
      highAccuracy: Boolean
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], units.asInstanceOf[js.Any], highAccuracy.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def intersection(shapeA: js.Array[IPrimitive], shapeB: js.Array[IPrimitive]): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def intersection(shapeA: js.Array[IPrimitive], shapeB: IPrimitive): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def intersection(shapeA: IPrimitive, shapeB: js.Array[IPrimitive]): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def intersection(shapeA: IPrimitive, shapeB: IPrimitive): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    
    inline def intersects(
      shapeA: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive]
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def intersects(shapeA: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive], shapeB: IPrimitive): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def intersects(
      shapeA: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: typings.bingmaps.Microsoft.Maps.Location
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def intersects(shapeA: IPrimitive, shapeB: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def intersects(shapeA: IPrimitive, shapeB: IPrimitive): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def intersects(shapeA: IPrimitive, shapeB: typings.bingmaps.Microsoft.Maps.Location): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def intersects(
      shapeA: typings.bingmaps.Microsoft.Maps.Location,
      shapeB: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive]
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def intersects(shapeA: typings.bingmaps.Microsoft.Maps.Location, shapeB: IPrimitive): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def intersects(shapeA: typings.bingmaps.Microsoft.Maps.Location, shapeB: typings.bingmaps.Microsoft.Maps.Location): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isValid(shape: js.Array[IPrimitive]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(shape.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isValid(shape: IPrimitive): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(shape.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def makeValid(shape: js.Array[IPrimitive]): IPrimitive | js.Array[IPrimitive] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeValid")(shape.asInstanceOf[js.Any]).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def makeValid(shape: IPrimitive): IPrimitive | js.Array[IPrimitive] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeValid")(shape.asInstanceOf[js.Any]).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    
    inline def nearestLocations(
      shapeA: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive]
    ): js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("nearestLocations")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Location]]
    inline def nearestLocations(shapeA: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive], shapeB: IPrimitive): js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("nearestLocations")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Location]]
    inline def nearestLocations(
      shapeA: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: typings.bingmaps.Microsoft.Maps.Location
    ): js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("nearestLocations")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Location]]
    inline def nearestLocations(shapeA: IPrimitive, shapeB: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive]): js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("nearestLocations")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Location]]
    inline def nearestLocations(shapeA: IPrimitive, shapeB: IPrimitive): js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("nearestLocations")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Location]]
    inline def nearestLocations(shapeA: IPrimitive, shapeB: typings.bingmaps.Microsoft.Maps.Location): js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("nearestLocations")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Location]]
    inline def nearestLocations(
      shapeA: typings.bingmaps.Microsoft.Maps.Location,
      shapeB: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive]
    ): js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("nearestLocations")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Location]]
    inline def nearestLocations(shapeA: typings.bingmaps.Microsoft.Maps.Location, shapeB: IPrimitive): js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("nearestLocations")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Location]]
    inline def nearestLocations(shapeA: typings.bingmaps.Microsoft.Maps.Location, shapeB: typings.bingmaps.Microsoft.Maps.Location): js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("nearestLocations")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Location]]
    
    inline def reduce(shape: js.Array[IPrimitive], tolerance: Double): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(shape.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def reduce(shape: IPrimitive, tolerance: Double): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(shape.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    
    inline def rotate(shape: js.Array[IPrimitive], angle: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(shape.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def rotate(shape: js.Array[IPrimitive], angle: Double, origin: typings.bingmaps.Microsoft.Maps.Location): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(shape.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def rotate(shape: IPrimitive, angle: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(shape.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def rotate(shape: IPrimitive, angle: Double, origin: typings.bingmaps.Microsoft.Maps.Location): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(shape.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def shortestLineTo(
      shapeA: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive]
    ): typings.bingmaps.Microsoft.Maps.Polyline = (^.asInstanceOf[js.Dynamic].applyDynamic("shortestLineTo")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline]
    inline def shortestLineTo(
      shapeA: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      options: IPolylineOptions
    ): typings.bingmaps.Microsoft.Maps.Polyline = (^.asInstanceOf[js.Dynamic].applyDynamic("shortestLineTo")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline]
    inline def shortestLineTo(shapeA: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive], shapeB: IPrimitive): typings.bingmaps.Microsoft.Maps.Polyline = (^.asInstanceOf[js.Dynamic].applyDynamic("shortestLineTo")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline]
    inline def shortestLineTo(
      shapeA: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: IPrimitive,
      options: IPolylineOptions
    ): typings.bingmaps.Microsoft.Maps.Polyline = (^.asInstanceOf[js.Dynamic].applyDynamic("shortestLineTo")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline]
    inline def shortestLineTo(
      shapeA: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: typings.bingmaps.Microsoft.Maps.Location
    ): typings.bingmaps.Microsoft.Maps.Polyline = (^.asInstanceOf[js.Dynamic].applyDynamic("shortestLineTo")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline]
    inline def shortestLineTo(
      shapeA: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: typings.bingmaps.Microsoft.Maps.Location,
      options: IPolylineOptions
    ): typings.bingmaps.Microsoft.Maps.Polyline = (^.asInstanceOf[js.Dynamic].applyDynamic("shortestLineTo")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline]
    inline def shortestLineTo(shapeA: IPrimitive, shapeB: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive]): typings.bingmaps.Microsoft.Maps.Polyline = (^.asInstanceOf[js.Dynamic].applyDynamic("shortestLineTo")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline]
    inline def shortestLineTo(
      shapeA: IPrimitive,
      shapeB: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      options: IPolylineOptions
    ): typings.bingmaps.Microsoft.Maps.Polyline = (^.asInstanceOf[js.Dynamic].applyDynamic("shortestLineTo")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline]
    inline def shortestLineTo(shapeA: IPrimitive, shapeB: IPrimitive): typings.bingmaps.Microsoft.Maps.Polyline = (^.asInstanceOf[js.Dynamic].applyDynamic("shortestLineTo")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline]
    inline def shortestLineTo(shapeA: IPrimitive, shapeB: IPrimitive, options: IPolylineOptions): typings.bingmaps.Microsoft.Maps.Polyline = (^.asInstanceOf[js.Dynamic].applyDynamic("shortestLineTo")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline]
    inline def shortestLineTo(shapeA: IPrimitive, shapeB: typings.bingmaps.Microsoft.Maps.Location): typings.bingmaps.Microsoft.Maps.Polyline = (^.asInstanceOf[js.Dynamic].applyDynamic("shortestLineTo")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline]
    inline def shortestLineTo(shapeA: IPrimitive, shapeB: typings.bingmaps.Microsoft.Maps.Location, options: IPolylineOptions): typings.bingmaps.Microsoft.Maps.Polyline = (^.asInstanceOf[js.Dynamic].applyDynamic("shortestLineTo")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline]
    inline def shortestLineTo(
      shapeA: typings.bingmaps.Microsoft.Maps.Location,
      shapeB: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive]
    ): typings.bingmaps.Microsoft.Maps.Polyline = (^.asInstanceOf[js.Dynamic].applyDynamic("shortestLineTo")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline]
    inline def shortestLineTo(
      shapeA: typings.bingmaps.Microsoft.Maps.Location,
      shapeB: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      options: IPolylineOptions
    ): typings.bingmaps.Microsoft.Maps.Polyline = (^.asInstanceOf[js.Dynamic].applyDynamic("shortestLineTo")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline]
    inline def shortestLineTo(shapeA: typings.bingmaps.Microsoft.Maps.Location, shapeB: IPrimitive): typings.bingmaps.Microsoft.Maps.Polyline = (^.asInstanceOf[js.Dynamic].applyDynamic("shortestLineTo")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline]
    inline def shortestLineTo(shapeA: typings.bingmaps.Microsoft.Maps.Location, shapeB: IPrimitive, options: IPolylineOptions): typings.bingmaps.Microsoft.Maps.Polyline = (^.asInstanceOf[js.Dynamic].applyDynamic("shortestLineTo")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline]
    inline def shortestLineTo(shapeA: typings.bingmaps.Microsoft.Maps.Location, shapeB: typings.bingmaps.Microsoft.Maps.Location): typings.bingmaps.Microsoft.Maps.Polyline = (^.asInstanceOf[js.Dynamic].applyDynamic("shortestLineTo")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline]
    inline def shortestLineTo(
      shapeA: typings.bingmaps.Microsoft.Maps.Location,
      shapeB: typings.bingmaps.Microsoft.Maps.Location,
      options: IPolylineOptions
    ): typings.bingmaps.Microsoft.Maps.Polyline = (^.asInstanceOf[js.Dynamic].applyDynamic("shortestLineTo")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline]
    
    inline def snapLocationsToShape(locs: js.Array[typings.bingmaps.Microsoft.Maps.Location], shape: js.Array[IPrimitive]): typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("snapLocationsToShape")(locs.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location]]
    inline def snapLocationsToShape(
      locs: js.Array[typings.bingmaps.Microsoft.Maps.Location],
      shape: js.Array[IPrimitive],
      tolerance: Double
    ): typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("snapLocationsToShape")(locs.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location]]
    inline def snapLocationsToShape(
      locs: js.Array[typings.bingmaps.Microsoft.Maps.Location],
      shape: js.Array[IPrimitive],
      tolerance: Double,
      toleranceUnits: DistanceUnits
    ): typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("snapLocationsToShape")(locs.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any], toleranceUnits.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location]]
    inline def snapLocationsToShape(
      locs: js.Array[typings.bingmaps.Microsoft.Maps.Location],
      shape: js.Array[IPrimitive],
      tolerance: Unit,
      toleranceUnits: DistanceUnits
    ): typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("snapLocationsToShape")(locs.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any], toleranceUnits.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location]]
    inline def snapLocationsToShape(locs: js.Array[typings.bingmaps.Microsoft.Maps.Location], shape: IPrimitive): typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("snapLocationsToShape")(locs.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location]]
    inline def snapLocationsToShape(locs: js.Array[typings.bingmaps.Microsoft.Maps.Location], shape: IPrimitive, tolerance: Double): typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("snapLocationsToShape")(locs.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location]]
    inline def snapLocationsToShape(
      locs: js.Array[typings.bingmaps.Microsoft.Maps.Location],
      shape: IPrimitive,
      tolerance: Double,
      toleranceUnits: DistanceUnits
    ): typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("snapLocationsToShape")(locs.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any], toleranceUnits.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location]]
    inline def snapLocationsToShape(
      locs: js.Array[typings.bingmaps.Microsoft.Maps.Location],
      shape: IPrimitive,
      tolerance: Unit,
      toleranceUnits: DistanceUnits
    ): typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("snapLocationsToShape")(locs.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any], toleranceUnits.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location]]
    inline def snapLocationsToShape(locs: typings.bingmaps.Microsoft.Maps.Location, shape: js.Array[IPrimitive]): typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("snapLocationsToShape")(locs.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location]]
    inline def snapLocationsToShape(locs: typings.bingmaps.Microsoft.Maps.Location, shape: js.Array[IPrimitive], tolerance: Double): typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("snapLocationsToShape")(locs.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location]]
    inline def snapLocationsToShape(
      locs: typings.bingmaps.Microsoft.Maps.Location,
      shape: js.Array[IPrimitive],
      tolerance: Double,
      toleranceUnits: DistanceUnits
    ): typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("snapLocationsToShape")(locs.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any], toleranceUnits.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location]]
    inline def snapLocationsToShape(
      locs: typings.bingmaps.Microsoft.Maps.Location,
      shape: js.Array[IPrimitive],
      tolerance: Unit,
      toleranceUnits: DistanceUnits
    ): typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("snapLocationsToShape")(locs.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any], toleranceUnits.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location]]
    inline def snapLocationsToShape(locs: typings.bingmaps.Microsoft.Maps.Location, shape: IPrimitive): typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("snapLocationsToShape")(locs.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location]]
    inline def snapLocationsToShape(locs: typings.bingmaps.Microsoft.Maps.Location, shape: IPrimitive, tolerance: Double): typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("snapLocationsToShape")(locs.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location]]
    inline def snapLocationsToShape(
      locs: typings.bingmaps.Microsoft.Maps.Location,
      shape: IPrimitive,
      tolerance: Double,
      toleranceUnits: DistanceUnits
    ): typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("snapLocationsToShape")(locs.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any], toleranceUnits.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location]]
    inline def snapLocationsToShape(
      locs: typings.bingmaps.Microsoft.Maps.Location,
      shape: IPrimitive,
      tolerance: Unit,
      toleranceUnits: DistanceUnits
    ): typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("snapLocationsToShape")(locs.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any], toleranceUnits.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location]]
    
    inline def snapShapeToShape(shapeToSnap: js.Array[IPrimitive], shape: js.Array[IPrimitive]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("snapShapeToShape")(shapeToSnap.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def snapShapeToShape(shapeToSnap: js.Array[IPrimitive], shape: js.Array[IPrimitive], tolerance: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("snapShapeToShape")(shapeToSnap.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def snapShapeToShape(
      shapeToSnap: js.Array[IPrimitive],
      shape: js.Array[IPrimitive],
      tolerance: Double,
      toleranceUnits: DistanceUnits
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("snapShapeToShape")(shapeToSnap.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any], toleranceUnits.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def snapShapeToShape(
      shapeToSnap: js.Array[IPrimitive],
      shape: js.Array[IPrimitive],
      tolerance: Unit,
      toleranceUnits: DistanceUnits
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("snapShapeToShape")(shapeToSnap.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any], toleranceUnits.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def snapShapeToShape(shapeToSnap: js.Array[IPrimitive], shape: IPrimitive): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("snapShapeToShape")(shapeToSnap.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def snapShapeToShape(shapeToSnap: js.Array[IPrimitive], shape: IPrimitive, tolerance: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("snapShapeToShape")(shapeToSnap.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def snapShapeToShape(
      shapeToSnap: js.Array[IPrimitive],
      shape: IPrimitive,
      tolerance: Double,
      toleranceUnits: DistanceUnits
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("snapShapeToShape")(shapeToSnap.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any], toleranceUnits.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def snapShapeToShape(
      shapeToSnap: js.Array[IPrimitive],
      shape: IPrimitive,
      tolerance: Unit,
      toleranceUnits: DistanceUnits
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("snapShapeToShape")(shapeToSnap.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any], toleranceUnits.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def snapShapeToShape(shapeToSnap: IPrimitive, shape: js.Array[IPrimitive]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("snapShapeToShape")(shapeToSnap.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def snapShapeToShape(shapeToSnap: IPrimitive, shape: js.Array[IPrimitive], tolerance: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("snapShapeToShape")(shapeToSnap.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def snapShapeToShape(
      shapeToSnap: IPrimitive,
      shape: js.Array[IPrimitive],
      tolerance: Double,
      toleranceUnits: DistanceUnits
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("snapShapeToShape")(shapeToSnap.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any], toleranceUnits.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def snapShapeToShape(
      shapeToSnap: IPrimitive,
      shape: js.Array[IPrimitive],
      tolerance: Unit,
      toleranceUnits: DistanceUnits
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("snapShapeToShape")(shapeToSnap.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any], toleranceUnits.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def snapShapeToShape(shapeToSnap: IPrimitive, shape: IPrimitive): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("snapShapeToShape")(shapeToSnap.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def snapShapeToShape(shapeToSnap: IPrimitive, shape: IPrimitive, tolerance: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("snapShapeToShape")(shapeToSnap.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def snapShapeToShape(shapeToSnap: IPrimitive, shape: IPrimitive, tolerance: Double, toleranceUnits: DistanceUnits): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("snapShapeToShape")(shapeToSnap.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any], toleranceUnits.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def snapShapeToShape(shapeToSnap: IPrimitive, shape: IPrimitive, tolerance: Unit, toleranceUnits: DistanceUnits): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("snapShapeToShape")(shapeToSnap.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any], toleranceUnits.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def symDifference(shapeA: js.Array[IPrimitive], shapeB: js.Array[IPrimitive]): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("symDifference")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def symDifference(shapeA: js.Array[IPrimitive], shapeB: IPrimitive): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("symDifference")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def symDifference(shapeA: IPrimitive, shapeB: js.Array[IPrimitive]): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("symDifference")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def symDifference(shapeA: IPrimitive, shapeB: IPrimitive): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("symDifference")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    
    inline def union(shapeA: js.Array[IPrimitive], shapeB: js.Array[IPrimitive]): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def union(shapeA: js.Array[IPrimitive], shapeB: IPrimitive): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def union(shapeA: IPrimitive, shapeB: js.Array[IPrimitive]): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    inline def union(shapeA: IPrimitive, shapeB: IPrimitive): IPrimitive | js.Array[IPrimitive] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    
    inline def unionAggregate(shapes: js.Array[IPrimitive]): IPrimitive | js.Array[IPrimitive] = ^.asInstanceOf[js.Dynamic].applyDynamic("unionAggregate")(shapes.asInstanceOf[js.Any]).asInstanceOf[IPrimitive | js.Array[IPrimitive]]
    
    inline def voronoiDiagram(shapes: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive]): js.Array[typings.bingmaps.Microsoft.Maps.Polygon] = ^.asInstanceOf[js.Dynamic].applyDynamic("voronoiDiagram")(shapes.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Polygon]]
    inline def voronoiDiagram(
      shapes: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      clipRegion: Unit,
      options: IPolygonOptions
    ): js.Array[typings.bingmaps.Microsoft.Maps.Polygon] = (^.asInstanceOf[js.Dynamic].applyDynamic("voronoiDiagram")(shapes.asInstanceOf[js.Any], clipRegion.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Polygon]]
    inline def voronoiDiagram(
      shapes: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      clipRegion: typings.bingmaps.Microsoft.Maps.LocationRect
    ): js.Array[typings.bingmaps.Microsoft.Maps.Polygon] = (^.asInstanceOf[js.Dynamic].applyDynamic("voronoiDiagram")(shapes.asInstanceOf[js.Any], clipRegion.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Polygon]]
    inline def voronoiDiagram(
      shapes: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      clipRegion: typings.bingmaps.Microsoft.Maps.LocationRect,
      options: IPolygonOptions
    ): js.Array[typings.bingmaps.Microsoft.Maps.Polygon] = (^.asInstanceOf[js.Dynamic].applyDynamic("voronoiDiagram")(shapes.asInstanceOf[js.Any], clipRegion.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Polygon]]
    inline def voronoiDiagram(
      shapes: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      clipRegion: typings.bingmaps.Microsoft.Maps.Polygon
    ): js.Array[typings.bingmaps.Microsoft.Maps.Polygon] = (^.asInstanceOf[js.Dynamic].applyDynamic("voronoiDiagram")(shapes.asInstanceOf[js.Any], clipRegion.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Polygon]]
    inline def voronoiDiagram(
      shapes: js.Array[typings.bingmaps.Microsoft.Maps.Location | IPrimitive],
      clipRegion: typings.bingmaps.Microsoft.Maps.Polygon,
      options: IPolygonOptions
    ): js.Array[typings.bingmaps.Microsoft.Maps.Polygon] = (^.asInstanceOf[js.Dynamic].applyDynamic("voronoiDiagram")(shapes.asInstanceOf[js.Any], clipRegion.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Polygon]]
    inline def voronoiDiagram(shapes: IPrimitive): js.Array[typings.bingmaps.Microsoft.Maps.Polygon] = ^.asInstanceOf[js.Dynamic].applyDynamic("voronoiDiagram")(shapes.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Polygon]]
    inline def voronoiDiagram(shapes: IPrimitive, clipRegion: Unit, options: IPolygonOptions): js.Array[typings.bingmaps.Microsoft.Maps.Polygon] = (^.asInstanceOf[js.Dynamic].applyDynamic("voronoiDiagram")(shapes.asInstanceOf[js.Any], clipRegion.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Polygon]]
    inline def voronoiDiagram(shapes: IPrimitive, clipRegion: typings.bingmaps.Microsoft.Maps.LocationRect): js.Array[typings.bingmaps.Microsoft.Maps.Polygon] = (^.asInstanceOf[js.Dynamic].applyDynamic("voronoiDiagram")(shapes.asInstanceOf[js.Any], clipRegion.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Polygon]]
    inline def voronoiDiagram(
      shapes: IPrimitive,
      clipRegion: typings.bingmaps.Microsoft.Maps.LocationRect,
      options: IPolygonOptions
    ): js.Array[typings.bingmaps.Microsoft.Maps.Polygon] = (^.asInstanceOf[js.Dynamic].applyDynamic("voronoiDiagram")(shapes.asInstanceOf[js.Any], clipRegion.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Polygon]]
    inline def voronoiDiagram(shapes: IPrimitive, clipRegion: typings.bingmaps.Microsoft.Maps.Polygon): js.Array[typings.bingmaps.Microsoft.Maps.Polygon] = (^.asInstanceOf[js.Dynamic].applyDynamic("voronoiDiagram")(shapes.asInstanceOf[js.Any], clipRegion.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Polygon]]
    inline def voronoiDiagram(shapes: IPrimitive, clipRegion: typings.bingmaps.Microsoft.Maps.Polygon, options: IPolygonOptions): js.Array[typings.bingmaps.Microsoft.Maps.Polygon] = (^.asInstanceOf[js.Dynamic].applyDynamic("voronoiDiagram")(shapes.asInstanceOf[js.Any], clipRegion.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Polygon]]
    inline def voronoiDiagram(shapes: typings.bingmaps.Microsoft.Maps.Location): js.Array[typings.bingmaps.Microsoft.Maps.Polygon] = ^.asInstanceOf[js.Dynamic].applyDynamic("voronoiDiagram")(shapes.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Polygon]]
    inline def voronoiDiagram(shapes: typings.bingmaps.Microsoft.Maps.Location, clipRegion: Unit, options: IPolygonOptions): js.Array[typings.bingmaps.Microsoft.Maps.Polygon] = (^.asInstanceOf[js.Dynamic].applyDynamic("voronoiDiagram")(shapes.asInstanceOf[js.Any], clipRegion.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Polygon]]
    inline def voronoiDiagram(
      shapes: typings.bingmaps.Microsoft.Maps.Location,
      clipRegion: typings.bingmaps.Microsoft.Maps.LocationRect
    ): js.Array[typings.bingmaps.Microsoft.Maps.Polygon] = (^.asInstanceOf[js.Dynamic].applyDynamic("voronoiDiagram")(shapes.asInstanceOf[js.Any], clipRegion.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Polygon]]
    inline def voronoiDiagram(
      shapes: typings.bingmaps.Microsoft.Maps.Location,
      clipRegion: typings.bingmaps.Microsoft.Maps.LocationRect,
      options: IPolygonOptions
    ): js.Array[typings.bingmaps.Microsoft.Maps.Polygon] = (^.asInstanceOf[js.Dynamic].applyDynamic("voronoiDiagram")(shapes.asInstanceOf[js.Any], clipRegion.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Polygon]]
    inline def voronoiDiagram(
      shapes: typings.bingmaps.Microsoft.Maps.Location,
      clipRegion: typings.bingmaps.Microsoft.Maps.Polygon
    ): js.Array[typings.bingmaps.Microsoft.Maps.Polygon] = (^.asInstanceOf[js.Dynamic].applyDynamic("voronoiDiagram")(shapes.asInstanceOf[js.Any], clipRegion.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Polygon]]
    inline def voronoiDiagram(
      shapes: typings.bingmaps.Microsoft.Maps.Location,
      clipRegion: typings.bingmaps.Microsoft.Maps.Polygon,
      options: IPolygonOptions
    ): js.Array[typings.bingmaps.Microsoft.Maps.Polygon] = (^.asInstanceOf[js.Dynamic].applyDynamic("voronoiDiagram")(shapes.asInstanceOf[js.Any], clipRegion.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Polygon]]
  }
  
  //////////////////////////////////////////////
  /// Tile Calculations
  //////////////////////////////////////////////
  /**
  * A colleciton of mathematical algorithms based on the tile pyramid used by Bign Maps.
  * @requires The Microsoft.Maps.SpatialMath module.
  */
  object Tiles {
    
    @JSGlobal("Microsoft.Maps.SpatialMath.Tiles")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getTilesInBounds(bounds: typings.bingmaps.Microsoft.Maps.LocationRect, zoom: Double): js.Array[typings.bingmaps.Microsoft.Maps.PyramidTileId] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTilesInBounds")(bounds.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.PyramidTileId]]
    
    inline def globalPixelToLocation(point: typings.bingmaps.Microsoft.Maps.Point, zoom: Double): typings.bingmaps.Microsoft.Maps.Location = (^.asInstanceOf[js.Dynamic].applyDynamic("globalPixelToLocation")(point.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Location]
    
    inline def globalPixelToTile(pixel: typings.bingmaps.Microsoft.Maps.Point, zoom: Double): typings.bingmaps.Microsoft.Maps.PyramidTileId = (^.asInstanceOf[js.Dynamic].applyDynamic("globalPixelToTile")(pixel.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.PyramidTileId]
    
    inline def groundResolution(latitude: Double, zoom: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("groundResolution")(latitude.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def groundResolution(latitude: Double, zoom: Double, units: DistanceUnits): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("groundResolution")(latitude.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any], units.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def locationToGlobalPixel(loc: typings.bingmaps.Microsoft.Maps.Location, zoom: Double): typings.bingmaps.Microsoft.Maps.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("locationToGlobalPixel")(loc.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Point]
    
    inline def locationToTile(loc: typings.bingmaps.Microsoft.Maps.Location, zoom: Double): typings.bingmaps.Microsoft.Maps.PyramidTileId = (^.asInstanceOf[js.Dynamic].applyDynamic("locationToTile")(loc.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.PyramidTileId]
    
    inline def mapSize(zoom: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mapSize")(zoom.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def tileToGlobalPixel(tile: typings.bingmaps.Microsoft.Maps.PyramidTileId): typings.bingmaps.Microsoft.Maps.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("tileToGlobalPixel")(tile.asInstanceOf[js.Any]).asInstanceOf[typings.bingmaps.Microsoft.Maps.Point]
    
    inline def tileToLocationRect(tile: typings.bingmaps.Microsoft.Maps.PyramidTileId): typings.bingmaps.Microsoft.Maps.LocationRect = ^.asInstanceOf[js.Dynamic].applyDynamic("tileToLocationRect")(tile.asInstanceOf[js.Any]).asInstanceOf[typings.bingmaps.Microsoft.Maps.LocationRect]
  }
  
  inline def convertArea(area: Double, fromUnits: AreaUnits, toUnits: AreaUnits): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("convertArea")(area.asInstanceOf[js.Any], fromUnits.asInstanceOf[js.Any], toUnits.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def convertDistance(distance: Double, fromUnits: DistanceUnits, toUnits: DistanceUnits): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("convertDistance")(distance.asInstanceOf[js.Any], fromUnits.asInstanceOf[js.Any], toUnits.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getCardinalSpline(locations: js.Array[typings.bingmaps.Microsoft.Maps.Location]): js.Array[typings.bingmaps.Microsoft.Maps.Location] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCardinalSpline")(locations.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Location]]
  inline def getCardinalSpline(locations: js.Array[typings.bingmaps.Microsoft.Maps.Location], tension: Double): js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCardinalSpline")(locations.asInstanceOf[js.Any], tension.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Location]]
  inline def getCardinalSpline(locations: js.Array[typings.bingmaps.Microsoft.Maps.Location], tension: Double, nodeSize: Double): js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCardinalSpline")(locations.asInstanceOf[js.Any], tension.asInstanceOf[js.Any], nodeSize.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Location]]
  inline def getCardinalSpline(
    locations: js.Array[typings.bingmaps.Microsoft.Maps.Location],
    tension: Double,
    nodeSize: Double,
    close: Boolean
  ): js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCardinalSpline")(locations.asInstanceOf[js.Any], tension.asInstanceOf[js.Any], nodeSize.asInstanceOf[js.Any], close.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Location]]
  inline def getCardinalSpline(
    locations: js.Array[typings.bingmaps.Microsoft.Maps.Location],
    tension: Double,
    nodeSize: Unit,
    close: Boolean
  ): js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCardinalSpline")(locations.asInstanceOf[js.Any], tension.asInstanceOf[js.Any], nodeSize.asInstanceOf[js.Any], close.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Location]]
  inline def getCardinalSpline(locations: js.Array[typings.bingmaps.Microsoft.Maps.Location], tension: Unit, nodeSize: Double): js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCardinalSpline")(locations.asInstanceOf[js.Any], tension.asInstanceOf[js.Any], nodeSize.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Location]]
  inline def getCardinalSpline(
    locations: js.Array[typings.bingmaps.Microsoft.Maps.Location],
    tension: Unit,
    nodeSize: Double,
    close: Boolean
  ): js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCardinalSpline")(locations.asInstanceOf[js.Any], tension.asInstanceOf[js.Any], nodeSize.asInstanceOf[js.Any], close.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Location]]
  inline def getCardinalSpline(
    locations: js.Array[typings.bingmaps.Microsoft.Maps.Location],
    tension: Unit,
    nodeSize: Unit,
    close: Boolean
  ): js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCardinalSpline")(locations.asInstanceOf[js.Any], tension.asInstanceOf[js.Any], nodeSize.asInstanceOf[js.Any], close.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Location]]
  
  inline def getDestination(origin: typings.bingmaps.Microsoft.Maps.Location, bearing: Double, distance: Double): typings.bingmaps.Microsoft.Maps.Location = (^.asInstanceOf[js.Dynamic].applyDynamic("getDestination")(origin.asInstanceOf[js.Any], bearing.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Location]
  inline def getDestination(
    origin: typings.bingmaps.Microsoft.Maps.Location,
    bearing: Double,
    distance: Double,
    units: DistanceUnits
  ): typings.bingmaps.Microsoft.Maps.Location = (^.asInstanceOf[js.Dynamic].applyDynamic("getDestination")(origin.asInstanceOf[js.Any], bearing.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], units.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Location]
  
  inline def getDistanceTo(
    origin: typings.bingmaps.Microsoft.Maps.Location,
    destination: typings.bingmaps.Microsoft.Maps.Location
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDistanceTo")(origin.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getDistanceTo(
    origin: typings.bingmaps.Microsoft.Maps.Location,
    destination: typings.bingmaps.Microsoft.Maps.Location,
    units: Unit,
    highAccuracy: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDistanceTo")(origin.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], units.asInstanceOf[js.Any], highAccuracy.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getDistanceTo(
    origin: typings.bingmaps.Microsoft.Maps.Location,
    destination: typings.bingmaps.Microsoft.Maps.Location,
    units: DistanceUnits
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDistanceTo")(origin.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], units.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getDistanceTo(
    origin: typings.bingmaps.Microsoft.Maps.Location,
    destination: typings.bingmaps.Microsoft.Maps.Location,
    units: DistanceUnits,
    highAccuracy: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDistanceTo")(origin.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], units.asInstanceOf[js.Any], highAccuracy.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getEarthRadius(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getEarthRadius")().asInstanceOf[Double]
  inline def getEarthRadius(units: DistanceUnits): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getEarthRadius")(units.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getGeodesicPath(path: js.Array[typings.bingmaps.Microsoft.Maps.Location]): js.Array[typings.bingmaps.Microsoft.Maps.Location] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGeodesicPath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Location]]
  inline def getGeodesicPath(path: js.Array[typings.bingmaps.Microsoft.Maps.Location], nodeSize: Double): js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("getGeodesicPath")(path.asInstanceOf[js.Any], nodeSize.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Location]]
  
  inline def getHeading(
    origin: typings.bingmaps.Microsoft.Maps.Location,
    destination: typings.bingmaps.Microsoft.Maps.Location
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeading")(origin.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getLengthOfPath(path: js.Array[typings.bingmaps.Microsoft.Maps.Location]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLengthOfPath")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getLengthOfPath(path: js.Array[typings.bingmaps.Microsoft.Maps.Location], units: Unit, highAccuracy: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getLengthOfPath")(path.asInstanceOf[js.Any], units.asInstanceOf[js.Any], highAccuracy.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getLengthOfPath(path: js.Array[typings.bingmaps.Microsoft.Maps.Location], units: DistanceUnits): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getLengthOfPath")(path.asInstanceOf[js.Any], units.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getLengthOfPath(
    path: js.Array[typings.bingmaps.Microsoft.Maps.Location],
    units: DistanceUnits,
    highAccuracy: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getLengthOfPath")(path.asInstanceOf[js.Any], units.asInstanceOf[js.Any], highAccuracy.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getLocationAlongPath(path: js.Array[typings.bingmaps.Microsoft.Maps.Location], distance: Double): typings.bingmaps.Microsoft.Maps.Location = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocationAlongPath")(path.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Location]
  inline def getLocationAlongPath(path: js.Array[typings.bingmaps.Microsoft.Maps.Location], distance: Double, units: DistanceUnits): typings.bingmaps.Microsoft.Maps.Location = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocationAlongPath")(path.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], units.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Location]
  inline def getLocationAlongPath(path: typings.bingmaps.Microsoft.Maps.Polyline, distance: Double): typings.bingmaps.Microsoft.Maps.Location = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocationAlongPath")(path.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Location]
  inline def getLocationAlongPath(path: typings.bingmaps.Microsoft.Maps.Polyline, distance: Double, units: DistanceUnits): typings.bingmaps.Microsoft.Maps.Location = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocationAlongPath")(path.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], units.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Location]
  
  inline def getRegularPolygon(origin: typings.bingmaps.Microsoft.Maps.Location, radius: Double, numberOfPoints: Double): js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRegularPolygon")(origin.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], numberOfPoints.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Location]]
  inline def getRegularPolygon(
    origin: typings.bingmaps.Microsoft.Maps.Location,
    radius: Double,
    numberOfPoints: Double,
    units: Unit,
    offset: Double
  ): js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRegularPolygon")(origin.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], numberOfPoints.asInstanceOf[js.Any], units.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Location]]
  inline def getRegularPolygon(
    origin: typings.bingmaps.Microsoft.Maps.Location,
    radius: Double,
    numberOfPoints: Double,
    units: DistanceUnits
  ): js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRegularPolygon")(origin.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], numberOfPoints.asInstanceOf[js.Any], units.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Location]]
  inline def getRegularPolygon(
    origin: typings.bingmaps.Microsoft.Maps.Location,
    radius: Double,
    numberOfPoints: Double,
    units: DistanceUnits,
    offset: Double
  ): js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRegularPolygon")(origin.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], numberOfPoints.asInstanceOf[js.Any], units.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.bingmaps.Microsoft.Maps.Location]]
  
  inline def interpolate(
    origin: typings.bingmaps.Microsoft.Maps.Location,
    destination: typings.bingmaps.Microsoft.Maps.Location
  ): typings.bingmaps.Microsoft.Maps.Location = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(origin.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Location]
  inline def interpolate(
    origin: typings.bingmaps.Microsoft.Maps.Location,
    destination: typings.bingmaps.Microsoft.Maps.Location,
    fraction: Double
  ): typings.bingmaps.Microsoft.Maps.Location = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(origin.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], fraction.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Location]
  
  inline def locationRectToPolygon(bounds: typings.bingmaps.Microsoft.Maps.LocationRect): typings.bingmaps.Microsoft.Maps.Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("locationRectToPolygon")(bounds.asInstanceOf[js.Any]).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polygon]
  
  inline def toDegMinSec(loc: typings.bingmaps.Microsoft.Maps.Location): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toDegMinSec")(loc.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def tryParseDegMinSec(input: String): Double | typings.bingmaps.Microsoft.Maps.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("tryParseDegMinSec")(input.asInstanceOf[js.Any]).asInstanceOf[Double | typings.bingmaps.Microsoft.Maps.Location]
}
