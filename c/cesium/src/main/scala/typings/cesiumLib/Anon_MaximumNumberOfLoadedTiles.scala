package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaximumNumberOfLoadedTiles extends js.Object {
  var maximumNumberOfLoadedTiles: scala.Double
  var maximumScreenSpaceError: scala.Double
  var url: java.lang.String
}

object Anon_MaximumNumberOfLoadedTiles {
  @scala.inline
  def apply(
    maximumNumberOfLoadedTiles: scala.Double,
    maximumScreenSpaceError: scala.Double,
    url: java.lang.String
  ): Anon_MaximumNumberOfLoadedTiles = {
    val __obj = js.Dynamic.literal(maximumNumberOfLoadedTiles = maximumNumberOfLoadedTiles, maximumScreenSpaceError = maximumScreenSpaceError, url = url)
  
    __obj.asInstanceOf[Anon_MaximumNumberOfLoadedTiles]
  }
}

