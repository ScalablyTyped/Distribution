package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeoXmlDataSet extends StObject {
  
  /**
    * An array of layers that are in the XML document.
    * In shapes in KML that are in a child documents and folders of the main document or folder are grouped together in a data Layer.
    * KML also supports GroundOverlay.
    */
  var layers: js.UndefOr[js.Array[Layer | GroundOverlay]] = js.undefined
  
  /**
    * An array of screen overlays that have been parsed from a KML file.
    */
  var screenOverlays: js.UndefOr[js.Array[KmlScreenOverlay]] = js.undefined
  
  /** An array of shapes that are in the XML document. */
  var shapes: js.UndefOr[js.Array[IPrimitive]] = js.undefined
  
  /**
    * Statistics about the content and processing time of a XML feed.
    */
  var stats: js.UndefOr[IGeoXmlStats] = js.undefined
  
  /**
    * Summary metadata provided at the document level of the XML feed data set.
    */
  var summary: js.UndefOr[IGeoXmlSummaryMetadata] = js.undefined
}
object IGeoXmlDataSet {
  
  inline def apply(): IGeoXmlDataSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeoXmlDataSet]
  }
  
  extension [Self <: IGeoXmlDataSet](x: Self) {
    
    inline def setLayers(value: js.Array[Layer | GroundOverlay]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: (Layer | GroundOverlay)*): Self = StObject.set(x, "layers", js.Array(value :_*))
    
    inline def setScreenOverlays(value: js.Array[KmlScreenOverlay]): Self = StObject.set(x, "screenOverlays", value.asInstanceOf[js.Any])
    
    inline def setScreenOverlaysUndefined: Self = StObject.set(x, "screenOverlays", js.undefined)
    
    inline def setScreenOverlaysVarargs(value: KmlScreenOverlay*): Self = StObject.set(x, "screenOverlays", js.Array(value :_*))
    
    inline def setShapes(value: js.Array[IPrimitive]): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
    
    inline def setShapesUndefined: Self = StObject.set(x, "shapes", js.undefined)
    
    inline def setShapesVarargs(value: IPrimitive*): Self = StObject.set(x, "shapes", js.Array(value :_*))
    
    inline def setStats(value: IGeoXmlStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setSummary(value: IGeoXmlSummaryMetadata): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
