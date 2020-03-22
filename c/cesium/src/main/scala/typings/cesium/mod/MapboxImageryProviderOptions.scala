package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapboxImageryProviderOptions extends MapboxProviderCommonOptions {
  /**
    * The public access token for the imagery
    */
  var accessToken: js.UndefOr[String] = js.undefined
  /**
    * The format of the image request
    * @default 'png'
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * The Mapbox Map ID
    */
  var mapId: String
  /**
    * The Mapbox server url
    * @default 'https://api.mapbox.com/v4/'
    */
  var url: js.UndefOr[String] = js.undefined
}

object MapboxImageryProviderOptions {
  @scala.inline
  def apply(
    mapId: String,
    accessToken: String = null,
    credit: Credit | String = null,
    ellipsoid: Ellipsoid = null,
    format: String = null,
    maximumLevel: Int | Double = null,
    minimumLevel: Int | Double = null,
    rectangle: Rectangle = null,
    url: String = null
  ): MapboxImageryProviderOptions = {
    val __obj = js.Dynamic.literal(mapId = mapId.asInstanceOf[js.Any])
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (maximumLevel != null) __obj.updateDynamic("maximumLevel")(maximumLevel.asInstanceOf[js.Any])
    if (minimumLevel != null) __obj.updateDynamic("minimumLevel")(minimumLevel.asInstanceOf[js.Any])
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapboxImageryProviderOptions]
  }
}

