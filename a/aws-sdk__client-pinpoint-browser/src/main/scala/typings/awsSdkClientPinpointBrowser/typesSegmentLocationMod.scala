package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesGpspointdimensionMod.GPSPointDimension
import typings.awsSdkClientPinpointBrowser.typesGpspointdimensionMod.UnmarshalledGPSPointDimension
import typings.awsSdkClientPinpointBrowser.typesSetDimensionMod.SetDimension
import typings.awsSdkClientPinpointBrowser.typesSetDimensionMod.UnmarshalledSetDimension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSegmentLocationMod {
  
  trait SegmentLocation extends StObject {
    
    /**
      * The country or region, in ISO 3166-1 alpha-2 format.
      */
    var Country: js.UndefOr[SetDimension] = js.undefined
    
    /**
      * The GPS Point dimension.
      */
    var GPSPoint: js.UndefOr[GPSPointDimension] = js.undefined
  }
  object SegmentLocation {
    
    inline def apply(): SegmentLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentLocation]
    }
    
    extension [Self <: SegmentLocation](x: Self) {
      
      inline def setCountry(value: SetDimension): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
      
      inline def setGPSPoint(value: GPSPointDimension): Self = StObject.set(x, "GPSPoint", value.asInstanceOf[js.Any])
      
      inline def setGPSPointUndefined: Self = StObject.set(x, "GPSPoint", js.undefined)
    }
  }
  
  trait UnmarshalledSegmentLocation
    extends StObject
       with SegmentLocation {
    
    /**
      * The country or region, in ISO 3166-1 alpha-2 format.
      */
    @JSName("Country")
    var Country_UnmarshalledSegmentLocation: js.UndefOr[UnmarshalledSetDimension] = js.undefined
    
    /**
      * The GPS Point dimension.
      */
    @JSName("GPSPoint")
    var GPSPoint_UnmarshalledSegmentLocation: js.UndefOr[UnmarshalledGPSPointDimension] = js.undefined
  }
  object UnmarshalledSegmentLocation {
    
    inline def apply(): UnmarshalledSegmentLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSegmentLocation]
    }
    
    extension [Self <: UnmarshalledSegmentLocation](x: Self) {
      
      inline def setCountry(value: UnmarshalledSetDimension): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
      
      inline def setGPSPoint(value: UnmarshalledGPSPointDimension): Self = StObject.set(x, "GPSPoint", value.asInstanceOf[js.Any])
      
      inline def setGPSPointUndefined: Self = StObject.set(x, "GPSPoint", js.undefined)
    }
  }
}
