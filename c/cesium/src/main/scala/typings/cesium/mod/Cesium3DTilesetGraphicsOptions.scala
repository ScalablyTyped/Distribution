package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cesium3DTilesetGraphicsOptions extends js.Object {
  /**
    * A number or Property specifying the maximum screen space error used to drive level of detail refinement.
    */
  var maximumScreenSpaceError: js.UndefOr[Double | Property] = js.undefined
  /**
    * A boolean Property specifying the visibility of the tilese
    * @default true
    */
  var show: js.UndefOr[Boolean | Property] = js.undefined
  /**
    * A string or Resource Property specifying the URI of the tileset.
    */
  var uri: js.UndefOr[String | Property] = js.undefined
}

object Cesium3DTilesetGraphicsOptions {
  @scala.inline
  def apply(
    maximumScreenSpaceError: Double | Property = null,
    show: Boolean | Property = null,
    uri: String | Property = null
  ): Cesium3DTilesetGraphicsOptions = {
    val __obj = js.Dynamic.literal()
    if (maximumScreenSpaceError != null) __obj.updateDynamic("maximumScreenSpaceError")(maximumScreenSpaceError.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cesium3DTilesetGraphicsOptions]
  }
}

