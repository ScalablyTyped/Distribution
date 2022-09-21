package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapConfiguration extends StObject {
  
  /**
    * Specifies the map style selected from an available data provider. Valid Esri map styles:    VectorEsriDarkGrayCanvas – The Esri Dark Gray Canvas map style. A vector basemap with a dark gray, neutral background with minimal colors, labels, and features that's designed to draw attention to your thematic content.     RasterEsriImagery – The Esri Imagery map style. A raster basemap that provides one meter or better satellite and aerial imagery in many parts of the world and lower resolution satellite imagery worldwide.     VectorEsriLightGrayCanvas – The Esri Light Gray Canvas map style, which provides a detailed vector basemap with a light gray, neutral background style with minimal colors, labels, and features that's designed to draw attention to your thematic content.     VectorEsriTopographic – The Esri Light map style, which provides a detailed vector basemap with a classic Esri map style.    VectorEsriStreets – The Esri World Streets map style, which provides a detailed vector basemap for the world symbolized with a classic Esri street map style. The vector tile layer is similar in content and style to the World Street Map raster map.    VectorEsriNavigation – The Esri World Navigation map style, which provides a detailed basemap for the world symbolized with a custom navigation map style that's designed for use during the day in mobile devices.   Valid HERE Technologies map styles:    VectorHereContrast – The HERE Contrast (Berlin) map style is a high contrast detailed base map of the world that blends 3D and 2D rendering.    VectorHereExplore – A default HERE map style containing a neutral, global map and its features including roads, buildings, landmarks, and water features. It also now includes a fully designed map of Japan.    VectorHereExploreTruck – A global map containing truck restrictions and attributes (e.g. width / height / HAZMAT) symbolized with highlighted segments and icons on top of HERE Explore to support use cases within transport and logistics.    The VectorHereContrast style has been renamed from VectorHereBerlin. VectorHereBerlin has been deprecated, but will continue to work in applications that use it. 
    */
  var Style: MapStyle
}
object MapConfiguration {
  
  inline def apply(Style: MapStyle): MapConfiguration = {
    val __obj = js.Dynamic.literal(Style = Style.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapConfiguration]
  }
  
  extension [Self <: MapConfiguration](x: Self) {
    
    inline def setStyle(value: MapStyle): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
  }
}
