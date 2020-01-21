package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaximumNumberOfLoadedTiles extends js.Object {
  var maximumNumberOfLoadedTiles: Double
  var maximumScreenSpaceError: Double
  var url: String
}

object AnonMaximumNumberOfLoadedTiles {
  @scala.inline
  def apply(maximumNumberOfLoadedTiles: Double, maximumScreenSpaceError: Double, url: String): AnonMaximumNumberOfLoadedTiles = {
    val __obj = js.Dynamic.literal(maximumNumberOfLoadedTiles = maximumNumberOfLoadedTiles.asInstanceOf[js.Any], maximumScreenSpaceError = maximumScreenSpaceError.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMaximumNumberOfLoadedTiles]
  }
}

