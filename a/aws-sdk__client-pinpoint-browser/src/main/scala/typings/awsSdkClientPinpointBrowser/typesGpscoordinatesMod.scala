package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGpscoordinatesMod {
  
  trait GPSCoordinates extends StObject {
    
    /**
      * Latitude
      */
    var Latitude: js.UndefOr[Double] = js.undefined
    
    /**
      * Longitude
      */
    var Longitude: js.UndefOr[Double] = js.undefined
  }
  object GPSCoordinates {
    
    @scala.inline
    def apply(): GPSCoordinates = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GPSCoordinates]
    }
    
    @scala.inline
    implicit class GPSCoordinatesMutableBuilder[Self <: GPSCoordinates] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLatitude(value: Double): Self = StObject.set(x, "Latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatitudeUndefined: Self = StObject.set(x, "Latitude", js.undefined)
      
      @scala.inline
      def setLongitude(value: Double): Self = StObject.set(x, "Longitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitudeUndefined: Self = StObject.set(x, "Longitude", js.undefined)
    }
  }
  
  type UnmarshalledGPSCoordinates = GPSCoordinates
}
