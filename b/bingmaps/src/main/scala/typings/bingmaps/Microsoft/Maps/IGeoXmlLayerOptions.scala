package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeoXmlLayerOptions extends IGeoXmlReadOptions {
  
  /** A boolean indicating if the map should automatically upate the view when a data set is loaded. Default: true */
  var autoUpdateMapView: js.UndefOr[Boolean] = js.native
  
  /** Options used to customize how the default infobox renders. */
  var infoboxOptions: js.UndefOr[IInfoboxOptions] = js.native
  
  /** An optional name to identify the layer by. */
  var layerName: js.UndefOr[String] = js.native
  
  /** A boolean indicating if infoboxes should automatically appear when shapes clicked. Default: false */
  var suppressInfoboxes: js.UndefOr[Boolean] = js.native
  
  /** A boolean indicating if the layer is visible or not. Default: true */
  var visible: js.UndefOr[Boolean] = js.native
}
object IGeoXmlLayerOptions {
  
  @scala.inline
  def apply(): IGeoXmlLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeoXmlLayerOptions]
  }
  
  @scala.inline
  implicit class IGeoXmlLayerOptionsOps[Self <: IGeoXmlLayerOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoUpdateMapView(value: Boolean): Self = this.set("autoUpdateMapView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoUpdateMapView: Self = this.set("autoUpdateMapView", js.undefined)
    
    @scala.inline
    def setInfoboxOptions(value: IInfoboxOptions): Self = this.set("infoboxOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfoboxOptions: Self = this.set("infoboxOptions", js.undefined)
    
    @scala.inline
    def setLayerName(value: String): Self = this.set("layerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayerName: Self = this.set("layerName", js.undefined)
    
    @scala.inline
    def setSuppressInfoboxes(value: Boolean): Self = this.set("suppressInfoboxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressInfoboxes: Self = this.set("suppressInfoboxes", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
