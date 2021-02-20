package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesGpspointdimensionMod.GPSPointDimension
import typings.awsSdkClientPinpointBrowser.typesGpspointdimensionMod.UnmarshalledGPSPointDimension
import typings.awsSdkClientPinpointBrowser.typesSetDimensionMod.SetDimension
import typings.awsSdkClientPinpointBrowser.typesSetDimensionMod.UnmarshalledSetDimension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSegmentLocationMod {
  
  @js.native
  trait SegmentLocation extends StObject {
    
    /**
      * The country or region, in ISO 3166-1 alpha-2 format.
      */
    var Country: js.UndefOr[SetDimension] = js.native
    
    /**
      * The GPS Point dimension.
      */
    var GPSPoint: js.UndefOr[GPSPointDimension] = js.native
  }
  object SegmentLocation {
    
    @scala.inline
    def apply(): SegmentLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentLocation]
    }
    
    @scala.inline
    implicit class SegmentLocationMutableBuilder[Self <: SegmentLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountry(value: SetDimension): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
      
      @scala.inline
      def setGPSPoint(value: GPSPointDimension): Self = StObject.set(x, "GPSPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGPSPointUndefined: Self = StObject.set(x, "GPSPoint", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledSegmentLocation extends SegmentLocation {
    
    /**
      * The country or region, in ISO 3166-1 alpha-2 format.
      */
    @JSName("Country")
    var Country_UnmarshalledSegmentLocation: js.UndefOr[UnmarshalledSetDimension] = js.native
    
    /**
      * The GPS Point dimension.
      */
    @JSName("GPSPoint")
    var GPSPoint_UnmarshalledSegmentLocation: js.UndefOr[UnmarshalledGPSPointDimension] = js.native
  }
  object UnmarshalledSegmentLocation {
    
    @scala.inline
    def apply(): UnmarshalledSegmentLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSegmentLocation]
    }
    
    @scala.inline
    implicit class UnmarshalledSegmentLocationMutableBuilder[Self <: UnmarshalledSegmentLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountry(value: UnmarshalledSetDimension): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
      
      @scala.inline
      def setGPSPoint(value: UnmarshalledGPSPointDimension): Self = StObject.set(x, "GPSPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGPSPointUndefined: Self = StObject.set(x, "GPSPoint", js.undefined)
    }
  }
}
