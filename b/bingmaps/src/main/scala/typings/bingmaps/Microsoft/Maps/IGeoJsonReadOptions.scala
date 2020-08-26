package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeoJsonReadOptions extends js.Object {
  /** 
    * If the GeoJSON file is hosted on a different domain, and CORS is not enabled, but does support JSONP,
    * you will need to specify the name of JSONP URL parameter that can be used to download the file across different domains.
    */
  var jsonpQueryParam: js.UndefOr[String] = js.native
  /** An optional name to identify the layer by. */
  var layerName: js.UndefOr[String] = js.native
  /** The styles to apply to shapes that don't have a defined style in the XML. */
  var style: js.UndefOr[IStylesOptions] = js.native
}

object IGeoJsonReadOptions {
  @scala.inline
  def apply(): IGeoJsonReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeoJsonReadOptions]
  }
  @scala.inline
  implicit class IGeoJsonReadOptionsOps[Self <: IGeoJsonReadOptions] (val x: Self) extends AnyVal {
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
    def setJsonpQueryParam(value: String): Self = this.set("jsonpQueryParam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsonpQueryParam: Self = this.set("jsonpQueryParam", js.undefined)
    @scala.inline
    def setLayerName(value: String): Self = this.set("layerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerName: Self = this.set("layerName", js.undefined)
    @scala.inline
    def setStyle(value: IStylesOptions): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

