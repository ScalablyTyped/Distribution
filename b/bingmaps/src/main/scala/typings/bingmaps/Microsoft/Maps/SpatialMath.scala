package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This module provides a bunch of useful spatial math calculations.
  * @requires The Microsoft.Maps.SpatialMath module.
  */
object SpatialMath {
  
  @js.native
  sealed trait AreaUnits extends StObject
  @JSGlobal("Microsoft.Maps.SpatialMath.AreaUnits")
  @js.native
  object AreaUnits extends StObject {
    
    /** Area in Acres */
    @js.native
    sealed trait Acres
      extends StObject
         with AreaUnits
    
    /** Area in Hectares */
    @js.native
    sealed trait Hectares
      extends StObject
         with AreaUnits
    
    /** Area in square Feet */
    @js.native
    sealed trait SquareFeet
      extends StObject
         with AreaUnits
    
    /** Area in square kilometers */
    @js.native
    sealed trait SquareKilometers
      extends StObject
         with AreaUnits
    
    /** Area in square meters */
    @js.native
    sealed trait SquareMeters
      extends StObject
         with AreaUnits
    
    /** Area in square miles */
    @js.native
    sealed trait SquareMiles
      extends StObject
         with AreaUnits
    
    /** Area in square Yards */
    @js.native
    sealed trait SquareYards
      extends StObject
         with AreaUnits
  }
  
  @js.native
  sealed trait DistanceUnits extends StObject
  @JSGlobal("Microsoft.Maps.SpatialMath.DistanceUnits")
  @js.native
  object DistanceUnits extends StObject {
    
    /** A distance in Feet */
    @js.native
    sealed trait Feet
      extends StObject
         with DistanceUnits
    
    /** A distance in kilometers */
    @js.native
    sealed trait Kilometers
      extends StObject
         with DistanceUnits
    
    /** A distance in meters */
    @js.native
    sealed trait Meters
      extends StObject
         with DistanceUnits
    
    /** A distance in miles */
    @js.native
    sealed trait Miles
      extends StObject
         with DistanceUnits
    
    /** A distance in Nautical Miles */
    @js.native
    sealed trait NauticalMiles
      extends StObject
         with DistanceUnits
    
    /** A distance in Yards */
    @js.native
    sealed trait Yards
      extends StObject
         with DistanceUnits
  }
  
  //////////////////////////////////////////////
  /// Geometry Calculations
  //////////////////////////////////////////////
  /**
  * A colleciton of geometry calculations that can be performed against Bing Maps shapes.
  * @requires The Microsoft.Maps.SpatialMath module.
  */
  object Geometry {
    
    @js.native
    sealed trait BufferEndCap extends StObject
    @JSGlobal("Microsoft.Maps.SpatialMath.Geometry.BufferEndCap")
    @js.native
    object BufferEndCap extends StObject {
      
      /** Adds a flat end to a buffered line that touches the end of the line. */
      @js.native
      sealed trait Flat
        extends StObject
           with BufferEndCap
      
      /** Adds a rounded end to a buffered line. */
      @js.native
      sealed trait Round
        extends StObject
           with BufferEndCap
      
      /** Adds a square end to a buffered line that has a buffer area at the end of the line. */
      @js.native
      sealed trait Square
        extends StObject
           with BufferEndCap
    }
  }
}
