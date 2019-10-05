package typings.baidumapDashWebDashSdk.BMap

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
    val __obj = js.Dynamic.literal(description = description, id = id, links = links, position = position, tiles = tiles)
  
    __obj.asInstanceOf[PanoramaData]
  }
}

