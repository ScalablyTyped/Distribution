package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanoramaData extends js.Object {
  var description: String
  var id: String
  var links: js.Array[PanoramaLink]
  var position: Point
  var tiles: PanoramaTileData
}

object PanoramaData {
  @scala.inline
  def apply(
    description: String,
    id: String,
    links: js.Array[PanoramaLink],
    position: Point,
    tiles: PanoramaTileData
  ): PanoramaData = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], tiles = tiles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PanoramaData]
  }
}

