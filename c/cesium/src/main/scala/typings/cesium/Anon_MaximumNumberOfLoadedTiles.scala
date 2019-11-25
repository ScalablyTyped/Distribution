package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaximumNumberOfLoadedTiles extends js.Object {
  var maximumNumberOfLoadedTiles: Double
  var maximumScreenSpaceError: Double
  var url: String
}

object Anon_MaximumNumberOfLoadedTiles {
  @scala.inline
  def apply(maximumNumberOfLoadedTiles: Double, maximumScreenSpaceError: Double, url: String): Anon_MaximumNumberOfLoadedTiles = {
    val __obj = js.Dynamic.literal(maximumNumberOfLoadedTiles = maximumNumberOfLoadedTiles.asInstanceOf[js.Any], maximumScreenSpaceError = maximumScreenSpaceError.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_MaximumNumberOfLoadedTiles]
  }
}

