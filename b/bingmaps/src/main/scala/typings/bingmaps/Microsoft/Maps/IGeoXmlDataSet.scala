package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeoXmlDataSet extends StObject {
  
  /**
    * An array of layers that are in the XML document.
    * In shapes in KML that are in a child documents and folders of the main document or folder are grouped together in a data Layer.
    * KML also supports GroundOverlay.
    */
  var layers: js.UndefOr[js.Array[Layer | GroundOverlay]] = js.native
  
  /**
    * An array of screen overlays that have been parsed from a KML file.
    */
  var screenOverlays: js.UndefOr[js.Array[KmlScreenOverlay]] = js.native
  
  /** An array of shapes that are in the XML document. */
  var shapes: js.UndefOr[js.Array[IPrimitive]] = js.native
  
  /**
    * Statistics about the content and processing time of a XML feed.
    */
  var stats: js.UndefOr[IGeoXmlStats] = js.native
  
  /**
    * Summary metadata provided at the document level of the XML feed data set.
    */
  var summary: js.UndefOr[IGeoXmlSummaryMetadata] = js.native
}
object IGeoXmlDataSet {
  
  @scala.inline
  def apply(): IGeoXmlDataSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeoXmlDataSet]
  }
  
  @scala.inline
  implicit class IGeoXmlDataSetMutableBuilder[Self <: IGeoXmlDataSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayers(value: js.Array[Layer | GroundOverlay]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: (Layer | GroundOverlay)*): Self = StObject.set(x, "layers", js.Array(value :_*))
    
    @scala.inline
    def setScreenOverlays(value: js.Array[KmlScreenOverlay]): Self = StObject.set(x, "screenOverlays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenOverlaysUndefined: Self = StObject.set(x, "screenOverlays", js.undefined)
    
    @scala.inline
    def setScreenOverlaysVarargs(value: KmlScreenOverlay*): Self = StObject.set(x, "screenOverlays", js.Array(value :_*))
    
    @scala.inline
    def setShapes(value: js.Array[IPrimitive]): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapesUndefined: Self = StObject.set(x, "shapes", js.undefined)
    
    @scala.inline
    def setShapesVarargs(value: IPrimitive*): Self = StObject.set(x, "shapes", js.Array(value :_*))
    
    @scala.inline
    def setStats(value: IGeoXmlStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    @scala.inline
    def setSummary(value: IGeoXmlSummaryMetadata): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
