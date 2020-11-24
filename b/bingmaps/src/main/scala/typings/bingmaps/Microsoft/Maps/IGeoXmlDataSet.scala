package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeoXmlDataSet extends js.Object {
  
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
  implicit class IGeoXmlDataSetOps[Self <: IGeoXmlDataSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLayersVarargs(value: (Layer | GroundOverlay)*): Self = this.set("layers", js.Array(value :_*))
    
    @scala.inline
    def setLayers(value: js.Array[Layer | GroundOverlay]): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    
    @scala.inline
    def setScreenOverlaysVarargs(value: KmlScreenOverlay*): Self = this.set("screenOverlays", js.Array(value :_*))
    
    @scala.inline
    def setScreenOverlays(value: js.Array[KmlScreenOverlay]): Self = this.set("screenOverlays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenOverlays: Self = this.set("screenOverlays", js.undefined)
    
    @scala.inline
    def setShapesVarargs(value: IPrimitive*): Self = this.set("shapes", js.Array(value :_*))
    
    @scala.inline
    def setShapes(value: js.Array[IPrimitive]): Self = this.set("shapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapes: Self = this.set("shapes", js.undefined)
    
    @scala.inline
    def setStats(value: IGeoXmlStats): Self = this.set("stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
    
    @scala.inline
    def setSummary(value: IGeoXmlSummaryMetadata): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
  }
}
