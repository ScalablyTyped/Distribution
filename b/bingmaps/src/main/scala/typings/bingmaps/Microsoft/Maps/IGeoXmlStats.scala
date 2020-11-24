package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeoXmlStats extends js.Object {
  
  /** The number of characters in the XML feed. */
  var fileSize: Double = js.native
  
  /** Number of Ground Overlays in the XML feed. */
  var numGroundOverlays: Double = js.native
  
  /** Number of Microsoft.Maps.Location objects in the XML feed. */
  var numLocations: Double = js.native
  
  /** The number of network links in the XML feed. */
  var numNetworkLinks: Double = js.native
  
  /** Number of Microsoft.Maps.Polygons objects in the XML feed. */
  var numPolygons: Double = js.native
  
  /** Number of Microsoft.Maps.Polylines objects in the XML feed. */
  var numPolylines: Double = js.native
  
  /** Number of Microsoft.Maps.Pushpins objects in the XML feed. */
  var numPushpins: Double = js.native
  
  /** Number of Screen Overlays in the XML feed. */
  var numScreenOverlays: Double = js.native
  
  /** The amount of time in ms it took to process the XML feed. */
  var processingTime: Double = js.native
}
object IGeoXmlStats {
  
  @scala.inline
  def apply(
    fileSize: Double,
    numGroundOverlays: Double,
    numLocations: Double,
    numNetworkLinks: Double,
    numPolygons: Double,
    numPolylines: Double,
    numPushpins: Double,
    numScreenOverlays: Double,
    processingTime: Double
  ): IGeoXmlStats = {
    val __obj = js.Dynamic.literal(fileSize = fileSize.asInstanceOf[js.Any], numGroundOverlays = numGroundOverlays.asInstanceOf[js.Any], numLocations = numLocations.asInstanceOf[js.Any], numNetworkLinks = numNetworkLinks.asInstanceOf[js.Any], numPolygons = numPolygons.asInstanceOf[js.Any], numPolylines = numPolylines.asInstanceOf[js.Any], numPushpins = numPushpins.asInstanceOf[js.Any], numScreenOverlays = numScreenOverlays.asInstanceOf[js.Any], processingTime = processingTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoXmlStats]
  }
  
  @scala.inline
  implicit class IGeoXmlStatsOps[Self <: IGeoXmlStats] (val x: Self) extends AnyVal {
    
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
    def setFileSize(value: Double): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumGroundOverlays(value: Double): Self = this.set("numGroundOverlays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumLocations(value: Double): Self = this.set("numLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumNetworkLinks(value: Double): Self = this.set("numNetworkLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumPolygons(value: Double): Self = this.set("numPolygons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumPolylines(value: Double): Self = this.set("numPolylines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumPushpins(value: Double): Self = this.set("numPushpins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumScreenOverlays(value: Double): Self = this.set("numScreenOverlays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingTime(value: Double): Self = this.set("processingTime", value.asInstanceOf[js.Any])
  }
}
