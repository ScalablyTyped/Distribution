package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostModuleAction extends js.Object {
  
  /** A URL to load the data layer from. Currently supports data in GeoJSON, GeoRSS (with inline GML), GPX, KML, and KMZ formats. */
  var addLayerFromUrl: String = js.native
  
  /** Options to use when loading data via the GeoJson module. */
  var geoJsonOption: js.UndefOr[IGeoJsonReadOptions] = js.native
  
  /** Options to use when loading data via the GeoXml module. */
  var geoXmlOption: js.UndefOr[IGeoXmlLayerOptions] = js.native
}
object PostModuleAction {
  
  @scala.inline
  def apply(addLayerFromUrl: String): PostModuleAction = {
    val __obj = js.Dynamic.literal(addLayerFromUrl = addLayerFromUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostModuleAction]
  }
  
  @scala.inline
  implicit class PostModuleActionOps[Self <: PostModuleAction] (val x: Self) extends AnyVal {
    
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
    def setAddLayerFromUrl(value: String): Self = this.set("addLayerFromUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoJsonOption(value: IGeoJsonReadOptions): Self = this.set("geoJsonOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoJsonOption: Self = this.set("geoJsonOption", js.undefined)
    
    @scala.inline
    def setGeoXmlOption(value: IGeoXmlLayerOptions): Self = this.set("geoXmlOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoXmlOption: Self = this.set("geoXmlOption", js.undefined)
  }
}
