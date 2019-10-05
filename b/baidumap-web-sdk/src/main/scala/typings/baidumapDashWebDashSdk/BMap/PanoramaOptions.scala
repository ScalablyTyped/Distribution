package typings.baidumapDashWebDashSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanoramaOptions extends js.Object {
  var albumsControl: js.UndefOr[Boolean] = js.undefined
  var albumsControlOptions: js.UndefOr[AlbumsControlOptions] = js.undefined
  var indoorSceneSwitchControl: js.UndefOr[Boolean] = js.undefined
  var linksControl: js.UndefOr[Boolean] = js.undefined
  var navigationControl: js.UndefOr[Boolean] = js.undefined
}

object PanoramaOptions {
  @scala.inline
  def apply(
    albumsControl: js.UndefOr[Boolean] = js.undefined,
    albumsControlOptions: AlbumsControlOptions = null,
    indoorSceneSwitchControl: js.UndefOr[Boolean] = js.undefined,
    linksControl: js.UndefOr[Boolean] = js.undefined,
    navigationControl: js.UndefOr[Boolean] = js.undefined
  ): PanoramaOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(albumsControl)) __obj.updateDynamic("albumsControl")(albumsControl)
    if (albumsControlOptions != null) __obj.updateDynamic("albumsControlOptions")(albumsControlOptions)
    if (!js.isUndefined(indoorSceneSwitchControl)) __obj.updateDynamic("indoorSceneSwitchControl")(indoorSceneSwitchControl)
    if (!js.isUndefined(linksControl)) __obj.updateDynamic("linksControl")(linksControl)
    if (!js.isUndefined(navigationControl)) __obj.updateDynamic("navigationControl")(navigationControl)
    __obj.asInstanceOf[PanoramaOptions]
  }
}

