package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PostModuleAction extends js.Object {
  /** A URL to load the data layer from. Currently supports data in GeoJSON, GeoRSS (with inline GML), GPX, KML, and KMZ formats. */
  var addLayerFromUrl: java.lang.String
  /** Options to use when loading data via the GeoJson module. */
  var geoJsonOption: js.UndefOr[IGeoJsonReadOptions] = js.undefined
  /** Options to use when loading data via the GeoXml module. */
  var geoXmlOption: js.UndefOr[IGeoXmlLayerOptions] = js.undefined
}

