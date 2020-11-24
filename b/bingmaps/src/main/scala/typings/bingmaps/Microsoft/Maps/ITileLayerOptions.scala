package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITileLayerOptions extends js.Object {
  
  /**
    * The number of milliseconds allowed for the tile layer image download. If the timeout occurs before the image is fully
    * downloaded, the map control considers the download a failure. The default value is 10000.
    */
  var downloadTimeout: js.UndefOr[Double] = js.native
  
  /** Allow retrieving data from CORS supported server. */
  var enableCORS: js.UndefOr[Boolean] = js.native
  
  /** The tile source for the tile layer. */
  var mercator: js.UndefOr[TileSource] = js.native
  
  /** The opacity of the tile layer, defined by a number between 0 (not visible) and 1. */
  var opacity: js.UndefOr[Double] = js.native
  
  /** Specifies that CORS should be made with the "use-credentials" flag instead of "anonymous". */
  var useCredentialsForCORS: js.UndefOr[Boolean] = js.native
  
  /**
    * A boolean indicating whether to show or hide the tile layer. The default value is true. A value of false indicates that
    * the tile layer is hidden, although it is still an entity on the map.
    */
  var visible: js.UndefOr[Boolean] = js.native
  
  /** The z-index of the tile layer. */
  var zIndex: js.UndefOr[Double] = js.native
}
object ITileLayerOptions {
  
  @scala.inline
  def apply(): ITileLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITileLayerOptions]
  }
  
  @scala.inline
  implicit class ITileLayerOptionsOps[Self <: ITileLayerOptions] (val x: Self) extends AnyVal {
    
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
    def setDownloadTimeout(value: Double): Self = this.set("downloadTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadTimeout: Self = this.set("downloadTimeout", js.undefined)
    
    @scala.inline
    def setEnableCORS(value: Boolean): Self = this.set("enableCORS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCORS: Self = this.set("enableCORS", js.undefined)
    
    @scala.inline
    def setMercator(value: TileSource): Self = this.set("mercator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMercator: Self = this.set("mercator", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setUseCredentialsForCORS(value: Boolean): Self = this.set("useCredentialsForCORS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCredentialsForCORS: Self = this.set("useCredentialsForCORS", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
