package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapboxImageryProviderOptions extends MapboxProviderCommonOptions {
  /**
    * The public access token for the imagery
    */
  var accessToken: js.UndefOr[String] = js.native
  /**
    * The format of the image request
    * @default 'png'
    */
  var format: js.UndefOr[String] = js.native
  /**
    * The Mapbox Map ID
    */
  var mapId: String = js.native
  /**
    * The Mapbox server url
    * @default 'https://api.mapbox.com/v4/'
    */
  var url: js.UndefOr[String] = js.native
}

object MapboxImageryProviderOptions {
  @scala.inline
  def apply(mapId: String): MapboxImageryProviderOptions = {
    val __obj = js.Dynamic.literal(mapId = mapId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapboxImageryProviderOptions]
  }
  @scala.inline
  implicit class MapboxImageryProviderOptionsOps[Self <: MapboxImageryProviderOptions] (val x: Self) extends AnyVal {
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
    def setMapId(value: String): Self = this.set("mapId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

