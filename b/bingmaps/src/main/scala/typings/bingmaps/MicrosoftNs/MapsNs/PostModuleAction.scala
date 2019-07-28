package typings.bingmaps.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostModuleAction extends js.Object {
  /** A URL to load the data layer from. Currently supports data in GeoJSON, GeoRSS (with inline GML), GPX, KML, and KMZ formats. */
  var addLayerFromUrl: String
  /** Options to use when loading data via the GeoJson module. */
  var geoJsonOption: js.UndefOr[IGeoJsonReadOptions] = js.undefined
  /** Options to use when loading data via the GeoXml module. */
  var geoXmlOption: js.UndefOr[IGeoXmlLayerOptions] = js.undefined
}

object PostModuleAction {
  @scala.inline
  def apply(
    addLayerFromUrl: String,
    geoJsonOption: IGeoJsonReadOptions = null,
    geoXmlOption: IGeoXmlLayerOptions = null
  ): PostModuleAction = {
    val __obj = js.Dynamic.literal(addLayerFromUrl = addLayerFromUrl)
    if (geoJsonOption != null) __obj.updateDynamic("geoJsonOption")(geoJsonOption)
    if (geoXmlOption != null) __obj.updateDynamic("geoXmlOption")(geoXmlOption)
    __obj.asInstanceOf[PostModuleAction]
  }
}

