package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostModuleAction extends StObject {
  
  /** A URL to load the data layer from. Currently supports data in GeoJSON, GeoRSS (with inline GML), GPX, KML, and KMZ formats. */
  var addLayerFromUrl: String
  
  /** Options to use when loading data via the GeoJson module. */
  var geoJsonOption: js.UndefOr[IGeoJsonReadOptions] = js.undefined
  
  /** Options to use when loading data via the GeoXml module. */
  var geoXmlOption: js.UndefOr[IGeoXmlLayerOptions] = js.undefined
}
object PostModuleAction {
  
  inline def apply(addLayerFromUrl: String): PostModuleAction = {
    val __obj = js.Dynamic.literal(addLayerFromUrl = addLayerFromUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostModuleAction]
  }
  
  extension [Self <: PostModuleAction](x: Self) {
    
    inline def setAddLayerFromUrl(value: String): Self = StObject.set(x, "addLayerFromUrl", value.asInstanceOf[js.Any])
    
    inline def setGeoJsonOption(value: IGeoJsonReadOptions): Self = StObject.set(x, "geoJsonOption", value.asInstanceOf[js.Any])
    
    inline def setGeoJsonOptionUndefined: Self = StObject.set(x, "geoJsonOption", js.undefined)
    
    inline def setGeoXmlOption(value: IGeoXmlLayerOptions): Self = StObject.set(x, "geoXmlOption", value.asInstanceOf[js.Any])
    
    inline def setGeoXmlOptionUndefined: Self = StObject.set(x, "geoXmlOption", js.undefined)
  }
}
