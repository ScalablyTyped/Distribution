package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeoJsonReadOptions extends js.Object {
  /** 
    * If the GeoJSON file is hosted on a different domain, and CORS is not enabled, but does support JSONP,
    * you will need to specify the name of JSONP URL parameter that can be used to download the file across different domains.
    */
  var jsonpQueryParam: js.UndefOr[String] = js.undefined
  /** An optional name to identify the layer by. */
  var layerName: js.UndefOr[String] = js.undefined
  /** The styles to apply to shapes that don't have a defined style in the XML. */
  var style: js.UndefOr[IStylesOptions] = js.undefined
}

object IGeoJsonReadOptions {
  @scala.inline
  def apply(jsonpQueryParam: String = null, layerName: String = null, style: IStylesOptions = null): IGeoJsonReadOptions = {
    val __obj = js.Dynamic.literal()
    if (jsonpQueryParam != null) __obj.updateDynamic("jsonpQueryParam")(jsonpQueryParam)
    if (layerName != null) __obj.updateDynamic("layerName")(layerName)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[IGeoJsonReadOptions]
  }
}

