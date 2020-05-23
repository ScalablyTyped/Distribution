package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapboxStyleImageryProviderOptions extends MapboxProviderCommonOptions {
  /**
    * The public access token for the imagery.
    */
  var accessToken: js.UndefOr[String] = js.undefined
  /**
    * Determines if tiles are rendered at a @2x scale factor
    */
  var scaleFactor: js.UndefOr[Boolean] = js.undefined
  /**
    * The Mapbox Style ID.
    */
  var styleId: String
  /**
    * The size of the image tiles
    * @default 512
    */
  var tilesize: js.UndefOr[Double] = js.undefined
  /**
    * The Mapbox server url
    * @default 'https://api.mapbox.com/styles/v1/'
    */
  var url: js.UndefOr[Resource | String] = js.undefined
  /**
    * The username of the map account.
    * @default 'mapbox'
    */
  var username: js.UndefOr[String] = js.undefined
}

object MapboxStyleImageryProviderOptions {
  @scala.inline
  def apply(
    styleId: String,
    accessToken: String = null,
    credit: Credit | String = null,
    ellipsoid: Ellipsoid = null,
    maximumLevel: js.UndefOr[Double] = js.undefined,
    minimumLevel: js.UndefOr[Double] = js.undefined,
    rectangle: Rectangle = null,
    scaleFactor: js.UndefOr[Boolean] = js.undefined,
    tilesize: js.UndefOr[Double] = js.undefined,
    url: Resource | String = null,
    username: String = null
  ): MapboxStyleImageryProviderOptions = {
    val __obj = js.Dynamic.literal(styleId = styleId.asInstanceOf[js.Any])
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumLevel)) __obj.updateDynamic("maximumLevel")(maximumLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumLevel)) __obj.updateDynamic("minimumLevel")(minimumLevel.get.asInstanceOf[js.Any])
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleFactor)) __obj.updateDynamic("scaleFactor")(scaleFactor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tilesize)) __obj.updateDynamic("tilesize")(tilesize.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapboxStyleImageryProviderOptions]
  }
}

